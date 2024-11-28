// Generated from ReFugg.g4 by ANTLR 4.7.2
package ch.compiler.parser;
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
		T__38=39, T__39=40, T__40=41, T__41=42, T__42=43, MAIN=44, FUNC=45, CLASS=46, 
		VOID=47, FIELD=48, VAR=49, GLOBAL=50, METH=51, CONST=52, ISA=53, PRIVATE=54, 
		PUBLIC=55, PROTECTED=56, FINAL=57, STATIC=58, IF=59, ELSE=60, WHILE=61, 
		DO=62, FOR=63, CONTINUE=64, BREAK=65, GOTO=66, RETURN=67, LABEL=68, SWITCH=69, 
		CASE=70, DEFAULT=71, TRUE=72, FALSE=73, THIS=74, NULL=75, NEW=76, INT_LIT=77, 
		DOUBLE_LIT=78, CHAR_LIT=79, STRING_LIT=80, SEMI=81, ID=82, COMMENT=83, 
		BIG_COMMENT=84, WS=85;
	public static final int
		RULE_program = 0, RULE_main = 1, RULE_func = 2, RULE_fHeader = 3, RULE_fParam = 4, 
		RULE_arg = 5, RULE_argList = 6, RULE_classDec = 7, RULE_classInside = 8, 
		RULE_poly = 9, RULE_visibilty = 10, RULE_classConstructor = 11, RULE_method = 12, 
		RULE_classField = 13, RULE_functionBlock = 14, RULE_loopBlock = 15, RULE_stmt = 16, 
		RULE_ifStmt = 17, RULE_whileStmt = 18, RULE_doWhileStmt = 19, RULE_forStmt = 20, 
		RULE_functionJumpStmt = 21, RULE_loopJumpStmt = 22, RULE_label = 23, RULE_switchCase = 24, 
		RULE_caseBlock = 25, RULE_check = 26, RULE_varDec = 27, RULE_globalVar = 28, 
		RULE_constArray = 29, RULE_constList = 30, RULE_constSubList = 31, RULE_constExprMany = 32, 
		RULE_constVar = 33, RULE_constArrayAccess = 34, RULE_constExpr = 35, RULE_constJoin = 36, 
		RULE_constEQ = 37, RULE_constRel = 38, RULE_constLogic = 39, RULE_constTerm = 40, 
		RULE_constExpo = 41, RULE_constUnary = 42, RULE_constFactor = 43, RULE_arrayAccess = 44, 
		RULE_methodCall = 45, RULE_newObject = 46, RULE_fCall = 47, RULE_thisAcces = 48, 
		RULE_varAcces = 49, RULE_exprTail = 50, RULE_lh_expression = 51, RULE_expression = 52, 
		RULE_orExpression = 53, RULE_andExpression = 54, RULE_equalityExpression = 55, 
		RULE_relationalExpression = 56, RULE_additiveExpression = 57, RULE_multiplicativeExpression = 58, 
		RULE_exponentiationExpression = 59, RULE_unaryExpression = 60, RULE_postExpression = 61, 
		RULE_primary = 62, RULE_list = 63, RULE_subList = 64, RULE_expressionMany = 65, 
		RULE_fArgs = 66, RULE_returntype = 67, RULE_constant = 68, RULE_type = 69, 
		RULE_identifier = 70, RULE_typemodifier = 71, RULE_doubleRule = 72, RULE_intRule = 73, 
		RULE_stringRule = 74, RULE_charRule = 75, RULE_booleanRule = 76, RULE_refRule = 77, 
		RULE_assignOP = 78, RULE_orOP = 79, RULE_andOP = 80, RULE_eqOP = 81, RULE_relOP = 82, 
		RULE_addOP = 83, RULE_multOP = 84, RULE_expOP = 85, RULE_preOP = 86, RULE_postOP = 87;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "main", "func", "fHeader", "fParam", "arg", "argList", "classDec", 
			"classInside", "poly", "visibilty", "classConstructor", "method", "classField", 
			"functionBlock", "loopBlock", "stmt", "ifStmt", "whileStmt", "doWhileStmt", 
			"forStmt", "functionJumpStmt", "loopJumpStmt", "label", "switchCase", 
			"caseBlock", "check", "varDec", "globalVar", "constArray", "constList", 
			"constSubList", "constExprMany", "constVar", "constArrayAccess", "constExpr", 
			"constJoin", "constEQ", "constRel", "constLogic", "constTerm", "constExpo", 
			"constUnary", "constFactor", "arrayAccess", "methodCall", "newObject", 
			"fCall", "thisAcces", "varAcces", "exprTail", "lh_expression", "expression", 
			"orExpression", "andExpression", "equalityExpression", "relationalExpression", 
			"additiveExpression", "multiplicativeExpression", "exponentiationExpression", 
			"unaryExpression", "postExpression", "primary", "list", "subList", "expressionMany", 
			"fArgs", "returntype", "constant", "type", "identifier", "typemodifier", 
			"doubleRule", "intRule", "stringRule", "charRule", "booleanRule", "refRule", 
			"assignOP", "orOP", "andOP", "eqOP", "relOP", "addOP", "multOP", "expOP", 
			"preOP", "postOP"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'['", "']'", "'('", "')'", "','", "'{'", "'}'", "'='", "':'", 
			"'.'", "'double'", "'int'", "'string'", "'char'", "'boolean'", "'+='", 
			"'-='", "'*='", "'/='", "'%='", "'^='", "'**='", "'||'", "'or'", "'&&'", 
			"'and'", "'=='", "'!='", "'<'", "'<='", "'>'", "'>='", "'+'", "'-'", 
			"'*'", "'/'", "'%'", "'^'", "'**'", "'!'", "'not'", "'++'", "'--'", "'main:'", 
			"'func:'", "'class:'", "'void'", "'field:'", "'var:'", "'global:'", "'method:'", 
			"'constructor:'", "'isa:'", "'private:'", "'public:'", "'protected:'", 
			"'final'", "'static'", "'if'", "'else'", "'while'", "'do'", "'for'", 
			"'continue'", "'break'", "'goto'", "'return'", "'label:'", "'switch'", 
			"'case'", "'default'", "'true'", "'false'", "'this'", "'null'", "'new'", 
			null, null, null, null, "';'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, "MAIN", "FUNC", "CLASS", 
			"VOID", "FIELD", "VAR", "GLOBAL", "METH", "CONST", "ISA", "PRIVATE", 
			"PUBLIC", "PROTECTED", "FINAL", "STATIC", "IF", "ELSE", "WHILE", "DO", 
			"FOR", "CONTINUE", "BREAK", "GOTO", "RETURN", "LABEL", "SWITCH", "CASE", 
			"DEFAULT", "TRUE", "FALSE", "THIS", "NULL", "NEW", "INT_LIT", "DOUBLE_LIT", 
			"CHAR_LIT", "STRING_LIT", "SEMI", "ID", "COMMENT", "BIG_COMMENT", "WS"
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
			setState(182);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 45)) & ~0x3f) == 0 && ((1L << (_la - 45)) & ((1L << (FUNC - 45)) | (1L << (CLASS - 45)) | (1L << (GLOBAL - 45)) | (1L << (LABEL - 45)))) != 0)) {
				{
				setState(180);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case FUNC:
					{
					setState(176);
					func();
					}
					break;
				case CLASS:
					{
					setState(177);
					classDec();
					}
					break;
				case GLOBAL:
					{
					setState(178);
					globalVar();
					}
					break;
				case LABEL:
					{
					setState(179);
					label();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(184);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(185);
			main();
			setState(186);
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
		public FunctionBlockContext functionBlock() {
			return getRuleContext(FunctionBlockContext.class,0);
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
			setState(188);
			match(MAIN);
			setState(189);
			functionBlock();
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
		public FunctionBlockContext functionBlock() {
			return getRuleContext(FunctionBlockContext.class,0);
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
			setState(191);
			match(FUNC);
			setState(192);
			fHeader();
			setState(193);
			fParam();
			setState(194);
			functionBlock();
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
			setState(196);
			returntype();
			setState(201);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0) {
				{
				{
				setState(197);
				match(T__0);
				setState(198);
				match(T__1);
				}
				}
				setState(203);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(204);
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
			setState(206);
			match(T__2);
			setState(208);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14))) != 0) || _la==ID) {
				{
				setState(207);
				argList();
				}
			}

			setState(210);
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

	public static class ArgContext extends ParserRuleContext {
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
		public ArgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arg; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReFuggListener ) ((ReFuggListener)listener).enterArg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReFuggListener ) ((ReFuggListener)listener).exitArg(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReFuggVisitor ) return ((ReFuggVisitor<? extends T>)visitor).visitArg(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgContext arg() throws RecognitionException {
		ArgContext _localctx = new ArgContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_arg);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(212);
			type();
			setState(216);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0) {
				{
				{
				setState(213);
				constArray();
				}
				}
				setState(218);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(219);
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

	public static class ArgListContext extends ParserRuleContext {
		public List<ArgContext> arg() {
			return getRuleContexts(ArgContext.class);
		}
		public ArgContext arg(int i) {
			return getRuleContext(ArgContext.class,i);
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
		enterRule(_localctx, 12, RULE_argList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(221);
			arg();
			setState(226);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__4) {
				{
				{
				setState(222);
				match(T__4);
				setState(223);
				arg();
				}
				}
				setState(228);
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
		public List<VisibiltyContext> visibilty() {
			return getRuleContexts(VisibiltyContext.class);
		}
		public VisibiltyContext visibilty(int i) {
			return getRuleContext(VisibiltyContext.class,i);
		}
		public List<ClassInsideContext> classInside() {
			return getRuleContexts(ClassInsideContext.class);
		}
		public ClassInsideContext classInside(int i) {
			return getRuleContext(ClassInsideContext.class,i);
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
		enterRule(_localctx, 14, RULE_classDec);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(229);
			match(CLASS);
			setState(230);
			identifier();
			setState(232);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ISA) {
				{
				setState(231);
				poly();
				}
			}

			setState(234);
			match(T__5);
			setState(243);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PRIVATE) | (1L << PUBLIC) | (1L << PROTECTED))) != 0)) {
				{
				{
				setState(235);
				visibilty();
				setState(237); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(236);
					classInside();
					}
					}
					setState(239); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << FIELD) | (1L << METH) | (1L << CONST))) != 0) );
				}
				}
				setState(245);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(246);
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

	public static class ClassInsideContext extends ParserRuleContext {
		public ClassConstructorContext classConstructor() {
			return getRuleContext(ClassConstructorContext.class,0);
		}
		public ClassFieldContext classField() {
			return getRuleContext(ClassFieldContext.class,0);
		}
		public MethodContext method() {
			return getRuleContext(MethodContext.class,0);
		}
		public ClassInsideContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classInside; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReFuggListener ) ((ReFuggListener)listener).enterClassInside(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReFuggListener ) ((ReFuggListener)listener).exitClassInside(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReFuggVisitor ) return ((ReFuggVisitor<? extends T>)visitor).visitClassInside(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassInsideContext classInside() throws RecognitionException {
		ClassInsideContext _localctx = new ClassInsideContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_classInside);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(251);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CONST:
				{
				setState(248);
				classConstructor();
				}
				break;
			case FIELD:
				{
				setState(249);
				classField();
				}
				break;
			case METH:
				{
				setState(250);
				method();
				}
				break;
			default:
				throw new NoViableAltException(this);
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
		enterRule(_localctx, 18, RULE_poly);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(253);
			match(ISA);
			setState(254);
			identifier();
			setState(259);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__4) {
				{
				{
				setState(255);
				match(T__4);
				setState(256);
				identifier();
				}
				}
				setState(261);
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
		enterRule(_localctx, 20, RULE_visibilty);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(262);
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
		public FunctionBlockContext functionBlock() {
			return getRuleContext(FunctionBlockContext.class,0);
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
		enterRule(_localctx, 22, RULE_classConstructor);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(264);
			match(CONST);
			setState(265);
			identifier();
			setState(266);
			fParam();
			setState(267);
			functionBlock();
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
		public FunctionBlockContext functionBlock() {
			return getRuleContext(FunctionBlockContext.class,0);
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
		enterRule(_localctx, 24, RULE_method);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(269);
			match(METH);
			setState(270);
			fHeader();
			setState(271);
			fParam();
			setState(272);
			functionBlock();
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
		public TypemodifierContext typemodifier() {
			return getRuleContext(TypemodifierContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(ReFuggParser.SEMI, 0); }
		public List<ConstArrayContext> constArray() {
			return getRuleContexts(ConstArrayContext.class);
		}
		public ConstArrayContext constArray(int i) {
			return getRuleContext(ConstArrayContext.class,i);
		}
		public ConstExprContext constExpr() {
			return getRuleContext(ConstExprContext.class,0);
		}
		public ConstListContext constList() {
			return getRuleContext(ConstListContext.class,0);
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
		enterRule(_localctx, 26, RULE_classField);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(274);
			match(FIELD);
			setState(275);
			typemodifier();
			setState(276);
			type();
			setState(280);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0) {
				{
				{
				setState(277);
				constArray();
				}
				}
				setState(282);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(283);
			identifier();
			setState(289);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__7) {
				{
				setState(284);
				match(T__7);
				setState(287);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__2:
				case T__32:
				case T__33:
				case T__39:
				case T__40:
				case TRUE:
				case FALSE:
				case NULL:
				case INT_LIT:
				case DOUBLE_LIT:
				case CHAR_LIT:
				case STRING_LIT:
				case ID:
					{
					setState(285);
					constExpr(0);
					}
					break;
				case T__5:
					{
					setState(286);
					constList();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
			}

			setState(291);
			match(SEMI);
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

	public static class FunctionBlockContext extends ParserRuleContext {
		public List<StmtContext> stmt() {
			return getRuleContexts(StmtContext.class);
		}
		public StmtContext stmt(int i) {
			return getRuleContext(StmtContext.class,i);
		}
		public List<FunctionJumpStmtContext> functionJumpStmt() {
			return getRuleContexts(FunctionJumpStmtContext.class);
		}
		public FunctionJumpStmtContext functionJumpStmt(int i) {
			return getRuleContext(FunctionJumpStmtContext.class,i);
		}
		public List<TerminalNode> SEMI() { return getTokens(ReFuggParser.SEMI); }
		public TerminalNode SEMI(int i) {
			return getToken(ReFuggParser.SEMI, i);
		}
		public FunctionBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReFuggListener ) ((ReFuggListener)listener).enterFunctionBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReFuggListener ) ((ReFuggListener)listener).exitFunctionBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReFuggVisitor ) return ((ReFuggVisitor<? extends T>)visitor).visitFunctionBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionBlockContext functionBlock() throws RecognitionException {
		FunctionBlockContext _localctx = new FunctionBlockContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_functionBlock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(293);
			match(T__5);
			setState(300);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__5) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__32) | (1L << T__33) | (1L << T__39) | (1L << T__40) | (1L << FINAL) | (1L << STATIC) | (1L << IF) | (1L << WHILE) | (1L << DO) | (1L << FOR))) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (GOTO - 66)) | (1L << (RETURN - 66)) | (1L << (LABEL - 66)) | (1L << (SWITCH - 66)) | (1L << (TRUE - 66)) | (1L << (FALSE - 66)) | (1L << (THIS - 66)) | (1L << (NULL - 66)) | (1L << (NEW - 66)) | (1L << (INT_LIT - 66)) | (1L << (DOUBLE_LIT - 66)) | (1L << (CHAR_LIT - 66)) | (1L << (STRING_LIT - 66)) | (1L << (ID - 66)))) != 0)) {
				{
				setState(298);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__2:
				case T__5:
				case T__10:
				case T__11:
				case T__12:
				case T__13:
				case T__14:
				case T__32:
				case T__33:
				case T__39:
				case T__40:
				case FINAL:
				case STATIC:
				case IF:
				case WHILE:
				case DO:
				case FOR:
				case LABEL:
				case SWITCH:
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
					setState(294);
					stmt();
					}
					break;
				case GOTO:
				case RETURN:
					{
					{
					setState(295);
					functionJumpStmt();
					setState(296);
					match(SEMI);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(302);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(303);
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

	public static class LoopBlockContext extends ParserRuleContext {
		public List<StmtContext> stmt() {
			return getRuleContexts(StmtContext.class);
		}
		public StmtContext stmt(int i) {
			return getRuleContext(StmtContext.class,i);
		}
		public List<LoopJumpStmtContext> loopJumpStmt() {
			return getRuleContexts(LoopJumpStmtContext.class);
		}
		public LoopJumpStmtContext loopJumpStmt(int i) {
			return getRuleContext(LoopJumpStmtContext.class,i);
		}
		public List<TerminalNode> SEMI() { return getTokens(ReFuggParser.SEMI); }
		public TerminalNode SEMI(int i) {
			return getToken(ReFuggParser.SEMI, i);
		}
		public LoopBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_loopBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReFuggListener ) ((ReFuggListener)listener).enterLoopBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReFuggListener ) ((ReFuggListener)listener).exitLoopBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReFuggVisitor ) return ((ReFuggVisitor<? extends T>)visitor).visitLoopBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LoopBlockContext loopBlock() throws RecognitionException {
		LoopBlockContext _localctx = new LoopBlockContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_loopBlock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(305);
			match(T__5);
			setState(312);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__5) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__32) | (1L << T__33) | (1L << T__39) | (1L << T__40) | (1L << FINAL) | (1L << STATIC) | (1L << IF) | (1L << WHILE) | (1L << DO) | (1L << FOR))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (CONTINUE - 64)) | (1L << (BREAK - 64)) | (1L << (GOTO - 64)) | (1L << (RETURN - 64)) | (1L << (LABEL - 64)) | (1L << (SWITCH - 64)) | (1L << (TRUE - 64)) | (1L << (FALSE - 64)) | (1L << (THIS - 64)) | (1L << (NULL - 64)) | (1L << (NEW - 64)) | (1L << (INT_LIT - 64)) | (1L << (DOUBLE_LIT - 64)) | (1L << (CHAR_LIT - 64)) | (1L << (STRING_LIT - 64)) | (1L << (ID - 64)))) != 0)) {
				{
				setState(310);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__2:
				case T__5:
				case T__10:
				case T__11:
				case T__12:
				case T__13:
				case T__14:
				case T__32:
				case T__33:
				case T__39:
				case T__40:
				case FINAL:
				case STATIC:
				case IF:
				case WHILE:
				case DO:
				case FOR:
				case LABEL:
				case SWITCH:
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
					setState(306);
					stmt();
					}
					break;
				case CONTINUE:
				case BREAK:
				case GOTO:
				case RETURN:
					{
					{
					setState(307);
					loopJumpStmt();
					setState(308);
					match(SEMI);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(314);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(315);
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
		public IfStmtContext ifStmt() {
			return getRuleContext(IfStmtContext.class,0);
		}
		public WhileStmtContext whileStmt() {
			return getRuleContext(WhileStmtContext.class,0);
		}
		public DoWhileStmtContext doWhileStmt() {
			return getRuleContext(DoWhileStmtContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(ReFuggParser.SEMI, 0); }
		public ForStmtContext forStmt() {
			return getRuleContext(ForStmtContext.class,0);
		}
		public SwitchCaseContext switchCase() {
			return getRuleContext(SwitchCaseContext.class,0);
		}
		public LabelContext label() {
			return getRuleContext(LabelContext.class,0);
		}
		public FunctionBlockContext functionBlock() {
			return getRuleContext(FunctionBlockContext.class,0);
		}
		public VarDecContext varDec() {
			return getRuleContext(VarDecContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public StmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReFuggListener ) ((ReFuggListener)listener).enterStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReFuggListener ) ((ReFuggListener)listener).exitStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReFuggVisitor ) return ((ReFuggVisitor<? extends T>)visitor).visitStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StmtContext stmt() throws RecognitionException {
		StmtContext _localctx = new StmtContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_stmt);
		try {
			setState(332);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(317);
				ifStmt();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(318);
				whileStmt();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(319);
				doWhileStmt();
				setState(320);
				match(SEMI);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(322);
				forStmt();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(323);
				switchCase();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(324);
				label();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(325);
				functionBlock();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(326);
				varDec();
				setState(327);
				match(SEMI);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(329);
				expression();
				setState(330);
				match(SEMI);
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
		public List<FunctionBlockContext> functionBlock() {
			return getRuleContexts(FunctionBlockContext.class);
		}
		public FunctionBlockContext functionBlock(int i) {
			return getRuleContext(FunctionBlockContext.class,i);
		}
		public TerminalNode ELSE() { return getToken(ReFuggParser.ELSE, 0); }
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
		enterRule(_localctx, 34, RULE_ifStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(334);
			match(IF);
			setState(335);
			check();
			setState(336);
			functionBlock();
			setState(339);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(337);
				match(ELSE);
				setState(338);
				functionBlock();
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
		public LoopBlockContext loopBlock() {
			return getRuleContext(LoopBlockContext.class,0);
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
		enterRule(_localctx, 36, RULE_whileStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(341);
			match(WHILE);
			setState(342);
			check();
			setState(343);
			loopBlock();
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
		public LoopBlockContext loopBlock() {
			return getRuleContext(LoopBlockContext.class,0);
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
		enterRule(_localctx, 38, RULE_doWhileStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(345);
			match(DO);
			setState(346);
			loopBlock();
			setState(347);
			match(WHILE);
			setState(348);
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
		public List<TerminalNode> SEMI() { return getTokens(ReFuggParser.SEMI); }
		public TerminalNode SEMI(int i) {
			return getToken(ReFuggParser.SEMI, i);
		}
		public LoopBlockContext loopBlock() {
			return getRuleContext(LoopBlockContext.class,0);
		}
		public VarDecContext varDec() {
			return getRuleContext(VarDecContext.class,0);
		}
		public List<OrExpressionContext> orExpression() {
			return getRuleContexts(OrExpressionContext.class);
		}
		public OrExpressionContext orExpression(int i) {
			return getRuleContext(OrExpressionContext.class,i);
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
		enterRule(_localctx, 40, RULE_forStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(350);
			match(FOR);
			setState(351);
			match(T__2);
			setState(354);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				{
				setState(352);
				varDec();
				}
				break;
			case 2:
				{
				setState(353);
				orExpression(0);
				}
				break;
			}
			setState(356);
			match(SEMI);
			setState(358);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__32) | (1L << T__33) | (1L << T__39) | (1L << T__40))) != 0) || ((((_la - 72)) & ~0x3f) == 0 && ((1L << (_la - 72)) & ((1L << (TRUE - 72)) | (1L << (FALSE - 72)) | (1L << (THIS - 72)) | (1L << (NULL - 72)) | (1L << (NEW - 72)) | (1L << (INT_LIT - 72)) | (1L << (DOUBLE_LIT - 72)) | (1L << (CHAR_LIT - 72)) | (1L << (STRING_LIT - 72)) | (1L << (ID - 72)))) != 0)) {
				{
				setState(357);
				orExpression(0);
				}
			}

			setState(360);
			match(SEMI);
			setState(362);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__32) | (1L << T__33) | (1L << T__39) | (1L << T__40))) != 0) || ((((_la - 72)) & ~0x3f) == 0 && ((1L << (_la - 72)) & ((1L << (TRUE - 72)) | (1L << (FALSE - 72)) | (1L << (THIS - 72)) | (1L << (NULL - 72)) | (1L << (NEW - 72)) | (1L << (INT_LIT - 72)) | (1L << (DOUBLE_LIT - 72)) | (1L << (CHAR_LIT - 72)) | (1L << (STRING_LIT - 72)) | (1L << (ID - 72)))) != 0)) {
				{
				setState(361);
				orExpression(0);
				}
			}

			setState(364);
			match(T__3);
			setState(365);
			loopBlock();
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

	public static class FunctionJumpStmtContext extends ParserRuleContext {
		public TerminalNode GOTO() { return getToken(ReFuggParser.GOTO, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode RETURN() { return getToken(ReFuggParser.RETURN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public FunctionJumpStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionJumpStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReFuggListener ) ((ReFuggListener)listener).enterFunctionJumpStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReFuggListener ) ((ReFuggListener)listener).exitFunctionJumpStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReFuggVisitor ) return ((ReFuggVisitor<? extends T>)visitor).visitFunctionJumpStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionJumpStmtContext functionJumpStmt() throws RecognitionException {
		FunctionJumpStmtContext _localctx = new FunctionJumpStmtContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_functionJumpStmt);
		int _la;
		try {
			setState(373);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case GOTO:
				enterOuterAlt(_localctx, 1);
				{
				setState(367);
				match(GOTO);
				setState(368);
				identifier();
				}
				break;
			case RETURN:
				enterOuterAlt(_localctx, 2);
				{
				setState(369);
				match(RETURN);
				setState(371);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__32) | (1L << T__33) | (1L << T__39) | (1L << T__40))) != 0) || ((((_la - 72)) & ~0x3f) == 0 && ((1L << (_la - 72)) & ((1L << (TRUE - 72)) | (1L << (FALSE - 72)) | (1L << (THIS - 72)) | (1L << (NULL - 72)) | (1L << (NEW - 72)) | (1L << (INT_LIT - 72)) | (1L << (DOUBLE_LIT - 72)) | (1L << (CHAR_LIT - 72)) | (1L << (STRING_LIT - 72)) | (1L << (ID - 72)))) != 0)) {
					{
					setState(370);
					expression();
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

	public static class LoopJumpStmtContext extends ParserRuleContext {
		public TerminalNode BREAK() { return getToken(ReFuggParser.BREAK, 0); }
		public TerminalNode CONTINUE() { return getToken(ReFuggParser.CONTINUE, 0); }
		public TerminalNode GOTO() { return getToken(ReFuggParser.GOTO, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode RETURN() { return getToken(ReFuggParser.RETURN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public LoopJumpStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_loopJumpStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReFuggListener ) ((ReFuggListener)listener).enterLoopJumpStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReFuggListener ) ((ReFuggListener)listener).exitLoopJumpStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReFuggVisitor ) return ((ReFuggVisitor<? extends T>)visitor).visitLoopJumpStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LoopJumpStmtContext loopJumpStmt() throws RecognitionException {
		LoopJumpStmtContext _localctx = new LoopJumpStmtContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_loopJumpStmt);
		int _la;
		try {
			setState(383);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BREAK:
				enterOuterAlt(_localctx, 1);
				{
				setState(375);
				match(BREAK);
				}
				break;
			case CONTINUE:
				enterOuterAlt(_localctx, 2);
				{
				setState(376);
				match(CONTINUE);
				}
				break;
			case GOTO:
				enterOuterAlt(_localctx, 3);
				{
				setState(377);
				match(GOTO);
				setState(378);
				identifier();
				}
				break;
			case RETURN:
				enterOuterAlt(_localctx, 4);
				{
				setState(379);
				match(RETURN);
				setState(381);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__32) | (1L << T__33) | (1L << T__39) | (1L << T__40))) != 0) || ((((_la - 72)) & ~0x3f) == 0 && ((1L << (_la - 72)) & ((1L << (TRUE - 72)) | (1L << (FALSE - 72)) | (1L << (THIS - 72)) | (1L << (NULL - 72)) | (1L << (NEW - 72)) | (1L << (INT_LIT - 72)) | (1L << (DOUBLE_LIT - 72)) | (1L << (CHAR_LIT - 72)) | (1L << (STRING_LIT - 72)) | (1L << (ID - 72)))) != 0)) {
					{
					setState(380);
					expression();
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
		public FunctionBlockContext functionBlock() {
			return getRuleContext(FunctionBlockContext.class,0);
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
		enterRule(_localctx, 46, RULE_label);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(385);
			match(LABEL);
			setState(386);
			identifier();
			setState(388);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
			case 1:
				{
				setState(387);
				functionBlock();
				}
				break;
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
		enterRule(_localctx, 48, RULE_switchCase);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(390);
			match(SWITCH);
			setState(391);
			check();
			setState(392);
			match(T__5);
			setState(394); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(393);
				caseBlock();
				}
				}
				setState(396); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==CASE || _la==DEFAULT );
			setState(398);
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
		public TerminalNode CASE() { return getToken(ReFuggParser.CASE, 0); }
		public ConstExprContext constExpr() {
			return getRuleContext(ConstExprContext.class,0);
		}
		public FunctionBlockContext functionBlock() {
			return getRuleContext(FunctionBlockContext.class,0);
		}
		public TerminalNode DEFAULT() { return getToken(ReFuggParser.DEFAULT, 0); }
		public CaseBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_caseBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReFuggListener ) ((ReFuggListener)listener).enterCaseBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReFuggListener ) ((ReFuggListener)listener).exitCaseBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReFuggVisitor ) return ((ReFuggVisitor<? extends T>)visitor).visitCaseBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CaseBlockContext caseBlock() throws RecognitionException {
		CaseBlockContext _localctx = new CaseBlockContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_caseBlock);
		try {
			setState(408);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CASE:
				enterOuterAlt(_localctx, 1);
				{
				setState(400);
				match(CASE);
				setState(401);
				constExpr(0);
				setState(402);
				match(T__8);
				setState(403);
				functionBlock();
				}
				break;
			case DEFAULT:
				enterOuterAlt(_localctx, 2);
				{
				setState(405);
				match(DEFAULT);
				setState(406);
				match(T__8);
				setState(407);
				functionBlock();
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
		public OrExpressionContext orExpression() {
			return getRuleContext(OrExpressionContext.class,0);
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
		enterRule(_localctx, 52, RULE_check);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(410);
			match(T__2);
			setState(411);
			orExpression(0);
			setState(412);
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
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TypemodifierContext typemodifier() {
			return getRuleContext(TypemodifierContext.class,0);
		}
		public List<ConstArrayContext> constArray() {
			return getRuleContexts(ConstArrayContext.class);
		}
		public ConstArrayContext constArray(int i) {
			return getRuleContext(ConstArrayContext.class,i);
		}
		public OrExpressionContext orExpression() {
			return getRuleContext(OrExpressionContext.class,0);
		}
		public ListContext list() {
			return getRuleContext(ListContext.class,0);
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
		enterRule(_localctx, 54, RULE_varDec);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(415);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==FINAL || _la==STATIC) {
				{
				setState(414);
				typemodifier();
				}
			}

			setState(417);
			type();
			setState(421);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0) {
				{
				{
				setState(418);
				constArray();
				}
				}
				setState(423);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(424);
			identifier();
			setState(430);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__7) {
				{
				setState(425);
				match(T__7);
				setState(428);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__2:
				case T__32:
				case T__33:
				case T__39:
				case T__40:
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
					setState(426);
					orExpression(0);
					}
					break;
				case T__5:
					{
					setState(427);
					list();
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

	public static class GlobalVarContext extends ParserRuleContext {
		public TerminalNode GLOBAL() { return getToken(ReFuggParser.GLOBAL, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(ReFuggParser.SEMI, 0); }
		public ConstExprContext constExpr() {
			return getRuleContext(ConstExprContext.class,0);
		}
		public ConstListContext constList() {
			return getRuleContext(ConstListContext.class,0);
		}
		public TypemodifierContext typemodifier() {
			return getRuleContext(TypemodifierContext.class,0);
		}
		public List<ConstArrayContext> constArray() {
			return getRuleContexts(ConstArrayContext.class);
		}
		public ConstArrayContext constArray(int i) {
			return getRuleContext(ConstArrayContext.class,i);
		}
		public GlobalVarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_globalVar; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReFuggListener ) ((ReFuggListener)listener).enterGlobalVar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReFuggListener ) ((ReFuggListener)listener).exitGlobalVar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReFuggVisitor ) return ((ReFuggVisitor<? extends T>)visitor).visitGlobalVar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GlobalVarContext globalVar() throws RecognitionException {
		GlobalVarContext _localctx = new GlobalVarContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_globalVar);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(432);
			match(GLOBAL);
			setState(434);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==FINAL || _la==STATIC) {
				{
				setState(433);
				typemodifier();
				}
			}

			setState(436);
			type();
			setState(440);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0) {
				{
				{
				setState(437);
				constArray();
				}
				}
				setState(442);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(443);
			identifier();
			setState(444);
			match(T__7);
			setState(447);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__2:
			case T__32:
			case T__33:
			case T__39:
			case T__40:
			case TRUE:
			case FALSE:
			case NULL:
			case INT_LIT:
			case DOUBLE_LIT:
			case CHAR_LIT:
			case STRING_LIT:
			case ID:
				{
				setState(445);
				constExpr(0);
				}
				break;
			case T__5:
				{
				setState(446);
				constList();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(449);
			match(SEMI);
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
		public ConstExprContext constExpr() {
			return getRuleContext(ConstExprContext.class,0);
		}
		public ConstArrayContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constArray; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReFuggListener ) ((ReFuggListener)listener).enterConstArray(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReFuggListener ) ((ReFuggListener)listener).exitConstArray(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReFuggVisitor ) return ((ReFuggVisitor<? extends T>)visitor).visitConstArray(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstArrayContext constArray() throws RecognitionException {
		ConstArrayContext _localctx = new ConstArrayContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_constArray);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(451);
			match(T__0);
			setState(453);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__32) | (1L << T__33) | (1L << T__39) | (1L << T__40))) != 0) || ((((_la - 72)) & ~0x3f) == 0 && ((1L << (_la - 72)) & ((1L << (TRUE - 72)) | (1L << (FALSE - 72)) | (1L << (NULL - 72)) | (1L << (INT_LIT - 72)) | (1L << (DOUBLE_LIT - 72)) | (1L << (CHAR_LIT - 72)) | (1L << (STRING_LIT - 72)) | (1L << (ID - 72)))) != 0)) {
				{
				setState(452);
				constExpr(0);
				}
			}

			setState(455);
			match(T__1);
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
		public ConstExprManyContext constExprMany() {
			return getRuleContext(ConstExprManyContext.class,0);
		}
		public List<ConstSubListContext> constSubList() {
			return getRuleContexts(ConstSubListContext.class);
		}
		public ConstSubListContext constSubList(int i) {
			return getRuleContext(ConstSubListContext.class,i);
		}
		public ConstListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReFuggListener ) ((ReFuggListener)listener).enterConstList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReFuggListener ) ((ReFuggListener)listener).exitConstList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReFuggVisitor ) return ((ReFuggVisitor<? extends T>)visitor).visitConstList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstListContext constList() throws RecognitionException {
		ConstListContext _localctx = new ConstListContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_constList);
		int _la;
		try {
			setState(471);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,39,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(457);
				match(T__5);
				setState(458);
				constExprMany();
				setState(459);
				match(T__6);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(461);
				match(T__5);
				setState(462);
				constSubList();
				setState(465); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(463);
					match(T__4);
					setState(464);
					constSubList();
					}
					}
					setState(467); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==T__4 );
				setState(469);
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
		enterRule(_localctx, 62, RULE_constSubList);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(473);
			match(T__5);
			setState(474);
			constExprMany();
			setState(475);
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
		enterRule(_localctx, 64, RULE_constExprMany);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(477);
			constExpr(0);
			setState(482);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__4) {
				{
				{
				setState(478);
				match(T__4);
				setState(479);
				constExpr(0);
				}
				}
				setState(484);
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

	public static class ConstVarContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ConstVarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constVar; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReFuggListener ) ((ReFuggListener)listener).enterConstVar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReFuggListener ) ((ReFuggListener)listener).exitConstVar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReFuggVisitor ) return ((ReFuggVisitor<? extends T>)visitor).visitConstVar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstVarContext constVar() throws RecognitionException {
		ConstVarContext _localctx = new ConstVarContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_constVar);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(485);
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

	public static class ConstArrayAccessContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public List<ConstExprContext> constExpr() {
			return getRuleContexts(ConstExprContext.class);
		}
		public ConstExprContext constExpr(int i) {
			return getRuleContext(ConstExprContext.class,i);
		}
		public ConstArrayAccessContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constArrayAccess; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReFuggListener ) ((ReFuggListener)listener).enterConstArrayAccess(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReFuggListener ) ((ReFuggListener)listener).exitConstArrayAccess(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReFuggVisitor ) return ((ReFuggVisitor<? extends T>)visitor).visitConstArrayAccess(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstArrayAccessContext constArrayAccess() throws RecognitionException {
		ConstArrayAccessContext _localctx = new ConstArrayAccessContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_constArrayAccess);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(487);
			identifier();
			setState(492); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(488);
					match(T__0);
					setState(489);
					constExpr(0);
					setState(490);
					match(T__1);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(494); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,41,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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
		public OrOPContext orOP() {
			return getRuleContext(OrOPContext.class,0);
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
		int _startState = 70;
		enterRecursionRule(_localctx, 70, RULE_constExpr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(497);
			constJoin(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(505);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,42,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ConstExprContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_constExpr);
					setState(499);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(500);
					orOP();
					setState(501);
					constJoin(0);
					}
					} 
				}
				setState(507);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,42,_ctx);
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
		public AndOPContext andOP() {
			return getRuleContext(AndOPContext.class,0);
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
		int _startState = 72;
		enterRecursionRule(_localctx, 72, RULE_constJoin, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(509);
			constEQ(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(517);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,43,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ConstJoinContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_constJoin);
					setState(511);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(512);
					andOP();
					setState(513);
					constEQ(0);
					}
					} 
				}
				setState(519);
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
		int _startState = 74;
		enterRecursionRule(_localctx, 74, RULE_constEQ, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(521);
			constRel(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(529);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,44,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ConstEQContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_constEQ);
					setState(523);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(524);
					eqOP();
					setState(525);
					constRel(0);
					}
					} 
				}
				setState(531);
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

	public static class ConstRelContext extends ParserRuleContext {
		public ConstLogicContext constLogic() {
			return getRuleContext(ConstLogicContext.class,0);
		}
		public ConstRelContext constRel() {
			return getRuleContext(ConstRelContext.class,0);
		}
		public RelOPContext relOP() {
			return getRuleContext(RelOPContext.class,0);
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
		int _startState = 76;
		enterRecursionRule(_localctx, 76, RULE_constRel, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(533);
			constLogic(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(541);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,45,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ConstRelContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_constRel);
					setState(535);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(536);
					relOP();
					setState(537);
					constLogic(0);
					}
					} 
				}
				setState(543);
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

	public static class ConstLogicContext extends ParserRuleContext {
		public ConstTermContext constTerm() {
			return getRuleContext(ConstTermContext.class,0);
		}
		public ConstLogicContext constLogic() {
			return getRuleContext(ConstLogicContext.class,0);
		}
		public AddOPContext addOP() {
			return getRuleContext(AddOPContext.class,0);
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
		int _startState = 78;
		enterRecursionRule(_localctx, 78, RULE_constLogic, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(545);
			constTerm(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(553);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,46,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ConstLogicContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_constLogic);
					setState(547);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(548);
					addOP();
					setState(549);
					constTerm(0);
					}
					} 
				}
				setState(555);
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

	public static class ConstTermContext extends ParserRuleContext {
		public ConstExpoContext constExpo() {
			return getRuleContext(ConstExpoContext.class,0);
		}
		public ConstTermContext constTerm() {
			return getRuleContext(ConstTermContext.class,0);
		}
		public MultOPContext multOP() {
			return getRuleContext(MultOPContext.class,0);
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
		int _startState = 80;
		enterRecursionRule(_localctx, 80, RULE_constTerm, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(557);
			constExpo(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(565);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,47,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ConstTermContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_constTerm);
					setState(559);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(560);
					multOP();
					setState(561);
					constExpo(0);
					}
					} 
				}
				setState(567);
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

	public static class ConstExpoContext extends ParserRuleContext {
		public ConstUnaryContext constUnary() {
			return getRuleContext(ConstUnaryContext.class,0);
		}
		public ConstExpoContext constExpo() {
			return getRuleContext(ConstExpoContext.class,0);
		}
		public ExpOPContext expOP() {
			return getRuleContext(ExpOPContext.class,0);
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
		int _startState = 82;
		enterRecursionRule(_localctx, 82, RULE_constExpo, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(569);
			constUnary();
			}
			_ctx.stop = _input.LT(-1);
			setState(577);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,48,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ConstExpoContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_constExpo);
					setState(571);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(572);
					expOP();
					setState(573);
					constUnary();
					}
					} 
				}
				setState(579);
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

	public static class ConstUnaryContext extends ParserRuleContext {
		public PreOPContext preOP() {
			return getRuleContext(PreOPContext.class,0);
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
		enterRule(_localctx, 84, RULE_constUnary);
		try {
			setState(584);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__32:
			case T__33:
			case T__39:
			case T__40:
				enterOuterAlt(_localctx, 1);
				{
				setState(580);
				preOP();
				setState(581);
				constFactor();
				}
				break;
			case T__2:
			case TRUE:
			case FALSE:
			case NULL:
			case INT_LIT:
			case DOUBLE_LIT:
			case CHAR_LIT:
			case STRING_LIT:
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(583);
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
		public ConstantContext constant() {
			return getRuleContext(ConstantContext.class,0);
		}
		public ConstExprContext constExpr() {
			return getRuleContext(ConstExprContext.class,0);
		}
		public ConstVarContext constVar() {
			return getRuleContext(ConstVarContext.class,0);
		}
		public ConstArrayAccessContext constArrayAccess() {
			return getRuleContext(ConstArrayAccessContext.class,0);
		}
		public ConstFactorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constFactor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReFuggListener ) ((ReFuggListener)listener).enterConstFactor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReFuggListener ) ((ReFuggListener)listener).exitConstFactor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReFuggVisitor ) return ((ReFuggVisitor<? extends T>)visitor).visitConstFactor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstFactorContext constFactor() throws RecognitionException {
		ConstFactorContext _localctx = new ConstFactorContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_constFactor);
		try {
			setState(593);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,50,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(586);
				constant();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(587);
				match(T__2);
				setState(588);
				constExpr(0);
				setState(589);
				match(T__3);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(591);
				constVar();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(592);
				constArrayAccess();
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

	public static class ArrayAccessContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ArrayAccessContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayAccess; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReFuggListener ) ((ReFuggListener)listener).enterArrayAccess(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReFuggListener ) ((ReFuggListener)listener).exitArrayAccess(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReFuggVisitor ) return ((ReFuggVisitor<? extends T>)visitor).visitArrayAccess(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayAccessContext arrayAccess() throws RecognitionException {
		ArrayAccessContext _localctx = new ArrayAccessContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_arrayAccess);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(595);
			match(T__0);
			setState(596);
			expression();
			setState(597);
			match(T__1);
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

	public static class MethodCallContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public FArgsContext fArgs() {
			return getRuleContext(FArgsContext.class,0);
		}
		public List<ArrayAccessContext> arrayAccess() {
			return getRuleContexts(ArrayAccessContext.class);
		}
		public ArrayAccessContext arrayAccess(int i) {
			return getRuleContext(ArrayAccessContext.class,i);
		}
		public List<ExprTailContext> exprTail() {
			return getRuleContexts(ExprTailContext.class);
		}
		public ExprTailContext exprTail(int i) {
			return getRuleContext(ExprTailContext.class,i);
		}
		public MethodCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodCall; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReFuggListener ) ((ReFuggListener)listener).enterMethodCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReFuggListener ) ((ReFuggListener)listener).exitMethodCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReFuggVisitor ) return ((ReFuggVisitor<? extends T>)visitor).visitMethodCall(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodCallContext methodCall() throws RecognitionException {
		MethodCallContext _localctx = new MethodCallContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_methodCall);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(599);
			match(T__9);
			setState(600);
			identifier();
			setState(601);
			fArgs();
			setState(605);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,51,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(602);
					arrayAccess();
					}
					} 
				}
				setState(607);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,51,_ctx);
			}
			setState(611);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,52,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(608);
					exprTail();
					}
					} 
				}
				setState(613);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,52,_ctx);
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

	public static class NewObjectContext extends ParserRuleContext {
		public TerminalNode NEW() { return getToken(ReFuggParser.NEW, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public FArgsContext fArgs() {
			return getRuleContext(FArgsContext.class,0);
		}
		public List<ArrayAccessContext> arrayAccess() {
			return getRuleContexts(ArrayAccessContext.class);
		}
		public ArrayAccessContext arrayAccess(int i) {
			return getRuleContext(ArrayAccessContext.class,i);
		}
		public List<ExprTailContext> exprTail() {
			return getRuleContexts(ExprTailContext.class);
		}
		public ExprTailContext exprTail(int i) {
			return getRuleContext(ExprTailContext.class,i);
		}
		public NewObjectContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_newObject; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReFuggListener ) ((ReFuggListener)listener).enterNewObject(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReFuggListener ) ((ReFuggListener)listener).exitNewObject(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReFuggVisitor ) return ((ReFuggVisitor<? extends T>)visitor).visitNewObject(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NewObjectContext newObject() throws RecognitionException {
		NewObjectContext _localctx = new NewObjectContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_newObject);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(614);
			match(NEW);
			setState(615);
			identifier();
			setState(616);
			fArgs();
			setState(620);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,53,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(617);
					arrayAccess();
					}
					} 
				}
				setState(622);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,53,_ctx);
			}
			setState(626);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,54,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(623);
					exprTail();
					}
					} 
				}
				setState(628);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,54,_ctx);
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

	public static class FCallContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public FArgsContext fArgs() {
			return getRuleContext(FArgsContext.class,0);
		}
		public List<ArrayAccessContext> arrayAccess() {
			return getRuleContexts(ArrayAccessContext.class);
		}
		public ArrayAccessContext arrayAccess(int i) {
			return getRuleContext(ArrayAccessContext.class,i);
		}
		public List<ExprTailContext> exprTail() {
			return getRuleContexts(ExprTailContext.class);
		}
		public ExprTailContext exprTail(int i) {
			return getRuleContext(ExprTailContext.class,i);
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
		enterRule(_localctx, 94, RULE_fCall);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(629);
			identifier();
			setState(630);
			fArgs();
			setState(634);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,55,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(631);
					arrayAccess();
					}
					} 
				}
				setState(636);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,55,_ctx);
			}
			setState(640);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,56,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(637);
					exprTail();
					}
					} 
				}
				setState(642);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,56,_ctx);
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

	public static class ThisAccesContext extends ParserRuleContext {
		public TerminalNode THIS() { return getToken(ReFuggParser.THIS, 0); }
		public List<ExprTailContext> exprTail() {
			return getRuleContexts(ExprTailContext.class);
		}
		public ExprTailContext exprTail(int i) {
			return getRuleContext(ExprTailContext.class,i);
		}
		public ThisAccesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_thisAcces; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReFuggListener ) ((ReFuggListener)listener).enterThisAcces(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReFuggListener ) ((ReFuggListener)listener).exitThisAcces(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReFuggVisitor ) return ((ReFuggVisitor<? extends T>)visitor).visitThisAcces(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ThisAccesContext thisAcces() throws RecognitionException {
		ThisAccesContext _localctx = new ThisAccesContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_thisAcces);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(643);
			match(THIS);
			setState(647);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,57,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(644);
					exprTail();
					}
					} 
				}
				setState(649);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,57,_ctx);
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

	public static class VarAccesContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public List<ArrayAccessContext> arrayAccess() {
			return getRuleContexts(ArrayAccessContext.class);
		}
		public ArrayAccessContext arrayAccess(int i) {
			return getRuleContext(ArrayAccessContext.class,i);
		}
		public List<ExprTailContext> exprTail() {
			return getRuleContexts(ExprTailContext.class);
		}
		public ExprTailContext exprTail(int i) {
			return getRuleContext(ExprTailContext.class,i);
		}
		public VarAccesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varAcces; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReFuggListener ) ((ReFuggListener)listener).enterVarAcces(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReFuggListener ) ((ReFuggListener)listener).exitVarAcces(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReFuggVisitor ) return ((ReFuggVisitor<? extends T>)visitor).visitVarAcces(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarAccesContext varAcces() throws RecognitionException {
		VarAccesContext _localctx = new VarAccesContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_varAcces);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(650);
			identifier();
			setState(654);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,58,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(651);
					arrayAccess();
					}
					} 
				}
				setState(656);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,58,_ctx);
			}
			setState(660);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,59,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(657);
					exprTail();
					}
					} 
				}
				setState(662);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,59,_ctx);
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

	public static class ExprTailContext extends ParserRuleContext {
		public MethodCallContext methodCall() {
			return getRuleContext(MethodCallContext.class,0);
		}
		public List<ArrayAccessContext> arrayAccess() {
			return getRuleContexts(ArrayAccessContext.class);
		}
		public ArrayAccessContext arrayAccess(int i) {
			return getRuleContext(ArrayAccessContext.class,i);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ExprTailContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exprTail; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReFuggListener ) ((ReFuggListener)listener).enterExprTail(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReFuggListener ) ((ReFuggListener)listener).exitExprTail(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReFuggVisitor ) return ((ReFuggVisitor<? extends T>)visitor).visitExprTail(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprTailContext exprTail() throws RecognitionException {
		ExprTailContext _localctx = new ExprTailContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_exprTail);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(666);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,60,_ctx) ) {
			case 1:
				{
				{
				setState(663);
				match(T__9);
				setState(664);
				identifier();
				}
				}
				break;
			case 2:
				{
				setState(665);
				methodCall();
				}
				break;
			}
			setState(671);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,61,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(668);
					arrayAccess();
					}
					} 
				}
				setState(673);
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

	public static class Lh_expressionContext extends ParserRuleContext {
		public ThisAccesContext thisAcces() {
			return getRuleContext(ThisAccesContext.class,0);
		}
		public VarAccesContext varAcces() {
			return getRuleContext(VarAccesContext.class,0);
		}
		public Lh_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lh_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReFuggListener ) ((ReFuggListener)listener).enterLh_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReFuggListener ) ((ReFuggListener)listener).exitLh_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReFuggVisitor ) return ((ReFuggVisitor<? extends T>)visitor).visitLh_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Lh_expressionContext lh_expression() throws RecognitionException {
		Lh_expressionContext _localctx = new Lh_expressionContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_lh_expression);
		try {
			setState(676);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case THIS:
				enterOuterAlt(_localctx, 1);
				{
				setState(674);
				thisAcces();
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(675);
				varAcces();
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

	public static class ExpressionContext extends ParserRuleContext {
		public Lh_expressionContext lh_expression() {
			return getRuleContext(Lh_expressionContext.class,0);
		}
		public AssignOPContext assignOP() {
			return getRuleContext(AssignOPContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ListContext list() {
			return getRuleContext(ListContext.class,0);
		}
		public OrExpressionContext orExpression() {
			return getRuleContext(OrExpressionContext.class,0);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReFuggListener ) ((ReFuggListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReFuggListener ) ((ReFuggListener)listener).exitExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReFuggVisitor ) return ((ReFuggVisitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_expression);
		try {
			setState(685);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,64,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(678);
				lh_expression();
				setState(679);
				assignOP();
				setState(682);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__2:
				case T__32:
				case T__33:
				case T__39:
				case T__40:
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
					setState(680);
					expression();
					}
					break;
				case T__5:
					{
					setState(681);
					list();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(684);
				orExpression(0);
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

	public static class OrExpressionContext extends ParserRuleContext {
		public AndExpressionContext andExpression() {
			return getRuleContext(AndExpressionContext.class,0);
		}
		public OrExpressionContext orExpression() {
			return getRuleContext(OrExpressionContext.class,0);
		}
		public OrOPContext orOP() {
			return getRuleContext(OrOPContext.class,0);
		}
		public OrExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_orExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReFuggListener ) ((ReFuggListener)listener).enterOrExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReFuggListener ) ((ReFuggListener)listener).exitOrExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReFuggVisitor ) return ((ReFuggVisitor<? extends T>)visitor).visitOrExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OrExpressionContext orExpression() throws RecognitionException {
		return orExpression(0);
	}

	private OrExpressionContext orExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		OrExpressionContext _localctx = new OrExpressionContext(_ctx, _parentState);
		OrExpressionContext _prevctx = _localctx;
		int _startState = 106;
		enterRecursionRule(_localctx, 106, RULE_orExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(688);
			andExpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(696);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,65,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new OrExpressionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_orExpression);
					setState(690);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(691);
					orOP();
					setState(692);
					andExpression(0);
					}
					} 
				}
				setState(698);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,65,_ctx);
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

	public static class AndExpressionContext extends ParserRuleContext {
		public EqualityExpressionContext equalityExpression() {
			return getRuleContext(EqualityExpressionContext.class,0);
		}
		public AndExpressionContext andExpression() {
			return getRuleContext(AndExpressionContext.class,0);
		}
		public AndOPContext andOP() {
			return getRuleContext(AndOPContext.class,0);
		}
		public AndExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_andExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReFuggListener ) ((ReFuggListener)listener).enterAndExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReFuggListener ) ((ReFuggListener)listener).exitAndExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReFuggVisitor ) return ((ReFuggVisitor<? extends T>)visitor).visitAndExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AndExpressionContext andExpression() throws RecognitionException {
		return andExpression(0);
	}

	private AndExpressionContext andExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		AndExpressionContext _localctx = new AndExpressionContext(_ctx, _parentState);
		AndExpressionContext _prevctx = _localctx;
		int _startState = 108;
		enterRecursionRule(_localctx, 108, RULE_andExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(700);
			equalityExpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(708);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,66,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new AndExpressionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_andExpression);
					setState(702);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(703);
					andOP();
					setState(704);
					equalityExpression(0);
					}
					} 
				}
				setState(710);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,66,_ctx);
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

	public static class EqualityExpressionContext extends ParserRuleContext {
		public RelationalExpressionContext relationalExpression() {
			return getRuleContext(RelationalExpressionContext.class,0);
		}
		public EqualityExpressionContext equalityExpression() {
			return getRuleContext(EqualityExpressionContext.class,0);
		}
		public EqOPContext eqOP() {
			return getRuleContext(EqOPContext.class,0);
		}
		public EqualityExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_equalityExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReFuggListener ) ((ReFuggListener)listener).enterEqualityExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReFuggListener ) ((ReFuggListener)listener).exitEqualityExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReFuggVisitor ) return ((ReFuggVisitor<? extends T>)visitor).visitEqualityExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EqualityExpressionContext equalityExpression() throws RecognitionException {
		return equalityExpression(0);
	}

	private EqualityExpressionContext equalityExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		EqualityExpressionContext _localctx = new EqualityExpressionContext(_ctx, _parentState);
		EqualityExpressionContext _prevctx = _localctx;
		int _startState = 110;
		enterRecursionRule(_localctx, 110, RULE_equalityExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(712);
			relationalExpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(720);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,67,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new EqualityExpressionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_equalityExpression);
					setState(714);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(715);
					eqOP();
					setState(716);
					relationalExpression(0);
					}
					} 
				}
				setState(722);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,67,_ctx);
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

	public static class RelationalExpressionContext extends ParserRuleContext {
		public AdditiveExpressionContext additiveExpression() {
			return getRuleContext(AdditiveExpressionContext.class,0);
		}
		public RelationalExpressionContext relationalExpression() {
			return getRuleContext(RelationalExpressionContext.class,0);
		}
		public RelOPContext relOP() {
			return getRuleContext(RelOPContext.class,0);
		}
		public RelationalExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relationalExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReFuggListener ) ((ReFuggListener)listener).enterRelationalExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReFuggListener ) ((ReFuggListener)listener).exitRelationalExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReFuggVisitor ) return ((ReFuggVisitor<? extends T>)visitor).visitRelationalExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RelationalExpressionContext relationalExpression() throws RecognitionException {
		return relationalExpression(0);
	}

	private RelationalExpressionContext relationalExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		RelationalExpressionContext _localctx = new RelationalExpressionContext(_ctx, _parentState);
		RelationalExpressionContext _prevctx = _localctx;
		int _startState = 112;
		enterRecursionRule(_localctx, 112, RULE_relationalExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(724);
			additiveExpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(732);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,68,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new RelationalExpressionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_relationalExpression);
					setState(726);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(727);
					relOP();
					setState(728);
					additiveExpression(0);
					}
					} 
				}
				setState(734);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,68,_ctx);
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

	public static class AdditiveExpressionContext extends ParserRuleContext {
		public MultiplicativeExpressionContext multiplicativeExpression() {
			return getRuleContext(MultiplicativeExpressionContext.class,0);
		}
		public AdditiveExpressionContext additiveExpression() {
			return getRuleContext(AdditiveExpressionContext.class,0);
		}
		public AddOPContext addOP() {
			return getRuleContext(AddOPContext.class,0);
		}
		public AdditiveExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_additiveExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReFuggListener ) ((ReFuggListener)listener).enterAdditiveExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReFuggListener ) ((ReFuggListener)listener).exitAdditiveExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReFuggVisitor ) return ((ReFuggVisitor<? extends T>)visitor).visitAdditiveExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AdditiveExpressionContext additiveExpression() throws RecognitionException {
		return additiveExpression(0);
	}

	private AdditiveExpressionContext additiveExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		AdditiveExpressionContext _localctx = new AdditiveExpressionContext(_ctx, _parentState);
		AdditiveExpressionContext _prevctx = _localctx;
		int _startState = 114;
		enterRecursionRule(_localctx, 114, RULE_additiveExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(736);
			multiplicativeExpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(744);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,69,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new AdditiveExpressionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_additiveExpression);
					setState(738);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(739);
					addOP();
					setState(740);
					multiplicativeExpression(0);
					}
					} 
				}
				setState(746);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,69,_ctx);
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

	public static class MultiplicativeExpressionContext extends ParserRuleContext {
		public ExponentiationExpressionContext exponentiationExpression() {
			return getRuleContext(ExponentiationExpressionContext.class,0);
		}
		public MultiplicativeExpressionContext multiplicativeExpression() {
			return getRuleContext(MultiplicativeExpressionContext.class,0);
		}
		public MultOPContext multOP() {
			return getRuleContext(MultOPContext.class,0);
		}
		public MultiplicativeExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multiplicativeExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReFuggListener ) ((ReFuggListener)listener).enterMultiplicativeExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReFuggListener ) ((ReFuggListener)listener).exitMultiplicativeExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReFuggVisitor ) return ((ReFuggVisitor<? extends T>)visitor).visitMultiplicativeExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MultiplicativeExpressionContext multiplicativeExpression() throws RecognitionException {
		return multiplicativeExpression(0);
	}

	private MultiplicativeExpressionContext multiplicativeExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		MultiplicativeExpressionContext _localctx = new MultiplicativeExpressionContext(_ctx, _parentState);
		MultiplicativeExpressionContext _prevctx = _localctx;
		int _startState = 116;
		enterRecursionRule(_localctx, 116, RULE_multiplicativeExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(748);
			exponentiationExpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(756);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,70,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new MultiplicativeExpressionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_multiplicativeExpression);
					setState(750);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(751);
					multOP();
					setState(752);
					exponentiationExpression(0);
					}
					} 
				}
				setState(758);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,70,_ctx);
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

	public static class ExponentiationExpressionContext extends ParserRuleContext {
		public UnaryExpressionContext unaryExpression() {
			return getRuleContext(UnaryExpressionContext.class,0);
		}
		public ExponentiationExpressionContext exponentiationExpression() {
			return getRuleContext(ExponentiationExpressionContext.class,0);
		}
		public ExpOPContext expOP() {
			return getRuleContext(ExpOPContext.class,0);
		}
		public ExponentiationExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exponentiationExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReFuggListener ) ((ReFuggListener)listener).enterExponentiationExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReFuggListener ) ((ReFuggListener)listener).exitExponentiationExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReFuggVisitor ) return ((ReFuggVisitor<? extends T>)visitor).visitExponentiationExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExponentiationExpressionContext exponentiationExpression() throws RecognitionException {
		return exponentiationExpression(0);
	}

	private ExponentiationExpressionContext exponentiationExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExponentiationExpressionContext _localctx = new ExponentiationExpressionContext(_ctx, _parentState);
		ExponentiationExpressionContext _prevctx = _localctx;
		int _startState = 118;
		enterRecursionRule(_localctx, 118, RULE_exponentiationExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(760);
			unaryExpression();
			}
			_ctx.stop = _input.LT(-1);
			setState(768);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,71,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ExponentiationExpressionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_exponentiationExpression);
					setState(762);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(763);
					expOP();
					setState(764);
					unaryExpression();
					}
					} 
				}
				setState(770);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,71,_ctx);
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

	public static class UnaryExpressionContext extends ParserRuleContext {
		public PreOPContext preOP() {
			return getRuleContext(PreOPContext.class,0);
		}
		public UnaryExpressionContext unaryExpression() {
			return getRuleContext(UnaryExpressionContext.class,0);
		}
		public PostExpressionContext postExpression() {
			return getRuleContext(PostExpressionContext.class,0);
		}
		public UnaryExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unaryExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReFuggListener ) ((ReFuggListener)listener).enterUnaryExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReFuggListener ) ((ReFuggListener)listener).exitUnaryExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReFuggVisitor ) return ((ReFuggVisitor<? extends T>)visitor).visitUnaryExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnaryExpressionContext unaryExpression() throws RecognitionException {
		UnaryExpressionContext _localctx = new UnaryExpressionContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_unaryExpression);
		try {
			setState(775);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__32:
			case T__33:
			case T__39:
			case T__40:
				enterOuterAlt(_localctx, 1);
				{
				setState(771);
				preOP();
				setState(772);
				unaryExpression();
				}
				break;
			case T__2:
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
				setState(774);
				postExpression();
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

	public static class PostExpressionContext extends ParserRuleContext {
		public PrimaryContext primary() {
			return getRuleContext(PrimaryContext.class,0);
		}
		public PostOPContext postOP() {
			return getRuleContext(PostOPContext.class,0);
		}
		public PostExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_postExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReFuggListener ) ((ReFuggListener)listener).enterPostExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReFuggListener ) ((ReFuggListener)listener).exitPostExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReFuggVisitor ) return ((ReFuggVisitor<? extends T>)visitor).visitPostExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PostExpressionContext postExpression() throws RecognitionException {
		PostExpressionContext _localctx = new PostExpressionContext(_ctx, getState());
		enterRule(_localctx, 122, RULE_postExpression);
		try {
			setState(781);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,73,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(777);
				primary();
				setState(778);
				postOP();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(780);
				primary();
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

	public static class PrimaryContext extends ParserRuleContext {
		public OrExpressionContext orExpression() {
			return getRuleContext(OrExpressionContext.class,0);
		}
		public NewObjectContext newObject() {
			return getRuleContext(NewObjectContext.class,0);
		}
		public FCallContext fCall() {
			return getRuleContext(FCallContext.class,0);
		}
		public VarAccesContext varAcces() {
			return getRuleContext(VarAccesContext.class,0);
		}
		public ThisAccesContext thisAcces() {
			return getRuleContext(ThisAccesContext.class,0);
		}
		public ConstantContext constant() {
			return getRuleContext(ConstantContext.class,0);
		}
		public PrimaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primary; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReFuggListener ) ((ReFuggListener)listener).enterPrimary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReFuggListener ) ((ReFuggListener)listener).exitPrimary(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReFuggVisitor ) return ((ReFuggVisitor<? extends T>)visitor).visitPrimary(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrimaryContext primary() throws RecognitionException {
		PrimaryContext _localctx = new PrimaryContext(_ctx, getState());
		enterRule(_localctx, 124, RULE_primary);
		try {
			setState(792);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,74,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(783);
				match(T__2);
				setState(784);
				orExpression(0);
				setState(785);
				match(T__3);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(787);
				newObject();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(788);
				fCall();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(789);
				varAcces();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(790);
				thisAcces();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(791);
				constant();
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

	public static class ListContext extends ParserRuleContext {
		public ExpressionManyContext expressionMany() {
			return getRuleContext(ExpressionManyContext.class,0);
		}
		public List<SubListContext> subList() {
			return getRuleContexts(SubListContext.class);
		}
		public SubListContext subList(int i) {
			return getRuleContext(SubListContext.class,i);
		}
		public ListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReFuggListener ) ((ReFuggListener)listener).enterList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReFuggListener ) ((ReFuggListener)listener).exitList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReFuggVisitor ) return ((ReFuggVisitor<? extends T>)visitor).visitList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ListContext list() throws RecognitionException {
		ListContext _localctx = new ListContext(_ctx, getState());
		enterRule(_localctx, 126, RULE_list);
		int _la;
		try {
			setState(808);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,76,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(794);
				match(T__5);
				setState(795);
				expressionMany();
				setState(796);
				match(T__6);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(798);
				match(T__5);
				setState(799);
				subList();
				setState(802); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(800);
					match(T__4);
					setState(801);
					subList();
					}
					}
					setState(804); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==T__4 );
				setState(806);
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
		public ExpressionManyContext expressionMany() {
			return getRuleContext(ExpressionManyContext.class,0);
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
		enterRule(_localctx, 128, RULE_subList);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(810);
			match(T__5);
			setState(811);
			expressionMany();
			setState(812);
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

	public static class ExpressionManyContext extends ParserRuleContext {
		public List<OrExpressionContext> orExpression() {
			return getRuleContexts(OrExpressionContext.class);
		}
		public OrExpressionContext orExpression(int i) {
			return getRuleContext(OrExpressionContext.class,i);
		}
		public ExpressionManyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionMany; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReFuggListener ) ((ReFuggListener)listener).enterExpressionMany(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReFuggListener ) ((ReFuggListener)listener).exitExpressionMany(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReFuggVisitor ) return ((ReFuggVisitor<? extends T>)visitor).visitExpressionMany(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionManyContext expressionMany() throws RecognitionException {
		ExpressionManyContext _localctx = new ExpressionManyContext(_ctx, getState());
		enterRule(_localctx, 130, RULE_expressionMany);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(814);
			orExpression(0);
			setState(819);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__4) {
				{
				{
				setState(815);
				match(T__4);
				setState(816);
				orExpression(0);
				}
				}
				setState(821);
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

	public static class FArgsContext extends ParserRuleContext {
		public ExpressionManyContext expressionMany() {
			return getRuleContext(ExpressionManyContext.class,0);
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
		enterRule(_localctx, 132, RULE_fArgs);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(822);
			match(T__2);
			setState(824);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__32) | (1L << T__33) | (1L << T__39) | (1L << T__40))) != 0) || ((((_la - 72)) & ~0x3f) == 0 && ((1L << (_la - 72)) & ((1L << (TRUE - 72)) | (1L << (FALSE - 72)) | (1L << (THIS - 72)) | (1L << (NULL - 72)) | (1L << (NEW - 72)) | (1L << (INT_LIT - 72)) | (1L << (DOUBLE_LIT - 72)) | (1L << (CHAR_LIT - 72)) | (1L << (STRING_LIT - 72)) | (1L << (ID - 72)))) != 0)) {
				{
				setState(823);
				expressionMany();
				}
			}

			setState(826);
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
		enterRule(_localctx, 134, RULE_returntype);
		try {
			setState(830);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VOID:
				enterOuterAlt(_localctx, 1);
				{
				setState(828);
				match(VOID);
				}
				break;
			case T__10:
			case T__11:
			case T__12:
			case T__13:
			case T__14:
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(829);
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

	public static class ConstantContext extends ParserRuleContext {
		public DoubleRuleContext doubleRule() {
			return getRuleContext(DoubleRuleContext.class,0);
		}
		public IntRuleContext intRule() {
			return getRuleContext(IntRuleContext.class,0);
		}
		public StringRuleContext stringRule() {
			return getRuleContext(StringRuleContext.class,0);
		}
		public CharRuleContext charRule() {
			return getRuleContext(CharRuleContext.class,0);
		}
		public BooleanRuleContext booleanRule() {
			return getRuleContext(BooleanRuleContext.class,0);
		}
		public RefRuleContext refRule() {
			return getRuleContext(RefRuleContext.class,0);
		}
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
		enterRule(_localctx, 136, RULE_constant);
		try {
			setState(838);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DOUBLE_LIT:
				enterOuterAlt(_localctx, 1);
				{
				setState(832);
				doubleRule();
				}
				break;
			case INT_LIT:
				enterOuterAlt(_localctx, 2);
				{
				setState(833);
				intRule();
				}
				break;
			case STRING_LIT:
				enterOuterAlt(_localctx, 3);
				{
				setState(834);
				stringRule();
				}
				break;
			case CHAR_LIT:
				enterOuterAlt(_localctx, 4);
				{
				setState(835);
				charRule();
				}
				break;
			case TRUE:
			case FALSE:
				enterOuterAlt(_localctx, 5);
				{
				setState(836);
				booleanRule();
				}
				break;
			case NULL:
				enterOuterAlt(_localctx, 6);
				{
				setState(837);
				refRule();
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
		enterRule(_localctx, 138, RULE_type);
		try {
			setState(846);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__10:
				enterOuterAlt(_localctx, 1);
				{
				setState(840);
				match(T__10);
				}
				break;
			case T__11:
				enterOuterAlt(_localctx, 2);
				{
				setState(841);
				match(T__11);
				}
				break;
			case T__12:
				enterOuterAlt(_localctx, 3);
				{
				setState(842);
				match(T__12);
				}
				break;
			case T__13:
				enterOuterAlt(_localctx, 4);
				{
				setState(843);
				match(T__13);
				}
				break;
			case T__14:
				enterOuterAlt(_localctx, 5);
				{
				setState(844);
				match(T__14);
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 6);
				{
				setState(845);
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
		enterRule(_localctx, 140, RULE_identifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(848);
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

	public static class TypemodifierContext extends ParserRuleContext {
		public TerminalNode FINAL() { return getToken(ReFuggParser.FINAL, 0); }
		public TerminalNode STATIC() { return getToken(ReFuggParser.STATIC, 0); }
		public TypemodifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typemodifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReFuggListener ) ((ReFuggListener)listener).enterTypemodifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReFuggListener ) ((ReFuggListener)listener).exitTypemodifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReFuggVisitor ) return ((ReFuggVisitor<? extends T>)visitor).visitTypemodifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypemodifierContext typemodifier() throws RecognitionException {
		TypemodifierContext _localctx = new TypemodifierContext(_ctx, getState());
		enterRule(_localctx, 142, RULE_typemodifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(850);
			_la = _input.LA(1);
			if ( !(_la==FINAL || _la==STATIC) ) {
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

	public static class DoubleRuleContext extends ParserRuleContext {
		public TerminalNode DOUBLE_LIT() { return getToken(ReFuggParser.DOUBLE_LIT, 0); }
		public DoubleRuleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_doubleRule; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReFuggListener ) ((ReFuggListener)listener).enterDoubleRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReFuggListener ) ((ReFuggListener)listener).exitDoubleRule(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReFuggVisitor ) return ((ReFuggVisitor<? extends T>)visitor).visitDoubleRule(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DoubleRuleContext doubleRule() throws RecognitionException {
		DoubleRuleContext _localctx = new DoubleRuleContext(_ctx, getState());
		enterRule(_localctx, 144, RULE_doubleRule);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(852);
			match(DOUBLE_LIT);
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

	public static class IntRuleContext extends ParserRuleContext {
		public TerminalNode INT_LIT() { return getToken(ReFuggParser.INT_LIT, 0); }
		public IntRuleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_intRule; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReFuggListener ) ((ReFuggListener)listener).enterIntRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReFuggListener ) ((ReFuggListener)listener).exitIntRule(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReFuggVisitor ) return ((ReFuggVisitor<? extends T>)visitor).visitIntRule(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IntRuleContext intRule() throws RecognitionException {
		IntRuleContext _localctx = new IntRuleContext(_ctx, getState());
		enterRule(_localctx, 146, RULE_intRule);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(854);
			match(INT_LIT);
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

	public static class StringRuleContext extends ParserRuleContext {
		public TerminalNode STRING_LIT() { return getToken(ReFuggParser.STRING_LIT, 0); }
		public StringRuleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stringRule; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReFuggListener ) ((ReFuggListener)listener).enterStringRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReFuggListener ) ((ReFuggListener)listener).exitStringRule(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReFuggVisitor ) return ((ReFuggVisitor<? extends T>)visitor).visitStringRule(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StringRuleContext stringRule() throws RecognitionException {
		StringRuleContext _localctx = new StringRuleContext(_ctx, getState());
		enterRule(_localctx, 148, RULE_stringRule);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(856);
			match(STRING_LIT);
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

	public static class CharRuleContext extends ParserRuleContext {
		public TerminalNode CHAR_LIT() { return getToken(ReFuggParser.CHAR_LIT, 0); }
		public CharRuleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_charRule; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReFuggListener ) ((ReFuggListener)listener).enterCharRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReFuggListener ) ((ReFuggListener)listener).exitCharRule(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReFuggVisitor ) return ((ReFuggVisitor<? extends T>)visitor).visitCharRule(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CharRuleContext charRule() throws RecognitionException {
		CharRuleContext _localctx = new CharRuleContext(_ctx, getState());
		enterRule(_localctx, 150, RULE_charRule);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(858);
			match(CHAR_LIT);
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

	public static class BooleanRuleContext extends ParserRuleContext {
		public TerminalNode TRUE() { return getToken(ReFuggParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(ReFuggParser.FALSE, 0); }
		public BooleanRuleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_booleanRule; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReFuggListener ) ((ReFuggListener)listener).enterBooleanRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReFuggListener ) ((ReFuggListener)listener).exitBooleanRule(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReFuggVisitor ) return ((ReFuggVisitor<? extends T>)visitor).visitBooleanRule(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BooleanRuleContext booleanRule() throws RecognitionException {
		BooleanRuleContext _localctx = new BooleanRuleContext(_ctx, getState());
		enterRule(_localctx, 152, RULE_booleanRule);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(860);
			_la = _input.LA(1);
			if ( !(_la==TRUE || _la==FALSE) ) {
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

	public static class RefRuleContext extends ParserRuleContext {
		public TerminalNode NULL() { return getToken(ReFuggParser.NULL, 0); }
		public RefRuleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_refRule; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReFuggListener ) ((ReFuggListener)listener).enterRefRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReFuggListener ) ((ReFuggListener)listener).exitRefRule(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReFuggVisitor ) return ((ReFuggVisitor<? extends T>)visitor).visitRefRule(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RefRuleContext refRule() throws RecognitionException {
		RefRuleContext _localctx = new RefRuleContext(_ctx, getState());
		enterRule(_localctx, 154, RULE_refRule);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(862);
			match(NULL);
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
		enterRule(_localctx, 156, RULE_assignOP);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(864);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__7) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__21))) != 0)) ) {
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

	public static class OrOPContext extends ParserRuleContext {
		public OrOPContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_orOP; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReFuggListener ) ((ReFuggListener)listener).enterOrOP(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReFuggListener ) ((ReFuggListener)listener).exitOrOP(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReFuggVisitor ) return ((ReFuggVisitor<? extends T>)visitor).visitOrOP(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OrOPContext orOP() throws RecognitionException {
		OrOPContext _localctx = new OrOPContext(_ctx, getState());
		enterRule(_localctx, 158, RULE_orOP);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(866);
			_la = _input.LA(1);
			if ( !(_la==T__22 || _la==T__23) ) {
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

	public static class AndOPContext extends ParserRuleContext {
		public AndOPContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_andOP; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReFuggListener ) ((ReFuggListener)listener).enterAndOP(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReFuggListener ) ((ReFuggListener)listener).exitAndOP(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReFuggVisitor ) return ((ReFuggVisitor<? extends T>)visitor).visitAndOP(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AndOPContext andOP() throws RecognitionException {
		AndOPContext _localctx = new AndOPContext(_ctx, getState());
		enterRule(_localctx, 160, RULE_andOP);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(868);
			_la = _input.LA(1);
			if ( !(_la==T__24 || _la==T__25) ) {
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
		enterRule(_localctx, 162, RULE_eqOP);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(870);
			_la = _input.LA(1);
			if ( !(_la==T__26 || _la==T__27) ) {
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

	public static class RelOPContext extends ParserRuleContext {
		public RelOPContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relOP; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReFuggListener ) ((ReFuggListener)listener).enterRelOP(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReFuggListener ) ((ReFuggListener)listener).exitRelOP(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReFuggVisitor ) return ((ReFuggVisitor<? extends T>)visitor).visitRelOP(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RelOPContext relOP() throws RecognitionException {
		RelOPContext _localctx = new RelOPContext(_ctx, getState());
		enterRule(_localctx, 164, RULE_relOP);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(872);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__28) | (1L << T__29) | (1L << T__30) | (1L << T__31))) != 0)) ) {
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

	public static class AddOPContext extends ParserRuleContext {
		public AddOPContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_addOP; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReFuggListener ) ((ReFuggListener)listener).enterAddOP(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReFuggListener ) ((ReFuggListener)listener).exitAddOP(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReFuggVisitor ) return ((ReFuggVisitor<? extends T>)visitor).visitAddOP(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AddOPContext addOP() throws RecognitionException {
		AddOPContext _localctx = new AddOPContext(_ctx, getState());
		enterRule(_localctx, 166, RULE_addOP);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(874);
			_la = _input.LA(1);
			if ( !(_la==T__32 || _la==T__33) ) {
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

	public static class MultOPContext extends ParserRuleContext {
		public MultOPContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multOP; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReFuggListener ) ((ReFuggListener)listener).enterMultOP(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReFuggListener ) ((ReFuggListener)listener).exitMultOP(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReFuggVisitor ) return ((ReFuggVisitor<? extends T>)visitor).visitMultOP(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MultOPContext multOP() throws RecognitionException {
		MultOPContext _localctx = new MultOPContext(_ctx, getState());
		enterRule(_localctx, 168, RULE_multOP);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(876);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__34) | (1L << T__35) | (1L << T__36))) != 0)) ) {
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

	public static class ExpOPContext extends ParserRuleContext {
		public ExpOPContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expOP; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReFuggListener ) ((ReFuggListener)listener).enterExpOP(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReFuggListener ) ((ReFuggListener)listener).exitExpOP(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReFuggVisitor ) return ((ReFuggVisitor<? extends T>)visitor).visitExpOP(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpOPContext expOP() throws RecognitionException {
		ExpOPContext _localctx = new ExpOPContext(_ctx, getState());
		enterRule(_localctx, 170, RULE_expOP);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(878);
			_la = _input.LA(1);
			if ( !(_la==T__37 || _la==T__38) ) {
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

	public static class PreOPContext extends ParserRuleContext {
		public PreOPContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_preOP; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReFuggListener ) ((ReFuggListener)listener).enterPreOP(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReFuggListener ) ((ReFuggListener)listener).exitPreOP(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReFuggVisitor ) return ((ReFuggVisitor<? extends T>)visitor).visitPreOP(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PreOPContext preOP() throws RecognitionException {
		PreOPContext _localctx = new PreOPContext(_ctx, getState());
		enterRule(_localctx, 172, RULE_preOP);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(880);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__32) | (1L << T__33) | (1L << T__39) | (1L << T__40))) != 0)) ) {
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
		enterRule(_localctx, 174, RULE_postOP);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(882);
			_la = _input.LA(1);
			if ( !(_la==T__41 || _la==T__42) ) {
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 35:
			return constExpr_sempred((ConstExprContext)_localctx, predIndex);
		case 36:
			return constJoin_sempred((ConstJoinContext)_localctx, predIndex);
		case 37:
			return constEQ_sempred((ConstEQContext)_localctx, predIndex);
		case 38:
			return constRel_sempred((ConstRelContext)_localctx, predIndex);
		case 39:
			return constLogic_sempred((ConstLogicContext)_localctx, predIndex);
		case 40:
			return constTerm_sempred((ConstTermContext)_localctx, predIndex);
		case 41:
			return constExpo_sempred((ConstExpoContext)_localctx, predIndex);
		case 53:
			return orExpression_sempred((OrExpressionContext)_localctx, predIndex);
		case 54:
			return andExpression_sempred((AndExpressionContext)_localctx, predIndex);
		case 55:
			return equalityExpression_sempred((EqualityExpressionContext)_localctx, predIndex);
		case 56:
			return relationalExpression_sempred((RelationalExpressionContext)_localctx, predIndex);
		case 57:
			return additiveExpression_sempred((AdditiveExpressionContext)_localctx, predIndex);
		case 58:
			return multiplicativeExpression_sempred((MultiplicativeExpressionContext)_localctx, predIndex);
		case 59:
			return exponentiationExpression_sempred((ExponentiationExpressionContext)_localctx, predIndex);
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
	private boolean orExpression_sempred(OrExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 7:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean andExpression_sempred(AndExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 8:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean equalityExpression_sempred(EqualityExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 9:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean relationalExpression_sempred(RelationalExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 10:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean additiveExpression_sempred(AdditiveExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 11:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean multiplicativeExpression_sempred(MultiplicativeExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 12:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean exponentiationExpression_sempred(ExponentiationExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 13:
			return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3W\u0377\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\4R\tR\4S\tS\4T\tT"+
		"\4U\tU\4V\tV\4W\tW\4X\tX\4Y\tY\3\2\3\2\3\2\3\2\7\2\u00b7\n\2\f\2\16\2"+
		"\u00ba\13\2\3\2\3\2\3\2\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\7"+
		"\5\u00ca\n\5\f\5\16\5\u00cd\13\5\3\5\3\5\3\6\3\6\5\6\u00d3\n\6\3\6\3\6"+
		"\3\7\3\7\7\7\u00d9\n\7\f\7\16\7\u00dc\13\7\3\7\3\7\3\b\3\b\3\b\7\b\u00e3"+
		"\n\b\f\b\16\b\u00e6\13\b\3\t\3\t\3\t\5\t\u00eb\n\t\3\t\3\t\3\t\6\t\u00f0"+
		"\n\t\r\t\16\t\u00f1\7\t\u00f4\n\t\f\t\16\t\u00f7\13\t\3\t\3\t\3\n\3\n"+
		"\3\n\5\n\u00fe\n\n\3\13\3\13\3\13\3\13\7\13\u0104\n\13\f\13\16\13\u0107"+
		"\13\13\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\17\3\17"+
		"\3\17\3\17\7\17\u0119\n\17\f\17\16\17\u011c\13\17\3\17\3\17\3\17\3\17"+
		"\5\17\u0122\n\17\5\17\u0124\n\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\7"+
		"\20\u012d\n\20\f\20\16\20\u0130\13\20\3\20\3\20\3\21\3\21\3\21\3\21\3"+
		"\21\7\21\u0139\n\21\f\21\16\21\u013c\13\21\3\21\3\21\3\22\3\22\3\22\3"+
		"\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\5\22\u014f"+
		"\n\22\3\23\3\23\3\23\3\23\3\23\5\23\u0156\n\23\3\24\3\24\3\24\3\24\3\25"+
		"\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26\5\26\u0165\n\26\3\26\3\26\5\26"+
		"\u0169\n\26\3\26\3\26\5\26\u016d\n\26\3\26\3\26\3\26\3\27\3\27\3\27\3"+
		"\27\5\27\u0176\n\27\5\27\u0178\n\27\3\30\3\30\3\30\3\30\3\30\3\30\5\30"+
		"\u0180\n\30\5\30\u0182\n\30\3\31\3\31\3\31\5\31\u0187\n\31\3\32\3\32\3"+
		"\32\3\32\6\32\u018d\n\32\r\32\16\32\u018e\3\32\3\32\3\33\3\33\3\33\3\33"+
		"\3\33\3\33\3\33\3\33\5\33\u019b\n\33\3\34\3\34\3\34\3\34\3\35\5\35\u01a2"+
		"\n\35\3\35\3\35\7\35\u01a6\n\35\f\35\16\35\u01a9\13\35\3\35\3\35\3\35"+
		"\3\35\5\35\u01af\n\35\5\35\u01b1\n\35\3\36\3\36\5\36\u01b5\n\36\3\36\3"+
		"\36\7\36\u01b9\n\36\f\36\16\36\u01bc\13\36\3\36\3\36\3\36\3\36\5\36\u01c2"+
		"\n\36\3\36\3\36\3\37\3\37\5\37\u01c8\n\37\3\37\3\37\3 \3 \3 \3 \3 \3 "+
		"\3 \3 \6 \u01d4\n \r \16 \u01d5\3 \3 \5 \u01da\n \3!\3!\3!\3!\3\"\3\""+
		"\3\"\7\"\u01e3\n\"\f\"\16\"\u01e6\13\"\3#\3#\3$\3$\3$\3$\3$\6$\u01ef\n"+
		"$\r$\16$\u01f0\3%\3%\3%\3%\3%\3%\3%\7%\u01fa\n%\f%\16%\u01fd\13%\3&\3"+
		"&\3&\3&\3&\3&\3&\7&\u0206\n&\f&\16&\u0209\13&\3\'\3\'\3\'\3\'\3\'\3\'"+
		"\3\'\7\'\u0212\n\'\f\'\16\'\u0215\13\'\3(\3(\3(\3(\3(\3(\3(\7(\u021e\n"+
		"(\f(\16(\u0221\13(\3)\3)\3)\3)\3)\3)\3)\7)\u022a\n)\f)\16)\u022d\13)\3"+
		"*\3*\3*\3*\3*\3*\3*\7*\u0236\n*\f*\16*\u0239\13*\3+\3+\3+\3+\3+\3+\3+"+
		"\7+\u0242\n+\f+\16+\u0245\13+\3,\3,\3,\3,\5,\u024b\n,\3-\3-\3-\3-\3-\3"+
		"-\3-\5-\u0254\n-\3.\3.\3.\3.\3/\3/\3/\3/\7/\u025e\n/\f/\16/\u0261\13/"+
		"\3/\7/\u0264\n/\f/\16/\u0267\13/\3\60\3\60\3\60\3\60\7\60\u026d\n\60\f"+
		"\60\16\60\u0270\13\60\3\60\7\60\u0273\n\60\f\60\16\60\u0276\13\60\3\61"+
		"\3\61\3\61\7\61\u027b\n\61\f\61\16\61\u027e\13\61\3\61\7\61\u0281\n\61"+
		"\f\61\16\61\u0284\13\61\3\62\3\62\7\62\u0288\n\62\f\62\16\62\u028b\13"+
		"\62\3\63\3\63\7\63\u028f\n\63\f\63\16\63\u0292\13\63\3\63\7\63\u0295\n"+
		"\63\f\63\16\63\u0298\13\63\3\64\3\64\3\64\5\64\u029d\n\64\3\64\7\64\u02a0"+
		"\n\64\f\64\16\64\u02a3\13\64\3\65\3\65\5\65\u02a7\n\65\3\66\3\66\3\66"+
		"\3\66\5\66\u02ad\n\66\3\66\5\66\u02b0\n\66\3\67\3\67\3\67\3\67\3\67\3"+
		"\67\3\67\7\67\u02b9\n\67\f\67\16\67\u02bc\13\67\38\38\38\38\38\38\38\7"+
		"8\u02c5\n8\f8\168\u02c8\138\39\39\39\39\39\39\39\79\u02d1\n9\f9\169\u02d4"+
		"\139\3:\3:\3:\3:\3:\3:\3:\7:\u02dd\n:\f:\16:\u02e0\13:\3;\3;\3;\3;\3;"+
		"\3;\3;\7;\u02e9\n;\f;\16;\u02ec\13;\3<\3<\3<\3<\3<\3<\3<\7<\u02f5\n<\f"+
		"<\16<\u02f8\13<\3=\3=\3=\3=\3=\3=\3=\7=\u0301\n=\f=\16=\u0304\13=\3>\3"+
		">\3>\3>\5>\u030a\n>\3?\3?\3?\3?\5?\u0310\n?\3@\3@\3@\3@\3@\3@\3@\3@\3"+
		"@\5@\u031b\n@\3A\3A\3A\3A\3A\3A\3A\3A\6A\u0325\nA\rA\16A\u0326\3A\3A\5"+
		"A\u032b\nA\3B\3B\3B\3B\3C\3C\3C\7C\u0334\nC\fC\16C\u0337\13C\3D\3D\5D"+
		"\u033b\nD\3D\3D\3E\3E\5E\u0341\nE\3F\3F\3F\3F\3F\3F\5F\u0349\nF\3G\3G"+
		"\3G\3G\3G\3G\5G\u0351\nG\3H\3H\3I\3I\3J\3J\3K\3K\3L\3L\3M\3M\3N\3N\3O"+
		"\3O\3P\3P\3Q\3Q\3R\3R\3S\3S\3T\3T\3U\3U\3V\3V\3W\3W\3X\3X\3Y\3Y\3Y\2\20"+
		"HJLNPRTlnprtvxZ\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62"+
		"\64\668:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprtvxz|~\u0080\u0082\u0084\u0086\u0088"+
		"\u008a\u008c\u008e\u0090\u0092\u0094\u0096\u0098\u009a\u009c\u009e\u00a0"+
		"\u00a2\u00a4\u00a6\u00a8\u00aa\u00ac\u00ae\u00b0\2\17\3\28:\3\2;<\3\2"+
		"JK\4\2\n\n\22\30\3\2\31\32\3\2\33\34\3\2\35\36\3\2\37\"\3\2#$\3\2%\'\3"+
		"\2()\4\2#$*+\3\2,-\2\u038b\2\u00b8\3\2\2\2\4\u00be\3\2\2\2\6\u00c1\3\2"+
		"\2\2\b\u00c6\3\2\2\2\n\u00d0\3\2\2\2\f\u00d6\3\2\2\2\16\u00df\3\2\2\2"+
		"\20\u00e7\3\2\2\2\22\u00fd\3\2\2\2\24\u00ff\3\2\2\2\26\u0108\3\2\2\2\30"+
		"\u010a\3\2\2\2\32\u010f\3\2\2\2\34\u0114\3\2\2\2\36\u0127\3\2\2\2 \u0133"+
		"\3\2\2\2\"\u014e\3\2\2\2$\u0150\3\2\2\2&\u0157\3\2\2\2(\u015b\3\2\2\2"+
		"*\u0160\3\2\2\2,\u0177\3\2\2\2.\u0181\3\2\2\2\60\u0183\3\2\2\2\62\u0188"+
		"\3\2\2\2\64\u019a\3\2\2\2\66\u019c\3\2\2\28\u01a1\3\2\2\2:\u01b2\3\2\2"+
		"\2<\u01c5\3\2\2\2>\u01d9\3\2\2\2@\u01db\3\2\2\2B\u01df\3\2\2\2D\u01e7"+
		"\3\2\2\2F\u01e9\3\2\2\2H\u01f2\3\2\2\2J\u01fe\3\2\2\2L\u020a\3\2\2\2N"+
		"\u0216\3\2\2\2P\u0222\3\2\2\2R\u022e\3\2\2\2T\u023a\3\2\2\2V\u024a\3\2"+
		"\2\2X\u0253\3\2\2\2Z\u0255\3\2\2\2\\\u0259\3\2\2\2^\u0268\3\2\2\2`\u0277"+
		"\3\2\2\2b\u0285\3\2\2\2d\u028c\3\2\2\2f\u029c\3\2\2\2h\u02a6\3\2\2\2j"+
		"\u02af\3\2\2\2l\u02b1\3\2\2\2n\u02bd\3\2\2\2p\u02c9\3\2\2\2r\u02d5\3\2"+
		"\2\2t\u02e1\3\2\2\2v\u02ed\3\2\2\2x\u02f9\3\2\2\2z\u0309\3\2\2\2|\u030f"+
		"\3\2\2\2~\u031a\3\2\2\2\u0080\u032a\3\2\2\2\u0082\u032c\3\2\2\2\u0084"+
		"\u0330\3\2\2\2\u0086\u0338\3\2\2\2\u0088\u0340\3\2\2\2\u008a\u0348\3\2"+
		"\2\2\u008c\u0350\3\2\2\2\u008e\u0352\3\2\2\2\u0090\u0354\3\2\2\2\u0092"+
		"\u0356\3\2\2\2\u0094\u0358\3\2\2\2\u0096\u035a\3\2\2\2\u0098\u035c\3\2"+
		"\2\2\u009a\u035e\3\2\2\2\u009c\u0360\3\2\2\2\u009e\u0362\3\2\2\2\u00a0"+
		"\u0364\3\2\2\2\u00a2\u0366\3\2\2\2\u00a4\u0368\3\2\2\2\u00a6\u036a\3\2"+
		"\2\2\u00a8\u036c\3\2\2\2\u00aa\u036e\3\2\2\2\u00ac\u0370\3\2\2\2\u00ae"+
		"\u0372\3\2\2\2\u00b0\u0374\3\2\2\2\u00b2\u00b7\5\6\4\2\u00b3\u00b7\5\20"+
		"\t\2\u00b4\u00b7\5:\36\2\u00b5\u00b7\5\60\31\2\u00b6\u00b2\3\2\2\2\u00b6"+
		"\u00b3\3\2\2\2\u00b6\u00b4\3\2\2\2\u00b6\u00b5\3\2\2\2\u00b7\u00ba\3\2"+
		"\2\2\u00b8\u00b6\3\2\2\2\u00b8\u00b9\3\2\2\2\u00b9\u00bb\3\2\2\2\u00ba"+
		"\u00b8\3\2\2\2\u00bb\u00bc\5\4\3\2\u00bc\u00bd\7\2\2\3\u00bd\3\3\2\2\2"+
		"\u00be\u00bf\7.\2\2\u00bf\u00c0\5\36\20\2\u00c0\5\3\2\2\2\u00c1\u00c2"+
		"\7/\2\2\u00c2\u00c3\5\b\5\2\u00c3\u00c4\5\n\6\2\u00c4\u00c5\5\36\20\2"+
		"\u00c5\7\3\2\2\2\u00c6\u00cb\5\u0088E\2\u00c7\u00c8\7\3\2\2\u00c8\u00ca"+
		"\7\4\2\2\u00c9\u00c7\3\2\2\2\u00ca\u00cd\3\2\2\2\u00cb\u00c9\3\2\2\2\u00cb"+
		"\u00cc\3\2\2\2\u00cc\u00ce\3\2\2\2\u00cd\u00cb\3\2\2\2\u00ce\u00cf\5\u008e"+
		"H\2\u00cf\t\3\2\2\2\u00d0\u00d2\7\5\2\2\u00d1\u00d3\5\16\b\2\u00d2\u00d1"+
		"\3\2\2\2\u00d2\u00d3\3\2\2\2\u00d3\u00d4\3\2\2\2\u00d4\u00d5\7\6\2\2\u00d5"+
		"\13\3\2\2\2\u00d6\u00da\5\u008cG\2\u00d7\u00d9\5<\37\2\u00d8\u00d7\3\2"+
		"\2\2\u00d9\u00dc\3\2\2\2\u00da\u00d8\3\2\2\2\u00da\u00db\3\2\2\2\u00db"+
		"\u00dd\3\2\2\2\u00dc\u00da\3\2\2\2\u00dd\u00de\5\u008eH\2\u00de\r\3\2"+
		"\2\2\u00df\u00e4\5\f\7\2\u00e0\u00e1\7\7\2\2\u00e1\u00e3\5\f\7\2\u00e2"+
		"\u00e0\3\2\2\2\u00e3\u00e6\3\2\2\2\u00e4\u00e2\3\2\2\2\u00e4\u00e5\3\2"+
		"\2\2\u00e5\17\3\2\2\2\u00e6\u00e4\3\2\2\2\u00e7\u00e8\7\60\2\2\u00e8\u00ea"+
		"\5\u008eH\2\u00e9\u00eb\5\24\13\2\u00ea\u00e9\3\2\2\2\u00ea\u00eb\3\2"+
		"\2\2\u00eb\u00ec\3\2\2\2\u00ec\u00f5\7\b\2\2\u00ed\u00ef\5\26\f\2\u00ee"+
		"\u00f0\5\22\n\2\u00ef\u00ee\3\2\2\2\u00f0\u00f1\3\2\2\2\u00f1\u00ef\3"+
		"\2\2\2\u00f1\u00f2\3\2\2\2\u00f2\u00f4\3\2\2\2\u00f3\u00ed\3\2\2\2\u00f4"+
		"\u00f7\3\2\2\2\u00f5\u00f3\3\2\2\2\u00f5\u00f6\3\2\2\2\u00f6\u00f8\3\2"+
		"\2\2\u00f7\u00f5\3\2\2\2\u00f8\u00f9\7\t\2\2\u00f9\21\3\2\2\2\u00fa\u00fe"+
		"\5\30\r\2\u00fb\u00fe\5\34\17\2\u00fc\u00fe\5\32\16\2\u00fd\u00fa\3\2"+
		"\2\2\u00fd\u00fb\3\2\2\2\u00fd\u00fc\3\2\2\2\u00fe\23\3\2\2\2\u00ff\u0100"+
		"\7\67\2\2\u0100\u0105\5\u008eH\2\u0101\u0102\7\7\2\2\u0102\u0104\5\u008e"+
		"H\2\u0103\u0101\3\2\2\2\u0104\u0107\3\2\2\2\u0105\u0103\3\2\2\2\u0105"+
		"\u0106\3\2\2\2\u0106\25\3\2\2\2\u0107\u0105\3\2\2\2\u0108\u0109\t\2\2"+
		"\2\u0109\27\3\2\2\2\u010a\u010b\7\66\2\2\u010b\u010c\5\u008eH\2\u010c"+
		"\u010d\5\n\6\2\u010d\u010e\5\36\20\2\u010e\31\3\2\2\2\u010f\u0110\7\65"+
		"\2\2\u0110\u0111\5\b\5\2\u0111\u0112\5\n\6\2\u0112\u0113\5\36\20\2\u0113"+
		"\33\3\2\2\2\u0114\u0115\7\62\2\2\u0115\u0116\5\u0090I\2\u0116\u011a\5"+
		"\u008cG\2\u0117\u0119\5<\37\2\u0118\u0117\3\2\2\2\u0119\u011c\3\2\2\2"+
		"\u011a\u0118\3\2\2\2\u011a\u011b\3\2\2\2\u011b\u011d\3\2\2\2\u011c\u011a"+
		"\3\2\2\2\u011d\u0123\5\u008eH\2\u011e\u0121\7\n\2\2\u011f\u0122\5H%\2"+
		"\u0120\u0122\5> \2\u0121\u011f\3\2\2\2\u0121\u0120\3\2\2\2\u0122\u0124"+
		"\3\2\2\2\u0123\u011e\3\2\2\2\u0123\u0124\3\2\2\2\u0124\u0125\3\2\2\2\u0125"+
		"\u0126\7S\2\2\u0126\35\3\2\2\2\u0127\u012e\7\b\2\2\u0128\u012d\5\"\22"+
		"\2\u0129\u012a\5,\27\2\u012a\u012b\7S\2\2\u012b\u012d\3\2\2\2\u012c\u0128"+
		"\3\2\2\2\u012c\u0129\3\2\2\2\u012d\u0130\3\2\2\2\u012e\u012c\3\2\2\2\u012e"+
		"\u012f\3\2\2\2\u012f\u0131\3\2\2\2\u0130\u012e\3\2\2\2\u0131\u0132\7\t"+
		"\2\2\u0132\37\3\2\2\2\u0133\u013a\7\b\2\2\u0134\u0139\5\"\22\2\u0135\u0136"+
		"\5.\30\2\u0136\u0137\7S\2\2\u0137\u0139\3\2\2\2\u0138\u0134\3\2\2\2\u0138"+
		"\u0135\3\2\2\2\u0139\u013c\3\2\2\2\u013a\u0138\3\2\2\2\u013a\u013b\3\2"+
		"\2\2\u013b\u013d\3\2\2\2\u013c\u013a\3\2\2\2\u013d\u013e\7\t\2\2\u013e"+
		"!\3\2\2\2\u013f\u014f\5$\23\2\u0140\u014f\5&\24\2\u0141\u0142\5(\25\2"+
		"\u0142\u0143\7S\2\2\u0143\u014f\3\2\2\2\u0144\u014f\5*\26\2\u0145\u014f"+
		"\5\62\32\2\u0146\u014f\5\60\31\2\u0147\u014f\5\36\20\2\u0148\u0149\58"+
		"\35\2\u0149\u014a\7S\2\2\u014a\u014f\3\2\2\2\u014b\u014c\5j\66\2\u014c"+
		"\u014d\7S\2\2\u014d\u014f\3\2\2\2\u014e\u013f\3\2\2\2\u014e\u0140\3\2"+
		"\2\2\u014e\u0141\3\2\2\2\u014e\u0144\3\2\2\2\u014e\u0145\3\2\2\2\u014e"+
		"\u0146\3\2\2\2\u014e\u0147\3\2\2\2\u014e\u0148\3\2\2\2\u014e\u014b\3\2"+
		"\2\2\u014f#\3\2\2\2\u0150\u0151\7=\2\2\u0151\u0152\5\66\34\2\u0152\u0155"+
		"\5\36\20\2\u0153\u0154\7>\2\2\u0154\u0156\5\36\20\2\u0155\u0153\3\2\2"+
		"\2\u0155\u0156\3\2\2\2\u0156%\3\2\2\2\u0157\u0158\7?\2\2\u0158\u0159\5"+
		"\66\34\2\u0159\u015a\5 \21\2\u015a\'\3\2\2\2\u015b\u015c\7@\2\2\u015c"+
		"\u015d\5 \21\2\u015d\u015e\7?\2\2\u015e\u015f\5\66\34\2\u015f)\3\2\2\2"+
		"\u0160\u0161\7A\2\2\u0161\u0164\7\5\2\2\u0162\u0165\58\35\2\u0163\u0165"+
		"\5l\67\2\u0164\u0162\3\2\2\2\u0164\u0163\3\2\2\2\u0164\u0165\3\2\2\2\u0165"+
		"\u0166\3\2\2\2\u0166\u0168\7S\2\2\u0167\u0169\5l\67\2\u0168\u0167\3\2"+
		"\2\2\u0168\u0169\3\2\2\2\u0169\u016a\3\2\2\2\u016a\u016c\7S\2\2\u016b"+
		"\u016d\5l\67\2\u016c\u016b\3\2\2\2\u016c\u016d\3\2\2\2\u016d\u016e\3\2"+
		"\2\2\u016e\u016f\7\6\2\2\u016f\u0170\5 \21\2\u0170+\3\2\2\2\u0171\u0172"+
		"\7D\2\2\u0172\u0178\5\u008eH\2\u0173\u0175\7E\2\2\u0174\u0176\5j\66\2"+
		"\u0175\u0174\3\2\2\2\u0175\u0176\3\2\2\2\u0176\u0178\3\2\2\2\u0177\u0171"+
		"\3\2\2\2\u0177\u0173\3\2\2\2\u0178-\3\2\2\2\u0179\u0182\7C\2\2\u017a\u0182"+
		"\7B\2\2\u017b\u017c\7D\2\2\u017c\u0182\5\u008eH\2\u017d\u017f\7E\2\2\u017e"+
		"\u0180\5j\66\2\u017f\u017e\3\2\2\2\u017f\u0180\3\2\2\2\u0180\u0182\3\2"+
		"\2\2\u0181\u0179\3\2\2\2\u0181\u017a\3\2\2\2\u0181\u017b\3\2\2\2\u0181"+
		"\u017d\3\2\2\2\u0182/\3\2\2\2\u0183\u0184\7F\2\2\u0184\u0186\5\u008eH"+
		"\2\u0185\u0187\5\36\20\2\u0186\u0185\3\2\2\2\u0186\u0187\3\2\2\2\u0187"+
		"\61\3\2\2\2\u0188\u0189\7G\2\2\u0189\u018a\5\66\34\2\u018a\u018c\7\b\2"+
		"\2\u018b\u018d\5\64\33\2\u018c\u018b\3\2\2\2\u018d\u018e\3\2\2\2\u018e"+
		"\u018c\3\2\2\2\u018e\u018f\3\2\2\2\u018f\u0190\3\2\2\2\u0190\u0191\7\t"+
		"\2\2\u0191\63\3\2\2\2\u0192\u0193\7H\2\2\u0193\u0194\5H%\2\u0194\u0195"+
		"\7\13\2\2\u0195\u0196\5\36\20\2\u0196\u019b\3\2\2\2\u0197\u0198\7I\2\2"+
		"\u0198\u0199\7\13\2\2\u0199\u019b\5\36\20\2\u019a\u0192\3\2\2\2\u019a"+
		"\u0197\3\2\2\2\u019b\65\3\2\2\2\u019c\u019d\7\5\2\2\u019d\u019e\5l\67"+
		"\2\u019e\u019f\7\6\2\2\u019f\67\3\2\2\2\u01a0\u01a2\5\u0090I\2\u01a1\u01a0"+
		"\3\2\2\2\u01a1\u01a2\3\2\2\2\u01a2\u01a3\3\2\2\2\u01a3\u01a7\5\u008cG"+
		"\2\u01a4\u01a6\5<\37\2\u01a5\u01a4\3\2\2\2\u01a6\u01a9\3\2\2\2\u01a7\u01a5"+
		"\3\2\2\2\u01a7\u01a8\3\2\2\2\u01a8\u01aa\3\2\2\2\u01a9\u01a7\3\2\2\2\u01aa"+
		"\u01b0\5\u008eH\2\u01ab\u01ae\7\n\2\2\u01ac\u01af\5l\67\2\u01ad\u01af"+
		"\5\u0080A\2\u01ae\u01ac\3\2\2\2\u01ae\u01ad\3\2\2\2\u01af\u01b1\3\2\2"+
		"\2\u01b0\u01ab\3\2\2\2\u01b0\u01b1\3\2\2\2\u01b19\3\2\2\2\u01b2\u01b4"+
		"\7\64\2\2\u01b3\u01b5\5\u0090I\2\u01b4\u01b3\3\2\2\2\u01b4\u01b5\3\2\2"+
		"\2\u01b5\u01b6\3\2\2\2\u01b6\u01ba\5\u008cG\2\u01b7\u01b9\5<\37\2\u01b8"+
		"\u01b7\3\2\2\2\u01b9\u01bc\3\2\2\2\u01ba\u01b8\3\2\2\2\u01ba\u01bb\3\2"+
		"\2\2\u01bb\u01bd\3\2\2\2\u01bc\u01ba\3\2\2\2\u01bd\u01be\5\u008eH\2\u01be"+
		"\u01c1\7\n\2\2\u01bf\u01c2\5H%\2\u01c0\u01c2\5> \2\u01c1\u01bf\3\2\2\2"+
		"\u01c1\u01c0\3\2\2\2\u01c2\u01c3\3\2\2\2\u01c3\u01c4\7S\2\2\u01c4;\3\2"+
		"\2\2\u01c5\u01c7\7\3\2\2\u01c6\u01c8\5H%\2\u01c7\u01c6\3\2\2\2\u01c7\u01c8"+
		"\3\2\2\2\u01c8\u01c9\3\2\2\2\u01c9\u01ca\7\4\2\2\u01ca=\3\2\2\2\u01cb"+
		"\u01cc\7\b\2\2\u01cc\u01cd\5B\"\2\u01cd\u01ce\7\t\2\2\u01ce\u01da\3\2"+
		"\2\2\u01cf\u01d0\7\b\2\2\u01d0\u01d3\5@!\2\u01d1\u01d2\7\7\2\2\u01d2\u01d4"+
		"\5@!\2\u01d3\u01d1\3\2\2\2\u01d4\u01d5\3\2\2\2\u01d5\u01d3\3\2\2\2\u01d5"+
		"\u01d6\3\2\2\2\u01d6\u01d7\3\2\2\2\u01d7\u01d8\7\t\2\2\u01d8\u01da\3\2"+
		"\2\2\u01d9\u01cb\3\2\2\2\u01d9\u01cf\3\2\2\2\u01da?\3\2\2\2\u01db\u01dc"+
		"\7\b\2\2\u01dc\u01dd\5B\"\2\u01dd\u01de\7\t\2\2\u01deA\3\2\2\2\u01df\u01e4"+
		"\5H%\2\u01e0\u01e1\7\7\2\2\u01e1\u01e3\5H%\2\u01e2\u01e0\3\2\2\2\u01e3"+
		"\u01e6\3\2\2\2\u01e4\u01e2\3\2\2\2\u01e4\u01e5\3\2\2\2\u01e5C\3\2\2\2"+
		"\u01e6\u01e4\3\2\2\2\u01e7\u01e8\5\u008eH\2\u01e8E\3\2\2\2\u01e9\u01ee"+
		"\5\u008eH\2\u01ea\u01eb\7\3\2\2\u01eb\u01ec\5H%\2\u01ec\u01ed\7\4\2\2"+
		"\u01ed\u01ef\3\2\2\2\u01ee\u01ea\3\2\2\2\u01ef\u01f0\3\2\2\2\u01f0\u01ee"+
		"\3\2\2\2\u01f0\u01f1\3\2\2\2\u01f1G\3\2\2\2\u01f2\u01f3\b%\1\2\u01f3\u01f4"+
		"\5J&\2\u01f4\u01fb\3\2\2\2\u01f5\u01f6\f\4\2\2\u01f6\u01f7\5\u00a0Q\2"+
		"\u01f7\u01f8\5J&\2\u01f8\u01fa\3\2\2\2\u01f9\u01f5\3\2\2\2\u01fa\u01fd"+
		"\3\2\2\2\u01fb\u01f9\3\2\2\2\u01fb\u01fc\3\2\2\2\u01fcI\3\2\2\2\u01fd"+
		"\u01fb\3\2\2\2\u01fe\u01ff\b&\1\2\u01ff\u0200\5L\'\2\u0200\u0207\3\2\2"+
		"\2\u0201\u0202\f\4\2\2\u0202\u0203\5\u00a2R\2\u0203\u0204\5L\'\2\u0204"+
		"\u0206\3\2\2\2\u0205\u0201\3\2\2\2\u0206\u0209\3\2\2\2\u0207\u0205\3\2"+
		"\2\2\u0207\u0208\3\2\2\2\u0208K\3\2\2\2\u0209\u0207\3\2\2\2\u020a\u020b"+
		"\b\'\1\2\u020b\u020c\5N(\2\u020c\u0213\3\2\2\2\u020d\u020e\f\4\2\2\u020e"+
		"\u020f\5\u00a4S\2\u020f\u0210\5N(\2\u0210\u0212\3\2\2\2\u0211\u020d\3"+
		"\2\2\2\u0212\u0215\3\2\2\2\u0213\u0211\3\2\2\2\u0213\u0214\3\2\2\2\u0214"+
		"M\3\2\2\2\u0215\u0213\3\2\2\2\u0216\u0217\b(\1\2\u0217\u0218\5P)\2\u0218"+
		"\u021f\3\2\2\2\u0219\u021a\f\4\2\2\u021a\u021b\5\u00a6T\2\u021b\u021c"+
		"\5P)\2\u021c\u021e\3\2\2\2\u021d\u0219\3\2\2\2\u021e\u0221\3\2\2\2\u021f"+
		"\u021d\3\2\2\2\u021f\u0220\3\2\2\2\u0220O\3\2\2\2\u0221\u021f\3\2\2\2"+
		"\u0222\u0223\b)\1\2\u0223\u0224\5R*\2\u0224\u022b\3\2\2\2\u0225\u0226"+
		"\f\4\2\2\u0226\u0227\5\u00a8U\2\u0227\u0228\5R*\2\u0228\u022a\3\2\2\2"+
		"\u0229\u0225\3\2\2\2\u022a\u022d\3\2\2\2\u022b\u0229\3\2\2\2\u022b\u022c"+
		"\3\2\2\2\u022cQ\3\2\2\2\u022d\u022b\3\2\2\2\u022e\u022f\b*\1\2\u022f\u0230"+
		"\5T+\2\u0230\u0237\3\2\2\2\u0231\u0232\f\4\2\2\u0232\u0233\5\u00aaV\2"+
		"\u0233\u0234\5T+\2\u0234\u0236\3\2\2\2\u0235\u0231\3\2\2\2\u0236\u0239"+
		"\3\2\2\2\u0237\u0235\3\2\2\2\u0237\u0238\3\2\2\2\u0238S\3\2\2\2\u0239"+
		"\u0237\3\2\2\2\u023a\u023b\b+\1\2\u023b\u023c\5V,\2\u023c\u0243\3\2\2"+
		"\2\u023d\u023e\f\4\2\2\u023e\u023f\5\u00acW\2\u023f\u0240\5V,\2\u0240"+
		"\u0242\3\2\2\2\u0241\u023d\3\2\2\2\u0242\u0245\3\2\2\2\u0243\u0241\3\2"+
		"\2\2\u0243\u0244\3\2\2\2\u0244U\3\2\2\2\u0245\u0243\3\2\2\2\u0246\u0247"+
		"\5\u00aeX\2\u0247\u0248\5X-\2\u0248\u024b\3\2\2\2\u0249\u024b\5X-\2\u024a"+
		"\u0246\3\2\2\2\u024a\u0249\3\2\2\2\u024bW\3\2\2\2\u024c\u0254\5\u008a"+
		"F\2\u024d\u024e\7\5\2\2\u024e\u024f\5H%\2\u024f\u0250\7\6\2\2\u0250\u0254"+
		"\3\2\2\2\u0251\u0254\5D#\2\u0252\u0254\5F$\2\u0253\u024c\3\2\2\2\u0253"+
		"\u024d\3\2\2\2\u0253\u0251\3\2\2\2\u0253\u0252\3\2\2\2\u0254Y\3\2\2\2"+
		"\u0255\u0256\7\3\2\2\u0256\u0257\5j\66\2\u0257\u0258\7\4\2\2\u0258[\3"+
		"\2\2\2\u0259\u025a\7\f\2\2\u025a\u025b\5\u008eH\2\u025b\u025f\5\u0086"+
		"D\2\u025c\u025e\5Z.\2\u025d\u025c\3\2\2\2\u025e\u0261\3\2\2\2\u025f\u025d"+
		"\3\2\2\2\u025f\u0260\3\2\2\2\u0260\u0265\3\2\2\2\u0261\u025f\3\2\2\2\u0262"+
		"\u0264\5f\64\2\u0263\u0262\3\2\2\2\u0264\u0267\3\2\2\2\u0265\u0263\3\2"+
		"\2\2\u0265\u0266\3\2\2\2\u0266]\3\2\2\2\u0267\u0265\3\2\2\2\u0268\u0269"+
		"\7N\2\2\u0269\u026a\5\u008eH\2\u026a\u026e\5\u0086D\2\u026b\u026d\5Z."+
		"\2\u026c\u026b\3\2\2\2\u026d\u0270\3\2\2\2\u026e\u026c\3\2\2\2\u026e\u026f"+
		"\3\2\2\2\u026f\u0274\3\2\2\2\u0270\u026e\3\2\2\2\u0271\u0273\5f\64\2\u0272"+
		"\u0271\3\2\2\2\u0273\u0276\3\2\2\2\u0274\u0272\3\2\2\2\u0274\u0275\3\2"+
		"\2\2\u0275_\3\2\2\2\u0276\u0274\3\2\2\2\u0277\u0278\5\u008eH\2\u0278\u027c"+
		"\5\u0086D\2\u0279\u027b\5Z.\2\u027a\u0279\3\2\2\2\u027b\u027e\3\2\2\2"+
		"\u027c\u027a\3\2\2\2\u027c\u027d\3\2\2\2\u027d\u0282\3\2\2\2\u027e\u027c"+
		"\3\2\2\2\u027f\u0281\5f\64\2\u0280\u027f\3\2\2\2\u0281\u0284\3\2\2\2\u0282"+
		"\u0280\3\2\2\2\u0282\u0283\3\2\2\2\u0283a\3\2\2\2\u0284\u0282\3\2\2\2"+
		"\u0285\u0289\7L\2\2\u0286\u0288\5f\64\2\u0287\u0286\3\2\2\2\u0288\u028b"+
		"\3\2\2\2\u0289\u0287\3\2\2\2\u0289\u028a\3\2\2\2\u028ac\3\2\2\2\u028b"+
		"\u0289\3\2\2\2\u028c\u0290\5\u008eH\2\u028d\u028f\5Z.\2\u028e\u028d\3"+
		"\2\2\2\u028f\u0292\3\2\2\2\u0290\u028e\3\2\2\2\u0290\u0291\3\2\2\2\u0291"+
		"\u0296\3\2\2\2\u0292\u0290\3\2\2\2\u0293\u0295\5f\64\2\u0294\u0293\3\2"+
		"\2\2\u0295\u0298\3\2\2\2\u0296\u0294\3\2\2\2\u0296\u0297\3\2\2\2\u0297"+
		"e\3\2\2\2\u0298\u0296\3\2\2\2\u0299\u029a\7\f\2\2\u029a\u029d\5\u008e"+
		"H\2\u029b\u029d\5\\/\2\u029c\u0299\3\2\2\2\u029c\u029b\3\2\2\2\u029d\u02a1"+
		"\3\2\2\2\u029e\u02a0\5Z.\2\u029f\u029e\3\2\2\2\u02a0\u02a3\3\2\2\2\u02a1"+
		"\u029f\3\2\2\2\u02a1\u02a2\3\2\2\2\u02a2g\3\2\2\2\u02a3\u02a1\3\2\2\2"+
		"\u02a4\u02a7\5b\62\2\u02a5\u02a7\5d\63\2\u02a6\u02a4\3\2\2\2\u02a6\u02a5"+
		"\3\2\2\2\u02a7i\3\2\2\2\u02a8\u02a9\5h\65\2\u02a9\u02ac\5\u009eP\2\u02aa"+
		"\u02ad\5j\66\2\u02ab\u02ad\5\u0080A\2\u02ac\u02aa\3\2\2\2\u02ac\u02ab"+
		"\3\2\2\2\u02ad\u02b0\3\2\2\2\u02ae\u02b0\5l\67\2\u02af\u02a8\3\2\2\2\u02af"+
		"\u02ae\3\2\2\2\u02b0k\3\2\2\2\u02b1\u02b2\b\67\1\2\u02b2\u02b3\5n8\2\u02b3"+
		"\u02ba\3\2\2\2\u02b4\u02b5\f\4\2\2\u02b5\u02b6\5\u00a0Q\2\u02b6\u02b7"+
		"\5n8\2\u02b7\u02b9\3\2\2\2\u02b8\u02b4\3\2\2\2\u02b9\u02bc\3\2\2\2\u02ba"+
		"\u02b8\3\2\2\2\u02ba\u02bb\3\2\2\2\u02bbm\3\2\2\2\u02bc\u02ba\3\2\2\2"+
		"\u02bd\u02be\b8\1\2\u02be\u02bf\5p9\2\u02bf\u02c6\3\2\2\2\u02c0\u02c1"+
		"\f\4\2\2\u02c1\u02c2\5\u00a2R\2\u02c2\u02c3\5p9\2\u02c3\u02c5\3\2\2\2"+
		"\u02c4\u02c0\3\2\2\2\u02c5\u02c8\3\2\2\2\u02c6\u02c4\3\2\2\2\u02c6\u02c7"+
		"\3\2\2\2\u02c7o\3\2\2\2\u02c8\u02c6\3\2\2\2\u02c9\u02ca\b9\1\2\u02ca\u02cb"+
		"\5r:\2\u02cb\u02d2\3\2\2\2\u02cc\u02cd\f\4\2\2\u02cd\u02ce\5\u00a4S\2"+
		"\u02ce\u02cf\5r:\2\u02cf\u02d1\3\2\2\2\u02d0\u02cc\3\2\2\2\u02d1\u02d4"+
		"\3\2\2\2\u02d2\u02d0\3\2\2\2\u02d2\u02d3\3\2\2\2\u02d3q\3\2\2\2\u02d4"+
		"\u02d2\3\2\2\2\u02d5\u02d6\b:\1\2\u02d6\u02d7\5t;\2\u02d7\u02de\3\2\2"+
		"\2\u02d8\u02d9\f\4\2\2\u02d9\u02da\5\u00a6T\2\u02da\u02db\5t;\2\u02db"+
		"\u02dd\3\2\2\2\u02dc\u02d8\3\2\2\2\u02dd\u02e0\3\2\2\2\u02de\u02dc\3\2"+
		"\2\2\u02de\u02df\3\2\2\2\u02dfs\3\2\2\2\u02e0\u02de\3\2\2\2\u02e1\u02e2"+
		"\b;\1\2\u02e2\u02e3\5v<\2\u02e3\u02ea\3\2\2\2\u02e4\u02e5\f\4\2\2\u02e5"+
		"\u02e6\5\u00a8U\2\u02e6\u02e7\5v<\2\u02e7\u02e9\3\2\2\2\u02e8\u02e4\3"+
		"\2\2\2\u02e9\u02ec\3\2\2\2\u02ea\u02e8\3\2\2\2\u02ea\u02eb\3\2\2\2\u02eb"+
		"u\3\2\2\2\u02ec\u02ea\3\2\2\2\u02ed\u02ee\b<\1\2\u02ee\u02ef\5x=\2\u02ef"+
		"\u02f6\3\2\2\2\u02f0\u02f1\f\4\2\2\u02f1\u02f2\5\u00aaV\2\u02f2\u02f3"+
		"\5x=\2\u02f3\u02f5\3\2\2\2\u02f4\u02f0\3\2\2\2\u02f5\u02f8\3\2\2\2\u02f6"+
		"\u02f4\3\2\2\2\u02f6\u02f7\3\2\2\2\u02f7w\3\2\2\2\u02f8\u02f6\3\2\2\2"+
		"\u02f9\u02fa\b=\1\2\u02fa\u02fb\5z>\2\u02fb\u0302\3\2\2\2\u02fc\u02fd"+
		"\f\4\2\2\u02fd\u02fe\5\u00acW\2\u02fe\u02ff\5z>\2\u02ff\u0301\3\2\2\2"+
		"\u0300\u02fc\3\2\2\2\u0301\u0304\3\2\2\2\u0302\u0300\3\2\2\2\u0302\u0303"+
		"\3\2\2\2\u0303y\3\2\2\2\u0304\u0302\3\2\2\2\u0305\u0306\5\u00aeX\2\u0306"+
		"\u0307\5z>\2\u0307\u030a\3\2\2\2\u0308\u030a\5|?\2\u0309\u0305\3\2\2\2"+
		"\u0309\u0308\3\2\2\2\u030a{\3\2\2\2\u030b\u030c\5~@\2\u030c\u030d\5\u00b0"+
		"Y\2\u030d\u0310\3\2\2\2\u030e\u0310\5~@\2\u030f\u030b\3\2\2\2\u030f\u030e"+
		"\3\2\2\2\u0310}\3\2\2\2\u0311\u0312\7\5\2\2\u0312\u0313\5l\67\2\u0313"+
		"\u0314\7\6\2\2\u0314\u031b\3\2\2\2\u0315\u031b\5^\60\2\u0316\u031b\5`"+
		"\61\2\u0317\u031b\5d\63\2\u0318\u031b\5b\62\2\u0319\u031b\5\u008aF\2\u031a"+
		"\u0311\3\2\2\2\u031a\u0315\3\2\2\2\u031a\u0316\3\2\2\2\u031a\u0317\3\2"+
		"\2\2\u031a\u0318\3\2\2\2\u031a\u0319\3\2\2\2\u031b\177\3\2\2\2\u031c\u031d"+
		"\7\b\2\2\u031d\u031e\5\u0084C\2\u031e\u031f\7\t\2\2\u031f\u032b\3\2\2"+
		"\2\u0320\u0321\7\b\2\2\u0321\u0324\5\u0082B\2\u0322\u0323\7\7\2\2\u0323"+
		"\u0325\5\u0082B\2\u0324\u0322\3\2\2\2\u0325\u0326\3\2\2\2\u0326\u0324"+
		"\3\2\2\2\u0326\u0327\3\2\2\2\u0327\u0328\3\2\2\2\u0328\u0329\7\t\2\2\u0329"+
		"\u032b\3\2\2\2\u032a\u031c\3\2\2\2\u032a\u0320\3\2\2\2\u032b\u0081\3\2"+
		"\2\2\u032c\u032d\7\b\2\2\u032d\u032e\5\u0084C\2\u032e\u032f\7\t\2\2\u032f"+
		"\u0083\3\2\2\2\u0330\u0335\5l\67\2\u0331\u0332\7\7\2\2\u0332\u0334\5l"+
		"\67\2\u0333\u0331\3\2\2\2\u0334\u0337\3\2\2\2\u0335\u0333\3\2\2\2\u0335"+
		"\u0336\3\2\2\2\u0336\u0085\3\2\2\2\u0337\u0335\3\2\2\2\u0338\u033a\7\5"+
		"\2\2\u0339\u033b\5\u0084C\2\u033a\u0339\3\2\2\2\u033a\u033b\3\2\2\2\u033b"+
		"\u033c\3\2\2\2\u033c\u033d\7\6\2\2\u033d\u0087\3\2\2\2\u033e\u0341\7\61"+
		"\2\2\u033f\u0341\5\u008cG\2\u0340\u033e\3\2\2\2\u0340\u033f\3\2\2\2\u0341"+
		"\u0089\3\2\2\2\u0342\u0349\5\u0092J\2\u0343\u0349\5\u0094K\2\u0344\u0349"+
		"\5\u0096L\2\u0345\u0349\5\u0098M\2\u0346\u0349\5\u009aN\2\u0347\u0349"+
		"\5\u009cO\2\u0348\u0342\3\2\2\2\u0348\u0343\3\2\2\2\u0348\u0344\3\2\2"+
		"\2\u0348\u0345\3\2\2\2\u0348\u0346\3\2\2\2\u0348\u0347\3\2\2\2\u0349\u008b"+
		"\3\2\2\2\u034a\u0351\7\r\2\2\u034b\u0351\7\16\2\2\u034c\u0351\7\17\2\2"+
		"\u034d\u0351\7\20\2\2\u034e\u0351\7\21\2\2\u034f\u0351\5\u008eH\2\u0350"+
		"\u034a\3\2\2\2\u0350\u034b\3\2\2\2\u0350\u034c\3\2\2\2\u0350\u034d\3\2"+
		"\2\2\u0350\u034e\3\2\2\2\u0350\u034f\3\2\2\2\u0351\u008d\3\2\2\2\u0352"+
		"\u0353\7T\2\2\u0353\u008f\3\2\2\2\u0354\u0355\t\3\2\2\u0355\u0091\3\2"+
		"\2\2\u0356\u0357\7P\2\2\u0357\u0093\3\2\2\2\u0358\u0359\7O\2\2\u0359\u0095"+
		"\3\2\2\2\u035a\u035b\7R\2\2\u035b\u0097\3\2\2\2\u035c\u035d\7Q\2\2\u035d"+
		"\u0099\3\2\2\2\u035e\u035f\t\4\2\2\u035f\u009b\3\2\2\2\u0360\u0361\7M"+
		"\2\2\u0361\u009d\3\2\2\2\u0362\u0363\t\5\2\2\u0363\u009f\3\2\2\2\u0364"+
		"\u0365\t\6\2\2\u0365\u00a1\3\2\2\2\u0366\u0367\t\7\2\2\u0367\u00a3\3\2"+
		"\2\2\u0368\u0369\t\b\2\2\u0369\u00a5\3\2\2\2\u036a\u036b\t\t\2\2\u036b"+
		"\u00a7\3\2\2\2\u036c\u036d\t\n\2\2\u036d\u00a9\3\2\2\2\u036e\u036f\t\13"+
		"\2\2\u036f\u00ab\3\2\2\2\u0370\u0371\t\f\2\2\u0371\u00ad\3\2\2\2\u0372"+
		"\u0373\t\r\2\2\u0373\u00af\3\2\2\2\u0374\u0375\t\16\2\2\u0375\u00b1\3"+
		"\2\2\2T\u00b6\u00b8\u00cb\u00d2\u00da\u00e4\u00ea\u00f1\u00f5\u00fd\u0105"+
		"\u011a\u0121\u0123\u012c\u012e\u0138\u013a\u014e\u0155\u0164\u0168\u016c"+
		"\u0175\u0177\u017f\u0181\u0186\u018e\u019a\u01a1\u01a7\u01ae\u01b0\u01b4"+
		"\u01ba\u01c1\u01c7\u01d5\u01d9\u01e4\u01f0\u01fb\u0207\u0213\u021f\u022b"+
		"\u0237\u0243\u024a\u0253\u025f\u0265\u026e\u0274\u027c\u0282\u0289\u0290"+
		"\u0296\u029c\u02a1\u02a6\u02ac\u02af\u02ba\u02c6\u02d2\u02de\u02ea\u02f6"+
		"\u0302\u0309\u030f\u031a\u0326\u032a\u0335\u033a\u0340\u0348\u0350";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}