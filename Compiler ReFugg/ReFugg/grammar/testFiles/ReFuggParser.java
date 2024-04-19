// Generated from ReFugg.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ReFuggParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		T__31=32, T__32=33, T__33=34, T__34=35, T__35=36, T__36=37, T__37=38, 
		T__38=39, T__39=40, T__40=41, T__41=42, T__42=43, T__43=44, MAIN=45, FUNC=46, 
		CLASS=47, VOID=48, FIELD=49, VAR=50, GLOBAL=51, METH=52, CONST=53, ISA=54, 
		PRIVATE=55, PUBLIC=56, PROTECTED=57, IF=58, ELSE=59, WHILE=60, DO=61, 
		FOR=62, CONTINUE=63, BREAK=64, GOTO=65, RETURN=66, LABEL=67, SWITCH=68, 
		CASE=69, DEFAULT=70, TRUE=71, FALSE=72, THIS=73, NULL=74, NEW=75, INT_LIT=76, 
		DOUBLE_LIT=77, CHAR_LIT=78, STRING_LIT=79, ID=80, COMMENT=81, BIG_COMMENT=82, 
		WS=83;
	public static final int
		RULE_program = 0, RULE_main = 1, RULE_func = 2, RULE_fHeader = 3, RULE_fParam = 4, 
		RULE_argList = 5, RULE_classDec = 6, RULE_poly = 7, RULE_visibilty = 8, 
		RULE_classConstructor = 9, RULE_method = 10, RULE_classField = 11, RULE_block = 12, 
		RULE_stmt = 13, RULE_ifStmt = 14, RULE_whileStmt = 15, RULE_doWhileStmt = 16, 
		RULE_forStmt = 17, RULE_jumpStmt = 18, RULE_label = 19, RULE_switchCase = 20, 
		RULE_caseBlock = 21, RULE_check = 22, RULE_varDec = 23, RULE_assign = 24, 
		RULE_globalVar = 25, RULE_constArray = 26, RULE_constDelc = 27, RULE_constList = 28, 
		RULE_constSubList = 29, RULE_constExprMany = 30, RULE_constExpr = 31, 
		RULE_constJoin = 32, RULE_constEQ = 33, RULE_constRel = 34, RULE_constLogic = 35, 
		RULE_constTerm = 36, RULE_constExpo = 37, RULE_constUnary = 38, RULE_constFactor = 39, 
		RULE_expr = 40, RULE_join = 41, RULE_eq = 42, RULE_rel = 43, RULE_logic = 44, 
		RULE_term = 45, RULE_expo = 46, RULE_unary = 47, RULE_factor = 48, RULE_fCall = 49, 
		RULE_methCall = 50, RULE_methCallTail = 51, RULE_create = 52, RULE_fArgs = 53, 
		RULE_index = 54, RULE_thisAccess = 55, RULE_list = 56, RULE_subList = 57, 
		RULE_exprMany = 58, RULE_returntype = 59, RULE_logicOp = 60, RULE_assignOP = 61, 
		RULE_postOP = 62, RULE_constant = 63, RULE_type = 64, RULE_identifier = 65, 
		RULE_or = 66, RULE_and = 67, RULE_notNeg = 68, RULE_eqOP = 69, RULE_add = 70, 
		RULE_mult = 71, RULE_expoOp = 72;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "main", "func", "fHeader", "fParam", "argList", "classDec", 
			"poly", "visibilty", "classConstructor", "method", "classField", "block", 
			"stmt", "ifStmt", "whileStmt", "doWhileStmt", "forStmt", "jumpStmt", 
			"label", "switchCase", "caseBlock", "check", "varDec", "assign", "globalVar", 
			"constArray", "constDelc", "constList", "constSubList", "constExprMany", 
			"constExpr", "constJoin", "constEQ", "constRel", "constLogic", "constTerm", 
			"constExpo", "constUnary", "constFactor", "expr", "join", "eq", "rel", 
			"logic", "term", "expo", "unary", "factor", "fCall", "methCall", "methCallTail", 
			"create", "fArgs", "index", "thisAccess", "list", "subList", "exprMany", 
			"returntype", "logicOp", "assignOP", "postOP", "constant", "type", "identifier", 
			"or", "and", "notNeg", "eqOP", "add", "mult", "expoOp"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'['", "']'", "'('", "')'", "','", "'{'", "'}'", "';'", "':'", 
			"'='", "'.'", "'<'", "'<='", "'>'", "'>='", "'+='", "'-='", "'*='", "'/='", 
			"'^='", "'%='", "'++'", "'--'", "'double'", "'int'", "'string'", "'char'", 
			"'boolean'", "'or'", "'||'", "'and'", "'&&'", "'not'", "'!'", "'-'", 
			"'=='", "'is'", "'!='", "'is not'", "'+'", "'*'", "'/'", "'%'", "'^'", 
			"'main:'", "'func:'", "'class:'", "'void'", "'field:'", "'var:'", "'global:'", 
			"'method:'", "'constructor:'", "'isa:'", "'private:'", "'public:'", "'protected:'", 
			"'if'", "'else'", "'while'", "'do'", "'for'", "'continue'", "'break'", 
			"'goto'", "'return'", "'label:'", "'switch'", "'case'", "'default'", 
			"'true'", "'false'", "'this'", "'null'", "'new'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, "MAIN", "FUNC", 
			"CLASS", "VOID", "FIELD", "VAR", "GLOBAL", "METH", "CONST", "ISA", "PRIVATE", 
			"PUBLIC", "PROTECTED", "IF", "ELSE", "WHILE", "DO", "FOR", "CONTINUE", 
			"BREAK", "GOTO", "RETURN", "LABEL", "SWITCH", "CASE", "DEFAULT", "TRUE", 
			"FALSE", "THIS", "NULL", "NEW", "INT_LIT", "DOUBLE_LIT", "CHAR_LIT", 
			"STRING_LIT", "ID", "COMMENT", "BIG_COMMENT", "WS"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
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
	public String getGrammarFileName() { return "ReFugg.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public ReFuggParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgramContext extends ParserRuleContext {
		public MainContext main() {
			return getRuleContext(MainContext.class,0);
		}
		public TerminalNode EOF() { return getToken(ReFuggParser.EOF, 0); }
		public List<FuncContext> func() {
			return getRuleContexts(FuncContext.class);
		}
		public FuncContext func(int i) {
			return getRuleContext(FuncContext.class,i);
		}
		public List<ClassDecContext> classDec() {
			return getRuleContexts(ClassDecContext.class);
		}
		public ClassDecContext classDec(int i) {
			return getRuleContext(ClassDecContext.class,i);
		}
		public List<GlobalVarContext> globalVar() {
			return getRuleContexts(GlobalVarContext.class);
		}
		public GlobalVarContext globalVar(int i) {
			return getRuleContext(GlobalVarContext.class,i);
		}
		public List<LabelContext> label() {
			return getRuleContexts(LabelContext.class);
		}
		public LabelContext label(int i) {
			return getRuleContext(LabelContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReFuggListener ) ((ReFuggListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReFuggListener ) ((ReFuggListener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReFuggVisitor ) return ((ReFuggVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(152);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 46)) & ~0x3f) == 0 && ((1L << (_la - 46)) & ((1L << (FUNC - 46)) | (1L << (CLASS - 46)) | (1L << (GLOBAL - 46)) | (1L << (LABEL - 46)))) != 0)) {
				{
				setState(150);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case FUNC:
					{
					setState(146);
					func();
					}
					break;
				case CLASS:
					{
					setState(147);
					classDec();
					}
					break;
				case GLOBAL:
					{
					setState(148);
					globalVar();
					}
					break;
				case LABEL:
					{
					setState(149);
					label();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(154);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(155);
			main();
			setState(156);
			match(EOF);
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

	public static class MainContext extends ParserRuleContext {
		public TerminalNode MAIN() { return getToken(ReFuggParser.MAIN, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public MainContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_main; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReFuggListener ) ((ReFuggListener)listener).enterMain(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReFuggListener ) ((ReFuggListener)listener).exitMain(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReFuggVisitor ) return ((ReFuggVisitor<? extends T>)visitor).visitMain(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MainContext main() throws RecognitionException {
		MainContext _localctx = new MainContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_main);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(158);
			match(MAIN);
			setState(159);
			block();
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

	public static class FuncContext extends ParserRuleContext {
		public TerminalNode FUNC() { return getToken(ReFuggParser.FUNC, 0); }
		public FHeaderContext fHeader() {
			return getRuleContext(FHeaderContext.class,0);
		}
		public FParamContext fParam() {
			return getRuleContext(FParamContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public FuncContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_func; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReFuggListener ) ((ReFuggListener)listener).enterFunc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReFuggListener ) ((ReFuggListener)listener).exitFunc(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReFuggVisitor ) return ((ReFuggVisitor<? extends T>)visitor).visitFunc(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FuncContext func() throws RecognitionException {
		FuncContext _localctx = new FuncContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_func);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(161);
			match(FUNC);
			setState(162);
			fHeader();
			setState(163);
			fParam();
			setState(164);
			block();
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

	public static class FHeaderContext extends ParserRuleContext {
		public ReturntypeContext returntype() {
			return getRuleContext(ReturntypeContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public FHeaderContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fHeader; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReFuggListener ) ((ReFuggListener)listener).enterFHeader(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReFuggListener ) ((ReFuggListener)listener).exitFHeader(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReFuggVisitor ) return ((ReFuggVisitor<? extends T>)visitor).visitFHeader(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FHeaderContext fHeader() throws RecognitionException {
		FHeaderContext _localctx = new FHeaderContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_fHeader);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(166);
			returntype();
			setState(171);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0) {
				{
				{
				setState(167);
				match(T__0);
				setState(168);
				match(T__1);
				}
				}
				setState(173);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(174);
			identifier();
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

	public static class FParamContext extends ParserRuleContext {
		public ArgListContext argList() {
			return getRuleContext(ArgListContext.class,0);
		}
		public FParamContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fParam; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReFuggListener ) ((ReFuggListener)listener).enterFParam(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReFuggListener ) ((ReFuggListener)listener).exitFParam(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReFuggVisitor ) return ((ReFuggVisitor<? extends T>)visitor).visitFParam(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FParamContext fParam() throws RecognitionException {
		FParamContext _localctx = new FParamContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_fParam);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(176);
			match(T__2);
			setState(178);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 24)) & ~0x3f) == 0 && ((1L << (_la - 24)) & ((1L << (T__23 - 24)) | (1L << (T__24 - 24)) | (1L << (T__25 - 24)) | (1L << (T__26 - 24)) | (1L << (T__27 - 24)) | (1L << (ID - 24)))) != 0)) {
				{
				setState(177);
				argList();
				}
			}

			setState(180);
			match(T__3);
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

	public static class ArgListContext extends ParserRuleContext {
		public List<TypeContext> type() {
			return getRuleContexts(TypeContext.class);
		}
		public TypeContext type(int i) {
			return getRuleContext(TypeContext.class,i);
		}
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public List<ConstArrayContext> constArray() {
			return getRuleContexts(ConstArrayContext.class);
		}
		public ConstArrayContext constArray(int i) {
			return getRuleContext(ConstArrayContext.class,i);
		}
		public ArgListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReFuggListener ) ((ReFuggListener)listener).enterArgList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReFuggListener ) ((ReFuggListener)listener).exitArgList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReFuggVisitor ) return ((ReFuggVisitor<? extends T>)visitor).visitArgList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgListContext argList() throws RecognitionException {
		ArgListContext _localctx = new ArgListContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_argList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(182);
			type();
			setState(186);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0) {
				{
				{
				setState(183);
				constArray();
				}
				}
				setState(188);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(189);
			identifier();
			setState(202);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__4) {
				{
				{
				setState(190);
				match(T__4);
				setState(191);
				type();
				setState(195);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__0) {
					{
					{
					setState(192);
					constArray();
					}
					}
					setState(197);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(198);
				identifier();
				}
				}
				setState(204);
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

	public static class ClassDecContext extends ParserRuleContext {
		public TerminalNode CLASS() { return getToken(ReFuggParser.CLASS, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public PolyContext poly() {
			return getRuleContext(PolyContext.class,0);
		}
		public List<ClassConstructorContext> classConstructor() {
			return getRuleContexts(ClassConstructorContext.class);
		}
		public ClassConstructorContext classConstructor(int i) {
			return getRuleContext(ClassConstructorContext.class,i);
		}
		public List<VisibiltyContext> visibilty() {
			return getRuleContexts(VisibiltyContext.class);
		}
		public VisibiltyContext visibilty(int i) {
			return getRuleContext(VisibiltyContext.class,i);
		}
		public List<ClassFieldContext> classField() {
			return getRuleContexts(ClassFieldContext.class);
		}
		public ClassFieldContext classField(int i) {
			return getRuleContext(ClassFieldContext.class,i);
		}
		public List<MethodContext> method() {
			return getRuleContexts(MethodContext.class);
		}
		public MethodContext method(int i) {
			return getRuleContext(MethodContext.class,i);
		}
		public ClassDecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classDec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReFuggListener ) ((ReFuggListener)listener).enterClassDec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReFuggListener ) ((ReFuggListener)listener).exitClassDec(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReFuggVisitor ) return ((ReFuggVisitor<? extends T>)visitor).visitClassDec(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassDecContext classDec() throws RecognitionException {
		ClassDecContext _localctx = new ClassDecContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_classDec);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(205);
			match(CLASS);
			setState(206);
			identifier();
			setState(208);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ISA) {
				{
				setState(207);
				poly();
				}
			}

			setState(210);
			match(T__5);
			setState(220);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << CONST) | (1L << PRIVATE) | (1L << PUBLIC) | (1L << PROTECTED))) != 0)) {
				{
				setState(218);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
				case 1:
					{
					setState(211);
					classConstructor();
					}
					break;
				case 2:
					{
					{
					setState(212);
					visibilty();
					setState(213);
					classField();
					}
					}
					break;
				case 3:
					{
					{
					setState(215);
					visibilty();
					setState(216);
					method();
					}
					}
					break;
				}
				}
				setState(222);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(223);
			match(T__6);
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

	public static class PolyContext extends ParserRuleContext {
		public TerminalNode ISA() { return getToken(ReFuggParser.ISA, 0); }
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public PolyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_poly; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReFuggListener ) ((ReFuggListener)listener).enterPoly(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReFuggListener ) ((ReFuggListener)listener).exitPoly(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReFuggVisitor ) return ((ReFuggVisitor<? extends T>)visitor).visitPoly(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PolyContext poly() throws RecognitionException {
		PolyContext _localctx = new PolyContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_poly);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(225);
			match(ISA);
			setState(226);
			identifier();
			setState(231);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__4) {
				{
				{
				setState(227);
				match(T__4);
				setState(228);
				identifier();
				}
				}
				setState(233);
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

	public static class VisibiltyContext extends ParserRuleContext {
		public TerminalNode PUBLIC() { return getToken(ReFuggParser.PUBLIC, 0); }
		public TerminalNode PRIVATE() { return getToken(ReFuggParser.PRIVATE, 0); }
		public TerminalNode PROTECTED() { return getToken(ReFuggParser.PROTECTED, 0); }
		public VisibiltyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_visibilty; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReFuggListener ) ((ReFuggListener)listener).enterVisibilty(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReFuggListener ) ((ReFuggListener)listener).exitVisibilty(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReFuggVisitor ) return ((ReFuggVisitor<? extends T>)visitor).visitVisibilty(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VisibiltyContext visibilty() throws RecognitionException {
		VisibiltyContext _localctx = new VisibiltyContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_visibilty);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(234);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PRIVATE) | (1L << PUBLIC) | (1L << PROTECTED))) != 0)) ) {
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

	public static class ClassConstructorContext extends ParserRuleContext {
		public TerminalNode CONST() { return getToken(ReFuggParser.CONST, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public FParamContext fParam() {
			return getRuleContext(FParamContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public ClassConstructorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classConstructor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReFuggListener ) ((ReFuggListener)listener).enterClassConstructor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReFuggListener ) ((ReFuggListener)listener).exitClassConstructor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReFuggVisitor ) return ((ReFuggVisitor<? extends T>)visitor).visitClassConstructor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassConstructorContext classConstructor() throws RecognitionException {
		ClassConstructorContext _localctx = new ClassConstructorContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_classConstructor);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(236);
			match(CONST);
			setState(237);
			identifier();
			setState(238);
			fParam();
			setState(239);
			block();
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

	public static class MethodContext extends ParserRuleContext {
		public TerminalNode METH() { return getToken(ReFuggParser.METH, 0); }
		public FHeaderContext fHeader() {
			return getRuleContext(FHeaderContext.class,0);
		}
		public FParamContext fParam() {
			return getRuleContext(FParamContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public MethodContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_method; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReFuggListener ) ((ReFuggListener)listener).enterMethod(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReFuggListener ) ((ReFuggListener)listener).exitMethod(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReFuggVisitor ) return ((ReFuggVisitor<? extends T>)visitor).visitMethod(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodContext method() throws RecognitionException {
		MethodContext _localctx = new MethodContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_method);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(241);
			match(METH);
			setState(242);
			fHeader();
			setState(243);
			fParam();
			setState(244);
			block();
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

	public static class ClassFieldContext extends ParserRuleContext {
		public TerminalNode FIELD() { return getToken(ReFuggParser.FIELD, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public List<ConstArrayContext> constArray() {
			return getRuleContexts(ConstArrayContext.class);
		}
		public ConstArrayContext constArray(int i) {
			return getRuleContext(ConstArrayContext.class,i);
		}
		public ClassFieldContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classField; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReFuggListener ) ((ReFuggListener)listener).enterClassField(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReFuggListener ) ((ReFuggListener)listener).exitClassField(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReFuggVisitor ) return ((ReFuggVisitor<? extends T>)visitor).visitClassField(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassFieldContext classField() throws RecognitionException {
		ClassFieldContext _localctx = new ClassFieldContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_classField);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(246);
			match(FIELD);
			setState(247);
			type();
			setState(251);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0) {
				{
				{
				setState(248);
				constArray();
				}
				}
				setState(253);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(254);
			identifier();
			setState(255);
			match(T__7);
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
		public List<StmtContext> stmt() {
			return getRuleContexts(StmtContext.class);
		}
		public StmtContext stmt(int i) {
			return getRuleContext(StmtContext.class,i);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReFuggListener ) ((ReFuggListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReFuggListener ) ((ReFuggListener)listener).exitBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReFuggVisitor ) return ((ReFuggVisitor<? extends T>)visitor).visitBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(257);
			match(T__5);
			setState(261);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__5) | (1L << T__32) | (1L << T__33) | (1L << T__34) | (1L << VAR) | (1L << IF) | (1L << WHILE) | (1L << DO) | (1L << FOR) | (1L << CONTINUE))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (BREAK - 64)) | (1L << (GOTO - 64)) | (1L << (RETURN - 64)) | (1L << (LABEL - 64)) | (1L << (SWITCH - 64)) | (1L << (TRUE - 64)) | (1L << (FALSE - 64)) | (1L << (THIS - 64)) | (1L << (NULL - 64)) | (1L << (NEW - 64)) | (1L << (INT_LIT - 64)) | (1L << (DOUBLE_LIT - 64)) | (1L << (CHAR_LIT - 64)) | (1L << (STRING_LIT - 64)) | (1L << (ID - 64)))) != 0)) {
				{
				{
				setState(258);
				stmt();
				}
				}
				setState(263);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(264);
			match(T__6);
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

	public static class StmtContext extends ParserRuleContext {
		public StmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stmt; }
	 
		public StmtContext() { }
		public void copyFrom(StmtContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class WhileStatementContext extends StmtContext {
		public WhileStmtContext whileStmt() {
			return getRuleContext(WhileStmtContext.class,0);
		}
		public WhileStatementContext(StmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReFuggListener ) ((ReFuggListener)listener).enterWhileStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReFuggListener ) ((ReFuggListener)listener).exitWhileStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReFuggVisitor ) return ((ReFuggVisitor<? extends T>)visitor).visitWhileStatement(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BlockStatementContext extends StmtContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public BlockStatementContext(StmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReFuggListener ) ((ReFuggListener)listener).enterBlockStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReFuggListener ) ((ReFuggListener)listener).exitBlockStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReFuggVisitor ) return ((ReFuggVisitor<? extends T>)visitor).visitBlockStatement(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExprStatementContext extends StmtContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ExprStatementContext(StmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReFuggListener ) ((ReFuggListener)listener).enterExprStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReFuggListener ) ((ReFuggListener)listener).exitExprStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReFuggVisitor ) return ((ReFuggVisitor<? extends T>)visitor).visitExprStatement(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ForStatementContext extends StmtContext {
		public ForStmtContext forStmt() {
			return getRuleContext(ForStmtContext.class,0);
		}
		public ForStatementContext(StmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReFuggListener ) ((ReFuggListener)listener).enterForStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReFuggListener ) ((ReFuggListener)listener).exitForStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReFuggVisitor ) return ((ReFuggVisitor<? extends T>)visitor).visitForStatement(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DoWhileStatementContext extends StmtContext {
		public DoWhileStmtContext doWhileStmt() {
			return getRuleContext(DoWhileStmtContext.class,0);
		}
		public DoWhileStatementContext(StmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReFuggListener ) ((ReFuggListener)listener).enterDoWhileStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReFuggListener ) ((ReFuggListener)listener).exitDoWhileStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReFuggVisitor ) return ((ReFuggVisitor<? extends T>)visitor).visitDoWhileStatement(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AsssignStatementContext extends StmtContext {
		public AssignContext assign() {
			return getRuleContext(AssignContext.class,0);
		}
		public AsssignStatementContext(StmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReFuggListener ) ((ReFuggListener)listener).enterAsssignStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReFuggListener ) ((ReFuggListener)listener).exitAsssignStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReFuggVisitor ) return ((ReFuggVisitor<? extends T>)visitor).visitAsssignStatement(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IfStatementContext extends StmtContext {
		public IfStmtContext ifStmt() {
			return getRuleContext(IfStmtContext.class,0);
		}
		public IfStatementContext(StmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReFuggListener ) ((ReFuggListener)listener).enterIfStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReFuggListener ) ((ReFuggListener)listener).exitIfStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReFuggVisitor ) return ((ReFuggVisitor<? extends T>)visitor).visitIfStatement(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class VarDecStatementContext extends StmtContext {
		public VarDecContext varDec() {
			return getRuleContext(VarDecContext.class,0);
		}
		public VarDecStatementContext(StmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReFuggListener ) ((ReFuggListener)listener).enterVarDecStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReFuggListener ) ((ReFuggListener)listener).exitVarDecStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReFuggVisitor ) return ((ReFuggVisitor<? extends T>)visitor).visitVarDecStatement(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LabelStatementContext extends StmtContext {
		public LabelContext label() {
			return getRuleContext(LabelContext.class,0);
		}
		public LabelStatementContext(StmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReFuggListener ) ((ReFuggListener)listener).enterLabelStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReFuggListener ) ((ReFuggListener)listener).exitLabelStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReFuggVisitor ) return ((ReFuggVisitor<? extends T>)visitor).visitLabelStatement(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SwitchStatementContext extends StmtContext {
		public SwitchCaseContext switchCase() {
			return getRuleContext(SwitchCaseContext.class,0);
		}
		public SwitchStatementContext(StmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReFuggListener ) ((ReFuggListener)listener).enterSwitchStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReFuggListener ) ((ReFuggListener)listener).exitSwitchStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReFuggVisitor ) return ((ReFuggVisitor<? extends T>)visitor).visitSwitchStatement(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class JumpStatementContext extends StmtContext {
		public JumpStmtContext jumpStmt() {
			return getRuleContext(JumpStmtContext.class,0);
		}
		public JumpStatementContext(StmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReFuggListener ) ((ReFuggListener)listener).enterJumpStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReFuggListener ) ((ReFuggListener)listener).exitJumpStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReFuggVisitor ) return ((ReFuggVisitor<? extends T>)visitor).visitJumpStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StmtContext stmt() throws RecognitionException {
		StmtContext _localctx = new StmtContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_stmt);
		try {
			setState(287);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				_localctx = new IfStatementContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(266);
				ifStmt();
				}
				break;
			case 2:
				_localctx = new WhileStatementContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(267);
				whileStmt();
				}
				break;
			case 3:
				_localctx = new DoWhileStatementContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(268);
				doWhileStmt();
				setState(269);
				match(T__7);
				}
				break;
			case 4:
				_localctx = new ForStatementContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(271);
				forStmt();
				}
				break;
			case 5:
				_localctx = new SwitchStatementContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(272);
				switchCase();
				}
				break;
			case 6:
				_localctx = new LabelStatementContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(273);
				label();
				}
				break;
			case 7:
				_localctx = new BlockStatementContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(274);
				block();
				}
				break;
			case 8:
				_localctx = new VarDecStatementContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(275);
				varDec();
				setState(276);
				match(T__7);
				}
				break;
			case 9:
				_localctx = new AsssignStatementContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(278);
				assign();
				setState(279);
				match(T__7);
				}
				break;
			case 10:
				_localctx = new ExprStatementContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(281);
				expr(0);
				setState(282);
				match(T__7);
				}
				break;
			case 11:
				_localctx = new JumpStatementContext(_localctx);
				enterOuterAlt(_localctx, 11);
				{
				setState(284);
				jumpStmt();
				setState(285);
				match(T__7);
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

	public static class IfStmtContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(ReFuggParser.IF, 0); }
		public CheckContext check() {
			return getRuleContext(CheckContext.class,0);
		}
		public List<BlockContext> block() {
			return getRuleContexts(BlockContext.class);
		}
		public BlockContext block(int i) {
			return getRuleContext(BlockContext.class,i);
		}
		public TerminalNode ELSE() { return getToken(ReFuggParser.ELSE, 0); }
		public IfStmtContext ifStmt() {
			return getRuleContext(IfStmtContext.class,0);
		}
		public IfStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReFuggListener ) ((ReFuggListener)listener).enterIfStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReFuggListener ) ((ReFuggListener)listener).exitIfStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReFuggVisitor ) return ((ReFuggVisitor<? extends T>)visitor).visitIfStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfStmtContext ifStmt() throws RecognitionException {
		IfStmtContext _localctx = new IfStmtContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_ifStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(289);
			match(IF);
			setState(290);
			check();
			setState(291);
			block();
			setState(297);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(292);
				match(ELSE);
				setState(295);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case IF:
					{
					setState(293);
					ifStmt();
					}
					break;
				case T__5:
					{
					setState(294);
					block();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
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

	public static class WhileStmtContext extends ParserRuleContext {
		public TerminalNode WHILE() { return getToken(ReFuggParser.WHILE, 0); }
		public CheckContext check() {
			return getRuleContext(CheckContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public WhileStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whileStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReFuggListener ) ((ReFuggListener)listener).enterWhileStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReFuggListener ) ((ReFuggListener)listener).exitWhileStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReFuggVisitor ) return ((ReFuggVisitor<? extends T>)visitor).visitWhileStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhileStmtContext whileStmt() throws RecognitionException {
		WhileStmtContext _localctx = new WhileStmtContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_whileStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(299);
			match(WHILE);
			setState(300);
			check();
			setState(301);
			block();
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

	public static class DoWhileStmtContext extends ParserRuleContext {
		public TerminalNode DO() { return getToken(ReFuggParser.DO, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode WHILE() { return getToken(ReFuggParser.WHILE, 0); }
		public CheckContext check() {
			return getRuleContext(CheckContext.class,0);
		}
		public DoWhileStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_doWhileStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReFuggListener ) ((ReFuggListener)listener).enterDoWhileStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReFuggListener ) ((ReFuggListener)listener).exitDoWhileStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReFuggVisitor ) return ((ReFuggVisitor<? extends T>)visitor).visitDoWhileStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DoWhileStmtContext doWhileStmt() throws RecognitionException {
		DoWhileStmtContext _localctx = new DoWhileStmtContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_doWhileStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(303);
			match(DO);
			setState(304);
			block();
			setState(305);
			match(WHILE);
			setState(306);
			check();
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

	public static class ForStmtContext extends ParserRuleContext {
		public TerminalNode FOR() { return getToken(ReFuggParser.FOR, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public VarDecContext varDec() {
			return getRuleContext(VarDecContext.class,0);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public ForStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReFuggListener ) ((ReFuggListener)listener).enterForStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReFuggListener ) ((ReFuggListener)listener).exitForStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReFuggVisitor ) return ((ReFuggVisitor<? extends T>)visitor).visitForStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForStmtContext forStmt() throws RecognitionException {
		ForStmtContext _localctx = new ForStmtContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_forStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(308);
			match(FOR);
			setState(309);
			match(T__2);
			setState(312);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VAR:
				{
				setState(310);
				varDec();
				}
				break;
			case T__2:
			case T__5:
			case T__32:
			case T__33:
			case T__34:
			case TRUE:
			case FALSE:
			case THIS:
			case NULL:
			case NEW:
			case INT_LIT:
			case DOUBLE_LIT:
			case CHAR_LIT:
			case STRING_LIT:
			case ID:
				{
				setState(311);
				expr(0);
				}
				break;
			case T__7:
				break;
			default:
				break;
			}
			setState(314);
			match(T__7);
			setState(316);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__5) | (1L << T__32) | (1L << T__33) | (1L << T__34))) != 0) || ((((_la - 71)) & ~0x3f) == 0 && ((1L << (_la - 71)) & ((1L << (TRUE - 71)) | (1L << (FALSE - 71)) | (1L << (THIS - 71)) | (1L << (NULL - 71)) | (1L << (NEW - 71)) | (1L << (INT_LIT - 71)) | (1L << (DOUBLE_LIT - 71)) | (1L << (CHAR_LIT - 71)) | (1L << (STRING_LIT - 71)) | (1L << (ID - 71)))) != 0)) {
				{
				setState(315);
				expr(0);
				}
			}

			setState(318);
			match(T__7);
			setState(320);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__5) | (1L << T__32) | (1L << T__33) | (1L << T__34))) != 0) || ((((_la - 71)) & ~0x3f) == 0 && ((1L << (_la - 71)) & ((1L << (TRUE - 71)) | (1L << (FALSE - 71)) | (1L << (THIS - 71)) | (1L << (NULL - 71)) | (1L << (NEW - 71)) | (1L << (INT_LIT - 71)) | (1L << (DOUBLE_LIT - 71)) | (1L << (CHAR_LIT - 71)) | (1L << (STRING_LIT - 71)) | (1L << (ID - 71)))) != 0)) {
				{
				setState(319);
				expr(0);
				}
			}

			setState(322);
			match(T__3);
			setState(323);
			block();
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

	public static class JumpStmtContext extends ParserRuleContext {
		public JumpStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jumpStmt; }
	 
		public JumpStmtContext() { }
		public void copyFrom(JumpStmtContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class BreakStatementContext extends JumpStmtContext {
		public TerminalNode BREAK() { return getToken(ReFuggParser.BREAK, 0); }
		public BreakStatementContext(JumpStmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReFuggListener ) ((ReFuggListener)listener).enterBreakStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReFuggListener ) ((ReFuggListener)listener).exitBreakStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReFuggVisitor ) return ((ReFuggVisitor<? extends T>)visitor).visitBreakStatement(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ContinueStatementContext extends JumpStmtContext {
		public TerminalNode CONTINUE() { return getToken(ReFuggParser.CONTINUE, 0); }
		public ContinueStatementContext(JumpStmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReFuggListener ) ((ReFuggListener)listener).enterContinueStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReFuggListener ) ((ReFuggListener)listener).exitContinueStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReFuggVisitor ) return ((ReFuggVisitor<? extends T>)visitor).visitContinueStatement(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ReturnStatementContext extends JumpStmtContext {
		public TerminalNode RETURN() { return getToken(ReFuggParser.RETURN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ReturnStatementContext(JumpStmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReFuggListener ) ((ReFuggListener)listener).enterReturnStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReFuggListener ) ((ReFuggListener)listener).exitReturnStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReFuggVisitor ) return ((ReFuggVisitor<? extends T>)visitor).visitReturnStatement(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class GotoStatementContext extends JumpStmtContext {
		public TerminalNode GOTO() { return getToken(ReFuggParser.GOTO, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public GotoStatementContext(JumpStmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReFuggListener ) ((ReFuggListener)listener).enterGotoStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReFuggListener ) ((ReFuggListener)listener).exitGotoStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReFuggVisitor ) return ((ReFuggVisitor<? extends T>)visitor).visitGotoStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JumpStmtContext jumpStmt() throws RecognitionException {
		JumpStmtContext _localctx = new JumpStmtContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_jumpStmt);
		int _la;
		try {
			setState(333);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BREAK:
				_localctx = new BreakStatementContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(325);
				match(BREAK);
				}
				break;
			case CONTINUE:
				_localctx = new ContinueStatementContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(326);
				match(CONTINUE);
				}
				break;
			case GOTO:
				_localctx = new GotoStatementContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(327);
				match(GOTO);
				setState(328);
				identifier();
				}
				break;
			case RETURN:
				_localctx = new ReturnStatementContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(329);
				match(RETURN);
				setState(331);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__5) | (1L << T__32) | (1L << T__33) | (1L << T__34))) != 0) || ((((_la - 71)) & ~0x3f) == 0 && ((1L << (_la - 71)) & ((1L << (TRUE - 71)) | (1L << (FALSE - 71)) | (1L << (THIS - 71)) | (1L << (NULL - 71)) | (1L << (NEW - 71)) | (1L << (INT_LIT - 71)) | (1L << (DOUBLE_LIT - 71)) | (1L << (CHAR_LIT - 71)) | (1L << (STRING_LIT - 71)) | (1L << (ID - 71)))) != 0)) {
					{
					setState(330);
					expr(0);
					}
				}

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

	public static class LabelContext extends ParserRuleContext {
		public TerminalNode LABEL() { return getToken(ReFuggParser.LABEL, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public LabelContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_label; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReFuggListener ) ((ReFuggListener)listener).enterLabel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReFuggListener ) ((ReFuggListener)listener).exitLabel(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReFuggVisitor ) return ((ReFuggVisitor<? extends T>)visitor).visitLabel(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LabelContext label() throws RecognitionException {
		LabelContext _localctx = new LabelContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_label);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(335);
			match(LABEL);
			setState(336);
			identifier();
			setState(337);
			block();
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

	public static class SwitchCaseContext extends ParserRuleContext {
		public TerminalNode SWITCH() { return getToken(ReFuggParser.SWITCH, 0); }
		public CheckContext check() {
			return getRuleContext(CheckContext.class,0);
		}
		public List<CaseBlockContext> caseBlock() {
			return getRuleContexts(CaseBlockContext.class);
		}
		public CaseBlockContext caseBlock(int i) {
			return getRuleContext(CaseBlockContext.class,i);
		}
		public SwitchCaseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switchCase; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReFuggListener ) ((ReFuggListener)listener).enterSwitchCase(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReFuggListener ) ((ReFuggListener)listener).exitSwitchCase(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReFuggVisitor ) return ((ReFuggVisitor<? extends T>)visitor).visitSwitchCase(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SwitchCaseContext switchCase() throws RecognitionException {
		SwitchCaseContext _localctx = new SwitchCaseContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_switchCase);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(339);
			match(SWITCH);
			setState(340);
			check();
			setState(341);
			match(T__5);
			setState(343); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(342);
				caseBlock();
				}
				}
				setState(345); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==CASE || _la==DEFAULT );
			setState(347);
			match(T__6);
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

	public static class CaseBlockContext extends ParserRuleContext {
		public CaseBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_caseBlock; }
	 
		public CaseBlockContext() { }
		public void copyFrom(CaseBlockContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class CaseStatementContext extends CaseBlockContext {
		public TerminalNode CASE() { return getToken(ReFuggParser.CASE, 0); }
		public ConstExprContext constExpr() {
			return getRuleContext(ConstExprContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public CaseStatementContext(CaseBlockContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReFuggListener ) ((ReFuggListener)listener).enterCaseStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReFuggListener ) ((ReFuggListener)listener).exitCaseStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReFuggVisitor ) return ((ReFuggVisitor<? extends T>)visitor).visitCaseStatement(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DefaultStatementContext extends CaseBlockContext {
		public TerminalNode DEFAULT() { return getToken(ReFuggParser.DEFAULT, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public DefaultStatementContext(CaseBlockContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReFuggListener ) ((ReFuggListener)listener).enterDefaultStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReFuggListener ) ((ReFuggListener)listener).exitDefaultStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReFuggVisitor ) return ((ReFuggVisitor<? extends T>)visitor).visitDefaultStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CaseBlockContext caseBlock() throws RecognitionException {
		CaseBlockContext _localctx = new CaseBlockContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_caseBlock);
		try {
			setState(357);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CASE:
				_localctx = new CaseStatementContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(349);
				match(CASE);
				setState(350);
				constExpr(0);
				setState(351);
				match(T__8);
				setState(352);
				block();
				}
				break;
			case DEFAULT:
				_localctx = new DefaultStatementContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(354);
				match(DEFAULT);
				setState(355);
				match(T__8);
				setState(356);
				block();
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

	public static class CheckContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public CheckContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_check; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReFuggListener ) ((ReFuggListener)listener).enterCheck(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReFuggListener ) ((ReFuggListener)listener).exitCheck(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReFuggVisitor ) return ((ReFuggVisitor<? extends T>)visitor).visitCheck(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CheckContext check() throws RecognitionException {
		CheckContext _localctx = new CheckContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_check);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(359);
			match(T__2);
			setState(360);
			expr(0);
			setState(361);
			match(T__3);
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

	public static class VarDecContext extends ParserRuleContext {
		public TerminalNode VAR() { return getToken(ReFuggParser.VAR, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public List<ConstArrayContext> constArray() {
			return getRuleContexts(ConstArrayContext.class);
		}
		public ConstArrayContext constArray(int i) {
			return getRuleContext(ConstArrayContext.class,i);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public VarDecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varDec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReFuggListener ) ((ReFuggListener)listener).enterVarDec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReFuggListener ) ((ReFuggListener)listener).exitVarDec(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReFuggVisitor ) return ((ReFuggVisitor<? extends T>)visitor).visitVarDec(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarDecContext varDec() throws RecognitionException {
		VarDecContext _localctx = new VarDecContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_varDec);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(363);
			match(VAR);
			setState(364);
			type();
			setState(365);
			identifier();
			setState(369);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0) {
				{
				{
				setState(366);
				constArray();
				}
				}
				setState(371);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(374);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__9) {
				{
				setState(372);
				match(T__9);
				setState(373);
				expr(0);
				}
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

	public static class AssignContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public IndexContext index() {
			return getRuleContext(IndexContext.class,0);
		}
		public AssignOPContext assignOP() {
			return getRuleContext(AssignOPContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ThisAccessContext thisAccess() {
			return getRuleContext(ThisAccessContext.class,0);
		}
		public AssignContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assign; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReFuggListener ) ((ReFuggListener)listener).enterAssign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReFuggListener ) ((ReFuggListener)listener).exitAssign(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReFuggVisitor ) return ((ReFuggVisitor<? extends T>)visitor).visitAssign(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignContext assign() throws RecognitionException {
		AssignContext _localctx = new AssignContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_assign);
		try {
			setState(386);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(376);
				identifier();
				setState(377);
				index();
				setState(378);
				assignOP();
				setState(379);
				expr(0);
				}
				break;
			case THIS:
				enterOuterAlt(_localctx, 2);
				{
				setState(381);
				thisAccess();
				setState(382);
				index();
				setState(383);
				assignOP();
				setState(384);
				expr(0);
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

	public static class GlobalVarContext extends ParserRuleContext {
		public GlobalVarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_globalVar; }
	 
		public GlobalVarContext() { }
		public void copyFrom(GlobalVarContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class GlobalYesInitContext extends GlobalVarContext {
		public TerminalNode GLOBAL() { return getToken(ReFuggParser.GLOBAL, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ConstDelcContext constDelc() {
			return getRuleContext(ConstDelcContext.class,0);
		}
		public List<ConstArrayContext> constArray() {
			return getRuleContexts(ConstArrayContext.class);
		}
		public ConstArrayContext constArray(int i) {
			return getRuleContext(ConstArrayContext.class,i);
		}
		public GlobalYesInitContext(GlobalVarContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReFuggListener ) ((ReFuggListener)listener).enterGlobalYesInit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReFuggListener ) ((ReFuggListener)listener).exitGlobalYesInit(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReFuggVisitor ) return ((ReFuggVisitor<? extends T>)visitor).visitGlobalYesInit(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class GlobalNoInitContext extends GlobalVarContext {
		public TerminalNode GLOBAL() { return getToken(ReFuggParser.GLOBAL, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public List<ConstArrayContext> constArray() {
			return getRuleContexts(ConstArrayContext.class);
		}
		public ConstArrayContext constArray(int i) {
			return getRuleContext(ConstArrayContext.class,i);
		}
		public GlobalNoInitContext(GlobalVarContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReFuggListener ) ((ReFuggListener)listener).enterGlobalNoInit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReFuggListener ) ((ReFuggListener)listener).exitGlobalNoInit(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReFuggVisitor ) return ((ReFuggVisitor<? extends T>)visitor).visitGlobalNoInit(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GlobalVarContext globalVar() throws RecognitionException {
		GlobalVarContext _localctx = new GlobalVarContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_globalVar);
		int _la;
		try {
			setState(412);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
			case 1:
				_localctx = new GlobalNoInitContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(388);
				match(GLOBAL);
				setState(389);
				type();
				setState(390);
				identifier();
				setState(394);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__0) {
					{
					{
					setState(391);
					constArray();
					}
					}
					setState(396);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(397);
				match(T__7);
				}
				break;
			case 2:
				_localctx = new GlobalYesInitContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(399);
				match(GLOBAL);
				setState(400);
				type();
				setState(401);
				identifier();
				setState(405);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__0) {
					{
					{
					setState(402);
					constArray();
					}
					}
					setState(407);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(408);
				match(T__9);
				setState(409);
				constDelc();
				setState(410);
				match(T__7);
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

	public static class ConstArrayContext extends ParserRuleContext {
		public ConstArrayContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constArray; }
	 
		public ConstArrayContext() { }
		public void copyFrom(ConstArrayContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ConstUnknownArraysizeContext extends ConstArrayContext {
		public ConstUnknownArraysizeContext(ConstArrayContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReFuggListener ) ((ReFuggListener)listener).enterConstUnknownArraysize(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReFuggListener ) ((ReFuggListener)listener).exitConstUnknownArraysize(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReFuggVisitor ) return ((ReFuggVisitor<? extends T>)visitor).visitConstUnknownArraysize(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ConstKnownArraysizeContext extends ConstArrayContext {
		public ConstExprContext constExpr() {
			return getRuleContext(ConstExprContext.class,0);
		}
		public ConstKnownArraysizeContext(ConstArrayContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReFuggListener ) ((ReFuggListener)listener).enterConstKnownArraysize(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReFuggListener ) ((ReFuggListener)listener).exitConstKnownArraysize(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReFuggVisitor ) return ((ReFuggVisitor<? extends T>)visitor).visitConstKnownArraysize(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstArrayContext constArray() throws RecognitionException {
		ConstArrayContext _localctx = new ConstArrayContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_constArray);
		try {
			setState(420);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
			case 1:
				_localctx = new ConstKnownArraysizeContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(414);
				match(T__0);
				setState(415);
				constExpr(0);
				setState(416);
				match(T__1);
				}
				break;
			case 2:
				_localctx = new ConstUnknownArraysizeContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(418);
				match(T__0);
				setState(419);
				match(T__1);
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

	public static class ConstDelcContext extends ParserRuleContext {
		public ConstExprContext constExpr() {
			return getRuleContext(ConstExprContext.class,0);
		}
		public ConstListContext constList() {
			return getRuleContext(ConstListContext.class,0);
		}
		public ConstDelcContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constDelc; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReFuggListener ) ((ReFuggListener)listener).enterConstDelc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReFuggListener ) ((ReFuggListener)listener).exitConstDelc(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReFuggVisitor ) return ((ReFuggVisitor<? extends T>)visitor).visitConstDelc(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstDelcContext constDelc() throws RecognitionException {
		ConstDelcContext _localctx = new ConstDelcContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_constDelc);
		try {
			setState(424);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(422);
				constExpr(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(423);
				constList();
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

	public static class ConstListContext extends ParserRuleContext {
		public ConstListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constList; }
	 
		public ConstListContext() { }
		public void copyFrom(ConstListContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ConstListYesSubContext extends ConstListContext {
		public List<ConstSubListContext> constSubList() {
			return getRuleContexts(ConstSubListContext.class);
		}
		public ConstSubListContext constSubList(int i) {
			return getRuleContext(ConstSubListContext.class,i);
		}
		public ConstListYesSubContext(ConstListContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReFuggListener ) ((ReFuggListener)listener).enterConstListYesSub(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReFuggListener ) ((ReFuggListener)listener).exitConstListYesSub(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReFuggVisitor ) return ((ReFuggVisitor<? extends T>)visitor).visitConstListYesSub(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ConstListNoSubContext extends ConstListContext {
		public ConstExprManyContext constExprMany() {
			return getRuleContext(ConstExprManyContext.class,0);
		}
		public ConstListNoSubContext(ConstListContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReFuggListener ) ((ReFuggListener)listener).enterConstListNoSub(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReFuggListener ) ((ReFuggListener)listener).exitConstListNoSub(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReFuggVisitor ) return ((ReFuggVisitor<? extends T>)visitor).visitConstListNoSub(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstListContext constList() throws RecognitionException {
		ConstListContext _localctx = new ConstListContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_constList);
		int _la;
		try {
			setState(440);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
			case 1:
				_localctx = new ConstListNoSubContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(426);
				match(T__5);
				setState(427);
				constExprMany();
				setState(428);
				match(T__6);
				}
				break;
			case 2:
				_localctx = new ConstListYesSubContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(430);
				match(T__5);
				setState(431);
				constSubList();
				setState(434); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(432);
					match(T__4);
					setState(433);
					constSubList();
					}
					}
					setState(436); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==T__4 );
				setState(438);
				match(T__6);
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

	public static class ConstSubListContext extends ParserRuleContext {
		public ConstExprManyContext constExprMany() {
			return getRuleContext(ConstExprManyContext.class,0);
		}
		public ConstSubListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constSubList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReFuggListener ) ((ReFuggListener)listener).enterConstSubList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReFuggListener ) ((ReFuggListener)listener).exitConstSubList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReFuggVisitor ) return ((ReFuggVisitor<? extends T>)visitor).visitConstSubList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstSubListContext constSubList() throws RecognitionException {
		ConstSubListContext _localctx = new ConstSubListContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_constSubList);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(442);
			match(T__5);
			setState(443);
			constExprMany();
			setState(444);
			match(T__6);
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

	public static class ConstExprManyContext extends ParserRuleContext {
		public List<ConstExprContext> constExpr() {
			return getRuleContexts(ConstExprContext.class);
		}
		public ConstExprContext constExpr(int i) {
			return getRuleContext(ConstExprContext.class,i);
		}
		public ConstExprManyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constExprMany; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReFuggListener ) ((ReFuggListener)listener).enterConstExprMany(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReFuggListener ) ((ReFuggListener)listener).exitConstExprMany(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReFuggVisitor ) return ((ReFuggVisitor<? extends T>)visitor).visitConstExprMany(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstExprManyContext constExprMany() throws RecognitionException {
		ConstExprManyContext _localctx = new ConstExprManyContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_constExprMany);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(446);
			constExpr(0);
			setState(451);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__4) {
				{
				{
				setState(447);
				match(T__4);
				setState(448);
				constExpr(0);
				}
				}
				setState(453);
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

	public static class ConstExprContext extends ParserRuleContext {
		public ConstJoinContext constJoin() {
			return getRuleContext(ConstJoinContext.class,0);
		}
		public ConstExprContext constExpr() {
			return getRuleContext(ConstExprContext.class,0);
		}
		public OrContext or() {
			return getRuleContext(OrContext.class,0);
		}
		public ConstExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReFuggListener ) ((ReFuggListener)listener).enterConstExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReFuggListener ) ((ReFuggListener)listener).exitConstExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReFuggVisitor ) return ((ReFuggVisitor<? extends T>)visitor).visitConstExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstExprContext constExpr() throws RecognitionException {
		return constExpr(0);
	}

	private ConstExprContext constExpr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ConstExprContext _localctx = new ConstExprContext(_ctx, _parentState);
		ConstExprContext _prevctx = _localctx;
		int _startState = 62;
		enterRecursionRule(_localctx, 62, RULE_constExpr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(455);
			constJoin(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(463);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,34,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ConstExprContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_constExpr);
					setState(457);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(458);
					or();
					setState(459);
					constJoin(0);
					}
					} 
				}
				setState(465);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,34,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class ConstJoinContext extends ParserRuleContext {
		public ConstEQContext constEQ() {
			return getRuleContext(ConstEQContext.class,0);
		}
		public ConstJoinContext constJoin() {
			return getRuleContext(ConstJoinContext.class,0);
		}
		public AndContext and() {
			return getRuleContext(AndContext.class,0);
		}
		public ConstJoinContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constJoin; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReFuggListener ) ((ReFuggListener)listener).enterConstJoin(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReFuggListener ) ((ReFuggListener)listener).exitConstJoin(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReFuggVisitor ) return ((ReFuggVisitor<? extends T>)visitor).visitConstJoin(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstJoinContext constJoin() throws RecognitionException {
		return constJoin(0);
	}

	private ConstJoinContext constJoin(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ConstJoinContext _localctx = new ConstJoinContext(_ctx, _parentState);
		ConstJoinContext _prevctx = _localctx;
		int _startState = 64;
		enterRecursionRule(_localctx, 64, RULE_constJoin, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(467);
			constEQ(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(475);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,35,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ConstJoinContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_constJoin);
					setState(469);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(470);
					and();
					setState(471);
					constEQ(0);
					}
					} 
				}
				setState(477);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,35,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class ConstEQContext extends ParserRuleContext {
		public ConstRelContext constRel() {
			return getRuleContext(ConstRelContext.class,0);
		}
		public ConstEQContext constEQ() {
			return getRuleContext(ConstEQContext.class,0);
		}
		public EqOPContext eqOP() {
			return getRuleContext(EqOPContext.class,0);
		}
		public ConstEQContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constEQ; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReFuggListener ) ((ReFuggListener)listener).enterConstEQ(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReFuggListener ) ((ReFuggListener)listener).exitConstEQ(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReFuggVisitor ) return ((ReFuggVisitor<? extends T>)visitor).visitConstEQ(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstEQContext constEQ() throws RecognitionException {
		return constEQ(0);
	}

	private ConstEQContext constEQ(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ConstEQContext _localctx = new ConstEQContext(_ctx, _parentState);
		ConstEQContext _prevctx = _localctx;
		int _startState = 66;
		enterRecursionRule(_localctx, 66, RULE_constEQ, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(479);
			constRel(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(487);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,36,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ConstEQContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_constEQ);
					setState(481);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(482);
					eqOP();
					setState(483);
					constRel(0);
					}
					} 
				}
				setState(489);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,36,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class ConstRelContext extends ParserRuleContext {
		public ConstLogicContext constLogic() {
			return getRuleContext(ConstLogicContext.class,0);
		}
		public ConstRelContext constRel() {
			return getRuleContext(ConstRelContext.class,0);
		}
		public LogicOpContext logicOp() {
			return getRuleContext(LogicOpContext.class,0);
		}
		public ConstRelContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constRel; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReFuggListener ) ((ReFuggListener)listener).enterConstRel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReFuggListener ) ((ReFuggListener)listener).exitConstRel(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReFuggVisitor ) return ((ReFuggVisitor<? extends T>)visitor).visitConstRel(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstRelContext constRel() throws RecognitionException {
		return constRel(0);
	}

	private ConstRelContext constRel(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ConstRelContext _localctx = new ConstRelContext(_ctx, _parentState);
		ConstRelContext _prevctx = _localctx;
		int _startState = 68;
		enterRecursionRule(_localctx, 68, RULE_constRel, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(491);
			constLogic(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(499);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,37,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ConstRelContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_constRel);
					setState(493);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(494);
					logicOp();
					setState(495);
					constLogic(0);
					}
					} 
				}
				setState(501);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,37,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class ConstLogicContext extends ParserRuleContext {
		public ConstTermContext constTerm() {
			return getRuleContext(ConstTermContext.class,0);
		}
		public ConstLogicContext constLogic() {
			return getRuleContext(ConstLogicContext.class,0);
		}
		public AddContext add() {
			return getRuleContext(AddContext.class,0);
		}
		public ConstLogicContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constLogic; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReFuggListener ) ((ReFuggListener)listener).enterConstLogic(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReFuggListener ) ((ReFuggListener)listener).exitConstLogic(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReFuggVisitor ) return ((ReFuggVisitor<? extends T>)visitor).visitConstLogic(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstLogicContext constLogic() throws RecognitionException {
		return constLogic(0);
	}

	private ConstLogicContext constLogic(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ConstLogicContext _localctx = new ConstLogicContext(_ctx, _parentState);
		ConstLogicContext _prevctx = _localctx;
		int _startState = 70;
		enterRecursionRule(_localctx, 70, RULE_constLogic, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(503);
			constTerm(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(511);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,38,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ConstLogicContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_constLogic);
					setState(505);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(506);
					add();
					setState(507);
					constTerm(0);
					}
					} 
				}
				setState(513);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,38,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class ConstTermContext extends ParserRuleContext {
		public ConstExpoContext constExpo() {
			return getRuleContext(ConstExpoContext.class,0);
		}
		public ConstTermContext constTerm() {
			return getRuleContext(ConstTermContext.class,0);
		}
		public MultContext mult() {
			return getRuleContext(MultContext.class,0);
		}
		public ConstTermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constTerm; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReFuggListener ) ((ReFuggListener)listener).enterConstTerm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReFuggListener ) ((ReFuggListener)listener).exitConstTerm(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReFuggVisitor ) return ((ReFuggVisitor<? extends T>)visitor).visitConstTerm(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstTermContext constTerm() throws RecognitionException {
		return constTerm(0);
	}

	private ConstTermContext constTerm(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ConstTermContext _localctx = new ConstTermContext(_ctx, _parentState);
		ConstTermContext _prevctx = _localctx;
		int _startState = 72;
		enterRecursionRule(_localctx, 72, RULE_constTerm, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(515);
			constExpo(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(523);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,39,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ConstTermContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_constTerm);
					setState(517);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(518);
					mult();
					setState(519);
					constExpo(0);
					}
					} 
				}
				setState(525);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,39,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class ConstExpoContext extends ParserRuleContext {
		public ConstUnaryContext constUnary() {
			return getRuleContext(ConstUnaryContext.class,0);
		}
		public ConstExpoContext constExpo() {
			return getRuleContext(ConstExpoContext.class,0);
		}
		public ExpoOpContext expoOp() {
			return getRuleContext(ExpoOpContext.class,0);
		}
		public ConstExpoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constExpo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReFuggListener ) ((ReFuggListener)listener).enterConstExpo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReFuggListener ) ((ReFuggListener)listener).exitConstExpo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReFuggVisitor ) return ((ReFuggVisitor<? extends T>)visitor).visitConstExpo(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstExpoContext constExpo() throws RecognitionException {
		return constExpo(0);
	}

	private ConstExpoContext constExpo(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ConstExpoContext _localctx = new ConstExpoContext(_ctx, _parentState);
		ConstExpoContext _prevctx = _localctx;
		int _startState = 74;
		enterRecursionRule(_localctx, 74, RULE_constExpo, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(527);
			constUnary();
			}
			_ctx.stop = _input.LT(-1);
			setState(535);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,40,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ConstExpoContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_constExpo);
					setState(529);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(530);
					expoOp();
					setState(531);
					constUnary();
					}
					} 
				}
				setState(537);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,40,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class ConstUnaryContext extends ParserRuleContext {
		public NotNegContext notNeg() {
			return getRuleContext(NotNegContext.class,0);
		}
		public ConstFactorContext constFactor() {
			return getRuleContext(ConstFactorContext.class,0);
		}
		public ConstUnaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constUnary; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReFuggListener ) ((ReFuggListener)listener).enterConstUnary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReFuggListener ) ((ReFuggListener)listener).exitConstUnary(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReFuggVisitor ) return ((ReFuggVisitor<? extends T>)visitor).visitConstUnary(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstUnaryContext constUnary() throws RecognitionException {
		ConstUnaryContext _localctx = new ConstUnaryContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_constUnary);
		try {
			setState(542);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__32:
			case T__33:
			case T__34:
				enterOuterAlt(_localctx, 1);
				{
				setState(538);
				notNeg();
				setState(539);
				constFactor();
				}
				break;
			case T__2:
			case T__5:
			case TRUE:
			case FALSE:
			case THIS:
			case NULL:
			case INT_LIT:
			case DOUBLE_LIT:
			case CHAR_LIT:
			case STRING_LIT:
				enterOuterAlt(_localctx, 2);
				{
				setState(541);
				constFactor();
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

	public static class ConstFactorContext extends ParserRuleContext {
		public ConstFactorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constFactor; }
	 
		public ConstFactorContext() { }
		public void copyFrom(ConstFactorContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ConstExprConstContext extends ConstFactorContext {
		public ConstantContext constant() {
			return getRuleContext(ConstantContext.class,0);
		}
		public ConstExprConstContext(ConstFactorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReFuggListener ) ((ReFuggListener)listener).enterConstExprConst(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReFuggListener ) ((ReFuggListener)listener).exitConstExprConst(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReFuggVisitor ) return ((ReFuggVisitor<? extends T>)visitor).visitConstExprConst(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ConstExprListContext extends ConstFactorContext {
		public ConstListContext constList() {
			return getRuleContext(ConstListContext.class,0);
		}
		public ConstExprListContext(ConstFactorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReFuggListener ) ((ReFuggListener)listener).enterConstExprList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReFuggListener ) ((ReFuggListener)listener).exitConstExprList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReFuggVisitor ) return ((ReFuggVisitor<? extends T>)visitor).visitConstExprList(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ConstExprParenthContext extends ConstFactorContext {
		public ConstExprContext constExpr() {
			return getRuleContext(ConstExprContext.class,0);
		}
		public ConstExprParenthContext(ConstFactorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReFuggListener ) ((ReFuggListener)listener).enterConstExprParenth(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReFuggListener ) ((ReFuggListener)listener).exitConstExprParenth(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReFuggVisitor ) return ((ReFuggVisitor<? extends T>)visitor).visitConstExprParenth(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstFactorContext constFactor() throws RecognitionException {
		ConstFactorContext _localctx = new ConstFactorContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_constFactor);
		try {
			setState(550);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TRUE:
			case FALSE:
			case THIS:
			case NULL:
			case INT_LIT:
			case DOUBLE_LIT:
			case CHAR_LIT:
			case STRING_LIT:
				_localctx = new ConstExprConstContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(544);
				constant();
				}
				break;
			case T__2:
				_localctx = new ConstExprParenthContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(545);
				match(T__2);
				setState(546);
				constExpr(0);
				setState(547);
				match(T__3);
				}
				break;
			case T__5:
				_localctx = new ConstExprListContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(549);
				constList();
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

	public static class ExprContext extends ParserRuleContext {
		public JoinContext join() {
			return getRuleContext(JoinContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public OrContext or() {
			return getRuleContext(OrContext.class,0);
		}
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReFuggListener ) ((ReFuggListener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReFuggListener ) ((ReFuggListener)listener).exitExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReFuggVisitor ) return ((ReFuggVisitor<? extends T>)visitor).visitExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 80;
		enterRecursionRule(_localctx, 80, RULE_expr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(553);
			join(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(561);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,43,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ExprContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_expr);
					setState(555);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(556);
					or();
					setState(557);
					join(0);
					}
					} 
				}
				setState(563);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,43,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class JoinContext extends ParserRuleContext {
		public EqContext eq() {
			return getRuleContext(EqContext.class,0);
		}
		public JoinContext join() {
			return getRuleContext(JoinContext.class,0);
		}
		public AndContext and() {
			return getRuleContext(AndContext.class,0);
		}
		public JoinContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_join; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReFuggListener ) ((ReFuggListener)listener).enterJoin(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReFuggListener ) ((ReFuggListener)listener).exitJoin(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReFuggVisitor ) return ((ReFuggVisitor<? extends T>)visitor).visitJoin(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JoinContext join() throws RecognitionException {
		return join(0);
	}

	private JoinContext join(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		JoinContext _localctx = new JoinContext(_ctx, _parentState);
		JoinContext _prevctx = _localctx;
		int _startState = 82;
		enterRecursionRule(_localctx, 82, RULE_join, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(565);
			eq(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(573);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,44,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new JoinContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_join);
					setState(567);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(568);
					and();
					setState(569);
					eq(0);
					}
					} 
				}
				setState(575);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,44,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class EqContext extends ParserRuleContext {
		public RelContext rel() {
			return getRuleContext(RelContext.class,0);
		}
		public EqContext eq() {
			return getRuleContext(EqContext.class,0);
		}
		public EqOPContext eqOP() {
			return getRuleContext(EqOPContext.class,0);
		}
		public EqContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_eq; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReFuggListener ) ((ReFuggListener)listener).enterEq(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReFuggListener ) ((ReFuggListener)listener).exitEq(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReFuggVisitor ) return ((ReFuggVisitor<? extends T>)visitor).visitEq(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EqContext eq() throws RecognitionException {
		return eq(0);
	}

	private EqContext eq(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		EqContext _localctx = new EqContext(_ctx, _parentState);
		EqContext _prevctx = _localctx;
		int _startState = 84;
		enterRecursionRule(_localctx, 84, RULE_eq, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(577);
			rel(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(585);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,45,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new EqContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_eq);
					setState(579);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(580);
					eqOP();
					setState(581);
					rel(0);
					}
					} 
				}
				setState(587);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,45,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class RelContext extends ParserRuleContext {
		public LogicContext logic() {
			return getRuleContext(LogicContext.class,0);
		}
		public RelContext rel() {
			return getRuleContext(RelContext.class,0);
		}
		public LogicOpContext logicOp() {
			return getRuleContext(LogicOpContext.class,0);
		}
		public RelContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rel; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReFuggListener ) ((ReFuggListener)listener).enterRel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReFuggListener ) ((ReFuggListener)listener).exitRel(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReFuggVisitor ) return ((ReFuggVisitor<? extends T>)visitor).visitRel(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RelContext rel() throws RecognitionException {
		return rel(0);
	}

	private RelContext rel(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		RelContext _localctx = new RelContext(_ctx, _parentState);
		RelContext _prevctx = _localctx;
		int _startState = 86;
		enterRecursionRule(_localctx, 86, RULE_rel, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(589);
			logic(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(597);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,46,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new RelContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_rel);
					setState(591);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(592);
					logicOp();
					setState(593);
					logic(0);
					}
					} 
				}
				setState(599);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,46,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class LogicContext extends ParserRuleContext {
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public LogicContext logic() {
			return getRuleContext(LogicContext.class,0);
		}
		public AddContext add() {
			return getRuleContext(AddContext.class,0);
		}
		public LogicContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logic; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReFuggListener ) ((ReFuggListener)listener).enterLogic(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReFuggListener ) ((ReFuggListener)listener).exitLogic(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReFuggVisitor ) return ((ReFuggVisitor<? extends T>)visitor).visitLogic(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LogicContext logic() throws RecognitionException {
		return logic(0);
	}

	private LogicContext logic(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		LogicContext _localctx = new LogicContext(_ctx, _parentState);
		LogicContext _prevctx = _localctx;
		int _startState = 88;
		enterRecursionRule(_localctx, 88, RULE_logic, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(601);
			term(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(609);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,47,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new LogicContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_logic);
					setState(603);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(604);
					add();
					setState(605);
					term(0);
					}
					} 
				}
				setState(611);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,47,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class TermContext extends ParserRuleContext {
		public ExpoContext expo() {
			return getRuleContext(ExpoContext.class,0);
		}
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public MultContext mult() {
			return getRuleContext(MultContext.class,0);
		}
		public TermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_term; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReFuggListener ) ((ReFuggListener)listener).enterTerm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReFuggListener ) ((ReFuggListener)listener).exitTerm(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReFuggVisitor ) return ((ReFuggVisitor<? extends T>)visitor).visitTerm(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TermContext term() throws RecognitionException {
		return term(0);
	}

	private TermContext term(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		TermContext _localctx = new TermContext(_ctx, _parentState);
		TermContext _prevctx = _localctx;
		int _startState = 90;
		enterRecursionRule(_localctx, 90, RULE_term, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(613);
			expo(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(621);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,48,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new TermContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_term);
					setState(615);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(616);
					mult();
					setState(617);
					expo(0);
					}
					} 
				}
				setState(623);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,48,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class ExpoContext extends ParserRuleContext {
		public UnaryContext unary() {
			return getRuleContext(UnaryContext.class,0);
		}
		public ExpoContext expo() {
			return getRuleContext(ExpoContext.class,0);
		}
		public ExpoOpContext expoOp() {
			return getRuleContext(ExpoOpContext.class,0);
		}
		public ExpoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReFuggListener ) ((ReFuggListener)listener).enterExpo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReFuggListener ) ((ReFuggListener)listener).exitExpo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReFuggVisitor ) return ((ReFuggVisitor<? extends T>)visitor).visitExpo(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpoContext expo() throws RecognitionException {
		return expo(0);
	}

	private ExpoContext expo(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpoContext _localctx = new ExpoContext(_ctx, _parentState);
		ExpoContext _prevctx = _localctx;
		int _startState = 92;
		enterRecursionRule(_localctx, 92, RULE_expo, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(625);
			unary();
			}
			_ctx.stop = _input.LT(-1);
			setState(633);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,49,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ExpoContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_expo);
					setState(627);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(628);
					expoOp();
					setState(629);
					unary();
					}
					} 
				}
				setState(635);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,49,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class UnaryContext extends ParserRuleContext {
		public NotNegContext notNeg() {
			return getRuleContext(NotNegContext.class,0);
		}
		public FactorContext factor() {
			return getRuleContext(FactorContext.class,0);
		}
		public UnaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unary; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReFuggListener ) ((ReFuggListener)listener).enterUnary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReFuggListener ) ((ReFuggListener)listener).exitUnary(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReFuggVisitor ) return ((ReFuggVisitor<? extends T>)visitor).visitUnary(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnaryContext unary() throws RecognitionException {
		UnaryContext _localctx = new UnaryContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_unary);
		try {
			setState(640);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__32:
			case T__33:
			case T__34:
				enterOuterAlt(_localctx, 1);
				{
				setState(636);
				notNeg();
				setState(637);
				factor();
				}
				break;
			case T__2:
			case T__5:
			case TRUE:
			case FALSE:
			case THIS:
			case NULL:
			case NEW:
			case INT_LIT:
			case DOUBLE_LIT:
			case CHAR_LIT:
			case STRING_LIT:
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(639);
				factor();
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

	public static class FactorContext extends ParserRuleContext {
		public FactorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_factor; }
	 
		public FactorContext() { }
		public void copyFrom(FactorContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ExprfCallContext extends FactorContext {
		public FCallContext fCall() {
			return getRuleContext(FCallContext.class,0);
		}
		public ExprfCallContext(FactorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReFuggListener ) ((ReFuggListener)listener).enterExprfCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReFuggListener ) ((ReFuggListener)listener).exitExprfCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReFuggVisitor ) return ((ReFuggVisitor<? extends T>)visitor).visitExprfCall(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExprCreateContext extends FactorContext {
		public CreateContext create() {
			return getRuleContext(CreateContext.class,0);
		}
		public ExprCreateContext(FactorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReFuggListener ) ((ReFuggListener)listener).enterExprCreate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReFuggListener ) ((ReFuggListener)listener).exitExprCreate(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReFuggVisitor ) return ((ReFuggVisitor<? extends T>)visitor).visitExprCreate(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExprParenthContext extends FactorContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ExprParenthContext(FactorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReFuggListener ) ((ReFuggListener)listener).enterExprParenth(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReFuggListener ) ((ReFuggListener)listener).exitExprParenth(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReFuggVisitor ) return ((ReFuggVisitor<? extends T>)visitor).visitExprParenth(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExprListContext extends FactorContext {
		public ListContext list() {
			return getRuleContext(ListContext.class,0);
		}
		public ExprListContext(FactorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReFuggListener ) ((ReFuggListener)listener).enterExprList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReFuggListener ) ((ReFuggListener)listener).exitExprList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReFuggVisitor ) return ((ReFuggVisitor<? extends T>)visitor).visitExprList(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExprmethCallContext extends FactorContext {
		public MethCallContext methCall() {
			return getRuleContext(MethCallContext.class,0);
		}
		public ExprmethCallContext(FactorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReFuggListener ) ((ReFuggListener)listener).enterExprmethCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReFuggListener ) ((ReFuggListener)listener).exitExprmethCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReFuggVisitor ) return ((ReFuggVisitor<? extends T>)visitor).visitExprmethCall(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExpridentifierContext extends FactorContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public PostOPContext postOP() {
			return getRuleContext(PostOPContext.class,0);
		}
		public ExpridentifierContext(FactorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReFuggListener ) ((ReFuggListener)listener).enterExpridentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReFuggListener ) ((ReFuggListener)listener).exitExpridentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReFuggVisitor ) return ((ReFuggVisitor<? extends T>)visitor).visitExpridentifier(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExpridentifierIndexContext extends FactorContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public IndexContext index() {
			return getRuleContext(IndexContext.class,0);
		}
		public PostOPContext postOP() {
			return getRuleContext(PostOPContext.class,0);
		}
		public ExpridentifierIndexContext(FactorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReFuggListener ) ((ReFuggListener)listener).enterExpridentifierIndex(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReFuggListener ) ((ReFuggListener)listener).exitExpridentifierIndex(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReFuggVisitor ) return ((ReFuggVisitor<? extends T>)visitor).visitExpridentifierIndex(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExprThisContext extends FactorContext {
		public ThisAccessContext thisAccess() {
			return getRuleContext(ThisAccessContext.class,0);
		}
		public PostOPContext postOP() {
			return getRuleContext(PostOPContext.class,0);
		}
		public ExprThisContext(FactorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReFuggListener ) ((ReFuggListener)listener).enterExprThis(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReFuggListener ) ((ReFuggListener)listener).exitExprThis(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReFuggVisitor ) return ((ReFuggVisitor<? extends T>)visitor).visitExprThis(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExprConstantContext extends FactorContext {
		public ConstantContext constant() {
			return getRuleContext(ConstantContext.class,0);
		}
		public ExprConstantContext(FactorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReFuggListener ) ((ReFuggListener)listener).enterExprConstant(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReFuggListener ) ((ReFuggListener)listener).exitExprConstant(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReFuggVisitor ) return ((ReFuggVisitor<? extends T>)visitor).visitExprConstant(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FactorContext factor() throws RecognitionException {
		FactorContext _localctx = new FactorContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_factor);
		try {
			setState(664);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,54,_ctx) ) {
			case 1:
				_localctx = new ExprParenthContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(642);
				match(T__2);
				setState(643);
				expr(0);
				setState(644);
				match(T__3);
				}
				break;
			case 2:
				_localctx = new ExprfCallContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(646);
				fCall();
				}
				break;
			case 3:
				_localctx = new ExprmethCallContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(647);
				methCall();
				}
				break;
			case 4:
				_localctx = new ExpridentifierContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(648);
				identifier();
				setState(650);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,51,_ctx) ) {
				case 1:
					{
					setState(649);
					postOP();
					}
					break;
				}
				}
				break;
			case 5:
				_localctx = new ExpridentifierIndexContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(652);
				identifier();
				setState(653);
				index();
				setState(655);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,52,_ctx) ) {
				case 1:
					{
					setState(654);
					postOP();
					}
					break;
				}
				}
				break;
			case 6:
				_localctx = new ExprCreateContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(657);
				create();
				}
				break;
			case 7:
				_localctx = new ExprConstantContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(658);
				constant();
				}
				break;
			case 8:
				_localctx = new ExprThisContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(659);
				thisAccess();
				setState(661);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,53,_ctx) ) {
				case 1:
					{
					setState(660);
					postOP();
					}
					break;
				}
				}
				break;
			case 9:
				_localctx = new ExprListContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(663);
				list();
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

	public static class FCallContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public FArgsContext fArgs() {
			return getRuleContext(FArgsContext.class,0);
		}
		public FCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fCall; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReFuggListener ) ((ReFuggListener)listener).enterFCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReFuggListener ) ((ReFuggListener)listener).exitFCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReFuggVisitor ) return ((ReFuggVisitor<? extends T>)visitor).visitFCall(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FCallContext fCall() throws RecognitionException {
		FCallContext _localctx = new FCallContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_fCall);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(666);
			identifier();
			setState(667);
			fArgs();
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

	public static class MethCallContext extends ParserRuleContext {
		public MethCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methCall; }
	 
		public MethCallContext() { }
		public void copyFrom(MethCallContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class MethCallThisContext extends MethCallContext {
		public ThisAccessContext thisAccess() {
			return getRuleContext(ThisAccessContext.class,0);
		}
		public List<MethCallTailContext> methCallTail() {
			return getRuleContexts(MethCallTailContext.class);
		}
		public MethCallTailContext methCallTail(int i) {
			return getRuleContext(MethCallTailContext.class,i);
		}
		public MethCallThisContext(MethCallContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReFuggListener ) ((ReFuggListener)listener).enterMethCallThis(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReFuggListener ) ((ReFuggListener)listener).exitMethCallThis(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReFuggVisitor ) return ((ReFuggVisitor<? extends T>)visitor).visitMethCallThis(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MethCallidentifierContext extends MethCallContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public IndexContext index() {
			return getRuleContext(IndexContext.class,0);
		}
		public List<MethCallTailContext> methCallTail() {
			return getRuleContexts(MethCallTailContext.class);
		}
		public MethCallTailContext methCallTail(int i) {
			return getRuleContext(MethCallTailContext.class,i);
		}
		public MethCallidentifierContext(MethCallContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReFuggListener ) ((ReFuggListener)listener).enterMethCallidentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReFuggListener ) ((ReFuggListener)listener).exitMethCallidentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReFuggVisitor ) return ((ReFuggVisitor<? extends T>)visitor).visitMethCallidentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethCallContext methCall() throws RecognitionException {
		MethCallContext _localctx = new MethCallContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_methCall);
		try {
			int _alt;
			setState(682);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				_localctx = new MethCallidentifierContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(669);
				identifier();
				setState(670);
				index();
				setState(672); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(671);
						methCallTail();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(674); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,55,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				break;
			case THIS:
				_localctx = new MethCallThisContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(676);
				thisAccess();
				setState(678); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(677);
						methCallTail();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(680); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,56,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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

	public static class MethCallTailContext extends ParserRuleContext {
		public FCallContext fCall() {
			return getRuleContext(FCallContext.class,0);
		}
		public IndexContext index() {
			return getRuleContext(IndexContext.class,0);
		}
		public MethCallTailContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methCallTail; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReFuggListener ) ((ReFuggListener)listener).enterMethCallTail(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReFuggListener ) ((ReFuggListener)listener).exitMethCallTail(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReFuggVisitor ) return ((ReFuggVisitor<? extends T>)visitor).visitMethCallTail(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethCallTailContext methCallTail() throws RecognitionException {
		MethCallTailContext _localctx = new MethCallTailContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_methCallTail);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(684);
			match(T__10);
			setState(685);
			fCall();
			setState(686);
			index();
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

	public static class CreateContext extends ParserRuleContext {
		public TerminalNode NEW() { return getToken(ReFuggParser.NEW, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public FArgsContext fArgs() {
			return getRuleContext(FArgsContext.class,0);
		}
		public IndexContext index() {
			return getRuleContext(IndexContext.class,0);
		}
		public List<MethCallTailContext> methCallTail() {
			return getRuleContexts(MethCallTailContext.class);
		}
		public MethCallTailContext methCallTail(int i) {
			return getRuleContext(MethCallTailContext.class,i);
		}
		public CreateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReFuggListener ) ((ReFuggListener)listener).enterCreate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReFuggListener ) ((ReFuggListener)listener).exitCreate(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReFuggVisitor ) return ((ReFuggVisitor<? extends T>)visitor).visitCreate(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CreateContext create() throws RecognitionException {
		CreateContext _localctx = new CreateContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_create);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(688);
			match(NEW);
			setState(689);
			identifier();
			setState(690);
			fArgs();
			setState(691);
			index();
			setState(695);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,58,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(692);
					methCallTail();
					}
					} 
				}
				setState(697);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,58,_ctx);
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

	public static class FArgsContext extends ParserRuleContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public FArgsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fArgs; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReFuggListener ) ((ReFuggListener)listener).enterFArgs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReFuggListener ) ((ReFuggListener)listener).exitFArgs(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReFuggVisitor ) return ((ReFuggVisitor<? extends T>)visitor).visitFArgs(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FArgsContext fArgs() throws RecognitionException {
		FArgsContext _localctx = new FArgsContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_fArgs);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(698);
			match(T__2);
			setState(707);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__5) | (1L << T__32) | (1L << T__33) | (1L << T__34))) != 0) || ((((_la - 71)) & ~0x3f) == 0 && ((1L << (_la - 71)) & ((1L << (TRUE - 71)) | (1L << (FALSE - 71)) | (1L << (THIS - 71)) | (1L << (NULL - 71)) | (1L << (NEW - 71)) | (1L << (INT_LIT - 71)) | (1L << (DOUBLE_LIT - 71)) | (1L << (CHAR_LIT - 71)) | (1L << (STRING_LIT - 71)) | (1L << (ID - 71)))) != 0)) {
				{
				setState(699);
				expr(0);
				setState(704);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__4) {
					{
					{
					setState(700);
					match(T__4);
					setState(701);
					expr(0);
					}
					}
					setState(706);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(709);
			match(T__3);
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

	public static class IndexContext extends ParserRuleContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public IndexContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_index; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReFuggListener ) ((ReFuggListener)listener).enterIndex(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReFuggListener ) ((ReFuggListener)listener).exitIndex(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReFuggVisitor ) return ((ReFuggVisitor<? extends T>)visitor).visitIndex(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IndexContext index() throws RecognitionException {
		IndexContext _localctx = new IndexContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_index);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(717);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,61,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(711);
					match(T__0);
					setState(712);
					expr(0);
					setState(713);
					match(T__1);
					}
					} 
				}
				setState(719);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,61,_ctx);
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

	public static class ThisAccessContext extends ParserRuleContext {
		public TerminalNode THIS() { return getToken(ReFuggParser.THIS, 0); }
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public List<IndexContext> index() {
			return getRuleContexts(IndexContext.class);
		}
		public IndexContext index(int i) {
			return getRuleContext(IndexContext.class,i);
		}
		public ThisAccessContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_thisAccess; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReFuggListener ) ((ReFuggListener)listener).enterThisAccess(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReFuggListener ) ((ReFuggListener)listener).exitThisAccess(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReFuggVisitor ) return ((ReFuggVisitor<? extends T>)visitor).visitThisAccess(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ThisAccessContext thisAccess() throws RecognitionException {
		ThisAccessContext _localctx = new ThisAccessContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_thisAccess);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(720);
			match(THIS);
			setState(727);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,62,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(721);
					match(T__10);
					setState(722);
					identifier();
					setState(723);
					index();
					}
					} 
				}
				setState(729);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,62,_ctx);
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

	public static class ListContext extends ParserRuleContext {
		public ListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_list; }
	 
		public ListContext() { }
		public void copyFrom(ListContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ExprListYesSubContext extends ListContext {
		public List<SubListContext> subList() {
			return getRuleContexts(SubListContext.class);
		}
		public SubListContext subList(int i) {
			return getRuleContext(SubListContext.class,i);
		}
		public ExprListYesSubContext(ListContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReFuggListener ) ((ReFuggListener)listener).enterExprListYesSub(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReFuggListener ) ((ReFuggListener)listener).exitExprListYesSub(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReFuggVisitor ) return ((ReFuggVisitor<? extends T>)visitor).visitExprListYesSub(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExprListNoSubContext extends ListContext {
		public ExprManyContext exprMany() {
			return getRuleContext(ExprManyContext.class,0);
		}
		public ExprListNoSubContext(ListContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReFuggListener ) ((ReFuggListener)listener).enterExprListNoSub(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReFuggListener ) ((ReFuggListener)listener).exitExprListNoSub(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReFuggVisitor ) return ((ReFuggVisitor<? extends T>)visitor).visitExprListNoSub(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ListContext list() throws RecognitionException {
		ListContext _localctx = new ListContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_list);
		int _la;
		try {
			setState(744);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,64,_ctx) ) {
			case 1:
				_localctx = new ExprListNoSubContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(730);
				match(T__5);
				setState(731);
				exprMany();
				setState(732);
				match(T__6);
				}
				break;
			case 2:
				_localctx = new ExprListYesSubContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(734);
				match(T__5);
				setState(735);
				subList();
				setState(738); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(736);
					match(T__4);
					setState(737);
					subList();
					}
					}
					setState(740); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==T__4 );
				setState(742);
				match(T__6);
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

	public static class SubListContext extends ParserRuleContext {
		public ExprManyContext exprMany() {
			return getRuleContext(ExprManyContext.class,0);
		}
		public SubListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_subList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReFuggListener ) ((ReFuggListener)listener).enterSubList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReFuggListener ) ((ReFuggListener)listener).exitSubList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReFuggVisitor ) return ((ReFuggVisitor<? extends T>)visitor).visitSubList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SubListContext subList() throws RecognitionException {
		SubListContext _localctx = new SubListContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_subList);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(746);
			match(T__5);
			setState(747);
			exprMany();
			setState(748);
			match(T__6);
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

	public static class ExprManyContext extends ParserRuleContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public ExprManyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exprMany; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReFuggListener ) ((ReFuggListener)listener).enterExprMany(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReFuggListener ) ((ReFuggListener)listener).exitExprMany(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReFuggVisitor ) return ((ReFuggVisitor<? extends T>)visitor).visitExprMany(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprManyContext exprMany() throws RecognitionException {
		ExprManyContext _localctx = new ExprManyContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_exprMany);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(750);
			expr(0);
			setState(755);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__4) {
				{
				{
				setState(751);
				match(T__4);
				setState(752);
				expr(0);
				}
				}
				setState(757);
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

	public static class ReturntypeContext extends ParserRuleContext {
		public TerminalNode VOID() { return getToken(ReFuggParser.VOID, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public ReturntypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returntype; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReFuggListener ) ((ReFuggListener)listener).enterReturntype(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReFuggListener ) ((ReFuggListener)listener).exitReturntype(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReFuggVisitor ) return ((ReFuggVisitor<? extends T>)visitor).visitReturntype(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReturntypeContext returntype() throws RecognitionException {
		ReturntypeContext _localctx = new ReturntypeContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_returntype);
		try {
			setState(760);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VOID:
				enterOuterAlt(_localctx, 1);
				{
				setState(758);
				match(VOID);
				}
				break;
			case T__23:
			case T__24:
			case T__25:
			case T__26:
			case T__27:
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(759);
				type();
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

	public static class LogicOpContext extends ParserRuleContext {
		public LogicOpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logicOp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReFuggListener ) ((ReFuggListener)listener).enterLogicOp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReFuggListener ) ((ReFuggListener)listener).exitLogicOp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReFuggVisitor ) return ((ReFuggVisitor<? extends T>)visitor).visitLogicOp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LogicOpContext logicOp() throws RecognitionException {
		LogicOpContext _localctx = new LogicOpContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_logicOp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(762);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14))) != 0)) ) {
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

	public static class AssignOPContext extends ParserRuleContext {
		public AssignOPContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignOP; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReFuggListener ) ((ReFuggListener)listener).enterAssignOP(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReFuggListener ) ((ReFuggListener)listener).exitAssignOP(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReFuggVisitor ) return ((ReFuggVisitor<? extends T>)visitor).visitAssignOP(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignOPContext assignOP() throws RecognitionException {
		AssignOPContext _localctx = new AssignOPContext(_ctx, getState());
		enterRule(_localctx, 122, RULE_assignOP);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(764);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__9) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20))) != 0)) ) {
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

	public static class PostOPContext extends ParserRuleContext {
		public PostOPContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_postOP; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReFuggListener ) ((ReFuggListener)listener).enterPostOP(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReFuggListener ) ((ReFuggListener)listener).exitPostOP(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReFuggVisitor ) return ((ReFuggVisitor<? extends T>)visitor).visitPostOP(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PostOPContext postOP() throws RecognitionException {
		PostOPContext _localctx = new PostOPContext(_ctx, getState());
		enterRule(_localctx, 124, RULE_postOP);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(766);
			_la = _input.LA(1);
			if ( !(_la==T__21 || _la==T__22) ) {
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

	public static class ConstantContext extends ParserRuleContext {
		public TerminalNode DOUBLE_LIT() { return getToken(ReFuggParser.DOUBLE_LIT, 0); }
		public TerminalNode INT_LIT() { return getToken(ReFuggParser.INT_LIT, 0); }
		public TerminalNode STRING_LIT() { return getToken(ReFuggParser.STRING_LIT, 0); }
		public TerminalNode CHAR_LIT() { return getToken(ReFuggParser.CHAR_LIT, 0); }
		public TerminalNode TRUE() { return getToken(ReFuggParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(ReFuggParser.FALSE, 0); }
		public TerminalNode THIS() { return getToken(ReFuggParser.THIS, 0); }
		public TerminalNode NULL() { return getToken(ReFuggParser.NULL, 0); }
		public ConstantContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constant; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReFuggListener ) ((ReFuggListener)listener).enterConstant(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReFuggListener ) ((ReFuggListener)listener).exitConstant(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReFuggVisitor ) return ((ReFuggVisitor<? extends T>)visitor).visitConstant(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstantContext constant() throws RecognitionException {
		ConstantContext _localctx = new ConstantContext(_ctx, getState());
		enterRule(_localctx, 126, RULE_constant);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(768);
			_la = _input.LA(1);
			if ( !(((((_la - 71)) & ~0x3f) == 0 && ((1L << (_la - 71)) & ((1L << (TRUE - 71)) | (1L << (FALSE - 71)) | (1L << (THIS - 71)) | (1L << (NULL - 71)) | (1L << (INT_LIT - 71)) | (1L << (DOUBLE_LIT - 71)) | (1L << (CHAR_LIT - 71)) | (1L << (STRING_LIT - 71)))) != 0)) ) {
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

	public static class TypeContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReFuggListener ) ((ReFuggListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReFuggListener ) ((ReFuggListener)listener).exitType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReFuggVisitor ) return ((ReFuggVisitor<? extends T>)visitor).visitType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 128, RULE_type);
		try {
			setState(776);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__23:
				enterOuterAlt(_localctx, 1);
				{
				setState(770);
				match(T__23);
				}
				break;
			case T__24:
				enterOuterAlt(_localctx, 2);
				{
				setState(771);
				match(T__24);
				}
				break;
			case T__25:
				enterOuterAlt(_localctx, 3);
				{
				setState(772);
				match(T__25);
				}
				break;
			case T__26:
				enterOuterAlt(_localctx, 4);
				{
				setState(773);
				match(T__26);
				}
				break;
			case T__27:
				enterOuterAlt(_localctx, 5);
				{
				setState(774);
				match(T__27);
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 6);
				{
				setState(775);
				identifier();
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

	public static class IdentifierContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(ReFuggParser.ID, 0); }
		public IdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReFuggListener ) ((ReFuggListener)listener).enterIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReFuggListener ) ((ReFuggListener)listener).exitIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReFuggVisitor ) return ((ReFuggVisitor<? extends T>)visitor).visitIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdentifierContext identifier() throws RecognitionException {
		IdentifierContext _localctx = new IdentifierContext(_ctx, getState());
		enterRule(_localctx, 130, RULE_identifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(778);
			match(ID);
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

	public static class OrContext extends ParserRuleContext {
		public OrContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_or; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReFuggListener ) ((ReFuggListener)listener).enterOr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReFuggListener ) ((ReFuggListener)listener).exitOr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReFuggVisitor ) return ((ReFuggVisitor<? extends T>)visitor).visitOr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OrContext or() throws RecognitionException {
		OrContext _localctx = new OrContext(_ctx, getState());
		enterRule(_localctx, 132, RULE_or);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(780);
			_la = _input.LA(1);
			if ( !(_la==T__28 || _la==T__29) ) {
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

	public static class AndContext extends ParserRuleContext {
		public AndContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_and; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReFuggListener ) ((ReFuggListener)listener).enterAnd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReFuggListener ) ((ReFuggListener)listener).exitAnd(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReFuggVisitor ) return ((ReFuggVisitor<? extends T>)visitor).visitAnd(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AndContext and() throws RecognitionException {
		AndContext _localctx = new AndContext(_ctx, getState());
		enterRule(_localctx, 134, RULE_and);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(782);
			_la = _input.LA(1);
			if ( !(_la==T__30 || _la==T__31) ) {
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

	public static class NotNegContext extends ParserRuleContext {
		public NotNegContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_notNeg; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReFuggListener ) ((ReFuggListener)listener).enterNotNeg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReFuggListener ) ((ReFuggListener)listener).exitNotNeg(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReFuggVisitor ) return ((ReFuggVisitor<? extends T>)visitor).visitNotNeg(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NotNegContext notNeg() throws RecognitionException {
		NotNegContext _localctx = new NotNegContext(_ctx, getState());
		enterRule(_localctx, 136, RULE_notNeg);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(784);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__32) | (1L << T__33) | (1L << T__34))) != 0)) ) {
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

	public static class EqOPContext extends ParserRuleContext {
		public EqOPContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_eqOP; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReFuggListener ) ((ReFuggListener)listener).enterEqOP(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReFuggListener ) ((ReFuggListener)listener).exitEqOP(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReFuggVisitor ) return ((ReFuggVisitor<? extends T>)visitor).visitEqOP(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EqOPContext eqOP() throws RecognitionException {
		EqOPContext _localctx = new EqOPContext(_ctx, getState());
		enterRule(_localctx, 138, RULE_eqOP);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(786);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__35) | (1L << T__36) | (1L << T__37) | (1L << T__38))) != 0)) ) {
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

	public static class AddContext extends ParserRuleContext {
		public AddContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_add; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReFuggListener ) ((ReFuggListener)listener).enterAdd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReFuggListener ) ((ReFuggListener)listener).exitAdd(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReFuggVisitor ) return ((ReFuggVisitor<? extends T>)visitor).visitAdd(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AddContext add() throws RecognitionException {
		AddContext _localctx = new AddContext(_ctx, getState());
		enterRule(_localctx, 140, RULE_add);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(788);
			_la = _input.LA(1);
			if ( !(_la==T__34 || _la==T__39) ) {
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

	public static class MultContext extends ParserRuleContext {
		public MultContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mult; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReFuggListener ) ((ReFuggListener)listener).enterMult(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReFuggListener ) ((ReFuggListener)listener).exitMult(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReFuggVisitor ) return ((ReFuggVisitor<? extends T>)visitor).visitMult(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MultContext mult() throws RecognitionException {
		MultContext _localctx = new MultContext(_ctx, getState());
		enterRule(_localctx, 142, RULE_mult);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(790);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__40) | (1L << T__41) | (1L << T__42))) != 0)) ) {
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

	public static class ExpoOpContext extends ParserRuleContext {
		public ExpoOpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expoOp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReFuggListener ) ((ReFuggListener)listener).enterExpoOp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReFuggListener ) ((ReFuggListener)listener).exitExpoOp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReFuggVisitor ) return ((ReFuggVisitor<? extends T>)visitor).visitExpoOp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpoOpContext expoOp() throws RecognitionException {
		ExpoOpContext _localctx = new ExpoOpContext(_ctx, getState());
		enterRule(_localctx, 144, RULE_expoOp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(792);
			match(T__43);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 31:
			return constExpr_sempred((ConstExprContext)_localctx, predIndex);
		case 32:
			return constJoin_sempred((ConstJoinContext)_localctx, predIndex);
		case 33:
			return constEQ_sempred((ConstEQContext)_localctx, predIndex);
		case 34:
			return constRel_sempred((ConstRelContext)_localctx, predIndex);
		case 35:
			return constLogic_sempred((ConstLogicContext)_localctx, predIndex);
		case 36:
			return constTerm_sempred((ConstTermContext)_localctx, predIndex);
		case 37:
			return constExpo_sempred((ConstExpoContext)_localctx, predIndex);
		case 40:
			return expr_sempred((ExprContext)_localctx, predIndex);
		case 41:
			return join_sempred((JoinContext)_localctx, predIndex);
		case 42:
			return eq_sempred((EqContext)_localctx, predIndex);
		case 43:
			return rel_sempred((RelContext)_localctx, predIndex);
		case 44:
			return logic_sempred((LogicContext)_localctx, predIndex);
		case 45:
			return term_sempred((TermContext)_localctx, predIndex);
		case 46:
			return expo_sempred((ExpoContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean constExpr_sempred(ConstExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean constJoin_sempred(ConstJoinContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean constEQ_sempred(ConstEQContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean constRel_sempred(ConstRelContext _localctx, int predIndex) {
		switch (predIndex) {
		case 3:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean constLogic_sempred(ConstLogicContext _localctx, int predIndex) {
		switch (predIndex) {
		case 4:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean constTerm_sempred(ConstTermContext _localctx, int predIndex) {
		switch (predIndex) {
		case 5:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean constExpo_sempred(ConstExpoContext _localctx, int predIndex) {
		switch (predIndex) {
		case 6:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 7:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean join_sempred(JoinContext _localctx, int predIndex) {
		switch (predIndex) {
		case 8:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean eq_sempred(EqContext _localctx, int predIndex) {
		switch (predIndex) {
		case 9:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean rel_sempred(RelContext _localctx, int predIndex) {
		switch (predIndex) {
		case 10:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean logic_sempred(LogicContext _localctx, int predIndex) {
		switch (predIndex) {
		case 11:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean term_sempred(TermContext _localctx, int predIndex) {
		switch (predIndex) {
		case 12:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean expo_sempred(ExpoContext _localctx, int predIndex) {
		switch (predIndex) {
		case 13:
			return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3U\u031d\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\3\2\3\2\3\2\3\2\7\2\u0099\n\2\f\2\16\2\u009c\13\2\3\2\3\2\3"+
		"\2\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\7\5\u00ac\n\5\f\5\16\5"+
		"\u00af\13\5\3\5\3\5\3\6\3\6\5\6\u00b5\n\6\3\6\3\6\3\7\3\7\7\7\u00bb\n"+
		"\7\f\7\16\7\u00be\13\7\3\7\3\7\3\7\3\7\7\7\u00c4\n\7\f\7\16\7\u00c7\13"+
		"\7\3\7\3\7\7\7\u00cb\n\7\f\7\16\7\u00ce\13\7\3\b\3\b\3\b\5\b\u00d3\n\b"+
		"\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\7\b\u00dd\n\b\f\b\16\b\u00e0\13\b\3\b"+
		"\3\b\3\t\3\t\3\t\3\t\7\t\u00e8\n\t\f\t\16\t\u00eb\13\t\3\n\3\n\3\13\3"+
		"\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\7\r\u00fc\n\r\f\r\16"+
		"\r\u00ff\13\r\3\r\3\r\3\r\3\16\3\16\7\16\u0106\n\16\f\16\16\16\u0109\13"+
		"\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3"+
		"\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\5\17\u0122\n\17\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\5\20\u012a\n\20\5\20\u012c\n\20\3\21\3\21\3"+
		"\21\3\21\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\5\23\u013b\n\23"+
		"\3\23\3\23\5\23\u013f\n\23\3\23\3\23\5\23\u0143\n\23\3\23\3\23\3\23\3"+
		"\24\3\24\3\24\3\24\3\24\3\24\5\24\u014e\n\24\5\24\u0150\n\24\3\25\3\25"+
		"\3\25\3\25\3\26\3\26\3\26\3\26\6\26\u015a\n\26\r\26\16\26\u015b\3\26\3"+
		"\26\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\5\27\u0168\n\27\3\30\3\30"+
		"\3\30\3\30\3\31\3\31\3\31\3\31\7\31\u0172\n\31\f\31\16\31\u0175\13\31"+
		"\3\31\3\31\5\31\u0179\n\31\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32"+
		"\3\32\5\32\u0185\n\32\3\33\3\33\3\33\3\33\7\33\u018b\n\33\f\33\16\33\u018e"+
		"\13\33\3\33\3\33\3\33\3\33\3\33\3\33\7\33\u0196\n\33\f\33\16\33\u0199"+
		"\13\33\3\33\3\33\3\33\3\33\5\33\u019f\n\33\3\34\3\34\3\34\3\34\3\34\3"+
		"\34\5\34\u01a7\n\34\3\35\3\35\5\35\u01ab\n\35\3\36\3\36\3\36\3\36\3\36"+
		"\3\36\3\36\3\36\6\36\u01b5\n\36\r\36\16\36\u01b6\3\36\3\36\5\36\u01bb"+
		"\n\36\3\37\3\37\3\37\3\37\3 \3 \3 \7 \u01c4\n \f \16 \u01c7\13 \3!\3!"+
		"\3!\3!\3!\3!\3!\7!\u01d0\n!\f!\16!\u01d3\13!\3\"\3\"\3\"\3\"\3\"\3\"\3"+
		"\"\7\"\u01dc\n\"\f\"\16\"\u01df\13\"\3#\3#\3#\3#\3#\3#\3#\7#\u01e8\n#"+
		"\f#\16#\u01eb\13#\3$\3$\3$\3$\3$\3$\3$\7$\u01f4\n$\f$\16$\u01f7\13$\3"+
		"%\3%\3%\3%\3%\3%\3%\7%\u0200\n%\f%\16%\u0203\13%\3&\3&\3&\3&\3&\3&\3&"+
		"\7&\u020c\n&\f&\16&\u020f\13&\3\'\3\'\3\'\3\'\3\'\3\'\3\'\7\'\u0218\n"+
		"\'\f\'\16\'\u021b\13\'\3(\3(\3(\3(\5(\u0221\n(\3)\3)\3)\3)\3)\3)\5)\u0229"+
		"\n)\3*\3*\3*\3*\3*\3*\3*\7*\u0232\n*\f*\16*\u0235\13*\3+\3+\3+\3+\3+\3"+
		"+\3+\7+\u023e\n+\f+\16+\u0241\13+\3,\3,\3,\3,\3,\3,\3,\7,\u024a\n,\f,"+
		"\16,\u024d\13,\3-\3-\3-\3-\3-\3-\3-\7-\u0256\n-\f-\16-\u0259\13-\3.\3"+
		".\3.\3.\3.\3.\3.\7.\u0262\n.\f.\16.\u0265\13.\3/\3/\3/\3/\3/\3/\3/\7/"+
		"\u026e\n/\f/\16/\u0271\13/\3\60\3\60\3\60\3\60\3\60\3\60\3\60\7\60\u027a"+
		"\n\60\f\60\16\60\u027d\13\60\3\61\3\61\3\61\3\61\5\61\u0283\n\61\3\62"+
		"\3\62\3\62\3\62\3\62\3\62\3\62\3\62\5\62\u028d\n\62\3\62\3\62\3\62\5\62"+
		"\u0292\n\62\3\62\3\62\3\62\3\62\5\62\u0298\n\62\3\62\5\62\u029b\n\62\3"+
		"\63\3\63\3\63\3\64\3\64\3\64\6\64\u02a3\n\64\r\64\16\64\u02a4\3\64\3\64"+
		"\6\64\u02a9\n\64\r\64\16\64\u02aa\5\64\u02ad\n\64\3\65\3\65\3\65\3\65"+
		"\3\66\3\66\3\66\3\66\3\66\7\66\u02b8\n\66\f\66\16\66\u02bb\13\66\3\67"+
		"\3\67\3\67\3\67\7\67\u02c1\n\67\f\67\16\67\u02c4\13\67\5\67\u02c6\n\67"+
		"\3\67\3\67\38\38\38\38\78\u02ce\n8\f8\168\u02d1\138\39\39\39\39\39\79"+
		"\u02d8\n9\f9\169\u02db\139\3:\3:\3:\3:\3:\3:\3:\3:\6:\u02e5\n:\r:\16:"+
		"\u02e6\3:\3:\5:\u02eb\n:\3;\3;\3;\3;\3<\3<\3<\7<\u02f4\n<\f<\16<\u02f7"+
		"\13<\3=\3=\5=\u02fb\n=\3>\3>\3?\3?\3@\3@\3A\3A\3B\3B\3B\3B\3B\3B\5B\u030b"+
		"\nB\3C\3C\3D\3D\3E\3E\3F\3F\3G\3G\3H\3H\3I\3I\3J\3J\3J\2\20@BDFHJLRTV"+
		"XZ\\^K\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<"+
		">@BDFHJLNPRTVXZ\\^`bdfhjlnprtvxz|~\u0080\u0082\u0084\u0086\u0088\u008a"+
		"\u008c\u008e\u0090\u0092\2\r\3\29;\3\2\16\21\4\2\f\f\22\27\3\2\30\31\4"+
		"\2ILNQ\3\2\37 \3\2!\"\3\2#%\3\2&)\4\2%%**\3\2+-\2\u0332\2\u009a\3\2\2"+
		"\2\4\u00a0\3\2\2\2\6\u00a3\3\2\2\2\b\u00a8\3\2\2\2\n\u00b2\3\2\2\2\f\u00b8"+
		"\3\2\2\2\16\u00cf\3\2\2\2\20\u00e3\3\2\2\2\22\u00ec\3\2\2\2\24\u00ee\3"+
		"\2\2\2\26\u00f3\3\2\2\2\30\u00f8\3\2\2\2\32\u0103\3\2\2\2\34\u0121\3\2"+
		"\2\2\36\u0123\3\2\2\2 \u012d\3\2\2\2\"\u0131\3\2\2\2$\u0136\3\2\2\2&\u014f"+
		"\3\2\2\2(\u0151\3\2\2\2*\u0155\3\2\2\2,\u0167\3\2\2\2.\u0169\3\2\2\2\60"+
		"\u016d\3\2\2\2\62\u0184\3\2\2\2\64\u019e\3\2\2\2\66\u01a6\3\2\2\28\u01aa"+
		"\3\2\2\2:\u01ba\3\2\2\2<\u01bc\3\2\2\2>\u01c0\3\2\2\2@\u01c8\3\2\2\2B"+
		"\u01d4\3\2\2\2D\u01e0\3\2\2\2F\u01ec\3\2\2\2H\u01f8\3\2\2\2J\u0204\3\2"+
		"\2\2L\u0210\3\2\2\2N\u0220\3\2\2\2P\u0228\3\2\2\2R\u022a\3\2\2\2T\u0236"+
		"\3\2\2\2V\u0242\3\2\2\2X\u024e\3\2\2\2Z\u025a\3\2\2\2\\\u0266\3\2\2\2"+
		"^\u0272\3\2\2\2`\u0282\3\2\2\2b\u029a\3\2\2\2d\u029c\3\2\2\2f\u02ac\3"+
		"\2\2\2h\u02ae\3\2\2\2j\u02b2\3\2\2\2l\u02bc\3\2\2\2n\u02cf\3\2\2\2p\u02d2"+
		"\3\2\2\2r\u02ea\3\2\2\2t\u02ec\3\2\2\2v\u02f0\3\2\2\2x\u02fa\3\2\2\2z"+
		"\u02fc\3\2\2\2|\u02fe\3\2\2\2~\u0300\3\2\2\2\u0080\u0302\3\2\2\2\u0082"+
		"\u030a\3\2\2\2\u0084\u030c\3\2\2\2\u0086\u030e\3\2\2\2\u0088\u0310\3\2"+
		"\2\2\u008a\u0312\3\2\2\2\u008c\u0314\3\2\2\2\u008e\u0316\3\2\2\2\u0090"+
		"\u0318\3\2\2\2\u0092\u031a\3\2\2\2\u0094\u0099\5\6\4\2\u0095\u0099\5\16"+
		"\b\2\u0096\u0099\5\64\33\2\u0097\u0099\5(\25\2\u0098\u0094\3\2\2\2\u0098"+
		"\u0095\3\2\2\2\u0098\u0096\3\2\2\2\u0098\u0097\3\2\2\2\u0099\u009c\3\2"+
		"\2\2\u009a\u0098\3\2\2\2\u009a\u009b\3\2\2\2\u009b\u009d\3\2\2\2\u009c"+
		"\u009a\3\2\2\2\u009d\u009e\5\4\3\2\u009e\u009f\7\2\2\3\u009f\3\3\2\2\2"+
		"\u00a0\u00a1\7/\2\2\u00a1\u00a2\5\32\16\2\u00a2\5\3\2\2\2\u00a3\u00a4"+
		"\7\60\2\2\u00a4\u00a5\5\b\5\2\u00a5\u00a6\5\n\6\2\u00a6\u00a7\5\32\16"+
		"\2\u00a7\7\3\2\2\2\u00a8\u00ad\5x=\2\u00a9\u00aa\7\3\2\2\u00aa\u00ac\7"+
		"\4\2\2\u00ab\u00a9\3\2\2\2\u00ac\u00af\3\2\2\2\u00ad\u00ab\3\2\2\2\u00ad"+
		"\u00ae\3\2\2\2\u00ae\u00b0\3\2\2\2\u00af\u00ad\3\2\2\2\u00b0\u00b1\5\u0084"+
		"C\2\u00b1\t\3\2\2\2\u00b2\u00b4\7\5\2\2\u00b3\u00b5\5\f\7\2\u00b4\u00b3"+
		"\3\2\2\2\u00b4\u00b5\3\2\2\2\u00b5\u00b6\3\2\2\2\u00b6\u00b7\7\6\2\2\u00b7"+
		"\13\3\2\2\2\u00b8\u00bc\5\u0082B\2\u00b9\u00bb\5\66\34\2\u00ba\u00b9\3"+
		"\2\2\2\u00bb\u00be\3\2\2\2\u00bc\u00ba\3\2\2\2\u00bc\u00bd\3\2\2\2\u00bd"+
		"\u00bf\3\2\2\2\u00be\u00bc\3\2\2\2\u00bf\u00cc\5\u0084C\2\u00c0\u00c1"+
		"\7\7\2\2\u00c1\u00c5\5\u0082B\2\u00c2\u00c4\5\66\34\2\u00c3\u00c2\3\2"+
		"\2\2\u00c4\u00c7\3\2\2\2\u00c5\u00c3\3\2\2\2\u00c5\u00c6\3\2\2\2\u00c6"+
		"\u00c8\3\2\2\2\u00c7\u00c5\3\2\2\2\u00c8\u00c9\5\u0084C\2\u00c9\u00cb"+
		"\3\2\2\2\u00ca\u00c0\3\2\2\2\u00cb\u00ce\3\2\2\2\u00cc\u00ca\3\2\2\2\u00cc"+
		"\u00cd\3\2\2\2\u00cd\r\3\2\2\2\u00ce\u00cc\3\2\2\2\u00cf\u00d0\7\61\2"+
		"\2\u00d0\u00d2\5\u0084C\2\u00d1\u00d3\5\20\t\2\u00d2\u00d1\3\2\2\2\u00d2"+
		"\u00d3\3\2\2\2\u00d3\u00d4\3\2\2\2\u00d4\u00de\7\b\2\2\u00d5\u00dd\5\24"+
		"\13\2\u00d6\u00d7\5\22\n\2\u00d7\u00d8\5\30\r\2\u00d8\u00dd\3\2\2\2\u00d9"+
		"\u00da\5\22\n\2\u00da\u00db\5\26\f\2\u00db\u00dd\3\2\2\2\u00dc\u00d5\3"+
		"\2\2\2\u00dc\u00d6\3\2\2\2\u00dc\u00d9\3\2\2\2\u00dd\u00e0\3\2\2\2\u00de"+
		"\u00dc\3\2\2\2\u00de\u00df\3\2\2\2\u00df\u00e1\3\2\2\2\u00e0\u00de\3\2"+
		"\2\2\u00e1\u00e2\7\t\2\2\u00e2\17\3\2\2\2\u00e3\u00e4\78\2\2\u00e4\u00e9"+
		"\5\u0084C\2\u00e5\u00e6\7\7\2\2\u00e6\u00e8\5\u0084C\2\u00e7\u00e5\3\2"+
		"\2\2\u00e8\u00eb\3\2\2\2\u00e9\u00e7\3\2\2\2\u00e9\u00ea\3\2\2\2\u00ea"+
		"\21\3\2\2\2\u00eb\u00e9\3\2\2\2\u00ec\u00ed\t\2\2\2\u00ed\23\3\2\2\2\u00ee"+
		"\u00ef\7\67\2\2\u00ef\u00f0\5\u0084C\2\u00f0\u00f1\5\n\6\2\u00f1\u00f2"+
		"\5\32\16\2\u00f2\25\3\2\2\2\u00f3\u00f4\7\66\2\2\u00f4\u00f5\5\b\5\2\u00f5"+
		"\u00f6\5\n\6\2\u00f6\u00f7\5\32\16\2\u00f7\27\3\2\2\2\u00f8\u00f9\7\63"+
		"\2\2\u00f9\u00fd\5\u0082B\2\u00fa\u00fc\5\66\34\2\u00fb\u00fa\3\2\2\2"+
		"\u00fc\u00ff\3\2\2\2\u00fd\u00fb\3\2\2\2\u00fd\u00fe\3\2\2\2\u00fe\u0100"+
		"\3\2\2\2\u00ff\u00fd\3\2\2\2\u0100\u0101\5\u0084C\2\u0101\u0102\7\n\2"+
		"\2\u0102\31\3\2\2\2\u0103\u0107\7\b\2\2\u0104\u0106\5\34\17\2\u0105\u0104"+
		"\3\2\2\2\u0106\u0109\3\2\2\2\u0107\u0105\3\2\2\2\u0107\u0108\3\2\2\2\u0108"+
		"\u010a\3\2\2\2\u0109\u0107\3\2\2\2\u010a\u010b\7\t\2\2\u010b\33\3\2\2"+
		"\2\u010c\u0122\5\36\20\2\u010d\u0122\5 \21\2\u010e\u010f\5\"\22\2\u010f"+
		"\u0110\7\n\2\2\u0110\u0122\3\2\2\2\u0111\u0122\5$\23\2\u0112\u0122\5*"+
		"\26\2\u0113\u0122\5(\25\2\u0114\u0122\5\32\16\2\u0115\u0116\5\60\31\2"+
		"\u0116\u0117\7\n\2\2\u0117\u0122\3\2\2\2\u0118\u0119\5\62\32\2\u0119\u011a"+
		"\7\n\2\2\u011a\u0122\3\2\2\2\u011b\u011c\5R*\2\u011c\u011d\7\n\2\2\u011d"+
		"\u0122\3\2\2\2\u011e\u011f\5&\24\2\u011f\u0120\7\n\2\2\u0120\u0122\3\2"+
		"\2\2\u0121\u010c\3\2\2\2\u0121\u010d\3\2\2\2\u0121\u010e\3\2\2\2\u0121"+
		"\u0111\3\2\2\2\u0121\u0112\3\2\2\2\u0121\u0113\3\2\2\2\u0121\u0114\3\2"+
		"\2\2\u0121\u0115\3\2\2\2\u0121\u0118\3\2\2\2\u0121\u011b\3\2\2\2\u0121"+
		"\u011e\3\2\2\2\u0122\35\3\2\2\2\u0123\u0124\7<\2\2\u0124\u0125\5.\30\2"+
		"\u0125\u012b\5\32\16\2\u0126\u0129\7=\2\2\u0127\u012a\5\36\20\2\u0128"+
		"\u012a\5\32\16\2\u0129\u0127\3\2\2\2\u0129\u0128\3\2\2\2\u012a\u012c\3"+
		"\2\2\2\u012b\u0126\3\2\2\2\u012b\u012c\3\2\2\2\u012c\37\3\2\2\2\u012d"+
		"\u012e\7>\2\2\u012e\u012f\5.\30\2\u012f\u0130\5\32\16\2\u0130!\3\2\2\2"+
		"\u0131\u0132\7?\2\2\u0132\u0133\5\32\16\2\u0133\u0134\7>\2\2\u0134\u0135"+
		"\5.\30\2\u0135#\3\2\2\2\u0136\u0137\7@\2\2\u0137\u013a\7\5\2\2\u0138\u013b"+
		"\5\60\31\2\u0139\u013b\5R*\2\u013a\u0138\3\2\2\2\u013a\u0139\3\2\2\2\u013a"+
		"\u013b\3\2\2\2\u013b\u013c\3\2\2\2\u013c\u013e\7\n\2\2\u013d\u013f\5R"+
		"*\2\u013e\u013d\3\2\2\2\u013e\u013f\3\2\2\2\u013f\u0140\3\2\2\2\u0140"+
		"\u0142\7\n\2\2\u0141\u0143\5R*\2\u0142\u0141\3\2\2\2\u0142\u0143\3\2\2"+
		"\2\u0143\u0144\3\2\2\2\u0144\u0145\7\6\2\2\u0145\u0146\5\32\16\2\u0146"+
		"%\3\2\2\2\u0147\u0150\7B\2\2\u0148\u0150\7A\2\2\u0149\u014a\7C\2\2\u014a"+
		"\u0150\5\u0084C\2\u014b\u014d\7D\2\2\u014c\u014e\5R*\2\u014d\u014c\3\2"+
		"\2\2\u014d\u014e\3\2\2\2\u014e\u0150\3\2\2\2\u014f\u0147\3\2\2\2\u014f"+
		"\u0148\3\2\2\2\u014f\u0149\3\2\2\2\u014f\u014b\3\2\2\2\u0150\'\3\2\2\2"+
		"\u0151\u0152\7E\2\2\u0152\u0153\5\u0084C\2\u0153\u0154\5\32\16\2\u0154"+
		")\3\2\2\2\u0155\u0156\7F\2\2\u0156\u0157\5.\30\2\u0157\u0159\7\b\2\2\u0158"+
		"\u015a\5,\27\2\u0159\u0158\3\2\2\2\u015a\u015b\3\2\2\2\u015b\u0159\3\2"+
		"\2\2\u015b\u015c\3\2\2\2\u015c\u015d\3\2\2\2\u015d\u015e\7\t\2\2\u015e"+
		"+\3\2\2\2\u015f\u0160\7G\2\2\u0160\u0161\5@!\2\u0161\u0162\7\13\2\2\u0162"+
		"\u0163\5\32\16\2\u0163\u0168\3\2\2\2\u0164\u0165\7H\2\2\u0165\u0166\7"+
		"\13\2\2\u0166\u0168\5\32\16\2\u0167\u015f\3\2\2\2\u0167\u0164\3\2\2\2"+
		"\u0168-\3\2\2\2\u0169\u016a\7\5\2\2\u016a\u016b\5R*\2\u016b\u016c\7\6"+
		"\2\2\u016c/\3\2\2\2\u016d\u016e\7\64\2\2\u016e\u016f\5\u0082B\2\u016f"+
		"\u0173\5\u0084C\2\u0170\u0172\5\66\34\2\u0171\u0170\3\2\2\2\u0172\u0175"+
		"\3\2\2\2\u0173\u0171\3\2\2\2\u0173\u0174\3\2\2\2\u0174\u0178\3\2\2\2\u0175"+
		"\u0173\3\2\2\2\u0176\u0177\7\f\2\2\u0177\u0179\5R*\2\u0178\u0176\3\2\2"+
		"\2\u0178\u0179\3\2\2\2\u0179\61\3\2\2\2\u017a\u017b\5\u0084C\2\u017b\u017c"+
		"\5n8\2\u017c\u017d\5|?\2\u017d\u017e\5R*\2\u017e\u0185\3\2\2\2\u017f\u0180"+
		"\5p9\2\u0180\u0181\5n8\2\u0181\u0182\5|?\2\u0182\u0183\5R*\2\u0183\u0185"+
		"\3\2\2\2\u0184\u017a\3\2\2\2\u0184\u017f\3\2\2\2\u0185\63\3\2\2\2\u0186"+
		"\u0187\7\65\2\2\u0187\u0188\5\u0082B\2\u0188\u018c\5\u0084C\2\u0189\u018b"+
		"\5\66\34\2\u018a\u0189\3\2\2\2\u018b\u018e\3\2\2\2\u018c\u018a\3\2\2\2"+
		"\u018c\u018d\3\2\2\2\u018d\u018f\3\2\2\2\u018e\u018c\3\2\2\2\u018f\u0190"+
		"\7\n\2\2\u0190\u019f\3\2\2\2\u0191\u0192\7\65\2\2\u0192\u0193\5\u0082"+
		"B\2\u0193\u0197\5\u0084C\2\u0194\u0196\5\66\34\2\u0195\u0194\3\2\2\2\u0196"+
		"\u0199\3\2\2\2\u0197\u0195\3\2\2\2\u0197\u0198\3\2\2\2\u0198\u019a\3\2"+
		"\2\2\u0199\u0197\3\2\2\2\u019a\u019b\7\f\2\2\u019b\u019c\58\35\2\u019c"+
		"\u019d\7\n\2\2\u019d\u019f\3\2\2\2\u019e\u0186\3\2\2\2\u019e\u0191\3\2"+
		"\2\2\u019f\65\3\2\2\2\u01a0\u01a1\7\3\2\2\u01a1\u01a2\5@!\2\u01a2\u01a3"+
		"\7\4\2\2\u01a3\u01a7\3\2\2\2\u01a4\u01a5\7\3\2\2\u01a5\u01a7\7\4\2\2\u01a6"+
		"\u01a0\3\2\2\2\u01a6\u01a4\3\2\2\2\u01a7\67\3\2\2\2\u01a8\u01ab\5@!\2"+
		"\u01a9\u01ab\5:\36\2\u01aa\u01a8\3\2\2\2\u01aa\u01a9\3\2\2\2\u01ab9\3"+
		"\2\2\2\u01ac\u01ad\7\b\2\2\u01ad\u01ae\5> \2\u01ae\u01af\7\t\2\2\u01af"+
		"\u01bb\3\2\2\2\u01b0\u01b1\7\b\2\2\u01b1\u01b4\5<\37\2\u01b2\u01b3\7\7"+
		"\2\2\u01b3\u01b5\5<\37\2\u01b4\u01b2\3\2\2\2\u01b5\u01b6\3\2\2\2\u01b6"+
		"\u01b4\3\2\2\2\u01b6\u01b7\3\2\2\2\u01b7\u01b8\3\2\2\2\u01b8\u01b9\7\t"+
		"\2\2\u01b9\u01bb\3\2\2\2\u01ba\u01ac\3\2\2\2\u01ba\u01b0\3\2\2\2\u01bb"+
		";\3\2\2\2\u01bc\u01bd\7\b\2\2\u01bd\u01be\5> \2\u01be\u01bf\7\t\2\2\u01bf"+
		"=\3\2\2\2\u01c0\u01c5\5@!\2\u01c1\u01c2\7\7\2\2\u01c2\u01c4\5@!\2\u01c3"+
		"\u01c1\3\2\2\2\u01c4\u01c7\3\2\2\2\u01c5\u01c3\3\2\2\2\u01c5\u01c6\3\2"+
		"\2\2\u01c6?\3\2\2\2\u01c7\u01c5\3\2\2\2\u01c8\u01c9\b!\1\2\u01c9\u01ca"+
		"\5B\"\2\u01ca\u01d1\3\2\2\2\u01cb\u01cc\f\4\2\2\u01cc\u01cd\5\u0086D\2"+
		"\u01cd\u01ce\5B\"\2\u01ce\u01d0\3\2\2\2\u01cf\u01cb\3\2\2\2\u01d0\u01d3"+
		"\3\2\2\2\u01d1\u01cf\3\2\2\2\u01d1\u01d2\3\2\2\2\u01d2A\3\2\2\2\u01d3"+
		"\u01d1\3\2\2\2\u01d4\u01d5\b\"\1\2\u01d5\u01d6\5D#\2\u01d6\u01dd\3\2\2"+
		"\2\u01d7\u01d8\f\4\2\2\u01d8\u01d9\5\u0088E\2\u01d9\u01da\5D#\2\u01da"+
		"\u01dc\3\2\2\2\u01db\u01d7\3\2\2\2\u01dc\u01df\3\2\2\2\u01dd\u01db\3\2"+
		"\2\2\u01dd\u01de\3\2\2\2\u01deC\3\2\2\2\u01df\u01dd\3\2\2\2\u01e0\u01e1"+
		"\b#\1\2\u01e1\u01e2\5F$\2\u01e2\u01e9\3\2\2\2\u01e3\u01e4\f\4\2\2\u01e4"+
		"\u01e5\5\u008cG\2\u01e5\u01e6\5F$\2\u01e6\u01e8\3\2\2\2\u01e7\u01e3\3"+
		"\2\2\2\u01e8\u01eb\3\2\2\2\u01e9\u01e7\3\2\2\2\u01e9\u01ea\3\2\2\2\u01ea"+
		"E\3\2\2\2\u01eb\u01e9\3\2\2\2\u01ec\u01ed\b$\1\2\u01ed\u01ee\5H%\2\u01ee"+
		"\u01f5\3\2\2\2\u01ef\u01f0\f\4\2\2\u01f0\u01f1\5z>\2\u01f1\u01f2\5H%\2"+
		"\u01f2\u01f4\3\2\2\2\u01f3\u01ef\3\2\2\2\u01f4\u01f7\3\2\2\2\u01f5\u01f3"+
		"\3\2\2\2\u01f5\u01f6\3\2\2\2\u01f6G\3\2\2\2\u01f7\u01f5\3\2\2\2\u01f8"+
		"\u01f9\b%\1\2\u01f9\u01fa\5J&\2\u01fa\u0201\3\2\2\2\u01fb\u01fc\f\4\2"+
		"\2\u01fc\u01fd\5\u008eH\2\u01fd\u01fe\5J&\2\u01fe\u0200\3\2\2\2\u01ff"+
		"\u01fb\3\2\2\2\u0200\u0203\3\2\2\2\u0201\u01ff\3\2\2\2\u0201\u0202\3\2"+
		"\2\2\u0202I\3\2\2\2\u0203\u0201\3\2\2\2\u0204\u0205\b&\1\2\u0205\u0206"+
		"\5L\'\2\u0206\u020d\3\2\2\2\u0207\u0208\f\4\2\2\u0208\u0209\5\u0090I\2"+
		"\u0209\u020a\5L\'\2\u020a\u020c\3\2\2\2\u020b\u0207\3\2\2\2\u020c\u020f"+
		"\3\2\2\2\u020d\u020b\3\2\2\2\u020d\u020e\3\2\2\2\u020eK\3\2\2\2\u020f"+
		"\u020d\3\2\2\2\u0210\u0211\b\'\1\2\u0211\u0212\5N(\2\u0212\u0219\3\2\2"+
		"\2\u0213\u0214\f\4\2\2\u0214\u0215\5\u0092J\2\u0215\u0216\5N(\2\u0216"+
		"\u0218\3\2\2\2\u0217\u0213\3\2\2\2\u0218\u021b\3\2\2\2\u0219\u0217\3\2"+
		"\2\2\u0219\u021a\3\2\2\2\u021aM\3\2\2\2\u021b\u0219\3\2\2\2\u021c\u021d"+
		"\5\u008aF\2\u021d\u021e\5P)\2\u021e\u0221\3\2\2\2\u021f\u0221\5P)\2\u0220"+
		"\u021c\3\2\2\2\u0220\u021f\3\2\2\2\u0221O\3\2\2\2\u0222\u0229\5\u0080"+
		"A\2\u0223\u0224\7\5\2\2\u0224\u0225\5@!\2\u0225\u0226\7\6\2\2\u0226\u0229"+
		"\3\2\2\2\u0227\u0229\5:\36\2\u0228\u0222\3\2\2\2\u0228\u0223\3\2\2\2\u0228"+
		"\u0227\3\2\2\2\u0229Q\3\2\2\2\u022a\u022b\b*\1\2\u022b\u022c\5T+\2\u022c"+
		"\u0233\3\2\2\2\u022d\u022e\f\4\2\2\u022e\u022f\5\u0086D\2\u022f\u0230"+
		"\5T+\2\u0230\u0232\3\2\2\2\u0231\u022d\3\2\2\2\u0232\u0235\3\2\2\2\u0233"+
		"\u0231\3\2\2\2\u0233\u0234\3\2\2\2\u0234S\3\2\2\2\u0235\u0233\3\2\2\2"+
		"\u0236\u0237\b+\1\2\u0237\u0238\5V,\2\u0238\u023f\3\2\2\2\u0239\u023a"+
		"\f\4\2\2\u023a\u023b\5\u0088E\2\u023b\u023c\5V,\2\u023c\u023e\3\2\2\2"+
		"\u023d\u0239\3\2\2\2\u023e\u0241\3\2\2\2\u023f\u023d\3\2\2\2\u023f\u0240"+
		"\3\2\2\2\u0240U\3\2\2\2\u0241\u023f\3\2\2\2\u0242\u0243\b,\1\2\u0243\u0244"+
		"\5X-\2\u0244\u024b\3\2\2\2\u0245\u0246\f\4\2\2\u0246\u0247\5\u008cG\2"+
		"\u0247\u0248\5X-\2\u0248\u024a\3\2\2\2\u0249\u0245\3\2\2\2\u024a\u024d"+
		"\3\2\2\2\u024b\u0249\3\2\2\2\u024b\u024c\3\2\2\2\u024cW\3\2\2\2\u024d"+
		"\u024b\3\2\2\2\u024e\u024f\b-\1\2\u024f\u0250\5Z.\2\u0250\u0257\3\2\2"+
		"\2\u0251\u0252\f\4\2\2\u0252\u0253\5z>\2\u0253\u0254\5Z.\2\u0254\u0256"+
		"\3\2\2\2\u0255\u0251\3\2\2\2\u0256\u0259\3\2\2\2\u0257\u0255\3\2\2\2\u0257"+
		"\u0258\3\2\2\2\u0258Y\3\2\2\2\u0259\u0257\3\2\2\2\u025a\u025b\b.\1\2\u025b"+
		"\u025c\5\\/\2\u025c\u0263\3\2\2\2\u025d\u025e\f\4\2\2\u025e\u025f\5\u008e"+
		"H\2\u025f\u0260\5\\/\2\u0260\u0262\3\2\2\2\u0261\u025d\3\2\2\2\u0262\u0265"+
		"\3\2\2\2\u0263\u0261\3\2\2\2\u0263\u0264\3\2\2\2\u0264[\3\2\2\2\u0265"+
		"\u0263\3\2\2\2\u0266\u0267\b/\1\2\u0267\u0268\5^\60\2\u0268\u026f\3\2"+
		"\2\2\u0269\u026a\f\4\2\2\u026a\u026b\5\u0090I\2\u026b\u026c\5^\60\2\u026c"+
		"\u026e\3\2\2\2\u026d\u0269\3\2\2\2\u026e\u0271\3\2\2\2\u026f\u026d\3\2"+
		"\2\2\u026f\u0270\3\2\2\2\u0270]\3\2\2\2\u0271\u026f\3\2\2\2\u0272\u0273"+
		"\b\60\1\2\u0273\u0274\5`\61\2\u0274\u027b\3\2\2\2\u0275\u0276\f\4\2\2"+
		"\u0276\u0277\5\u0092J\2\u0277\u0278\5`\61\2\u0278\u027a\3\2\2\2\u0279"+
		"\u0275\3\2\2\2\u027a\u027d\3\2\2\2\u027b\u0279\3\2\2\2\u027b\u027c\3\2"+
		"\2\2\u027c_\3\2\2\2\u027d\u027b\3\2\2\2\u027e\u027f\5\u008aF\2\u027f\u0280"+
		"\5b\62\2\u0280\u0283\3\2\2\2\u0281\u0283\5b\62\2\u0282\u027e\3\2\2\2\u0282"+
		"\u0281\3\2\2\2\u0283a\3\2\2\2\u0284\u0285\7\5\2\2\u0285\u0286\5R*\2\u0286"+
		"\u0287\7\6\2\2\u0287\u029b\3\2\2\2\u0288\u029b\5d\63\2\u0289\u029b\5f"+
		"\64\2\u028a\u028c\5\u0084C\2\u028b\u028d\5~@\2\u028c\u028b\3\2\2\2\u028c"+
		"\u028d\3\2\2\2\u028d\u029b\3\2\2\2\u028e\u028f\5\u0084C\2\u028f\u0291"+
		"\5n8\2\u0290\u0292\5~@\2\u0291\u0290\3\2\2\2\u0291\u0292\3\2\2\2\u0292"+
		"\u029b\3\2\2\2\u0293\u029b\5j\66\2\u0294\u029b\5\u0080A\2\u0295\u0297"+
		"\5p9\2\u0296\u0298\5~@\2\u0297\u0296\3\2\2\2\u0297\u0298\3\2\2\2\u0298"+
		"\u029b\3\2\2\2\u0299\u029b\5r:\2\u029a\u0284\3\2\2\2\u029a\u0288\3\2\2"+
		"\2\u029a\u0289\3\2\2\2\u029a\u028a\3\2\2\2\u029a\u028e\3\2\2\2\u029a\u0293"+
		"\3\2\2\2\u029a\u0294\3\2\2\2\u029a\u0295\3\2\2\2\u029a\u0299\3\2\2\2\u029b"+
		"c\3\2\2\2\u029c\u029d\5\u0084C\2\u029d\u029e\5l\67\2\u029ee\3\2\2\2\u029f"+
		"\u02a0\5\u0084C\2\u02a0\u02a2\5n8\2\u02a1\u02a3\5h\65\2\u02a2\u02a1\3"+
		"\2\2\2\u02a3\u02a4\3\2\2\2\u02a4\u02a2\3\2\2\2\u02a4\u02a5\3\2\2\2\u02a5"+
		"\u02ad\3\2\2\2\u02a6\u02a8\5p9\2\u02a7\u02a9\5h\65\2\u02a8\u02a7\3\2\2"+
		"\2\u02a9\u02aa\3\2\2\2\u02aa\u02a8\3\2\2\2\u02aa\u02ab\3\2\2\2\u02ab\u02ad"+
		"\3\2\2\2\u02ac\u029f\3\2\2\2\u02ac\u02a6\3\2\2\2\u02adg\3\2\2\2\u02ae"+
		"\u02af\7\r\2\2\u02af\u02b0\5d\63\2\u02b0\u02b1\5n8\2\u02b1i\3\2\2\2\u02b2"+
		"\u02b3\7M\2\2\u02b3\u02b4\5\u0084C\2\u02b4\u02b5\5l\67\2\u02b5\u02b9\5"+
		"n8\2\u02b6\u02b8\5h\65\2\u02b7\u02b6\3\2\2\2\u02b8\u02bb\3\2\2\2\u02b9"+
		"\u02b7\3\2\2\2\u02b9\u02ba\3\2\2\2\u02bak\3\2\2\2\u02bb\u02b9\3\2\2\2"+
		"\u02bc\u02c5\7\5\2\2\u02bd\u02c2\5R*\2\u02be\u02bf\7\7\2\2\u02bf\u02c1"+
		"\5R*\2\u02c0\u02be\3\2\2\2\u02c1\u02c4\3\2\2\2\u02c2\u02c0\3\2\2\2\u02c2"+
		"\u02c3\3\2\2\2\u02c3\u02c6\3\2\2\2\u02c4\u02c2\3\2\2\2\u02c5\u02bd\3\2"+
		"\2\2\u02c5\u02c6\3\2\2\2\u02c6\u02c7\3\2\2\2\u02c7\u02c8\7\6\2\2\u02c8"+
		"m\3\2\2\2\u02c9\u02ca\7\3\2\2\u02ca\u02cb\5R*\2\u02cb\u02cc\7\4\2\2\u02cc"+
		"\u02ce\3\2\2\2\u02cd\u02c9\3\2\2\2\u02ce\u02d1\3\2\2\2\u02cf\u02cd\3\2"+
		"\2\2\u02cf\u02d0\3\2\2\2\u02d0o\3\2\2\2\u02d1\u02cf\3\2\2\2\u02d2\u02d9"+
		"\7K\2\2\u02d3\u02d4\7\r\2\2\u02d4\u02d5\5\u0084C\2\u02d5\u02d6\5n8\2\u02d6"+
		"\u02d8\3\2\2\2\u02d7\u02d3\3\2\2\2\u02d8\u02db\3\2\2\2\u02d9\u02d7\3\2"+
		"\2\2\u02d9\u02da\3\2\2\2\u02daq\3\2\2\2\u02db\u02d9\3\2\2\2\u02dc\u02dd"+
		"\7\b\2\2\u02dd\u02de\5v<\2\u02de\u02df\7\t\2\2\u02df\u02eb\3\2\2\2\u02e0"+
		"\u02e1\7\b\2\2\u02e1\u02e4\5t;\2\u02e2\u02e3\7\7\2\2\u02e3\u02e5\5t;\2"+
		"\u02e4\u02e2\3\2\2\2\u02e5\u02e6\3\2\2\2\u02e6\u02e4\3\2\2\2\u02e6\u02e7"+
		"\3\2\2\2\u02e7\u02e8\3\2\2\2\u02e8\u02e9\7\t\2\2\u02e9\u02eb\3\2\2\2\u02ea"+
		"\u02dc\3\2\2\2\u02ea\u02e0\3\2\2\2\u02ebs\3\2\2\2\u02ec\u02ed\7\b\2\2"+
		"\u02ed\u02ee\5v<\2\u02ee\u02ef\7\t\2\2\u02efu\3\2\2\2\u02f0\u02f5\5R*"+
		"\2\u02f1\u02f2\7\7\2\2\u02f2\u02f4\5R*\2\u02f3\u02f1\3\2\2\2\u02f4\u02f7"+
		"\3\2\2\2\u02f5\u02f3\3\2\2\2\u02f5\u02f6\3\2\2\2\u02f6w\3\2\2\2\u02f7"+
		"\u02f5\3\2\2\2\u02f8\u02fb\7\62\2\2\u02f9\u02fb\5\u0082B\2\u02fa\u02f8"+
		"\3\2\2\2\u02fa\u02f9\3\2\2\2\u02fby\3\2\2\2\u02fc\u02fd\t\3\2\2\u02fd"+
		"{\3\2\2\2\u02fe\u02ff\t\4\2\2\u02ff}\3\2\2\2\u0300\u0301\t\5\2\2\u0301"+
		"\177\3\2\2\2\u0302\u0303\t\6\2\2\u0303\u0081\3\2\2\2\u0304\u030b\7\32"+
		"\2\2\u0305\u030b\7\33\2\2\u0306\u030b\7\34\2\2\u0307\u030b\7\35\2\2\u0308"+
		"\u030b\7\36\2\2\u0309\u030b\5\u0084C\2\u030a\u0304\3\2\2\2\u030a\u0305"+
		"\3\2\2\2\u030a\u0306\3\2\2\2\u030a\u0307\3\2\2\2\u030a\u0308\3\2\2\2\u030a"+
		"\u0309\3\2\2\2\u030b\u0083\3\2\2\2\u030c\u030d\7R\2\2\u030d\u0085\3\2"+
		"\2\2\u030e\u030f\t\7\2\2\u030f\u0087\3\2\2\2\u0310\u0311\t\b\2\2\u0311"+
		"\u0089\3\2\2\2\u0312\u0313\t\t\2\2\u0313\u008b\3\2\2\2\u0314\u0315\t\n"+
		"\2\2\u0315\u008d\3\2\2\2\u0316\u0317\t\13\2\2\u0317\u008f\3\2\2\2\u0318"+
		"\u0319\t\f\2\2\u0319\u0091\3\2\2\2\u031a\u031b\7.\2\2\u031b\u0093\3\2"+
		"\2\2F\u0098\u009a\u00ad\u00b4\u00bc\u00c5\u00cc\u00d2\u00dc\u00de\u00e9"+
		"\u00fd\u0107\u0121\u0129\u012b\u013a\u013e\u0142\u014d\u014f\u015b\u0167"+
		"\u0173\u0178\u0184\u018c\u0197\u019e\u01a6\u01aa\u01b6\u01ba\u01c5\u01d1"+
		"\u01dd\u01e9\u01f5\u0201\u020d\u0219\u0220\u0228\u0233\u023f\u024b\u0257"+
		"\u0263\u026f\u027b\u0282\u028c\u0291\u0297\u029a\u02a4\u02aa\u02ac\u02b9"+
		"\u02c2\u02c5\u02cf\u02d9\u02e6\u02ea\u02f5\u02fa\u030a";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}