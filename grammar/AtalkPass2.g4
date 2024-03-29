grammar AtalkPass2;

@header {
	import java.util.ArrayList ;
}

@members {
	boolean hasErr = false;
	ArrayList<String> logs = new ArrayList<String>();
	String currentActor;

	void cerr(String str) {
		System.out.println(str);
	}
    void print(String str){
		// logs.add(str);
    }
	void printErr(int line, String str){
		hasErr = true;
        System.out.println("line " + line + ": " + str);
    }
	void printLogs() {
		if (hasErr)
			return;
		for (int i = 0; i < logs.size(); i++) {
			System.out.println(logs.get(i));
		}
	}

    void beginScope() {
        SymbolTable.push();
    }

    void endScope() {
        print("Stack offset: " + SymbolTable.top.getOffset(Register.SP) + ", Global offset: " + SymbolTable.top.getOffset(Register.GP));
        SymbolTable.pop();
    }

	int putLocalVar(String name, Type type) throws ItemAlreadyExistsException {
		int offset = SymbolTable.top.getOffset(Register.SP);
        try{
            SymbolTable.top.put(
                new SymbolTableLocalVariableItem(
                    new Variable(name, type),
                    offset
                )
            );
        }
        catch (ItemAlreadyExistsException iaee){
            name = name+"_temp";
            offset = putLocalVar(name, type);
            throw iaee;
        }
		return offset;
    }

	Type checkVariableExistance(int line, String name) {
		SymbolTableItem sti = SymbolTable.top.get(name);
		try {
			if(sti == null || !(sti instanceof SymbolTableVariableItem)) {
				throw new UndefinedVariableException();
			}
			else {
				Variable var = ((SymbolTableVariableItem) sti).getVariable();
				return var.getType();			
			}
		} catch (UndefinedVariableException uve) {
			try {
				SymbolTable.define();
				putLocalVar(name, NoType.getInstance());
				printErr(line, "ERR: Item " + name + " doesn't exist.");
				return NoType.getInstance();
			} catch (ItemAlreadyExistsException iaee) {
				// printErr(line, "ERR: variable already exists: " + iaee.getName());
				return NoType.getInstance();
			}
		}
	}
	void checkActorExistance(int line, String name) {
		SymbolTableItem sti = SymbolTable.top.get(name);
		try {
			if(sti == null) {
				throw new UndefinedActorException();
			} else {
				// cerr("actor hast " + name);
			}
		} catch (UndefinedActorException uae) {
			printErr(line, "ERR: Actor " + name + " doesn't exist.");
		}
	}
	void checkReceiverExistance(int line, String actor, String receiverKey) {
		SymbolTableActorItem stai = (SymbolTableActorItem) SymbolTable.top.get(actor);
		try {
			if (stai != null && !stai.hasReceiver(receiverKey)) {
				// stai.printReceivers();
				throw new UndefinedReceiverException();
			}
		} catch (UndefinedReceiverException ure) {
			printErr(line, "ERR: Receiver " + receiverKey + " doesn't exist in Actor " + actor + ".");
		}
	}
	Type typeCheck(int line, Type t1, Type t2) {
		try {
			if (!t1.equals(t2)) {
				throw new TypeErrorException();
			}
			return t1;
		} catch (TypeErrorException tee) {
			printErr(line, "ERR: Can't convert type " + t2.toString() + " to " + t1.toString());
			return NoType.getInstance();
		}
	}
	Type checkArrayDim(int line, Type type, int dim) {
		try {
			if (dim == 0)
				return type;
			if ((type instanceof ArrayType && !(dim <= ((ArrayType) type).dim())) || !(type instanceof ArrayType)) {
				throw new TypeErrorException();
			}
			Type returnType = ((ArrayType) type).type();
			for (int i = 1; i < dim; i++) {
				returnType = ((ArrayType) returnType).type();
			} 
			return returnType;
		} catch (TypeErrorException tee) {
			printErr(line, "ERR: " + type.toString() + " object doesn't support index access");
			return NoType.getInstance();
		}
	}
	void checkLValue(int line, boolean is_lvalue) {
		try {
			if (!is_lvalue) {
				throw new LValueException();
			}
		} catch (LValueException lve) {
			printErr(line, "ERR: Can't assign to RValue");
		}
	}
	void checkForeach(int line, Type exp) {
		try {
			if (!(exp instanceof ArrayType)) {
				throw new ForeachIterativeException();
			} /* else if (!exp.type().equals(var)) {
				throw new ForeachIteratorException();
			} */
		} catch (ForeachIterativeException ftie) {
			printErr(line, "ERR: Foreach iterative must be an array");
		} /* catch (ForeachIteratorException ftoe) {
			printErr(line, "ERR: Foreach iterator '" + var.toString() + "' doesn't match '" + exp.type().toString() + "'");
		} */
	}
	void checkInit(int line, boolean callsSender){
		try{
			if(callsSender)
				throw new InitCallsSenderException();
		} catch (InitCallsSenderException icse){
			printErr(line, "Init receiver can't call sender");
		}
	}
	void checkWrite(int line, Type type){
		String ret = type.toString();
		try{
			if( !(ret.equals("char") 
			 || ret.equals("int") 
			 || ret.equals("array(char)")) 
			)
				throw new WriteException();
		} catch (WriteException we) {
			printErr(line, "ERR: Write function only accepts int, char or string");
		}
	}
}


