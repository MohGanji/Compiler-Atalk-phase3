// Generated from /home/vmoh/uni_projs/compiler/Compiler-Atalk-phase3/grammar/AtalkPass2.g4 by ANTLR 4.7

	import java.util.ArrayList ;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class AtalkPass2Parser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		T__31=32, T__32=33, T__33=34, T__34=35, T__35=36, T__36=37, CONST_NUM=38, 
		CONST_CHAR=39, CONST_STR=40, NL=41, ID=42, COMMENT=43, WS=44;
	public static final int
		RULE_program = 0, RULE_actor = 1, RULE_state = 2, RULE_receiver = 3, RULE_type = 4, 
		RULE_block = 5, RULE_statements = 6, RULE_statement = 7, RULE_stm_vardef = 8, 
		RULE_stm_tell = 9, RULE_stm_write = 10, RULE_stm_if_elseif_else = 11, 
		RULE_stm_foreach = 12, RULE_stm_quit = 13, RULE_stm_break = 14, RULE_stm_assignment = 15, 
		RULE_expr = 16, RULE_expr_assign = 17, RULE_expr_or = 18, RULE_expr_or_tmp = 19, 
		RULE_expr_and = 20, RULE_expr_and_tmp = 21, RULE_expr_eq = 22, RULE_expr_eq_tmp = 23, 
		RULE_expr_cmp = 24, RULE_expr_cmp_tmp = 25, RULE_expr_add = 26, RULE_expr_add_tmp = 27, 
		RULE_expr_mult = 28, RULE_expr_mult_tmp = 29, RULE_expr_un = 30, RULE_expr_mem = 31, 
		RULE_expr_mem_tmp = 32, RULE_expr_other = 33;
	public static final String[] ruleNames = {
		"program", "actor", "state", "receiver", "type", "block", "statements", 
		"statement", "stm_vardef", "stm_tell", "stm_write", "stm_if_elseif_else", 
		"stm_foreach", "stm_quit", "stm_break", "stm_assignment", "expr", "expr_assign", 
		"expr_or", "expr_or_tmp", "expr_and", "expr_and_tmp", "expr_eq", "expr_eq_tmp", 
		"expr_cmp", "expr_cmp_tmp", "expr_add", "expr_add_tmp", "expr_mult", "expr_mult_tmp", 
		"expr_un", "expr_mem", "expr_mem_tmp", "expr_other"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'actor'", "'<'", "'>'", "'end'", "','", "'receiver'", "'('", "')'", 
		"'char'", "'['", "']'", "'int'", "'begin'", "'='", "'sender'", "'self'", 
		"'<<'", "'write'", "'if'", "'elseif'", "'else'", "'foreach'", "'in'", 
		"'quit'", "'break'", "'or'", "'and'", "'=='", "'<>'", "'+'", "'-'", "'*'", 
		"'/'", "'not'", "'{'", "'}'", "'read'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, "CONST_NUM", "CONST_CHAR", "CONST_STR", "NL", "ID", "COMMENT", 
		"WS"
	};
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "AtalkPass2.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }


		boolean hasErr = false;
		ArrayList<String> logs = new ArrayList<String>();

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

		void checkExistance(int line, String name) {
			SymbolTableItem sti = SymbolTable.top.get(name);
			try {
				if(sti == null) {
					throw new UndefinedVariableException();
				}
				else {
					SymbolTableVariableItemBase var = (SymbolTableVariableItemBase) sti;
					cerr("hast " + name);
					// print(line + ") Variable " + name + " used.\t\t" +   "Base Reg: " + var.getBaseRegister() + ", Offset: " + var.getOffset());
				}
			} catch (UndefinedVariableException uve) {
				try{
					putLocalVar(name, NoType.getInstance());
				} catch (ItemAlreadyExistsException iaee) {
					printErr(line, "ERR: variable already exists: " + iaee.getName());
				}
				printErr(line, "Item " + name + " doesn't exist.");
			}
		}

	public AtalkPass2Parser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgramContext extends ParserRuleContext {
		public List<ActorContext> actor() {
			return getRuleContexts(ActorContext.class);
		}
		public ActorContext actor(int i) {
			return getRuleContext(ActorContext.class,i);
		}
		public List<TerminalNode> NL() { return getTokens(AtalkPass2Parser.NL); }
		public TerminalNode NL(int i) {
			return getToken(AtalkPass2Parser.NL, i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			 beginScope(); 
			setState(73);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0 || _la==NL) {
				{
				setState(71);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__0:
					{
					setState(69);
					actor();
					}
					break;
				case NL:
					{
					setState(70);
					match(NL);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(75);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}

					endScope();
					printLogs();
				
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ActorContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(AtalkPass2Parser.ID, 0); }
		public TerminalNode CONST_NUM() { return getToken(AtalkPass2Parser.CONST_NUM, 0); }
		public List<TerminalNode> NL() { return getTokens(AtalkPass2Parser.NL); }
		public TerminalNode NL(int i) {
			return getToken(AtalkPass2Parser.NL, i);
		}
		public TerminalNode EOF() { return getToken(AtalkPass2Parser.EOF, 0); }
		public List<StateContext> state() {
			return getRuleContexts(StateContext.class);
		}
		public StateContext state(int i) {
			return getRuleContext(StateContext.class,i);
		}
		public List<ReceiverContext> receiver() {
			return getRuleContexts(ReceiverContext.class);
		}
		public ReceiverContext receiver(int i) {
			return getRuleContext(ReceiverContext.class,i);
		}
		public ActorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_actor; }
	}

	public final ActorContext actor() throws RecognitionException {
		ActorContext _localctx = new ActorContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_actor);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(78);
			match(T__0);
			setState(79);
			match(ID);
			setState(80);
			match(T__1);
			setState(81);
			match(CONST_NUM);
			setState(82);
			match(T__2);
			setState(83);
			match(NL);
			 beginScope(); 
			setState(90);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__5) | (1L << T__8) | (1L << T__11) | (1L << NL))) != 0)) {
				{
				setState(88);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__8:
				case T__11:
					{
					setState(85);
					state();
					}
					break;
				case T__5:
					{
					setState(86);
					receiver();
					}
					break;
				case NL:
					{
					setState(87);
					match(NL);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(92);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(93);
			match(T__3);
			 endScope(); 
			setState(95);
			_la = _input.LA(1);
			if ( !(_la==EOF || _la==NL) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StateContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public List<TerminalNode> ID() { return getTokens(AtalkPass2Parser.ID); }
		public TerminalNode ID(int i) {
			return getToken(AtalkPass2Parser.ID, i);
		}
		public TerminalNode NL() { return getToken(AtalkPass2Parser.NL, 0); }
		public StateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_state; }
	}

	public final StateContext state() throws RecognitionException {
		StateContext _localctx = new StateContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_state);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(97);
			type();
			setState(98);
			match(ID);
			setState(103);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__4) {
				{
				{
				setState(99);
				match(T__4);
				setState(100);
				match(ID);
				}
				}
				setState(105);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(106);
			match(NL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ReceiverContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(AtalkPass2Parser.ID); }
		public TerminalNode ID(int i) {
			return getToken(AtalkPass2Parser.ID, i);
		}
		public List<TerminalNode> NL() { return getTokens(AtalkPass2Parser.NL); }
		public TerminalNode NL(int i) {
			return getToken(AtalkPass2Parser.NL, i);
		}
		public StatementsContext statements() {
			return getRuleContext(StatementsContext.class,0);
		}
		public List<TypeContext> type() {
			return getRuleContexts(TypeContext.class);
		}
		public TypeContext type(int i) {
			return getRuleContext(TypeContext.class,i);
		}
		public ReceiverContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_receiver; }
	}

	public final ReceiverContext receiver() throws RecognitionException {
		ReceiverContext _localctx = new ReceiverContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_receiver);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(108);
			match(T__5);
			setState(109);
			match(ID);
			setState(110);
			match(T__6);
			setState(122);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__8 || _la==T__11) {
				{
				setState(111);
				type();
				setState(112);
				match(ID);
				setState(119);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__4) {
					{
					{
					setState(113);
					match(T__4);
					setState(114);
					type();
					setState(115);
					match(ID);
					}
					}
					setState(121);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(124);
			match(T__7);
			setState(125);
			match(NL);
			 beginScope(); 
			setState(127);
			statements();
			setState(128);
			match(T__3);
			setState(129);
			match(NL);
			 endScope(); 
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeContext extends ParserRuleContext {
		public Type return_type;
		public List<TerminalNode> CONST_NUM() { return getTokens(AtalkPass2Parser.CONST_NUM); }
		public TerminalNode CONST_NUM(int i) {
			return getToken(AtalkPass2Parser.CONST_NUM, i);
		}
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_type);
		int _la;
		try {
			setState(152);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__8:
				enterOuterAlt(_localctx, 1);
				{
				setState(132);
				match(T__8);
				setState(138);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__9) {
					{
					{
					setState(133);
					match(T__9);
					setState(134);
					match(CONST_NUM);
					setState(135);
					match(T__10);
					}
					}
					setState(140);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				 ((TypeContext)_localctx).return_type =  CharType.getInstance(); 
				}
				break;
			case T__11:
				enterOuterAlt(_localctx, 2);
				{
				setState(142);
				match(T__11);
				setState(148);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__9) {
					{
					{
					setState(143);
					match(T__9);
					setState(144);
					match(CONST_NUM);
					setState(145);
					match(T__10);
					}
					}
					setState(150);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				 ((TypeContext)_localctx).return_type =  IntType.getInstance(); 
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BlockContext extends ParserRuleContext {
		public List<TerminalNode> NL() { return getTokens(AtalkPass2Parser.NL); }
		public TerminalNode NL(int i) {
			return getToken(AtalkPass2Parser.NL, i);
		}
		public StatementsContext statements() {
			return getRuleContext(StatementsContext.class,0);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_block);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(154);
			match(T__12);
			setState(155);
			match(NL);
			 beginScope(); 
			setState(157);
			statements();
			setState(158);
			match(T__3);
			setState(159);
			match(NL);
			 endScope(); 
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatementsContext extends ParserRuleContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public List<TerminalNode> NL() { return getTokens(AtalkPass2Parser.NL); }
		public TerminalNode NL(int i) {
			return getToken(AtalkPass2Parser.NL, i);
		}
		public StatementsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statements; }
	}

	public final StatementsContext statements() throws RecognitionException {
		StatementsContext _localctx = new StatementsContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_statements);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(166);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__6) | (1L << T__8) | (1L << T__11) | (1L << T__12) | (1L << T__14) | (1L << T__15) | (1L << T__17) | (1L << T__18) | (1L << T__21) | (1L << T__23) | (1L << T__24) | (1L << T__30) | (1L << T__33) | (1L << T__34) | (1L << T__36) | (1L << CONST_NUM) | (1L << CONST_CHAR) | (1L << CONST_STR) | (1L << NL) | (1L << ID))) != 0)) {
				{
				setState(164);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__6:
				case T__8:
				case T__11:
				case T__12:
				case T__14:
				case T__15:
				case T__17:
				case T__18:
				case T__21:
				case T__23:
				case T__24:
				case T__30:
				case T__33:
				case T__34:
				case T__36:
				case CONST_NUM:
				case CONST_CHAR:
				case CONST_STR:
				case ID:
					{
					setState(162);
					statement();
					}
					break;
				case NL:
					{
					setState(163);
					match(NL);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(168);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatementContext extends ParserRuleContext {
		public Stm_vardefContext stm_vardef() {
			return getRuleContext(Stm_vardefContext.class,0);
		}
		public Stm_assignmentContext stm_assignment() {
			return getRuleContext(Stm_assignmentContext.class,0);
		}
		public Stm_foreachContext stm_foreach() {
			return getRuleContext(Stm_foreachContext.class,0);
		}
		public Stm_if_elseif_elseContext stm_if_elseif_else() {
			return getRuleContext(Stm_if_elseif_elseContext.class,0);
		}
		public Stm_quitContext stm_quit() {
			return getRuleContext(Stm_quitContext.class,0);
		}
		public Stm_breakContext stm_break() {
			return getRuleContext(Stm_breakContext.class,0);
		}
		public Stm_tellContext stm_tell() {
			return getRuleContext(Stm_tellContext.class,0);
		}
		public Stm_writeContext stm_write() {
			return getRuleContext(Stm_writeContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_statement);
		try {
			setState(178);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(169);
				stm_vardef();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(170);
				stm_assignment();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(171);
				stm_foreach();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(172);
				stm_if_elseif_else();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(173);
				stm_quit();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(174);
				stm_break();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(175);
				stm_tell();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(176);
				stm_write();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(177);
				block();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Stm_vardefContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public List<TerminalNode> ID() { return getTokens(AtalkPass2Parser.ID); }
		public TerminalNode ID(int i) {
			return getToken(AtalkPass2Parser.ID, i);
		}
		public TerminalNode NL() { return getToken(AtalkPass2Parser.NL, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public Stm_vardefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stm_vardef; }
	}

	public final Stm_vardefContext stm_vardef() throws RecognitionException {
		Stm_vardefContext _localctx = new Stm_vardefContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_stm_vardef);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(180);
			type();
			setState(181);
			match(ID);
			 SymbolTable.define(); 
			setState(185);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__13) {
				{
				setState(183);
				match(T__13);
				setState(184);
				expr();
				}
			}

			setState(196);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__4) {
				{
				{
				setState(187);
				match(T__4);
				setState(188);
				match(ID);
				 SymbolTable.define(); 
				setState(192);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__13) {
					{
					setState(190);
					match(T__13);
					setState(191);
					expr();
					}
				}

				}
				}
				setState(198);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(199);
			match(NL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Stm_tellContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(AtalkPass2Parser.ID); }
		public TerminalNode ID(int i) {
			return getToken(AtalkPass2Parser.ID, i);
		}
		public TerminalNode NL() { return getToken(AtalkPass2Parser.NL, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public Stm_tellContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stm_tell; }
	}

	public final Stm_tellContext stm_tell() throws RecognitionException {
		Stm_tellContext _localctx = new Stm_tellContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_stm_tell);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(201);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__14) | (1L << T__15) | (1L << ID))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(202);
			match(T__16);
			setState(203);
			match(ID);
			setState(204);
			match(T__6);
			setState(213);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__6) | (1L << T__30) | (1L << T__33) | (1L << T__34) | (1L << T__36) | (1L << CONST_NUM) | (1L << CONST_CHAR) | (1L << CONST_STR) | (1L << ID))) != 0)) {
				{
				setState(205);
				expr();
				setState(210);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__4) {
					{
					{
					setState(206);
					match(T__4);
					setState(207);
					expr();
					}
					}
					setState(212);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(215);
			match(T__7);
			setState(216);
			match(NL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Stm_writeContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode NL() { return getToken(AtalkPass2Parser.NL, 0); }
		public Stm_writeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stm_write; }
	}

	public final Stm_writeContext stm_write() throws RecognitionException {
		Stm_writeContext _localctx = new Stm_writeContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_stm_write);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(218);
			match(T__17);
			setState(219);
			match(T__6);
			setState(220);
			expr();
			setState(221);
			match(T__7);
			setState(222);
			match(NL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Stm_if_elseif_elseContext extends ParserRuleContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<TerminalNode> NL() { return getTokens(AtalkPass2Parser.NL); }
		public TerminalNode NL(int i) {
			return getToken(AtalkPass2Parser.NL, i);
		}
		public List<StatementsContext> statements() {
			return getRuleContexts(StatementsContext.class);
		}
		public StatementsContext statements(int i) {
			return getRuleContext(StatementsContext.class,i);
		}
		public Stm_if_elseif_elseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stm_if_elseif_else; }
	}

	public final Stm_if_elseif_elseContext stm_if_elseif_else() throws RecognitionException {
		Stm_if_elseif_elseContext _localctx = new Stm_if_elseif_elseContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_stm_if_elseif_else);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(224);
			match(T__18);
			setState(225);
			expr();
			setState(226);
			match(NL);
			 beginScope(); 
			setState(228);
			statements();
			setState(237);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__19) {
				{
				{
				setState(229);
				match(T__19);
				setState(230);
				expr();
				setState(231);
				match(NL);

								endScope();
								beginScope();
							
				setState(233);
				statements();
				}
				}
				setState(239);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(244);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__20) {
				{
				setState(240);
				match(T__20);
				setState(241);
				match(NL);

								endScope();
								beginScope();
							
				setState(243);
				statements();
				}
			}

			setState(246);
			match(T__3);
			setState(247);
			match(NL);
			 endScope(); 
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Stm_foreachContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(AtalkPass2Parser.ID, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public List<TerminalNode> NL() { return getTokens(AtalkPass2Parser.NL); }
		public TerminalNode NL(int i) {
			return getToken(AtalkPass2Parser.NL, i);
		}
		public StatementsContext statements() {
			return getRuleContext(StatementsContext.class,0);
		}
		public Stm_foreachContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stm_foreach; }
	}

	public final Stm_foreachContext stm_foreach() throws RecognitionException {
		Stm_foreachContext _localctx = new Stm_foreachContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_stm_foreach);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(250);
			match(T__21);
			setState(251);
			match(ID);
			setState(252);
			match(T__22);
			setState(253);
			expr();
			setState(254);
			match(NL);
			 beginScope(); 
			setState(256);
			statements();
			setState(257);
			match(T__3);
			setState(258);
			match(NL);
			 endScope(); 
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Stm_quitContext extends ParserRuleContext {
		public TerminalNode NL() { return getToken(AtalkPass2Parser.NL, 0); }
		public Stm_quitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stm_quit; }
	}

	public final Stm_quitContext stm_quit() throws RecognitionException {
		Stm_quitContext _localctx = new Stm_quitContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_stm_quit);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(261);
			match(T__23);
			setState(262);
			match(NL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Stm_breakContext extends ParserRuleContext {
		public TerminalNode NL() { return getToken(AtalkPass2Parser.NL, 0); }
		public Stm_breakContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stm_break; }
	}

	public final Stm_breakContext stm_break() throws RecognitionException {
		Stm_breakContext _localctx = new Stm_breakContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_stm_break);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(264);
			match(T__24);
			setState(265);
			match(NL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Stm_assignmentContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode NL() { return getToken(AtalkPass2Parser.NL, 0); }
		public Stm_assignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stm_assignment; }
	}

	public final Stm_assignmentContext stm_assignment() throws RecognitionException {
		Stm_assignmentContext _localctx = new Stm_assignmentContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_stm_assignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(267);
			expr();
			setState(268);
			match(NL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExprContext extends ParserRuleContext {
		public Expr_assignContext expr_assign() {
			return getRuleContext(Expr_assignContext.class,0);
		}
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
	}

	public final ExprContext expr() throws RecognitionException {
		ExprContext _localctx = new ExprContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_expr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(270);
			expr_assign();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Expr_assignContext extends ParserRuleContext {
		public Expr_orContext expr_or() {
			return getRuleContext(Expr_orContext.class,0);
		}
		public Expr_assignContext expr_assign() {
			return getRuleContext(Expr_assignContext.class,0);
		}
		public Expr_assignContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr_assign; }
	}

	public final Expr_assignContext expr_assign() throws RecognitionException {
		Expr_assignContext _localctx = new Expr_assignContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_expr_assign);
		try {
			setState(277);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(272);
				expr_or();
				setState(273);
				match(T__13);
				setState(274);
				expr_assign();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(276);
				expr_or();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Expr_orContext extends ParserRuleContext {
		public Expr_andContext expr_and() {
			return getRuleContext(Expr_andContext.class,0);
		}
		public Expr_or_tmpContext expr_or_tmp() {
			return getRuleContext(Expr_or_tmpContext.class,0);
		}
		public Expr_orContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr_or; }
	}

	public final Expr_orContext expr_or() throws RecognitionException {
		Expr_orContext _localctx = new Expr_orContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_expr_or);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(279);
			expr_and();
			setState(280);
			expr_or_tmp();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Expr_or_tmpContext extends ParserRuleContext {
		public Expr_andContext expr_and() {
			return getRuleContext(Expr_andContext.class,0);
		}
		public Expr_or_tmpContext expr_or_tmp() {
			return getRuleContext(Expr_or_tmpContext.class,0);
		}
		public Expr_or_tmpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr_or_tmp; }
	}

	public final Expr_or_tmpContext expr_or_tmp() throws RecognitionException {
		Expr_or_tmpContext _localctx = new Expr_or_tmpContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_expr_or_tmp);
		try {
			setState(287);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__25:
				enterOuterAlt(_localctx, 1);
				{
				setState(282);
				match(T__25);
				setState(283);
				expr_and();
				setState(284);
				expr_or_tmp();
				}
				break;
			case T__4:
			case T__7:
			case T__10:
			case T__13:
			case T__35:
			case NL:
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Expr_andContext extends ParserRuleContext {
		public Expr_eqContext expr_eq() {
			return getRuleContext(Expr_eqContext.class,0);
		}
		public Expr_and_tmpContext expr_and_tmp() {
			return getRuleContext(Expr_and_tmpContext.class,0);
		}
		public Expr_andContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr_and; }
	}

	public final Expr_andContext expr_and() throws RecognitionException {
		Expr_andContext _localctx = new Expr_andContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_expr_and);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(289);
			expr_eq();
			setState(290);
			expr_and_tmp();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Expr_and_tmpContext extends ParserRuleContext {
		public Expr_eqContext expr_eq() {
			return getRuleContext(Expr_eqContext.class,0);
		}
		public Expr_and_tmpContext expr_and_tmp() {
			return getRuleContext(Expr_and_tmpContext.class,0);
		}
		public Expr_and_tmpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr_and_tmp; }
	}

	public final Expr_and_tmpContext expr_and_tmp() throws RecognitionException {
		Expr_and_tmpContext _localctx = new Expr_and_tmpContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_expr_and_tmp);
		try {
			setState(297);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__26:
				enterOuterAlt(_localctx, 1);
				{
				setState(292);
				match(T__26);
				setState(293);
				expr_eq();
				setState(294);
				expr_and_tmp();
				}
				break;
			case T__4:
			case T__7:
			case T__10:
			case T__13:
			case T__25:
			case T__35:
			case NL:
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Expr_eqContext extends ParserRuleContext {
		public Expr_cmpContext expr_cmp() {
			return getRuleContext(Expr_cmpContext.class,0);
		}
		public Expr_eq_tmpContext expr_eq_tmp() {
			return getRuleContext(Expr_eq_tmpContext.class,0);
		}
		public Expr_eqContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr_eq; }
	}

	public final Expr_eqContext expr_eq() throws RecognitionException {
		Expr_eqContext _localctx = new Expr_eqContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_expr_eq);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(299);
			expr_cmp();
			setState(300);
			expr_eq_tmp();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Expr_eq_tmpContext extends ParserRuleContext {
		public Expr_cmpContext expr_cmp() {
			return getRuleContext(Expr_cmpContext.class,0);
		}
		public Expr_eq_tmpContext expr_eq_tmp() {
			return getRuleContext(Expr_eq_tmpContext.class,0);
		}
		public Expr_eq_tmpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr_eq_tmp; }
	}

	public final Expr_eq_tmpContext expr_eq_tmp() throws RecognitionException {
		Expr_eq_tmpContext _localctx = new Expr_eq_tmpContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_expr_eq_tmp);
		int _la;
		try {
			setState(307);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__27:
			case T__28:
				enterOuterAlt(_localctx, 1);
				{
				setState(302);
				_la = _input.LA(1);
				if ( !(_la==T__27 || _la==T__28) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(303);
				expr_cmp();
				setState(304);
				expr_eq_tmp();
				}
				break;
			case T__4:
			case T__7:
			case T__10:
			case T__13:
			case T__25:
			case T__26:
			case T__35:
			case NL:
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Expr_cmpContext extends ParserRuleContext {
		public Expr_addContext expr_add() {
			return getRuleContext(Expr_addContext.class,0);
		}
		public Expr_cmp_tmpContext expr_cmp_tmp() {
			return getRuleContext(Expr_cmp_tmpContext.class,0);
		}
		public Expr_cmpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr_cmp; }
	}

	public final Expr_cmpContext expr_cmp() throws RecognitionException {
		Expr_cmpContext _localctx = new Expr_cmpContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_expr_cmp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(309);
			expr_add();
			setState(310);
			expr_cmp_tmp();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Expr_cmp_tmpContext extends ParserRuleContext {
		public Expr_addContext expr_add() {
			return getRuleContext(Expr_addContext.class,0);
		}
		public Expr_cmp_tmpContext expr_cmp_tmp() {
			return getRuleContext(Expr_cmp_tmpContext.class,0);
		}
		public Expr_cmp_tmpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr_cmp_tmp; }
	}

	public final Expr_cmp_tmpContext expr_cmp_tmp() throws RecognitionException {
		Expr_cmp_tmpContext _localctx = new Expr_cmp_tmpContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_expr_cmp_tmp);
		int _la;
		try {
			setState(317);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__1:
			case T__2:
				enterOuterAlt(_localctx, 1);
				{
				setState(312);
				_la = _input.LA(1);
				if ( !(_la==T__1 || _la==T__2) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(313);
				expr_add();
				setState(314);
				expr_cmp_tmp();
				}
				break;
			case T__4:
			case T__7:
			case T__10:
			case T__13:
			case T__25:
			case T__26:
			case T__27:
			case T__28:
			case T__35:
			case NL:
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Expr_addContext extends ParserRuleContext {
		public Expr_multContext expr_mult() {
			return getRuleContext(Expr_multContext.class,0);
		}
		public Expr_add_tmpContext expr_add_tmp() {
			return getRuleContext(Expr_add_tmpContext.class,0);
		}
		public Expr_addContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr_add; }
	}

	public final Expr_addContext expr_add() throws RecognitionException {
		Expr_addContext _localctx = new Expr_addContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_expr_add);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(319);
			expr_mult();
			setState(320);
			expr_add_tmp();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Expr_add_tmpContext extends ParserRuleContext {
		public Expr_multContext expr_mult() {
			return getRuleContext(Expr_multContext.class,0);
		}
		public Expr_add_tmpContext expr_add_tmp() {
			return getRuleContext(Expr_add_tmpContext.class,0);
		}
		public Expr_add_tmpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr_add_tmp; }
	}

	public final Expr_add_tmpContext expr_add_tmp() throws RecognitionException {
		Expr_add_tmpContext _localctx = new Expr_add_tmpContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_expr_add_tmp);
		int _la;
		try {
			setState(327);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__29:
			case T__30:
				enterOuterAlt(_localctx, 1);
				{
				setState(322);
				_la = _input.LA(1);
				if ( !(_la==T__29 || _la==T__30) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(323);
				expr_mult();
				setState(324);
				expr_add_tmp();
				}
				break;
			case T__1:
			case T__2:
			case T__4:
			case T__7:
			case T__10:
			case T__13:
			case T__25:
			case T__26:
			case T__27:
			case T__28:
			case T__35:
			case NL:
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Expr_multContext extends ParserRuleContext {
		public Expr_unContext expr_un() {
			return getRuleContext(Expr_unContext.class,0);
		}
		public Expr_mult_tmpContext expr_mult_tmp() {
			return getRuleContext(Expr_mult_tmpContext.class,0);
		}
		public Expr_multContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr_mult; }
	}

	public final Expr_multContext expr_mult() throws RecognitionException {
		Expr_multContext _localctx = new Expr_multContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_expr_mult);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(329);
			expr_un();
			setState(330);
			expr_mult_tmp();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Expr_mult_tmpContext extends ParserRuleContext {
		public Expr_unContext expr_un() {
			return getRuleContext(Expr_unContext.class,0);
		}
		public Expr_mult_tmpContext expr_mult_tmp() {
			return getRuleContext(Expr_mult_tmpContext.class,0);
		}
		public Expr_mult_tmpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr_mult_tmp; }
	}

	public final Expr_mult_tmpContext expr_mult_tmp() throws RecognitionException {
		Expr_mult_tmpContext _localctx = new Expr_mult_tmpContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_expr_mult_tmp);
		int _la;
		try {
			setState(337);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__31:
			case T__32:
				enterOuterAlt(_localctx, 1);
				{
				setState(332);
				_la = _input.LA(1);
				if ( !(_la==T__31 || _la==T__32) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(333);
				expr_un();
				setState(334);
				expr_mult_tmp();
				}
				break;
			case T__1:
			case T__2:
			case T__4:
			case T__7:
			case T__10:
			case T__13:
			case T__25:
			case T__26:
			case T__27:
			case T__28:
			case T__29:
			case T__30:
			case T__35:
			case NL:
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Expr_unContext extends ParserRuleContext {
		public Expr_unContext expr_un() {
			return getRuleContext(Expr_unContext.class,0);
		}
		public Expr_memContext expr_mem() {
			return getRuleContext(Expr_memContext.class,0);
		}
		public Expr_unContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr_un; }
	}

	public final Expr_unContext expr_un() throws RecognitionException {
		Expr_unContext _localctx = new Expr_unContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_expr_un);
		int _la;
		try {
			setState(342);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__30:
			case T__33:
				enterOuterAlt(_localctx, 1);
				{
				setState(339);
				_la = _input.LA(1);
				if ( !(_la==T__30 || _la==T__33) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(340);
				expr_un();
				}
				break;
			case T__6:
			case T__34:
			case T__36:
			case CONST_NUM:
			case CONST_CHAR:
			case CONST_STR:
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(341);
				expr_mem();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Expr_memContext extends ParserRuleContext {
		public Expr_otherContext expr_other() {
			return getRuleContext(Expr_otherContext.class,0);
		}
		public Expr_mem_tmpContext expr_mem_tmp() {
			return getRuleContext(Expr_mem_tmpContext.class,0);
		}
		public Expr_memContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr_mem; }
	}

	public final Expr_memContext expr_mem() throws RecognitionException {
		Expr_memContext _localctx = new Expr_memContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_expr_mem);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(344);
			expr_other();
			setState(345);
			expr_mem_tmp();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Expr_mem_tmpContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Expr_mem_tmpContext expr_mem_tmp() {
			return getRuleContext(Expr_mem_tmpContext.class,0);
		}
		public Expr_mem_tmpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr_mem_tmp; }
	}

	public final Expr_mem_tmpContext expr_mem_tmp() throws RecognitionException {
		Expr_mem_tmpContext _localctx = new Expr_mem_tmpContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_expr_mem_tmp);
		try {
			setState(353);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__9:
				enterOuterAlt(_localctx, 1);
				{
				setState(347);
				match(T__9);
				setState(348);
				expr();
				setState(349);
				match(T__10);
				setState(350);
				expr_mem_tmp();
				}
				break;
			case T__1:
			case T__2:
			case T__4:
			case T__7:
			case T__10:
			case T__13:
			case T__25:
			case T__26:
			case T__27:
			case T__28:
			case T__29:
			case T__30:
			case T__31:
			case T__32:
			case T__35:
			case NL:
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Expr_otherContext extends ParserRuleContext {
		public Token var;
		public TerminalNode CONST_NUM() { return getToken(AtalkPass2Parser.CONST_NUM, 0); }
		public TerminalNode CONST_CHAR() { return getToken(AtalkPass2Parser.CONST_CHAR, 0); }
		public TerminalNode CONST_STR() { return getToken(AtalkPass2Parser.CONST_STR, 0); }
		public TerminalNode ID() { return getToken(AtalkPass2Parser.ID, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public Expr_otherContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr_other; }
	}

	public final Expr_otherContext expr_other() throws RecognitionException {
		Expr_otherContext _localctx = new Expr_otherContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_expr_other);
		int _la;
		try {
			setState(379);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CONST_NUM:
				enterOuterAlt(_localctx, 1);
				{
				setState(355);
				match(CONST_NUM);
				}
				break;
			case CONST_CHAR:
				enterOuterAlt(_localctx, 2);
				{
				setState(356);
				match(CONST_CHAR);
				}
				break;
			case CONST_STR:
				enterOuterAlt(_localctx, 3);
				{
				setState(357);
				match(CONST_STR);
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 4);
				{
				setState(358);
				((Expr_otherContext)_localctx).var = match(ID);
				 checkExistance((((Expr_otherContext)_localctx).var!=null?((Expr_otherContext)_localctx).var.getLine():0), ((Expr_otherContext)_localctx).var.getText()); 
				}
				break;
			case T__34:
				enterOuterAlt(_localctx, 5);
				{
				setState(360);
				match(T__34);
				setState(361);
				expr();
				setState(366);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__4) {
					{
					{
					setState(362);
					match(T__4);
					setState(363);
					expr();
					}
					}
					setState(368);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(369);
				match(T__35);
				}
				break;
			case T__36:
				enterOuterAlt(_localctx, 6);
				{
				setState(371);
				match(T__36);
				setState(372);
				match(T__6);
				setState(373);
				match(CONST_NUM);
				setState(374);
				match(T__7);
				}
				break;
			case T__6:
				enterOuterAlt(_localctx, 7);
				{
				setState(375);
				match(T__6);
				setState(376);
				expr();
				setState(377);
				match(T__7);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3.\u0180\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\3\2\3\2\3\2\7\2J\n\2\f\2\16\2M\13\2\3\2\3\2\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\7\3[\n\3\f\3\16\3^\13\3\3\3\3\3\3\3\3"+
		"\3\3\4\3\4\3\4\3\4\7\4h\n\4\f\4\16\4k\13\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\7\5x\n\5\f\5\16\5{\13\5\5\5}\n\5\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\3\5\3\6\3\6\3\6\3\6\7\6\u008b\n\6\f\6\16\6\u008e\13\6\3\6\3\6"+
		"\3\6\3\6\3\6\7\6\u0095\n\6\f\6\16\6\u0098\13\6\3\6\5\6\u009b\n\6\3\7\3"+
		"\7\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\7\b\u00a7\n\b\f\b\16\b\u00aa\13\b\3"+
		"\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u00b5\n\t\3\n\3\n\3\n\3\n\3\n\5"+
		"\n\u00bc\n\n\3\n\3\n\3\n\3\n\3\n\5\n\u00c3\n\n\7\n\u00c5\n\n\f\n\16\n"+
		"\u00c8\13\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\7\13\u00d3\n\13"+
		"\f\13\16\13\u00d6\13\13\5\13\u00d8\n\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f"+
		"\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\7\r\u00ee\n\r\f\r"+
		"\16\r\u00f1\13\r\3\r\3\r\3\r\3\r\5\r\u00f7\n\r\3\r\3\r\3\r\3\r\3\16\3"+
		"\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\20\3"+
		"\20\3\20\3\21\3\21\3\21\3\22\3\22\3\23\3\23\3\23\3\23\3\23\5\23\u0118"+
		"\n\23\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\5\25\u0122\n\25\3\26\3\26"+
		"\3\26\3\27\3\27\3\27\3\27\3\27\5\27\u012c\n\27\3\30\3\30\3\30\3\31\3\31"+
		"\3\31\3\31\3\31\5\31\u0136\n\31\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3\33"+
		"\5\33\u0140\n\33\3\34\3\34\3\34\3\35\3\35\3\35\3\35\3\35\5\35\u014a\n"+
		"\35\3\36\3\36\3\36\3\37\3\37\3\37\3\37\3\37\5\37\u0154\n\37\3 \3 \3 \5"+
		" \u0159\n \3!\3!\3!\3\"\3\"\3\"\3\"\3\"\3\"\5\"\u0164\n\"\3#\3#\3#\3#"+
		"\3#\3#\3#\3#\3#\7#\u016f\n#\f#\16#\u0172\13#\3#\3#\3#\3#\3#\3#\3#\3#\3"+
		"#\3#\5#\u017e\n#\3#\2\2$\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&("+
		"*,.\60\62\64\668:<>@BD\2\t\3\3++\4\2\21\22,,\3\2\36\37\3\2\4\5\3\2 !\3"+
		"\2\"#\4\2!!$$\2\u0189\2F\3\2\2\2\4P\3\2\2\2\6c\3\2\2\2\bn\3\2\2\2\n\u009a"+
		"\3\2\2\2\f\u009c\3\2\2\2\16\u00a8\3\2\2\2\20\u00b4\3\2\2\2\22\u00b6\3"+
		"\2\2\2\24\u00cb\3\2\2\2\26\u00dc\3\2\2\2\30\u00e2\3\2\2\2\32\u00fc\3\2"+
		"\2\2\34\u0107\3\2\2\2\36\u010a\3\2\2\2 \u010d\3\2\2\2\"\u0110\3\2\2\2"+
		"$\u0117\3\2\2\2&\u0119\3\2\2\2(\u0121\3\2\2\2*\u0123\3\2\2\2,\u012b\3"+
		"\2\2\2.\u012d\3\2\2\2\60\u0135\3\2\2\2\62\u0137\3\2\2\2\64\u013f\3\2\2"+
		"\2\66\u0141\3\2\2\28\u0149\3\2\2\2:\u014b\3\2\2\2<\u0153\3\2\2\2>\u0158"+
		"\3\2\2\2@\u015a\3\2\2\2B\u0163\3\2\2\2D\u017d\3\2\2\2FK\b\2\1\2GJ\5\4"+
		"\3\2HJ\7+\2\2IG\3\2\2\2IH\3\2\2\2JM\3\2\2\2KI\3\2\2\2KL\3\2\2\2LN\3\2"+
		"\2\2MK\3\2\2\2NO\b\2\1\2O\3\3\2\2\2PQ\7\3\2\2QR\7,\2\2RS\7\4\2\2ST\7("+
		"\2\2TU\7\5\2\2UV\7+\2\2V\\\b\3\1\2W[\5\6\4\2X[\5\b\5\2Y[\7+\2\2ZW\3\2"+
		"\2\2ZX\3\2\2\2ZY\3\2\2\2[^\3\2\2\2\\Z\3\2\2\2\\]\3\2\2\2]_\3\2\2\2^\\"+
		"\3\2\2\2_`\7\6\2\2`a\b\3\1\2ab\t\2\2\2b\5\3\2\2\2cd\5\n\6\2di\7,\2\2e"+
		"f\7\7\2\2fh\7,\2\2ge\3\2\2\2hk\3\2\2\2ig\3\2\2\2ij\3\2\2\2jl\3\2\2\2k"+
		"i\3\2\2\2lm\7+\2\2m\7\3\2\2\2no\7\b\2\2op\7,\2\2p|\7\t\2\2qr\5\n\6\2r"+
		"y\7,\2\2st\7\7\2\2tu\5\n\6\2uv\7,\2\2vx\3\2\2\2ws\3\2\2\2x{\3\2\2\2yw"+
		"\3\2\2\2yz\3\2\2\2z}\3\2\2\2{y\3\2\2\2|q\3\2\2\2|}\3\2\2\2}~\3\2\2\2~"+
		"\177\7\n\2\2\177\u0080\7+\2\2\u0080\u0081\b\5\1\2\u0081\u0082\5\16\b\2"+
		"\u0082\u0083\7\6\2\2\u0083\u0084\7+\2\2\u0084\u0085\b\5\1\2\u0085\t\3"+
		"\2\2\2\u0086\u008c\7\13\2\2\u0087\u0088\7\f\2\2\u0088\u0089\7(\2\2\u0089"+
		"\u008b\7\r\2\2\u008a\u0087\3\2\2\2\u008b\u008e\3\2\2\2\u008c\u008a\3\2"+
		"\2\2\u008c\u008d\3\2\2\2\u008d\u008f\3\2\2\2\u008e\u008c\3\2\2\2\u008f"+
		"\u009b\b\6\1\2\u0090\u0096\7\16\2\2\u0091\u0092\7\f\2\2\u0092\u0093\7"+
		"(\2\2\u0093\u0095\7\r\2\2\u0094\u0091\3\2\2\2\u0095\u0098\3\2\2\2\u0096"+
		"\u0094\3\2\2\2\u0096\u0097\3\2\2\2\u0097\u0099\3\2\2\2\u0098\u0096\3\2"+
		"\2\2\u0099\u009b\b\6\1\2\u009a\u0086\3\2\2\2\u009a\u0090\3\2\2\2\u009b"+
		"\13\3\2\2\2\u009c\u009d\7\17\2\2\u009d\u009e\7+\2\2\u009e\u009f\b\7\1"+
		"\2\u009f\u00a0\5\16\b\2\u00a0\u00a1\7\6\2\2\u00a1\u00a2\7+\2\2\u00a2\u00a3"+
		"\b\7\1\2\u00a3\r\3\2\2\2\u00a4\u00a7\5\20\t\2\u00a5\u00a7\7+\2\2\u00a6"+
		"\u00a4\3\2\2\2\u00a6\u00a5\3\2\2\2\u00a7\u00aa\3\2\2\2\u00a8\u00a6\3\2"+
		"\2\2\u00a8\u00a9\3\2\2\2\u00a9\17\3\2\2\2\u00aa\u00a8\3\2\2\2\u00ab\u00b5"+
		"\5\22\n\2\u00ac\u00b5\5 \21\2\u00ad\u00b5\5\32\16\2\u00ae\u00b5\5\30\r"+
		"\2\u00af\u00b5\5\34\17\2\u00b0\u00b5\5\36\20\2\u00b1\u00b5\5\24\13\2\u00b2"+
		"\u00b5\5\26\f\2\u00b3\u00b5\5\f\7\2\u00b4\u00ab\3\2\2\2\u00b4\u00ac\3"+
		"\2\2\2\u00b4\u00ad\3\2\2\2\u00b4\u00ae\3\2\2\2\u00b4\u00af\3\2\2\2\u00b4"+
		"\u00b0\3\2\2\2\u00b4\u00b1\3\2\2\2\u00b4\u00b2\3\2\2\2\u00b4\u00b3\3\2"+
		"\2\2\u00b5\21\3\2\2\2\u00b6\u00b7\5\n\6\2\u00b7\u00b8\7,\2\2\u00b8\u00bb"+
		"\b\n\1\2\u00b9\u00ba\7\20\2\2\u00ba\u00bc\5\"\22\2\u00bb\u00b9\3\2\2\2"+
		"\u00bb\u00bc\3\2\2\2\u00bc\u00c6\3\2\2\2\u00bd\u00be\7\7\2\2\u00be\u00bf"+
		"\7,\2\2\u00bf\u00c2\b\n\1\2\u00c0\u00c1\7\20\2\2\u00c1\u00c3\5\"\22\2"+
		"\u00c2\u00c0\3\2\2\2\u00c2\u00c3\3\2\2\2\u00c3\u00c5\3\2\2\2\u00c4\u00bd"+
		"\3\2\2\2\u00c5\u00c8\3\2\2\2\u00c6\u00c4\3\2\2\2\u00c6\u00c7\3\2\2\2\u00c7"+
		"\u00c9\3\2\2\2\u00c8\u00c6\3\2\2\2\u00c9\u00ca\7+\2\2\u00ca\23\3\2\2\2"+
		"\u00cb\u00cc\t\3\2\2\u00cc\u00cd\7\23\2\2\u00cd\u00ce\7,\2\2\u00ce\u00d7"+
		"\7\t\2\2\u00cf\u00d4\5\"\22\2\u00d0\u00d1\7\7\2\2\u00d1\u00d3\5\"\22\2"+
		"\u00d2\u00d0\3\2\2\2\u00d3\u00d6\3\2\2\2\u00d4\u00d2\3\2\2\2\u00d4\u00d5"+
		"\3\2\2\2\u00d5\u00d8\3\2\2\2\u00d6\u00d4\3\2\2\2\u00d7\u00cf\3\2\2\2\u00d7"+
		"\u00d8\3\2\2\2\u00d8\u00d9\3\2\2\2\u00d9\u00da\7\n\2\2\u00da\u00db\7+"+
		"\2\2\u00db\25\3\2\2\2\u00dc\u00dd\7\24\2\2\u00dd\u00de\7\t\2\2\u00de\u00df"+
		"\5\"\22\2\u00df\u00e0\7\n\2\2\u00e0\u00e1\7+\2\2\u00e1\27\3\2\2\2\u00e2"+
		"\u00e3\7\25\2\2\u00e3\u00e4\5\"\22\2\u00e4\u00e5\7+\2\2\u00e5\u00e6\b"+
		"\r\1\2\u00e6\u00ef\5\16\b\2\u00e7\u00e8\7\26\2\2\u00e8\u00e9\5\"\22\2"+
		"\u00e9\u00ea\7+\2\2\u00ea\u00eb\b\r\1\2\u00eb\u00ec\5\16\b\2\u00ec\u00ee"+
		"\3\2\2\2\u00ed\u00e7\3\2\2\2\u00ee\u00f1\3\2\2\2\u00ef\u00ed\3\2\2\2\u00ef"+
		"\u00f0\3\2\2\2\u00f0\u00f6\3\2\2\2\u00f1\u00ef\3\2\2\2\u00f2\u00f3\7\27"+
		"\2\2\u00f3\u00f4\7+\2\2\u00f4\u00f5\b\r\1\2\u00f5\u00f7\5\16\b\2\u00f6"+
		"\u00f2\3\2\2\2\u00f6\u00f7\3\2\2\2\u00f7\u00f8\3\2\2\2\u00f8\u00f9\7\6"+
		"\2\2\u00f9\u00fa\7+\2\2\u00fa\u00fb\b\r\1\2\u00fb\31\3\2\2\2\u00fc\u00fd"+
		"\7\30\2\2\u00fd\u00fe\7,\2\2\u00fe\u00ff\7\31\2\2\u00ff\u0100\5\"\22\2"+
		"\u0100\u0101\7+\2\2\u0101\u0102\b\16\1\2\u0102\u0103\5\16\b\2\u0103\u0104"+
		"\7\6\2\2\u0104\u0105\7+\2\2\u0105\u0106\b\16\1\2\u0106\33\3\2\2\2\u0107"+
		"\u0108\7\32\2\2\u0108\u0109\7+\2\2\u0109\35\3\2\2\2\u010a\u010b\7\33\2"+
		"\2\u010b\u010c\7+\2\2\u010c\37\3\2\2\2\u010d\u010e\5\"\22\2\u010e\u010f"+
		"\7+\2\2\u010f!\3\2\2\2\u0110\u0111\5$\23\2\u0111#\3\2\2\2\u0112\u0113"+
		"\5&\24\2\u0113\u0114\7\20\2\2\u0114\u0115\5$\23\2\u0115\u0118\3\2\2\2"+
		"\u0116\u0118\5&\24\2\u0117\u0112\3\2\2\2\u0117\u0116\3\2\2\2\u0118%\3"+
		"\2\2\2\u0119\u011a\5*\26\2\u011a\u011b\5(\25\2\u011b\'\3\2\2\2\u011c\u011d"+
		"\7\34\2\2\u011d\u011e\5*\26\2\u011e\u011f\5(\25\2\u011f\u0122\3\2\2\2"+
		"\u0120\u0122\3\2\2\2\u0121\u011c\3\2\2\2\u0121\u0120\3\2\2\2\u0122)\3"+
		"\2\2\2\u0123\u0124\5.\30\2\u0124\u0125\5,\27\2\u0125+\3\2\2\2\u0126\u0127"+
		"\7\35\2\2\u0127\u0128\5.\30\2\u0128\u0129\5,\27\2\u0129\u012c\3\2\2\2"+
		"\u012a\u012c\3\2\2\2\u012b\u0126\3\2\2\2\u012b\u012a\3\2\2\2\u012c-\3"+
		"\2\2\2\u012d\u012e\5\62\32\2\u012e\u012f\5\60\31\2\u012f/\3\2\2\2\u0130"+
		"\u0131\t\4\2\2\u0131\u0132\5\62\32\2\u0132\u0133\5\60\31\2\u0133\u0136"+
		"\3\2\2\2\u0134\u0136\3\2\2\2\u0135\u0130\3\2\2\2\u0135\u0134\3\2\2\2\u0136"+
		"\61\3\2\2\2\u0137\u0138\5\66\34\2\u0138\u0139\5\64\33\2\u0139\63\3\2\2"+
		"\2\u013a\u013b\t\5\2\2\u013b\u013c\5\66\34\2\u013c\u013d\5\64\33\2\u013d"+
		"\u0140\3\2\2\2\u013e\u0140\3\2\2\2\u013f\u013a\3\2\2\2\u013f\u013e\3\2"+
		"\2\2\u0140\65\3\2\2\2\u0141\u0142\5:\36\2\u0142\u0143\58\35\2\u0143\67"+
		"\3\2\2\2\u0144\u0145\t\6\2\2\u0145\u0146\5:\36\2\u0146\u0147\58\35\2\u0147"+
		"\u014a\3\2\2\2\u0148\u014a\3\2\2\2\u0149\u0144\3\2\2\2\u0149\u0148\3\2"+
		"\2\2\u014a9\3\2\2\2\u014b\u014c\5> \2\u014c\u014d\5<\37\2\u014d;\3\2\2"+
		"\2\u014e\u014f\t\7\2\2\u014f\u0150\5> \2\u0150\u0151\5<\37\2\u0151\u0154"+
		"\3\2\2\2\u0152\u0154\3\2\2\2\u0153\u014e\3\2\2\2\u0153\u0152\3\2\2\2\u0154"+
		"=\3\2\2\2\u0155\u0156\t\b\2\2\u0156\u0159\5> \2\u0157\u0159\5@!\2\u0158"+
		"\u0155\3\2\2\2\u0158\u0157\3\2\2\2\u0159?\3\2\2\2\u015a\u015b\5D#\2\u015b"+
		"\u015c\5B\"\2\u015cA\3\2\2\2\u015d\u015e\7\f\2\2\u015e\u015f\5\"\22\2"+
		"\u015f\u0160\7\r\2\2\u0160\u0161\5B\"\2\u0161\u0164\3\2\2\2\u0162\u0164"+
		"\3\2\2\2\u0163\u015d\3\2\2\2\u0163\u0162\3\2\2\2\u0164C\3\2\2\2\u0165"+
		"\u017e\7(\2\2\u0166\u017e\7)\2\2\u0167\u017e\7*\2\2\u0168\u0169\7,\2\2"+
		"\u0169\u017e\b#\1\2\u016a\u016b\7%\2\2\u016b\u0170\5\"\22\2\u016c\u016d"+
		"\7\7\2\2\u016d\u016f\5\"\22\2\u016e\u016c\3\2\2\2\u016f\u0172\3\2\2\2"+
		"\u0170\u016e\3\2\2\2\u0170\u0171\3\2\2\2\u0171\u0173\3\2\2\2\u0172\u0170"+
		"\3\2\2\2\u0173\u0174\7&\2\2\u0174\u017e\3\2\2\2\u0175\u0176\7\'\2\2\u0176"+
		"\u0177\7\t\2\2\u0177\u0178\7(\2\2\u0178\u017e\7\n\2\2\u0179\u017a\7\t"+
		"\2\2\u017a\u017b\5\"\22\2\u017b\u017c\7\n\2\2\u017c\u017e\3\2\2\2\u017d"+
		"\u0165\3\2\2\2\u017d\u0166\3\2\2\2\u017d\u0167\3\2\2\2\u017d\u0168\3\2"+
		"\2\2\u017d\u016a\3\2\2\2\u017d\u0175\3\2\2\2\u017d\u0179\3\2\2\2\u017e"+
		"E\3\2\2\2!IKZ\\iy|\u008c\u0096\u009a\u00a6\u00a8\u00b4\u00bb\u00c2\u00c6"+
		"\u00d4\u00d7\u00ef\u00f6\u0117\u0121\u012b\u0135\u013f\u0149\u0153\u0158"+
		"\u0163\u0170\u017d";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}