program
    : { beginScope(); }
    (
        actor
        | NL
    ) *
    {
		endScope();
		printLogs();
	}
    ;
actor
    : 'actor' act=ID {currentActor = $act.getText();} '<' CONST_NUM '>' NL
            { beginScope(); }
        (state | receiver | NL)*
        'end'
            { endScope(); }
        (NL | EOF)
    ;

state
	:
		type ID (',' ID)* NL
	;

receiver locals [boolean hasInit = false]
	: 
		'receiver' rec=ID '(' (type arg1=ID {SymbolTable.define();}
		(',' type arg2=ID {SymbolTable.define();}
		)*)? ')' NL { 
				if($rec.getText().equals("init") && $arg1 == null){
					$hasInit = true;	
				}
				beginScope(); 
			}
		s=statements {
			if($hasInit)
				checkInit($s.senderLine, $s.callsSender);
		}
		'end' NL
			{ endScope(); }
	;

type returns [Type retType] locals [int size = 1, ArrayList<Integer> dims = new ArrayList<Integer>(), Type x]
	:
		'char' ('[' sz=CONST_NUM ']' {
			$size *= $sz.int;

			if($sz.int <= 0) {
				$retType = new ArrayType(CharType.getInstance(), 0);
			}
			$dims.add($sz.int);
		})* {
			$retType = CharType.getInstance();
			if ($size == 1 && $sz.int == 0)
				$retType = CharType.getInstance();
			else {
				for(int i = $dims.size()-1; i >= 0; i--){
					if(i == $dims.size()-1)
						$x = new ArrayType(CharType.getInstance(), $dims.get(i));
					else
						$x = new ArrayType($x, $dims.get(i));
				}
				$retType = $x;
			}
		}
	|	'int' ('[' sz=CONST_NUM ']' {
			$size *= $sz.int;
			if($sz.int <= 0){
				$retType = new ArrayType(IntType.getInstance(), 0);
			}
			$dims.add($sz.int);
		})* {
			$retType = IntType.getInstance();
			if ($size == 1 && $sz.int == 0)
				$retType = IntType.getInstance();
			else if ($size != 0 && $sz.int != 0) {
				for(int i = $dims.size()-1; i >= 0; i--){
					if(i == $dims.size()-1)
						$x = new ArrayType(IntType.getInstance(), $dims.get(i));
					else
						$x = new ArrayType($x, $dims.get(i));
				}
				$retType = $x;
			}
		}
	;

block
	:
		'begin' NL
            { beginScope(); }
			statements
		'end' NL
            { endScope(); }        
	;

statements returns [boolean callsSender = false, int senderLine]
	:
		(s=statement {
			if($s.callsSender){
				$callsSender = true;
				$senderLine = $s.senderLine;
			}
		} | NL)*
	;

statement returns [boolean callsSender = false, int senderLine]
	: 
		stm_vardef
	|	stm_assignment
	|	stm_foreach
	|	stm_if_elseif_else
	|	stm_quit
	|	stm_break
	|	s=stm_tell {$callsSender = $s.callsSender; $senderLine = $s.senderLine;}
	|	stm_write
	|	block
	;

stm_vardef locals [Type exp2LastType = NoType.getInstance()]
	:
		tp=type var=ID {
			SymbolTable.define();
		} ('=' exp=expr {
			typeCheck($var.line, $tp.retType, $exp.retType);
		})?
		(',' var2=ID {
			SymbolTable.define();
		} ('=' exp2=expr {
			/* if ($exp2LastType.equals(NoType.getInstance())) {
				checkLValue($var.line, $exp.is_lvalue);
			} else {
				checkLValue($var.line, $exp2.is_lvalue);
			} */
			$exp2LastType = $exp2.retType;
			typeCheck($var.line, $tp.retType, $exp2.retType);
		})?)*
		NL
	;

stm_tell returns [boolean callsSender=false, int senderLine] locals [String rcKey, String actorName]
	:
		(act=ID {
			$actorName = $act.getText();
			checkActorExistance($act.line, $actorName);
		}
		| l='sender' {
			$senderLine = $l.line;
			$callsSender = true;
		}
		| 'self' {
			$actorName = currentActor;
		})
		'<<' rc=ID {
			$rcKey = $rc.getText();
		}
		'(' (ex=expr {$rcKey += ":" + $ex.retType.toString();}
		(',' ex2=expr {$rcKey += ":" + $ex2.retType.toString();} )*)? ')' NL 
		{
			checkReceiverExistance($rc.line, $actorName, $rcKey);
		}
	;

stm_write:
		'write' '(' exp=expr {
			checkWrite($exp.line, $exp.retType);
		} ')' NL
	;

stm_if_elseif_else:
		'if' exp=expr NL
			{
				typeCheck($exp.line, IntType.getInstance(), $exp.retType);
				beginScope();
			}
		statements
		('elseif' exp2=expr NL
			{
				typeCheck($exp2.line, IntType.getInstance(), $exp2.retType);
				endScope();
				beginScope();
			}
		statements)*
		('else' NL
			{
				endScope();
				beginScope();
			}
		statements)?
		'end' NL
			{ endScope(); }
	;

stm_foreach:
		'foreach' var=ID 'in' exp=expr NL
			{
				checkForeach($var.line, $exp.retType);
				beginScope();
			}
		statements
		'end' NL
			{ endScope(); }
	;

stm_quit:
		'quit' NL
	;

stm_break
	:
		'break' NL
	;

stm_assignment:
		expr NL
	;

expr returns [int line, boolean is_lvalue, Type retType]
	:
		exp=expr_assign {
			$line = $exp.line;
			$is_lvalue = $exp.is_lvalue;
			$retType = $exp.retType;
		}
	;

expr_assign returns [int line, boolean is_lvalue, Type retType]
	:
		exp=expr_or '=' exp2=expr_assign {
			$retType = typeCheck($exp.line, $exp.retType, $exp2.retType);
			checkLValue($exp.line, $exp.is_lvalue);
			$is_lvalue = $exp2.is_lvalue;
			$line = $exp.line;
		}
	|	exp=expr_or {
			$line = $exp.line;
			$is_lvalue = $exp.is_lvalue;
			$retType = $exp.retType;
		}
	;

expr_or returns [int line, boolean is_lvalue, Type retType]
	:
		exp=expr_and exp2=expr_or_tmp {
			$retType = $exp.retType;
			if (!$exp2.retType.equals(NoType.getInstance())) {
				$retType = typeCheck($exp.line, $exp.retType, $exp2.retType);
			}
			$is_lvalue = $exp.is_lvalue && $exp2.is_lvalue;
			$line = $exp.line;
		}
	;

expr_or_tmp returns [int line, boolean is_lvalue, Type retType]
	:
		'or' exp=expr_and exp2=expr_or_tmp {
			$retType = $exp.retType;
			if (!$exp2.retType.equals(NoType.getInstance())) {
				$retType = typeCheck($exp.line, $exp.retType, $exp2.retType);
			}
			$is_lvalue = false;
			$line = $exp.line;
		}
	| {
			$is_lvalue = true;
			$retType = NoType.getInstance();
			$line = 0;
		}
	;

expr_and returns [int line, boolean is_lvalue, Type retType]
	:
		exp=expr_eq exp2=expr_and_tmp {
			$retType = $exp.retType;
			if (!$exp2.retType.equals(NoType.getInstance())) {
				$retType = typeCheck($exp.line, $exp.retType, $exp2.retType);
			}
			$is_lvalue = $exp.is_lvalue && $exp2.is_lvalue;
			$line = $exp.line;
		}
	;

expr_and_tmp returns [int line, boolean is_lvalue, Type retType]
	:
		'and' exp=expr_eq exp2=expr_and_tmp {
			$retType = $exp.retType;
			if (!$exp2.retType.equals(NoType.getInstance())) {
				$retType = typeCheck($exp.line, $exp.retType, $exp2.retType);
			}
			$is_lvalue = false;
			$line = $exp.line;
		}
	| {
			$is_lvalue = true;
			$retType = NoType.getInstance();
			$line = 0;
		}
	;

expr_eq returns [int line, boolean is_lvalue, Type retType]
	:
		exp=expr_cmp exp2=expr_eq_tmp {
			$retType = $exp.retType;
			if (!$exp2.retType.equals(NoType.getInstance())) {
				$retType = typeCheck($exp.line, $exp.retType, $exp2.retType);
			}
			$is_lvalue = $exp.is_lvalue && $exp2.is_lvalue;
			$line = $exp.line;
		}
	;

expr_eq_tmp returns [int line, boolean is_lvalue, Type retType]
	:
		('==' | '<>') exp=expr_cmp exp2=expr_eq_tmp {
			$retType = $exp.retType;
			if (!$exp2.retType.equals(NoType.getInstance())) {
				$retType = typeCheck($exp.line, $exp.retType, $exp2.retType);
			}
			$is_lvalue = false;
			$line = $exp.line;
		}
	| {
			$is_lvalue = true;
			$retType = NoType.getInstance();
			$line = 0;
		}
	;

expr_cmp returns [int line, boolean is_lvalue, Type retType]
	:
		exp=expr_add exp2=expr_cmp_tmp {
			$retType = $exp.retType;
			if (!$exp2.retType.equals(NoType.getInstance())) {
				$retType = typeCheck($exp.line, $exp.retType, $exp2.retType);
			}
			$is_lvalue = $exp.is_lvalue && $exp2.is_lvalue;
			$line = $exp.line;
		}
	;

expr_cmp_tmp returns [int line, boolean is_lvalue, Type retType]
	:
		('<' | '>') exp=expr_add exp2=expr_cmp_tmp {
			$retType = $exp.retType;
			if (!$exp2.retType.equals(NoType.getInstance())) {
				$retType = typeCheck($exp.line, $exp.retType, $exp2.retType);
			}
			$is_lvalue = false;
			$line = $exp.line;
		}
	| {
			$is_lvalue = true;
			$retType = NoType.getInstance();
			$line = 0;
		}
	;

expr_add returns [int line, boolean is_lvalue, Type retType]
	:
		exp=expr_mult exp2=expr_add_tmp {
			$retType = $exp.retType;
			if (!$exp2.retType.equals(NoType.getInstance())) {
				$retType = typeCheck($exp.line, $exp.retType, $exp2.retType);
			}
			$is_lvalue = $exp.is_lvalue && $exp2.is_lvalue;
			$line = $exp.line;
		}
	;

expr_add_tmp returns [int line, boolean is_lvalue, Type retType]
	:
		('+' | '-') exp=expr_mult exp2=expr_add_tmp {
			$retType = $exp.retType;
			if (!$exp2.retType.equals(NoType.getInstance())) {
				$retType = typeCheck($exp.line, $exp.retType, $exp2.retType);
			}
			$is_lvalue = false;
			$line = $exp.line;
		}
	| {
			$is_lvalue = true;
			$retType = NoType.getInstance();
			$line = 0;
		}
	;

expr_mult returns [int line, boolean is_lvalue, Type retType]
	:
		exp=expr_un exp2=expr_mult_tmp {
			$retType = $exp.retType;
			if (!$exp2.retType.equals(NoType.getInstance())) {
				$retType = typeCheck($exp.line, $exp.retType, $exp2.retType);
			}
			$is_lvalue = $exp.is_lvalue && $exp2.is_lvalue;
			$line = $exp.line;
		}
	;

expr_mult_tmp returns [int line, boolean is_lvalue, Type retType]
	:
		('*' | '/') exp=expr_un exp2=expr_mult_tmp {
			$retType = $exp.retType;
			if (!$exp2.retType.equals(NoType.getInstance())) {
				$retType = typeCheck($exp.line, $exp.retType, $exp2.retType);
			}
			$is_lvalue = false;
			$line = $exp.line;
		}
	| {
			$is_lvalue = true;
			$retType = NoType.getInstance();
			$line = 0;
		}
	;

expr_un returns [int line, boolean is_lvalue, Type retType]
	:
		('not' | '-') exp=expr_un {
			$is_lvalue = false;
			$retType = $exp.retType;
			$line = $exp.line;
		}
	|	exp2=expr_mem {
			$is_lvalue = $exp2.is_lvalue;
			$retType = $exp2.retType;
			$line = $exp2.line;
		}
	;

expr_mem returns [int line, boolean is_lvalue, Type retType]
	:
		exp=expr_other {
			$is_lvalue = $exp.is_lvalue;
			$retType = $exp.retType;
			$line = $exp.line;
		} expmt=expr_mem_tmp {
			$retType = checkArrayDim($line, $retType, $expmt.dim);
		}
	;

expr_mem_tmp returns [int dim]
	:
		'[' expr ']' expmt=expr_mem_tmp {
			$dim = $expmt.dim + 1;
		}
	| {
		$dim = 0;
		}
	;

expr_other returns [int line, boolean is_lvalue, Type retType] locals [int arrayLength = 0, boolean exists]
	:
		l=CONST_NUM {
			$is_lvalue = false;
			$retType = IntType.getInstance();
			$line = $l.line;
		}
	|	l2=CONST_CHAR {
			$is_lvalue = false;
			$retType = CharType.getInstance();
			$line = $l2.line;
		}
	|	str=CONST_STR {
			$is_lvalue = false;
			$retType = new ArrayType(CharType.getInstance(), $str.getText().length()); $line = $str.line;
		}
	|	var=ID {
			$retType = checkVariableExistance($var.line, $var.getText());
			$is_lvalue = true;
			$line = $var.line;
		}
	|	'{' exp=expr {
			$arrayLength = 1;
		} (',' exp2=expr {
			$line = $exp.line;
			typeCheck($line, $exp2.retType, $exp.retType);
			$arrayLength += 1;
		})* '}' {
			$is_lvalue = false; $retType = new ArrayType($exp.retType, $arrayLength);
		}
	|	'read' '(' alen=CONST_NUM ')' {
			$is_lvalue = false;
			$retType = new ArrayType(CharType.getInstance(), $alen.int);
			$line = $alen.line;
		}
	|	'(' exp=expr ')' {
			$is_lvalue = $exp.is_lvalue;
			$retType = $exp.retType;
			$line = $exp.line;
		}
	;

CONST_NUM:
		[0-9]+
	;

CONST_CHAR:
		'\'' . '\''
	;

CONST_STR:
		'"' ~('\r' | '\n' | '"')* '"'
	;

NL:
		'\r'? '\n' { setText("new_line"); }
	;

ID:
		[a-zA-Z_][a-zA-Z0-9_]*
	;

COMMENT:
		'#'(~[\r\n])* -> skip
	;

WS:
    	[ \t] -> skip
    ;
