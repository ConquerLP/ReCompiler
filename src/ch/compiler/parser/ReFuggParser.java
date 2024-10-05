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
		PUBLIC=55, PROTECTED=56, FINAL=57, IF=58, ELSE=59, WHILE=60, DO=61, FOR=62, 
		CONTINUE=63, BREAK=64, GOTO=65, RETURN=66, LABEL=67, SWITCH=68, CASE=69, 
		DEFAULT=70, TRUE=71, FALSE=72, THIS=73, NULL=74, NEW=75, INT_LIT=76, DOUBLE_LIT=77, 
		CHAR_LIT=78, STRING_LIT=79, SEMI=80, ID=81, COMMENT=82, BIG_COMMENT=83, 
		WS=84;
	public static final int
		RULE_program = 0, RULE_main = 1, RULE_func = 2, RULE_fHeader = 3, RULE_fParam = 4, 
		RULE_arg = 5, RULE_argList = 6, RULE_classDec = 7, RULE_classInside = 8, 
		RULE_poly = 9, RULE_visibilty = 10, RULE_classConstructor = 11, RULE_method = 12, 
		RULE_classField = 13, RULE_block = 14, RULE_stmt = 15, RULE_ifStmt = 16, 
		RULE_whileStmt = 17, RULE_doWhileStmt = 18, RULE_forStmt = 19, RULE_jumpStmt = 20, 
		RULE_label = 21, RULE_switchCase = 22, RULE_caseBlock = 23, RULE_check = 24, 
		RULE_varDec = 25, RULE_globalVar = 26, RULE_constArray = 27, RULE_constList = 28, 
		RULE_constSubList = 29, RULE_constExprMany = 30, RULE_constVar = 31, RULE_constArrayAccess = 32, 
		RULE_constExpr = 33, RULE_constJoin = 34, RULE_constEQ = 35, RULE_constRel = 36, 
		RULE_constLogic = 37, RULE_constTerm = 38, RULE_constExpo = 39, RULE_constUnary = 40, 
		RULE_constFactor = 41, RULE_arrayAccess = 42, RULE_methodCall = 43, RULE_newObject = 44, 
		RULE_fCall = 45, RULE_thisAcces = 46, RULE_varAcces = 47, RULE_exprTail = 48, 
		RULE_lh_expression = 49, RULE_expression = 50, RULE_orExpression = 51, 
		RULE_andExpression = 52, RULE_equalityExpression = 53, RULE_relationalExpression = 54, 
		RULE_additiveExpression = 55, RULE_multiplicativeExpression = 56, RULE_exponentiationExpression = 57, 
		RULE_unaryExpression = 58, RULE_postExpression = 59, RULE_primary = 60, 
		RULE_list = 61, RULE_subList = 62, RULE_expressionMany = 63, RULE_fArgs = 64, 
		RULE_returntype = 65, RULE_constant = 66, RULE_type = 67, RULE_identifier = 68, 
		RULE_typemodifier = 69, RULE_doubleRule = 70, RULE_intRule = 71, RULE_stringRule = 72, 
		RULE_charRule = 73, RULE_booleanRule = 74, RULE_refRule = 75, RULE_assignOP = 76, 
		RULE_orOP = 77, RULE_andOP = 78, RULE_eqOP = 79, RULE_relOP = 80, RULE_addOP = 81, 
		RULE_multOP = 82, RULE_expOP = 83, RULE_preOP = 84, RULE_postOP = 85;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "main", "func", "fHeader", "fParam", "arg", "argList", "classDec", 
			"classInside", "poly", "visibilty", "classConstructor", "method", "classField", 
			"block", "stmt", "ifStmt", "whileStmt", "doWhileStmt", "forStmt", "jumpStmt", 
			"label", "switchCase", "caseBlock", "check", "varDec", "globalVar", "constArray", 
			"constList", "constSubList", "constExprMany", "constVar", "constArrayAccess", 
			"constExpr", "constJoin", "constEQ", "constRel", "constLogic", "constTerm", 
			"constExpo", "constUnary", "constFactor", "arrayAccess", "methodCall", 
			"newObject", "fCall", "thisAcces", "varAcces", "exprTail", "lh_expression", 
			"expression", "orExpression", "andExpression", "equalityExpression", 
			"relationalExpression", "additiveExpression", "multiplicativeExpression", 
			"exponentiationExpression", "unaryExpression", "postExpression", "primary", 
			"list", "subList", "expressionMany", "fArgs", "returntype", "constant", 
			"type", "identifier", "typemodifier", "doubleRule", "intRule", "stringRule", 
			"charRule", "booleanRule", "refRule", "assignOP", "orOP", "andOP", "eqOP", 
			"relOP", "addOP", "multOP", "expOP", "preOP", "postOP"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'['", "']'", "'('", "')'", "','", "'{'", "'}'", "':'", "'='", 
			"'.'", "'double'", "'int'", "'string'", "'char'", "'boolean'", "'+='", 
			"'-='", "'*='", "'/='", "'%='", "'^='", "'**='", "'||'", "'or'", "'&&'", 
			"'and'", "'=='", "'!='", "'<'", "'<='", "'>'", "'>='", "'+'", "'-'", 
			"'*'", "'/'", "'%'", "'^'", "'**'", "'!'", "'not'", "'++'", "'--'", "'main:'", 
			"'func:'", "'class:'", "'void'", "'field:'", "'var:'", "'global:'", "'method:'", 
			"'constructor:'", "'isa:'", "'private:'", "'public:'", "'protected:'", 
			"'final'", "'if'", "'else'", "'while'", "'do'", "'for'", "'continue'", 
			"'break'", "'goto'", "'return'", "'label:'", "'switch'", "'case'", "'default'", 
			"'true'", "'false'", "'this'", "'null'", "'new'", null, null, null, null, 
			"';'"
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
			"PUBLIC", "PROTECTED", "FINAL", "IF", "ELSE", "WHILE", "DO", "FOR", "CONTINUE", 
			"BREAK", "GOTO", "RETURN", "LABEL", "SWITCH", "CASE", "DEFAULT", "TRUE", 
			"FALSE", "THIS", "NULL", "NEW", "INT_LIT", "DOUBLE_LIT", "CHAR_LIT", 
			"STRING_LIT", "SEMI", "ID", "COMMENT", "BIG_COMMENT", "WS"
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
			setState(178);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 45)) & ~0x3f) == 0 && ((1L << (_la - 45)) & ((1L << (FUNC - 45)) | (1L << (CLASS - 45)) | (1L << (GLOBAL - 45)) | (1L << (LABEL - 45)))) != 0)) {
				{
				setState(176);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case FUNC:
					{
					setState(172);
					func();
					}
					break;
				case CLASS:
					{
					setState(173);
					classDec();
					}
					break;
				case GLOBAL:
					{
					setState(174);
					globalVar();
					}
					break;
				case LABEL:
					{
					setState(175);
					label();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(180);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(181);
			main();
			setState(182);
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
			setState(184);
			match(MAIN);
			setState(185);
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
			setState(187);
			match(FUNC);
			setState(188);
			fHeader();
			setState(189);
			fParam();
			setState(190);
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
			setState(192);
			returntype();
			setState(197);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0) {
				{
				{
				setState(193);
				match(T__0);
				setState(194);
				match(T__1);
				}
				}
				setState(199);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(200);
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
			setState(202);
			match(T__2);
			setState(204);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14))) != 0) || _la==ID) {
				{
				setState(203);
				argList();
				}
			}

			setState(206);
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
			setState(208);
			type();
			setState(212);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0) {
				{
				{
				setState(209);
				constArray();
				}
				}
				setState(214);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(215);
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
			setState(217);
			arg();
			setState(222);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__4) {
				{
				{
				setState(218);
				match(T__4);
				setState(219);
				arg();
				}
				}
				setState(224);
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
			setState(225);
			match(CLASS);
			setState(226);
			identifier();
			setState(228);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ISA) {
				{
				setState(227);
				poly();
				}
			}

			setState(230);
			match(T__5);
			setState(239);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PRIVATE) | (1L << PUBLIC) | (1L << PROTECTED))) != 0)) {
				{
				{
				setState(231);
				visibilty();
				setState(233); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(232);
					classInside();
					}
					}
					setState(235); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << FIELD) | (1L << METH) | (1L << CONST))) != 0) );
				}
				}
				setState(241);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(242);
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
			setState(247);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CONST:
				{
				setState(244);
				classConstructor();
				}
				break;
			case FIELD:
				{
				setState(245);
				classField();
				}
				break;
			case METH:
				{
				setState(246);
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
			setState(249);
			match(ISA);
			setState(250);
			identifier();
			setState(255);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__4) {
				{
				{
				setState(251);
				match(T__4);
				setState(252);
				identifier();
				}
				}
				setState(257);
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
			setState(258);
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
		enterRule(_localctx, 22, RULE_classConstructor);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(260);
			match(CONST);
			setState(261);
			identifier();
			setState(262);
			fParam();
			setState(263);
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
		enterRule(_localctx, 24, RULE_method);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(265);
			match(METH);
			setState(266);
			fHeader();
			setState(267);
			fParam();
			setState(268);
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
			setState(270);
			match(FIELD);
			setState(271);
			typemodifier();
			setState(272);
			type();
			setState(276);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0) {
				{
				{
				setState(273);
				constArray();
				}
				}
				setState(278);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(279);
			identifier();
			setState(280);
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
		enterRule(_localctx, 28, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(282);
			match(T__5);
			setState(286);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__5) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__32) | (1L << T__33) | (1L << T__39) | (1L << T__40) | (1L << FINAL) | (1L << IF) | (1L << WHILE) | (1L << DO) | (1L << FOR) | (1L << CONTINUE))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (BREAK - 64)) | (1L << (GOTO - 64)) | (1L << (RETURN - 64)) | (1L << (LABEL - 64)) | (1L << (SWITCH - 64)) | (1L << (TRUE - 64)) | (1L << (FALSE - 64)) | (1L << (THIS - 64)) | (1L << (NULL - 64)) | (1L << (NEW - 64)) | (1L << (INT_LIT - 64)) | (1L << (DOUBLE_LIT - 64)) | (1L << (CHAR_LIT - 64)) | (1L << (STRING_LIT - 64)) | (1L << (ID - 64)))) != 0)) {
				{
				{
				setState(283);
				stmt();
				}
				}
				setState(288);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(289);
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
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public VarDecContext varDec() {
			return getRuleContext(VarDecContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public JumpStmtContext jumpStmt() {
			return getRuleContext(JumpStmtContext.class,0);
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
		enterRule(_localctx, 30, RULE_stmt);
		try {
			setState(309);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(291);
				ifStmt();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(292);
				whileStmt();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(293);
				doWhileStmt();
				setState(294);
				match(SEMI);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(296);
				forStmt();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(297);
				switchCase();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(298);
				label();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(299);
				block();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(300);
				varDec();
				setState(301);
				match(SEMI);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(303);
				expression();
				setState(304);
				match(SEMI);
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(306);
				jumpStmt();
				setState(307);
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
		public List<StmtContext> stmt() {
			return getRuleContexts(StmtContext.class);
		}
		public StmtContext stmt(int i) {
			return getRuleContext(StmtContext.class,i);
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
		enterRule(_localctx, 32, RULE_ifStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(311);
			match(IF);
			setState(312);
			check();
			setState(313);
			stmt();
			setState(316);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				{
				setState(314);
				match(ELSE);
				setState(315);
				stmt();
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
		enterRule(_localctx, 34, RULE_whileStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(318);
			match(WHILE);
			setState(319);
			check();
			setState(320);
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
		enterRule(_localctx, 36, RULE_doWhileStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(322);
			match(DO);
			setState(323);
			block();
			setState(324);
			match(WHILE);
			setState(325);
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
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
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
		enterRule(_localctx, 38, RULE_forStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(327);
			match(FOR);
			setState(328);
			match(T__2);
			setState(331);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				{
				setState(329);
				varDec();
				}
				break;
			case 2:
				{
				setState(330);
				orExpression(0);
				}
				break;
			}
			setState(333);
			match(SEMI);
			setState(335);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__32) | (1L << T__33) | (1L << T__39) | (1L << T__40))) != 0) || ((((_la - 71)) & ~0x3f) == 0 && ((1L << (_la - 71)) & ((1L << (TRUE - 71)) | (1L << (FALSE - 71)) | (1L << (THIS - 71)) | (1L << (NULL - 71)) | (1L << (NEW - 71)) | (1L << (INT_LIT - 71)) | (1L << (DOUBLE_LIT - 71)) | (1L << (CHAR_LIT - 71)) | (1L << (STRING_LIT - 71)) | (1L << (ID - 71)))) != 0)) {
				{
				setState(334);
				orExpression(0);
				}
			}

			setState(337);
			match(SEMI);
			setState(339);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__32) | (1L << T__33) | (1L << T__39) | (1L << T__40))) != 0) || ((((_la - 71)) & ~0x3f) == 0 && ((1L << (_la - 71)) & ((1L << (TRUE - 71)) | (1L << (FALSE - 71)) | (1L << (THIS - 71)) | (1L << (NULL - 71)) | (1L << (NEW - 71)) | (1L << (INT_LIT - 71)) | (1L << (DOUBLE_LIT - 71)) | (1L << (CHAR_LIT - 71)) | (1L << (STRING_LIT - 71)) | (1L << (ID - 71)))) != 0)) {
				{
				setState(338);
				orExpression(0);
				}
			}

			setState(341);
			match(T__3);
			setState(342);
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
		public JumpStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jumpStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReFuggListener ) ((ReFuggListener)listener).enterJumpStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReFuggListener ) ((ReFuggListener)listener).exitJumpStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReFuggVisitor ) return ((ReFuggVisitor<? extends T>)visitor).visitJumpStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JumpStmtContext jumpStmt() throws RecognitionException {
		JumpStmtContext _localctx = new JumpStmtContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_jumpStmt);
		int _la;
		try {
			setState(352);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BREAK:
				enterOuterAlt(_localctx, 1);
				{
				setState(344);
				match(BREAK);
				}
				break;
			case CONTINUE:
				enterOuterAlt(_localctx, 2);
				{
				setState(345);
				match(CONTINUE);
				}
				break;
			case GOTO:
				enterOuterAlt(_localctx, 3);
				{
				setState(346);
				match(GOTO);
				setState(347);
				identifier();
				}
				break;
			case RETURN:
				enterOuterAlt(_localctx, 4);
				{
				setState(348);
				match(RETURN);
				setState(350);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__32) | (1L << T__33) | (1L << T__39) | (1L << T__40))) != 0) || ((((_la - 71)) & ~0x3f) == 0 && ((1L << (_la - 71)) & ((1L << (TRUE - 71)) | (1L << (FALSE - 71)) | (1L << (THIS - 71)) | (1L << (NULL - 71)) | (1L << (NEW - 71)) | (1L << (INT_LIT - 71)) | (1L << (DOUBLE_LIT - 71)) | (1L << (CHAR_LIT - 71)) | (1L << (STRING_LIT - 71)) | (1L << (ID - 71)))) != 0)) {
					{
					setState(349);
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
		enterRule(_localctx, 42, RULE_label);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(354);
			match(LABEL);
			setState(355);
			identifier();
			setState(356);
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
		enterRule(_localctx, 44, RULE_switchCase);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(358);
			match(SWITCH);
			setState(359);
			check();
			setState(360);
			match(T__5);
			setState(362); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(361);
				caseBlock();
				}
				}
				setState(364); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==CASE || _la==DEFAULT );
			setState(366);
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
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
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
		enterRule(_localctx, 46, RULE_caseBlock);
		try {
			setState(376);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CASE:
				enterOuterAlt(_localctx, 1);
				{
				setState(368);
				match(CASE);
				setState(369);
				constExpr(0);
				setState(370);
				match(T__7);
				setState(371);
				block();
				}
				break;
			case DEFAULT:
				enterOuterAlt(_localctx, 2);
				{
				setState(373);
				match(DEFAULT);
				setState(374);
				match(T__7);
				setState(375);
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
		enterRule(_localctx, 48, RULE_check);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(378);
			match(T__2);
			setState(379);
			orExpression(0);
			setState(380);
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
		enterRule(_localctx, 50, RULE_varDec);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(383);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==FINAL) {
				{
				setState(382);
				typemodifier();
				}
			}

			setState(385);
			type();
			setState(389);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0) {
				{
				{
				setState(386);
				constArray();
				}
				}
				setState(391);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(392);
			identifier();
			setState(398);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__8) {
				{
				setState(393);
				match(T__8);
				setState(396);
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
					setState(394);
					orExpression(0);
					}
					break;
				case T__5:
					{
					setState(395);
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
		enterRule(_localctx, 52, RULE_globalVar);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(400);
			match(GLOBAL);
			setState(402);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==FINAL) {
				{
				setState(401);
				typemodifier();
				}
			}

			setState(404);
			type();
			setState(408);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0) {
				{
				{
				setState(405);
				constArray();
				}
				}
				setState(410);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(411);
			identifier();
			setState(412);
			match(T__8);
			setState(415);
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
				setState(413);
				constExpr(0);
				}
				break;
			case T__5:
				{
				setState(414);
				constList();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(417);
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
		enterRule(_localctx, 54, RULE_constArray);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(419);
			match(T__0);
			setState(421);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__32) | (1L << T__33) | (1L << T__39) | (1L << T__40))) != 0) || ((((_la - 71)) & ~0x3f) == 0 && ((1L << (_la - 71)) & ((1L << (TRUE - 71)) | (1L << (FALSE - 71)) | (1L << (NULL - 71)) | (1L << (INT_LIT - 71)) | (1L << (DOUBLE_LIT - 71)) | (1L << (CHAR_LIT - 71)) | (1L << (STRING_LIT - 71)) | (1L << (ID - 71)))) != 0)) {
				{
				setState(420);
				constExpr(0);
				}
			}

			setState(423);
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
		enterRule(_localctx, 56, RULE_constList);
		int _la;
		try {
			setState(439);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(425);
				match(T__5);
				setState(426);
				constExprMany();
				setState(427);
				match(T__6);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(429);
				match(T__5);
				setState(430);
				constSubList();
				setState(433); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(431);
					match(T__4);
					setState(432);
					constSubList();
					}
					}
					setState(435); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==T__4 );
				setState(437);
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
			setState(441);
			match(T__5);
			setState(442);
			constExprMany();
			setState(443);
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
			setState(445);
			constExpr(0);
			setState(450);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__4) {
				{
				{
				setState(446);
				match(T__4);
				setState(447);
				constExpr(0);
				}
				}
				setState(452);
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
		enterRule(_localctx, 62, RULE_constVar);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(453);
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
		enterRule(_localctx, 64, RULE_constArrayAccess);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(455);
			identifier();
			setState(460); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(456);
					match(T__0);
					setState(457);
					constExpr(0);
					setState(458);
					match(T__1);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(462); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,33,_ctx);
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
		int _startState = 66;
		enterRecursionRule(_localctx, 66, RULE_constExpr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(465);
			constJoin(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(473);
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
					setState(467);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(468);
					orOP();
					setState(469);
					constJoin(0);
					}
					} 
				}
				setState(475);
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
		int _startState = 68;
		enterRecursionRule(_localctx, 68, RULE_constJoin, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(477);
			constEQ(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(485);
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
					setState(479);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(480);
					andOP();
					setState(481);
					constEQ(0);
					}
					} 
				}
				setState(487);
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
		int _startState = 70;
		enterRecursionRule(_localctx, 70, RULE_constEQ, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(489);
			constRel(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(497);
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
					setState(491);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(492);
					eqOP();
					setState(493);
					constRel(0);
					}
					} 
				}
				setState(499);
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
		int _startState = 72;
		enterRecursionRule(_localctx, 72, RULE_constRel, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(501);
			constLogic(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(509);
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
					setState(503);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(504);
					relOP();
					setState(505);
					constLogic(0);
					}
					} 
				}
				setState(511);
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
		int _startState = 74;
		enterRecursionRule(_localctx, 74, RULE_constLogic, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(513);
			constTerm(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(521);
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
					setState(515);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(516);
					addOP();
					setState(517);
					constTerm(0);
					}
					} 
				}
				setState(523);
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
		int _startState = 76;
		enterRecursionRule(_localctx, 76, RULE_constTerm, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(525);
			constExpo(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(533);
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
					setState(527);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(528);
					multOP();
					setState(529);
					constExpo(0);
					}
					} 
				}
				setState(535);
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
		int _startState = 78;
		enterRecursionRule(_localctx, 78, RULE_constExpo, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(537);
			constUnary();
			}
			_ctx.stop = _input.LT(-1);
			setState(545);
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
					setState(539);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(540);
					expOP();
					setState(541);
					constUnary();
					}
					} 
				}
				setState(547);
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
		enterRule(_localctx, 80, RULE_constUnary);
		try {
			setState(552);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__32:
			case T__33:
			case T__39:
			case T__40:
				enterOuterAlt(_localctx, 1);
				{
				setState(548);
				preOP();
				setState(549);
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
				setState(551);
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
		enterRule(_localctx, 82, RULE_constFactor);
		try {
			setState(561);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,42,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(554);
				constant();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(555);
				match(T__2);
				setState(556);
				constExpr(0);
				setState(557);
				match(T__3);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(559);
				constVar();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(560);
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
		enterRule(_localctx, 84, RULE_arrayAccess);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(563);
			match(T__0);
			setState(564);
			expression();
			setState(565);
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
		enterRule(_localctx, 86, RULE_methodCall);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(567);
			identifier();
			setState(568);
			match(T__9);
			setState(569);
			fArgs();
			setState(573);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,43,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(570);
					arrayAccess();
					}
					} 
				}
				setState(575);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,43,_ctx);
			}
			setState(579);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,44,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(576);
					exprTail();
					}
					} 
				}
				setState(581);
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
		enterRule(_localctx, 88, RULE_newObject);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(582);
			match(NEW);
			setState(583);
			identifier();
			setState(584);
			fArgs();
			setState(588);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,45,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(585);
					arrayAccess();
					}
					} 
				}
				setState(590);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,45,_ctx);
			}
			setState(594);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,46,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(591);
					exprTail();
					}
					} 
				}
				setState(596);
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
		enterRule(_localctx, 90, RULE_fCall);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(597);
			identifier();
			setState(598);
			fArgs();
			setState(602);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,47,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(599);
					arrayAccess();
					}
					} 
				}
				setState(604);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,47,_ctx);
			}
			setState(608);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,48,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(605);
					exprTail();
					}
					} 
				}
				setState(610);
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
		enterRule(_localctx, 92, RULE_thisAcces);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(611);
			match(THIS);
			setState(615);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,49,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(612);
					exprTail();
					}
					} 
				}
				setState(617);
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
		enterRule(_localctx, 94, RULE_varAcces);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(618);
			identifier();
			setState(622);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,50,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(619);
					arrayAccess();
					}
					} 
				}
				setState(624);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,50,_ctx);
			}
			setState(628);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,51,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(625);
					exprTail();
					}
					} 
				}
				setState(630);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,51,_ctx);
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
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public MethodCallContext methodCall() {
			return getRuleContext(MethodCallContext.class,0);
		}
		public List<ArrayAccessContext> arrayAccess() {
			return getRuleContexts(ArrayAccessContext.class);
		}
		public ArrayAccessContext arrayAccess(int i) {
			return getRuleContext(ArrayAccessContext.class,i);
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
		enterRule(_localctx, 96, RULE_exprTail);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(631);
			match(T__9);
			setState(634);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,52,_ctx) ) {
			case 1:
				{
				setState(632);
				identifier();
				}
				break;
			case 2:
				{
				setState(633);
				methodCall();
				}
				break;
			}
			setState(639);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,53,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(636);
					arrayAccess();
					}
					} 
				}
				setState(641);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,53,_ctx);
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
		enterRule(_localctx, 98, RULE_lh_expression);
		try {
			setState(644);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case THIS:
				enterOuterAlt(_localctx, 1);
				{
				setState(642);
				thisAcces();
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(643);
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
		enterRule(_localctx, 100, RULE_expression);
		try {
			setState(653);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,56,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(646);
				lh_expression();
				setState(647);
				assignOP();
				setState(650);
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
					setState(648);
					expression();
					}
					break;
				case T__5:
					{
					setState(649);
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
				setState(652);
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
		int _startState = 102;
		enterRecursionRule(_localctx, 102, RULE_orExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(656);
			andExpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(664);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,57,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new OrExpressionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_orExpression);
					setState(658);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(659);
					orOP();
					setState(660);
					andExpression(0);
					}
					} 
				}
				setState(666);
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
		int _startState = 104;
		enterRecursionRule(_localctx, 104, RULE_andExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(668);
			equalityExpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(676);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,58,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new AndExpressionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_andExpression);
					setState(670);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(671);
					andOP();
					setState(672);
					equalityExpression(0);
					}
					} 
				}
				setState(678);
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
		int _startState = 106;
		enterRecursionRule(_localctx, 106, RULE_equalityExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(680);
			relationalExpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(688);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,59,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new EqualityExpressionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_equalityExpression);
					setState(682);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(683);
					eqOP();
					setState(684);
					relationalExpression(0);
					}
					} 
				}
				setState(690);
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
		int _startState = 108;
		enterRecursionRule(_localctx, 108, RULE_relationalExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(692);
			additiveExpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(700);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,60,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new RelationalExpressionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_relationalExpression);
					setState(694);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(695);
					relOP();
					setState(696);
					additiveExpression(0);
					}
					} 
				}
				setState(702);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,60,_ctx);
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
		int _startState = 110;
		enterRecursionRule(_localctx, 110, RULE_additiveExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(704);
			multiplicativeExpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(712);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,61,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new AdditiveExpressionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_additiveExpression);
					setState(706);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(707);
					addOP();
					setState(708);
					multiplicativeExpression(0);
					}
					} 
				}
				setState(714);
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
		int _startState = 112;
		enterRecursionRule(_localctx, 112, RULE_multiplicativeExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(716);
			exponentiationExpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(724);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,62,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new MultiplicativeExpressionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_multiplicativeExpression);
					setState(718);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(719);
					multOP();
					setState(720);
					exponentiationExpression(0);
					}
					} 
				}
				setState(726);
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
		int _startState = 114;
		enterRecursionRule(_localctx, 114, RULE_exponentiationExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(728);
			unaryExpression();
			}
			_ctx.stop = _input.LT(-1);
			setState(736);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,63,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ExponentiationExpressionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_exponentiationExpression);
					setState(730);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(731);
					expOP();
					setState(732);
					unaryExpression();
					}
					} 
				}
				setState(738);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,63,_ctx);
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
		enterRule(_localctx, 116, RULE_unaryExpression);
		try {
			setState(743);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__32:
			case T__33:
			case T__39:
			case T__40:
				enterOuterAlt(_localctx, 1);
				{
				setState(739);
				preOP();
				setState(740);
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
				setState(742);
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
		enterRule(_localctx, 118, RULE_postExpression);
		try {
			setState(749);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,65,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(745);
				primary();
				setState(746);
				postOP();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(748);
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
		enterRule(_localctx, 120, RULE_primary);
		try {
			setState(760);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,66,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(751);
				match(T__2);
				setState(752);
				orExpression(0);
				setState(753);
				match(T__3);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(755);
				newObject();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(756);
				fCall();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(757);
				varAcces();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(758);
				thisAcces();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(759);
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
		enterRule(_localctx, 122, RULE_list);
		int _la;
		try {
			setState(776);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,68,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(762);
				match(T__5);
				setState(763);
				expressionMany();
				setState(764);
				match(T__6);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(766);
				match(T__5);
				setState(767);
				subList();
				setState(770); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(768);
					match(T__4);
					setState(769);
					subList();
					}
					}
					setState(772); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==T__4 );
				setState(774);
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
		enterRule(_localctx, 124, RULE_subList);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(778);
			match(T__5);
			setState(779);
			expressionMany();
			setState(780);
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
		enterRule(_localctx, 126, RULE_expressionMany);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(782);
			orExpression(0);
			setState(787);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__4) {
				{
				{
				setState(783);
				match(T__4);
				setState(784);
				orExpression(0);
				}
				}
				setState(789);
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
		enterRule(_localctx, 128, RULE_fArgs);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(790);
			match(T__2);
			setState(792);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__32) | (1L << T__33) | (1L << T__39) | (1L << T__40))) != 0) || ((((_la - 71)) & ~0x3f) == 0 && ((1L << (_la - 71)) & ((1L << (TRUE - 71)) | (1L << (FALSE - 71)) | (1L << (THIS - 71)) | (1L << (NULL - 71)) | (1L << (NEW - 71)) | (1L << (INT_LIT - 71)) | (1L << (DOUBLE_LIT - 71)) | (1L << (CHAR_LIT - 71)) | (1L << (STRING_LIT - 71)) | (1L << (ID - 71)))) != 0)) {
				{
				setState(791);
				expressionMany();
				}
			}

			setState(794);
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
		enterRule(_localctx, 130, RULE_returntype);
		try {
			setState(798);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VOID:
				enterOuterAlt(_localctx, 1);
				{
				setState(796);
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
				setState(797);
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
		enterRule(_localctx, 132, RULE_constant);
		try {
			setState(806);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DOUBLE_LIT:
				enterOuterAlt(_localctx, 1);
				{
				setState(800);
				doubleRule();
				}
				break;
			case INT_LIT:
				enterOuterAlt(_localctx, 2);
				{
				setState(801);
				intRule();
				}
				break;
			case STRING_LIT:
				enterOuterAlt(_localctx, 3);
				{
				setState(802);
				stringRule();
				}
				break;
			case CHAR_LIT:
				enterOuterAlt(_localctx, 4);
				{
				setState(803);
				charRule();
				}
				break;
			case TRUE:
			case FALSE:
				enterOuterAlt(_localctx, 5);
				{
				setState(804);
				booleanRule();
				}
				break;
			case NULL:
				enterOuterAlt(_localctx, 6);
				{
				setState(805);
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
		enterRule(_localctx, 134, RULE_type);
		try {
			setState(814);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__10:
				enterOuterAlt(_localctx, 1);
				{
				setState(808);
				match(T__10);
				}
				break;
			case T__11:
				enterOuterAlt(_localctx, 2);
				{
				setState(809);
				match(T__11);
				}
				break;
			case T__12:
				enterOuterAlt(_localctx, 3);
				{
				setState(810);
				match(T__12);
				}
				break;
			case T__13:
				enterOuterAlt(_localctx, 4);
				{
				setState(811);
				match(T__13);
				}
				break;
			case T__14:
				enterOuterAlt(_localctx, 5);
				{
				setState(812);
				match(T__14);
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 6);
				{
				setState(813);
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
		enterRule(_localctx, 136, RULE_identifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(816);
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
		enterRule(_localctx, 138, RULE_typemodifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(818);
			match(FINAL);
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
		enterRule(_localctx, 140, RULE_doubleRule);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(820);
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
		enterRule(_localctx, 142, RULE_intRule);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(822);
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
		enterRule(_localctx, 144, RULE_stringRule);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(824);
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
		enterRule(_localctx, 146, RULE_charRule);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(826);
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
		enterRule(_localctx, 148, RULE_booleanRule);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(828);
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
		enterRule(_localctx, 150, RULE_refRule);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(830);
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
		enterRule(_localctx, 152, RULE_assignOP);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(832);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__8) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__21))) != 0)) ) {
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
		enterRule(_localctx, 154, RULE_orOP);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(834);
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
		enterRule(_localctx, 156, RULE_andOP);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(836);
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
		enterRule(_localctx, 158, RULE_eqOP);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(838);
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
		enterRule(_localctx, 160, RULE_relOP);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(840);
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
		enterRule(_localctx, 162, RULE_addOP);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(842);
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
		enterRule(_localctx, 164, RULE_multOP);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(844);
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
		enterRule(_localctx, 166, RULE_expOP);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(846);
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
		enterRule(_localctx, 168, RULE_preOP);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(848);
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
		enterRule(_localctx, 170, RULE_postOP);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(850);
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
		case 33:
			return constExpr_sempred((ConstExprContext)_localctx, predIndex);
		case 34:
			return constJoin_sempred((ConstJoinContext)_localctx, predIndex);
		case 35:
			return constEQ_sempred((ConstEQContext)_localctx, predIndex);
		case 36:
			return constRel_sempred((ConstRelContext)_localctx, predIndex);
		case 37:
			return constLogic_sempred((ConstLogicContext)_localctx, predIndex);
		case 38:
			return constTerm_sempred((ConstTermContext)_localctx, predIndex);
		case 39:
			return constExpo_sempred((ConstExpoContext)_localctx, predIndex);
		case 51:
			return orExpression_sempred((OrExpressionContext)_localctx, predIndex);
		case 52:
			return andExpression_sempred((AndExpressionContext)_localctx, predIndex);
		case 53:
			return equalityExpression_sempred((EqualityExpressionContext)_localctx, predIndex);
		case 54:
			return relationalExpression_sempred((RelationalExpressionContext)_localctx, predIndex);
		case 55:
			return additiveExpression_sempred((AdditiveExpressionContext)_localctx, predIndex);
		case 56:
			return multiplicativeExpression_sempred((MultiplicativeExpressionContext)_localctx, predIndex);
		case 57:
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3V\u0357\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\4R\tR\4S\tS\4T\tT"+
		"\4U\tU\4V\tV\4W\tW\3\2\3\2\3\2\3\2\7\2\u00b3\n\2\f\2\16\2\u00b6\13\2\3"+
		"\2\3\2\3\2\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\7\5\u00c6\n\5\f"+
		"\5\16\5\u00c9\13\5\3\5\3\5\3\6\3\6\5\6\u00cf\n\6\3\6\3\6\3\7\3\7\7\7\u00d5"+
		"\n\7\f\7\16\7\u00d8\13\7\3\7\3\7\3\b\3\b\3\b\7\b\u00df\n\b\f\b\16\b\u00e2"+
		"\13\b\3\t\3\t\3\t\5\t\u00e7\n\t\3\t\3\t\3\t\6\t\u00ec\n\t\r\t\16\t\u00ed"+
		"\7\t\u00f0\n\t\f\t\16\t\u00f3\13\t\3\t\3\t\3\n\3\n\3\n\5\n\u00fa\n\n\3"+
		"\13\3\13\3\13\3\13\7\13\u0100\n\13\f\13\16\13\u0103\13\13\3\f\3\f\3\r"+
		"\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\7\17\u0115"+
		"\n\17\f\17\16\17\u0118\13\17\3\17\3\17\3\17\3\20\3\20\7\20\u011f\n\20"+
		"\f\20\16\20\u0122\13\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3"+
		"\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\5\21\u0138\n\21"+
		"\3\22\3\22\3\22\3\22\3\22\5\22\u013f\n\22\3\23\3\23\3\23\3\23\3\24\3\24"+
		"\3\24\3\24\3\24\3\25\3\25\3\25\3\25\5\25\u014e\n\25\3\25\3\25\5\25\u0152"+
		"\n\25\3\25\3\25\5\25\u0156\n\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26"+
		"\3\26\5\26\u0161\n\26\5\26\u0163\n\26\3\27\3\27\3\27\3\27\3\30\3\30\3"+
		"\30\3\30\6\30\u016d\n\30\r\30\16\30\u016e\3\30\3\30\3\31\3\31\3\31\3\31"+
		"\3\31\3\31\3\31\3\31\5\31\u017b\n\31\3\32\3\32\3\32\3\32\3\33\5\33\u0182"+
		"\n\33\3\33\3\33\7\33\u0186\n\33\f\33\16\33\u0189\13\33\3\33\3\33\3\33"+
		"\3\33\5\33\u018f\n\33\5\33\u0191\n\33\3\34\3\34\5\34\u0195\n\34\3\34\3"+
		"\34\7\34\u0199\n\34\f\34\16\34\u019c\13\34\3\34\3\34\3\34\3\34\5\34\u01a2"+
		"\n\34\3\34\3\34\3\35\3\35\5\35\u01a8\n\35\3\35\3\35\3\36\3\36\3\36\3\36"+
		"\3\36\3\36\3\36\3\36\6\36\u01b4\n\36\r\36\16\36\u01b5\3\36\3\36\5\36\u01ba"+
		"\n\36\3\37\3\37\3\37\3\37\3 \3 \3 \7 \u01c3\n \f \16 \u01c6\13 \3!\3!"+
		"\3\"\3\"\3\"\3\"\3\"\6\"\u01cf\n\"\r\"\16\"\u01d0\3#\3#\3#\3#\3#\3#\3"+
		"#\7#\u01da\n#\f#\16#\u01dd\13#\3$\3$\3$\3$\3$\3$\3$\7$\u01e6\n$\f$\16"+
		"$\u01e9\13$\3%\3%\3%\3%\3%\3%\3%\7%\u01f2\n%\f%\16%\u01f5\13%\3&\3&\3"+
		"&\3&\3&\3&\3&\7&\u01fe\n&\f&\16&\u0201\13&\3\'\3\'\3\'\3\'\3\'\3\'\3\'"+
		"\7\'\u020a\n\'\f\'\16\'\u020d\13\'\3(\3(\3(\3(\3(\3(\3(\7(\u0216\n(\f"+
		"(\16(\u0219\13(\3)\3)\3)\3)\3)\3)\3)\7)\u0222\n)\f)\16)\u0225\13)\3*\3"+
		"*\3*\3*\5*\u022b\n*\3+\3+\3+\3+\3+\3+\3+\5+\u0234\n+\3,\3,\3,\3,\3-\3"+
		"-\3-\3-\7-\u023e\n-\f-\16-\u0241\13-\3-\7-\u0244\n-\f-\16-\u0247\13-\3"+
		".\3.\3.\3.\7.\u024d\n.\f.\16.\u0250\13.\3.\7.\u0253\n.\f.\16.\u0256\13"+
		".\3/\3/\3/\7/\u025b\n/\f/\16/\u025e\13/\3/\7/\u0261\n/\f/\16/\u0264\13"+
		"/\3\60\3\60\7\60\u0268\n\60\f\60\16\60\u026b\13\60\3\61\3\61\7\61\u026f"+
		"\n\61\f\61\16\61\u0272\13\61\3\61\7\61\u0275\n\61\f\61\16\61\u0278\13"+
		"\61\3\62\3\62\3\62\5\62\u027d\n\62\3\62\7\62\u0280\n\62\f\62\16\62\u0283"+
		"\13\62\3\63\3\63\5\63\u0287\n\63\3\64\3\64\3\64\3\64\5\64\u028d\n\64\3"+
		"\64\5\64\u0290\n\64\3\65\3\65\3\65\3\65\3\65\3\65\3\65\7\65\u0299\n\65"+
		"\f\65\16\65\u029c\13\65\3\66\3\66\3\66\3\66\3\66\3\66\3\66\7\66\u02a5"+
		"\n\66\f\66\16\66\u02a8\13\66\3\67\3\67\3\67\3\67\3\67\3\67\3\67\7\67\u02b1"+
		"\n\67\f\67\16\67\u02b4\13\67\38\38\38\38\38\38\38\78\u02bd\n8\f8\168\u02c0"+
		"\138\39\39\39\39\39\39\39\79\u02c9\n9\f9\169\u02cc\139\3:\3:\3:\3:\3:"+
		"\3:\3:\7:\u02d5\n:\f:\16:\u02d8\13:\3;\3;\3;\3;\3;\3;\3;\7;\u02e1\n;\f"+
		";\16;\u02e4\13;\3<\3<\3<\3<\5<\u02ea\n<\3=\3=\3=\3=\5=\u02f0\n=\3>\3>"+
		"\3>\3>\3>\3>\3>\3>\3>\5>\u02fb\n>\3?\3?\3?\3?\3?\3?\3?\3?\6?\u0305\n?"+
		"\r?\16?\u0306\3?\3?\5?\u030b\n?\3@\3@\3@\3@\3A\3A\3A\7A\u0314\nA\fA\16"+
		"A\u0317\13A\3B\3B\5B\u031b\nB\3B\3B\3C\3C\5C\u0321\nC\3D\3D\3D\3D\3D\3"+
		"D\5D\u0329\nD\3E\3E\3E\3E\3E\3E\5E\u0331\nE\3F\3F\3G\3G\3H\3H\3I\3I\3"+
		"J\3J\3K\3K\3L\3L\3M\3M\3N\3N\3O\3O\3P\3P\3Q\3Q\3R\3R\3S\3S\3T\3T\3U\3"+
		"U\3V\3V\3W\3W\3W\2\20DFHJLNPhjlnprtX\2\4\6\b\n\f\16\20\22\24\26\30\32"+
		"\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprtvxz|~\u0080"+
		"\u0082\u0084\u0086\u0088\u008a\u008c\u008e\u0090\u0092\u0094\u0096\u0098"+
		"\u009a\u009c\u009e\u00a0\u00a2\u00a4\u00a6\u00a8\u00aa\u00ac\2\16\3\2"+
		"8:\3\2IJ\4\2\13\13\22\30\3\2\31\32\3\2\33\34\3\2\35\36\3\2\37\"\3\2#$"+
		"\3\2%\'\3\2()\4\2#$*+\3\2,-\2\u0366\2\u00b4\3\2\2\2\4\u00ba\3\2\2\2\6"+
		"\u00bd\3\2\2\2\b\u00c2\3\2\2\2\n\u00cc\3\2\2\2\f\u00d2\3\2\2\2\16\u00db"+
		"\3\2\2\2\20\u00e3\3\2\2\2\22\u00f9\3\2\2\2\24\u00fb\3\2\2\2\26\u0104\3"+
		"\2\2\2\30\u0106\3\2\2\2\32\u010b\3\2\2\2\34\u0110\3\2\2\2\36\u011c\3\2"+
		"\2\2 \u0137\3\2\2\2\"\u0139\3\2\2\2$\u0140\3\2\2\2&\u0144\3\2\2\2(\u0149"+
		"\3\2\2\2*\u0162\3\2\2\2,\u0164\3\2\2\2.\u0168\3\2\2\2\60\u017a\3\2\2\2"+
		"\62\u017c\3\2\2\2\64\u0181\3\2\2\2\66\u0192\3\2\2\28\u01a5\3\2\2\2:\u01b9"+
		"\3\2\2\2<\u01bb\3\2\2\2>\u01bf\3\2\2\2@\u01c7\3\2\2\2B\u01c9\3\2\2\2D"+
		"\u01d2\3\2\2\2F\u01de\3\2\2\2H\u01ea\3\2\2\2J\u01f6\3\2\2\2L\u0202\3\2"+
		"\2\2N\u020e\3\2\2\2P\u021a\3\2\2\2R\u022a\3\2\2\2T\u0233\3\2\2\2V\u0235"+
		"\3\2\2\2X\u0239\3\2\2\2Z\u0248\3\2\2\2\\\u0257\3\2\2\2^\u0265\3\2\2\2"+
		"`\u026c\3\2\2\2b\u0279\3\2\2\2d\u0286\3\2\2\2f\u028f\3\2\2\2h\u0291\3"+
		"\2\2\2j\u029d\3\2\2\2l\u02a9\3\2\2\2n\u02b5\3\2\2\2p\u02c1\3\2\2\2r\u02cd"+
		"\3\2\2\2t\u02d9\3\2\2\2v\u02e9\3\2\2\2x\u02ef\3\2\2\2z\u02fa\3\2\2\2|"+
		"\u030a\3\2\2\2~\u030c\3\2\2\2\u0080\u0310\3\2\2\2\u0082\u0318\3\2\2\2"+
		"\u0084\u0320\3\2\2\2\u0086\u0328\3\2\2\2\u0088\u0330\3\2\2\2\u008a\u0332"+
		"\3\2\2\2\u008c\u0334\3\2\2\2\u008e\u0336\3\2\2\2\u0090\u0338\3\2\2\2\u0092"+
		"\u033a\3\2\2\2\u0094\u033c\3\2\2\2\u0096\u033e\3\2\2\2\u0098\u0340\3\2"+
		"\2\2\u009a\u0342\3\2\2\2\u009c\u0344\3\2\2\2\u009e\u0346\3\2\2\2\u00a0"+
		"\u0348\3\2\2\2\u00a2\u034a\3\2\2\2\u00a4\u034c\3\2\2\2\u00a6\u034e\3\2"+
		"\2\2\u00a8\u0350\3\2\2\2\u00aa\u0352\3\2\2\2\u00ac\u0354\3\2\2\2\u00ae"+
		"\u00b3\5\6\4\2\u00af\u00b3\5\20\t\2\u00b0\u00b3\5\66\34\2\u00b1\u00b3"+
		"\5,\27\2\u00b2\u00ae\3\2\2\2\u00b2\u00af\3\2\2\2\u00b2\u00b0\3\2\2\2\u00b2"+
		"\u00b1\3\2\2\2\u00b3\u00b6\3\2\2\2\u00b4\u00b2\3\2\2\2\u00b4\u00b5\3\2"+
		"\2\2\u00b5\u00b7\3\2\2\2\u00b6\u00b4\3\2\2\2\u00b7\u00b8\5\4\3\2\u00b8"+
		"\u00b9\7\2\2\3\u00b9\3\3\2\2\2\u00ba\u00bb\7.\2\2\u00bb\u00bc\5\36\20"+
		"\2\u00bc\5\3\2\2\2\u00bd\u00be\7/\2\2\u00be\u00bf\5\b\5\2\u00bf\u00c0"+
		"\5\n\6\2\u00c0\u00c1\5\36\20\2\u00c1\7\3\2\2\2\u00c2\u00c7\5\u0084C\2"+
		"\u00c3\u00c4\7\3\2\2\u00c4\u00c6\7\4\2\2\u00c5\u00c3\3\2\2\2\u00c6\u00c9"+
		"\3\2\2\2\u00c7\u00c5\3\2\2\2\u00c7\u00c8\3\2\2\2\u00c8\u00ca\3\2\2\2\u00c9"+
		"\u00c7\3\2\2\2\u00ca\u00cb\5\u008aF\2\u00cb\t\3\2\2\2\u00cc\u00ce\7\5"+
		"\2\2\u00cd\u00cf\5\16\b\2\u00ce\u00cd\3\2\2\2\u00ce\u00cf\3\2\2\2\u00cf"+
		"\u00d0\3\2\2\2\u00d0\u00d1\7\6\2\2\u00d1\13\3\2\2\2\u00d2\u00d6\5\u0088"+
		"E\2\u00d3\u00d5\58\35\2\u00d4\u00d3\3\2\2\2\u00d5\u00d8\3\2\2\2\u00d6"+
		"\u00d4\3\2\2\2\u00d6\u00d7\3\2\2\2\u00d7\u00d9\3\2\2\2\u00d8\u00d6\3\2"+
		"\2\2\u00d9\u00da\5\u008aF\2\u00da\r\3\2\2\2\u00db\u00e0\5\f\7\2\u00dc"+
		"\u00dd\7\7\2\2\u00dd\u00df\5\f\7\2\u00de\u00dc\3\2\2\2\u00df\u00e2\3\2"+
		"\2\2\u00e0\u00de\3\2\2\2\u00e0\u00e1\3\2\2\2\u00e1\17\3\2\2\2\u00e2\u00e0"+
		"\3\2\2\2\u00e3\u00e4\7\60\2\2\u00e4\u00e6\5\u008aF\2\u00e5\u00e7\5\24"+
		"\13\2\u00e6\u00e5\3\2\2\2\u00e6\u00e7\3\2\2\2\u00e7\u00e8\3\2\2\2\u00e8"+
		"\u00f1\7\b\2\2\u00e9\u00eb\5\26\f\2\u00ea\u00ec\5\22\n\2\u00eb\u00ea\3"+
		"\2\2\2\u00ec\u00ed\3\2\2\2\u00ed\u00eb\3\2\2\2\u00ed\u00ee\3\2\2\2\u00ee"+
		"\u00f0\3\2\2\2\u00ef\u00e9\3\2\2\2\u00f0\u00f3\3\2\2\2\u00f1\u00ef\3\2"+
		"\2\2\u00f1\u00f2\3\2\2\2\u00f2\u00f4\3\2\2\2\u00f3\u00f1\3\2\2\2\u00f4"+
		"\u00f5\7\t\2\2\u00f5\21\3\2\2\2\u00f6\u00fa\5\30\r\2\u00f7\u00fa\5\34"+
		"\17\2\u00f8\u00fa\5\32\16\2\u00f9\u00f6\3\2\2\2\u00f9\u00f7\3\2\2\2\u00f9"+
		"\u00f8\3\2\2\2\u00fa\23\3\2\2\2\u00fb\u00fc\7\67\2\2\u00fc\u0101\5\u008a"+
		"F\2\u00fd\u00fe\7\7\2\2\u00fe\u0100\5\u008aF\2\u00ff\u00fd\3\2\2\2\u0100"+
		"\u0103\3\2\2\2\u0101\u00ff\3\2\2\2\u0101\u0102\3\2\2\2\u0102\25\3\2\2"+
		"\2\u0103\u0101\3\2\2\2\u0104\u0105\t\2\2\2\u0105\27\3\2\2\2\u0106\u0107"+
		"\7\66\2\2\u0107\u0108\5\u008aF\2\u0108\u0109\5\n\6\2\u0109\u010a\5\36"+
		"\20\2\u010a\31\3\2\2\2\u010b\u010c\7\65\2\2\u010c\u010d\5\b\5\2\u010d"+
		"\u010e\5\n\6\2\u010e\u010f\5\36\20\2\u010f\33\3\2\2\2\u0110\u0111\7\62"+
		"\2\2\u0111\u0112\5\u008cG\2\u0112\u0116\5\u0088E\2\u0113\u0115\58\35\2"+
		"\u0114\u0113\3\2\2\2\u0115\u0118\3\2\2\2\u0116\u0114\3\2\2\2\u0116\u0117"+
		"\3\2\2\2\u0117\u0119\3\2\2\2\u0118\u0116\3\2\2\2\u0119\u011a\5\u008aF"+
		"\2\u011a\u011b\7R\2\2\u011b\35\3\2\2\2\u011c\u0120\7\b\2\2\u011d\u011f"+
		"\5 \21\2\u011e\u011d\3\2\2\2\u011f\u0122\3\2\2\2\u0120\u011e\3\2\2\2\u0120"+
		"\u0121\3\2\2\2\u0121\u0123\3\2\2\2\u0122\u0120\3\2\2\2\u0123\u0124\7\t"+
		"\2\2\u0124\37\3\2\2\2\u0125\u0138\5\"\22\2\u0126\u0138\5$\23\2\u0127\u0128"+
		"\5&\24\2\u0128\u0129\7R\2\2\u0129\u0138\3\2\2\2\u012a\u0138\5(\25\2\u012b"+
		"\u0138\5.\30\2\u012c\u0138\5,\27\2\u012d\u0138\5\36\20\2\u012e\u012f\5"+
		"\64\33\2\u012f\u0130\7R\2\2\u0130\u0138\3\2\2\2\u0131\u0132\5f\64\2\u0132"+
		"\u0133\7R\2\2\u0133\u0138\3\2\2\2\u0134\u0135\5*\26\2\u0135\u0136\7R\2"+
		"\2\u0136\u0138\3\2\2\2\u0137\u0125\3\2\2\2\u0137\u0126\3\2\2\2\u0137\u0127"+
		"\3\2\2\2\u0137\u012a\3\2\2\2\u0137\u012b\3\2\2\2\u0137\u012c\3\2\2\2\u0137"+
		"\u012d\3\2\2\2\u0137\u012e\3\2\2\2\u0137\u0131\3\2\2\2\u0137\u0134\3\2"+
		"\2\2\u0138!\3\2\2\2\u0139\u013a\7<\2\2\u013a\u013b\5\62\32\2\u013b\u013e"+
		"\5 \21\2\u013c\u013d\7=\2\2\u013d\u013f\5 \21\2\u013e\u013c\3\2\2\2\u013e"+
		"\u013f\3\2\2\2\u013f#\3\2\2\2\u0140\u0141\7>\2\2\u0141\u0142\5\62\32\2"+
		"\u0142\u0143\5\36\20\2\u0143%\3\2\2\2\u0144\u0145\7?\2\2\u0145\u0146\5"+
		"\36\20\2\u0146\u0147\7>\2\2\u0147\u0148\5\62\32\2\u0148\'\3\2\2\2\u0149"+
		"\u014a\7@\2\2\u014a\u014d\7\5\2\2\u014b\u014e\5\64\33\2\u014c\u014e\5"+
		"h\65\2\u014d\u014b\3\2\2\2\u014d\u014c\3\2\2\2\u014d\u014e\3\2\2\2\u014e"+
		"\u014f\3\2\2\2\u014f\u0151\7R\2\2\u0150\u0152\5h\65\2\u0151\u0150\3\2"+
		"\2\2\u0151\u0152\3\2\2\2\u0152\u0153\3\2\2\2\u0153\u0155\7R\2\2\u0154"+
		"\u0156\5h\65\2\u0155\u0154\3\2\2\2\u0155\u0156\3\2\2\2\u0156\u0157\3\2"+
		"\2\2\u0157\u0158\7\6\2\2\u0158\u0159\5\36\20\2\u0159)\3\2\2\2\u015a\u0163"+
		"\7B\2\2\u015b\u0163\7A\2\2\u015c\u015d\7C\2\2\u015d\u0163\5\u008aF\2\u015e"+
		"\u0160\7D\2\2\u015f\u0161\5f\64\2\u0160\u015f\3\2\2\2\u0160\u0161\3\2"+
		"\2\2\u0161\u0163\3\2\2\2\u0162\u015a\3\2\2\2\u0162\u015b\3\2\2\2\u0162"+
		"\u015c\3\2\2\2\u0162\u015e\3\2\2\2\u0163+\3\2\2\2\u0164\u0165\7E\2\2\u0165"+
		"\u0166\5\u008aF\2\u0166\u0167\5\36\20\2\u0167-\3\2\2\2\u0168\u0169\7F"+
		"\2\2\u0169\u016a\5\62\32\2\u016a\u016c\7\b\2\2\u016b\u016d\5\60\31\2\u016c"+
		"\u016b\3\2\2\2\u016d\u016e\3\2\2\2\u016e\u016c\3\2\2\2\u016e\u016f\3\2"+
		"\2\2\u016f\u0170\3\2\2\2\u0170\u0171\7\t\2\2\u0171/\3\2\2\2\u0172\u0173"+
		"\7G\2\2\u0173\u0174\5D#\2\u0174\u0175\7\n\2\2\u0175\u0176\5\36\20\2\u0176"+
		"\u017b\3\2\2\2\u0177\u0178\7H\2\2\u0178\u0179\7\n\2\2\u0179\u017b\5\36"+
		"\20\2\u017a\u0172\3\2\2\2\u017a\u0177\3\2\2\2\u017b\61\3\2\2\2\u017c\u017d"+
		"\7\5\2\2\u017d\u017e\5h\65\2\u017e\u017f\7\6\2\2\u017f\63\3\2\2\2\u0180"+
		"\u0182\5\u008cG\2\u0181\u0180\3\2\2\2\u0181\u0182\3\2\2\2\u0182\u0183"+
		"\3\2\2\2\u0183\u0187\5\u0088E\2\u0184\u0186\58\35\2\u0185\u0184\3\2\2"+
		"\2\u0186\u0189\3\2\2\2\u0187\u0185\3\2\2\2\u0187\u0188\3\2\2\2\u0188\u018a"+
		"\3\2\2\2\u0189\u0187\3\2\2\2\u018a\u0190\5\u008aF\2\u018b\u018e\7\13\2"+
		"\2\u018c\u018f\5h\65\2\u018d\u018f\5|?\2\u018e\u018c\3\2\2\2\u018e\u018d"+
		"\3\2\2\2\u018f\u0191\3\2\2\2\u0190\u018b\3\2\2\2\u0190\u0191\3\2\2\2\u0191"+
		"\65\3\2\2\2\u0192\u0194\7\64\2\2\u0193\u0195\5\u008cG\2\u0194\u0193\3"+
		"\2\2\2\u0194\u0195\3\2\2\2\u0195\u0196\3\2\2\2\u0196\u019a\5\u0088E\2"+
		"\u0197\u0199\58\35\2\u0198\u0197\3\2\2\2\u0199\u019c\3\2\2\2\u019a\u0198"+
		"\3\2\2\2\u019a\u019b\3\2\2\2\u019b\u019d\3\2\2\2\u019c\u019a\3\2\2\2\u019d"+
		"\u019e\5\u008aF\2\u019e\u01a1\7\13\2\2\u019f\u01a2\5D#\2\u01a0\u01a2\5"+
		":\36\2\u01a1\u019f\3\2\2\2\u01a1\u01a0\3\2\2\2\u01a2\u01a3\3\2\2\2\u01a3"+
		"\u01a4\7R\2\2\u01a4\67\3\2\2\2\u01a5\u01a7\7\3\2\2\u01a6\u01a8\5D#\2\u01a7"+
		"\u01a6\3\2\2\2\u01a7\u01a8\3\2\2\2\u01a8\u01a9\3\2\2\2\u01a9\u01aa\7\4"+
		"\2\2\u01aa9\3\2\2\2\u01ab\u01ac\7\b\2\2\u01ac\u01ad\5> \2\u01ad\u01ae"+
		"\7\t\2\2\u01ae\u01ba\3\2\2\2\u01af\u01b0\7\b\2\2\u01b0\u01b3\5<\37\2\u01b1"+
		"\u01b2\7\7\2\2\u01b2\u01b4\5<\37\2\u01b3\u01b1\3\2\2\2\u01b4\u01b5\3\2"+
		"\2\2\u01b5\u01b3\3\2\2\2\u01b5\u01b6\3\2\2\2\u01b6\u01b7\3\2\2\2\u01b7"+
		"\u01b8\7\t\2\2\u01b8\u01ba\3\2\2\2\u01b9\u01ab\3\2\2\2\u01b9\u01af\3\2"+
		"\2\2\u01ba;\3\2\2\2\u01bb\u01bc\7\b\2\2\u01bc\u01bd\5> \2\u01bd\u01be"+
		"\7\t\2\2\u01be=\3\2\2\2\u01bf\u01c4\5D#\2\u01c0\u01c1\7\7\2\2\u01c1\u01c3"+
		"\5D#\2\u01c2\u01c0\3\2\2\2\u01c3\u01c6\3\2\2\2\u01c4\u01c2\3\2\2\2\u01c4"+
		"\u01c5\3\2\2\2\u01c5?\3\2\2\2\u01c6\u01c4\3\2\2\2\u01c7\u01c8\5\u008a"+
		"F\2\u01c8A\3\2\2\2\u01c9\u01ce\5\u008aF\2\u01ca\u01cb\7\3\2\2\u01cb\u01cc"+
		"\5D#\2\u01cc\u01cd\7\4\2\2\u01cd\u01cf\3\2\2\2\u01ce\u01ca\3\2\2\2\u01cf"+
		"\u01d0\3\2\2\2\u01d0\u01ce\3\2\2\2\u01d0\u01d1\3\2\2\2\u01d1C\3\2\2\2"+
		"\u01d2\u01d3\b#\1\2\u01d3\u01d4\5F$\2\u01d4\u01db\3\2\2\2\u01d5\u01d6"+
		"\f\4\2\2\u01d6\u01d7\5\u009cO\2\u01d7\u01d8\5F$\2\u01d8\u01da\3\2\2\2"+
		"\u01d9\u01d5\3\2\2\2\u01da\u01dd\3\2\2\2\u01db\u01d9\3\2\2\2\u01db\u01dc"+
		"\3\2\2\2\u01dcE\3\2\2\2\u01dd\u01db\3\2\2\2\u01de\u01df\b$\1\2\u01df\u01e0"+
		"\5H%\2\u01e0\u01e7\3\2\2\2\u01e1\u01e2\f\4\2\2\u01e2\u01e3\5\u009eP\2"+
		"\u01e3\u01e4\5H%\2\u01e4\u01e6\3\2\2\2\u01e5\u01e1\3\2\2\2\u01e6\u01e9"+
		"\3\2\2\2\u01e7\u01e5\3\2\2\2\u01e7\u01e8\3\2\2\2\u01e8G\3\2\2\2\u01e9"+
		"\u01e7\3\2\2\2\u01ea\u01eb\b%\1\2\u01eb\u01ec\5J&\2\u01ec\u01f3\3\2\2"+
		"\2\u01ed\u01ee\f\4\2\2\u01ee\u01ef\5\u00a0Q\2\u01ef\u01f0\5J&\2\u01f0"+
		"\u01f2\3\2\2\2\u01f1\u01ed\3\2\2\2\u01f2\u01f5\3\2\2\2\u01f3\u01f1\3\2"+
		"\2\2\u01f3\u01f4\3\2\2\2\u01f4I\3\2\2\2\u01f5\u01f3\3\2\2\2\u01f6\u01f7"+
		"\b&\1\2\u01f7\u01f8\5L\'\2\u01f8\u01ff\3\2\2\2\u01f9\u01fa\f\4\2\2\u01fa"+
		"\u01fb\5\u00a2R\2\u01fb\u01fc\5L\'\2\u01fc\u01fe\3\2\2\2\u01fd\u01f9\3"+
		"\2\2\2\u01fe\u0201\3\2\2\2\u01ff\u01fd\3\2\2\2\u01ff\u0200\3\2\2\2\u0200"+
		"K\3\2\2\2\u0201\u01ff\3\2\2\2\u0202\u0203\b\'\1\2\u0203\u0204\5N(\2\u0204"+
		"\u020b\3\2\2\2\u0205\u0206\f\4\2\2\u0206\u0207\5\u00a4S\2\u0207\u0208"+
		"\5N(\2\u0208\u020a\3\2\2\2\u0209\u0205\3\2\2\2\u020a\u020d\3\2\2\2\u020b"+
		"\u0209\3\2\2\2\u020b\u020c\3\2\2\2\u020cM\3\2\2\2\u020d\u020b\3\2\2\2"+
		"\u020e\u020f\b(\1\2\u020f\u0210\5P)\2\u0210\u0217\3\2\2\2\u0211\u0212"+
		"\f\4\2\2\u0212\u0213\5\u00a6T\2\u0213\u0214\5P)\2\u0214\u0216\3\2\2\2"+
		"\u0215\u0211\3\2\2\2\u0216\u0219\3\2\2\2\u0217\u0215\3\2\2\2\u0217\u0218"+
		"\3\2\2\2\u0218O\3\2\2\2\u0219\u0217\3\2\2\2\u021a\u021b\b)\1\2\u021b\u021c"+
		"\5R*\2\u021c\u0223\3\2\2\2\u021d\u021e\f\4\2\2\u021e\u021f\5\u00a8U\2"+
		"\u021f\u0220\5R*\2\u0220\u0222\3\2\2\2\u0221\u021d\3\2\2\2\u0222\u0225"+
		"\3\2\2\2\u0223\u0221\3\2\2\2\u0223\u0224\3\2\2\2\u0224Q\3\2\2\2\u0225"+
		"\u0223\3\2\2\2\u0226\u0227\5\u00aaV\2\u0227\u0228\5T+\2\u0228\u022b\3"+
		"\2\2\2\u0229\u022b\5T+\2\u022a\u0226\3\2\2\2\u022a\u0229\3\2\2\2\u022b"+
		"S\3\2\2\2\u022c\u0234\5\u0086D\2\u022d\u022e\7\5\2\2\u022e\u022f\5D#\2"+
		"\u022f\u0230\7\6\2\2\u0230\u0234\3\2\2\2\u0231\u0234\5@!\2\u0232\u0234"+
		"\5B\"\2\u0233\u022c\3\2\2\2\u0233\u022d\3\2\2\2\u0233\u0231\3\2\2\2\u0233"+
		"\u0232\3\2\2\2\u0234U\3\2\2\2\u0235\u0236\7\3\2\2\u0236\u0237\5f\64\2"+
		"\u0237\u0238\7\4\2\2\u0238W\3\2\2\2\u0239\u023a\5\u008aF\2\u023a\u023b"+
		"\7\f\2\2\u023b\u023f\5\u0082B\2\u023c\u023e\5V,\2\u023d\u023c\3\2\2\2"+
		"\u023e\u0241\3\2\2\2\u023f\u023d\3\2\2\2\u023f\u0240\3\2\2\2\u0240\u0245"+
		"\3\2\2\2\u0241\u023f\3\2\2\2\u0242\u0244\5b\62\2\u0243\u0242\3\2\2\2\u0244"+
		"\u0247\3\2\2\2\u0245\u0243\3\2\2\2\u0245\u0246\3\2\2\2\u0246Y\3\2\2\2"+
		"\u0247\u0245\3\2\2\2\u0248\u0249\7M\2\2\u0249\u024a\5\u008aF\2\u024a\u024e"+
		"\5\u0082B\2\u024b\u024d\5V,\2\u024c\u024b\3\2\2\2\u024d\u0250\3\2\2\2"+
		"\u024e\u024c\3\2\2\2\u024e\u024f\3\2\2\2\u024f\u0254\3\2\2\2\u0250\u024e"+
		"\3\2\2\2\u0251\u0253\5b\62\2\u0252\u0251\3\2\2\2\u0253\u0256\3\2\2\2\u0254"+
		"\u0252\3\2\2\2\u0254\u0255\3\2\2\2\u0255[\3\2\2\2\u0256\u0254\3\2\2\2"+
		"\u0257\u0258\5\u008aF\2\u0258\u025c\5\u0082B\2\u0259\u025b\5V,\2\u025a"+
		"\u0259\3\2\2\2\u025b\u025e\3\2\2\2\u025c\u025a\3\2\2\2\u025c\u025d\3\2"+
		"\2\2\u025d\u0262\3\2\2\2\u025e\u025c\3\2\2\2\u025f\u0261\5b\62\2\u0260"+
		"\u025f\3\2\2\2\u0261\u0264\3\2\2\2\u0262\u0260\3\2\2\2\u0262\u0263\3\2"+
		"\2\2\u0263]\3\2\2\2\u0264\u0262\3\2\2\2\u0265\u0269\7K\2\2\u0266\u0268"+
		"\5b\62\2\u0267\u0266\3\2\2\2\u0268\u026b\3\2\2\2\u0269\u0267\3\2\2\2\u0269"+
		"\u026a\3\2\2\2\u026a_\3\2\2\2\u026b\u0269\3\2\2\2\u026c\u0270\5\u008a"+
		"F\2\u026d\u026f\5V,\2\u026e\u026d\3\2\2\2\u026f\u0272\3\2\2\2\u0270\u026e"+
		"\3\2\2\2\u0270\u0271\3\2\2\2\u0271\u0276\3\2\2\2\u0272\u0270\3\2\2\2\u0273"+
		"\u0275\5b\62\2\u0274\u0273\3\2\2\2\u0275\u0278\3\2\2\2\u0276\u0274\3\2"+
		"\2\2\u0276\u0277\3\2\2\2\u0277a\3\2\2\2\u0278\u0276\3\2\2\2\u0279\u027c"+
		"\7\f\2\2\u027a\u027d\5\u008aF\2\u027b\u027d\5X-\2\u027c\u027a\3\2\2\2"+
		"\u027c\u027b\3\2\2\2\u027d\u0281\3\2\2\2\u027e\u0280\5V,\2\u027f\u027e"+
		"\3\2\2\2\u0280\u0283\3\2\2\2\u0281\u027f\3\2\2\2\u0281\u0282\3\2\2\2\u0282"+
		"c\3\2\2\2\u0283\u0281\3\2\2\2\u0284\u0287\5^\60\2\u0285\u0287\5`\61\2"+
		"\u0286\u0284\3\2\2\2\u0286\u0285\3\2\2\2\u0287e\3\2\2\2\u0288\u0289\5"+
		"d\63\2\u0289\u028c\5\u009aN\2\u028a\u028d\5f\64\2\u028b\u028d\5|?\2\u028c"+
		"\u028a\3\2\2\2\u028c\u028b\3\2\2\2\u028d\u0290\3\2\2\2\u028e\u0290\5h"+
		"\65\2\u028f\u0288\3\2\2\2\u028f\u028e\3\2\2\2\u0290g\3\2\2\2\u0291\u0292"+
		"\b\65\1\2\u0292\u0293\5j\66\2\u0293\u029a\3\2\2\2\u0294\u0295\f\4\2\2"+
		"\u0295\u0296\5\u009cO\2\u0296\u0297\5j\66\2\u0297\u0299\3\2\2\2\u0298"+
		"\u0294\3\2\2\2\u0299\u029c\3\2\2\2\u029a\u0298\3\2\2\2\u029a\u029b\3\2"+
		"\2\2\u029bi\3\2\2\2\u029c\u029a\3\2\2\2\u029d\u029e\b\66\1\2\u029e\u029f"+
		"\5l\67\2\u029f\u02a6\3\2\2\2\u02a0\u02a1\f\4\2\2\u02a1\u02a2\5\u009eP"+
		"\2\u02a2\u02a3\5l\67\2\u02a3\u02a5\3\2\2\2\u02a4\u02a0\3\2\2\2\u02a5\u02a8"+
		"\3\2\2\2\u02a6\u02a4\3\2\2\2\u02a6\u02a7\3\2\2\2\u02a7k\3\2\2\2\u02a8"+
		"\u02a6\3\2\2\2\u02a9\u02aa\b\67\1\2\u02aa\u02ab\5n8\2\u02ab\u02b2\3\2"+
		"\2\2\u02ac\u02ad\f\4\2\2\u02ad\u02ae\5\u00a0Q\2\u02ae\u02af\5n8\2\u02af"+
		"\u02b1\3\2\2\2\u02b0\u02ac\3\2\2\2\u02b1\u02b4\3\2\2\2\u02b2\u02b0\3\2"+
		"\2\2\u02b2\u02b3\3\2\2\2\u02b3m\3\2\2\2\u02b4\u02b2\3\2\2\2\u02b5\u02b6"+
		"\b8\1\2\u02b6\u02b7\5p9\2\u02b7\u02be\3\2\2\2\u02b8\u02b9\f\4\2\2\u02b9"+
		"\u02ba\5\u00a2R\2\u02ba\u02bb\5p9\2\u02bb\u02bd\3\2\2\2\u02bc\u02b8\3"+
		"\2\2\2\u02bd\u02c0\3\2\2\2\u02be\u02bc\3\2\2\2\u02be\u02bf\3\2\2\2\u02bf"+
		"o\3\2\2\2\u02c0\u02be\3\2\2\2\u02c1\u02c2\b9\1\2\u02c2\u02c3\5r:\2\u02c3"+
		"\u02ca\3\2\2\2\u02c4\u02c5\f\4\2\2\u02c5\u02c6\5\u00a4S\2\u02c6\u02c7"+
		"\5r:\2\u02c7\u02c9\3\2\2\2\u02c8\u02c4\3\2\2\2\u02c9\u02cc\3\2\2\2\u02ca"+
		"\u02c8\3\2\2\2\u02ca\u02cb\3\2\2\2\u02cbq\3\2\2\2\u02cc\u02ca\3\2\2\2"+
		"\u02cd\u02ce\b:\1\2\u02ce\u02cf\5t;\2\u02cf\u02d6\3\2\2\2\u02d0\u02d1"+
		"\f\4\2\2\u02d1\u02d2\5\u00a6T\2\u02d2\u02d3\5t;\2\u02d3\u02d5\3\2\2\2"+
		"\u02d4\u02d0\3\2\2\2\u02d5\u02d8\3\2\2\2\u02d6\u02d4\3\2\2\2\u02d6\u02d7"+
		"\3\2\2\2\u02d7s\3\2\2\2\u02d8\u02d6\3\2\2\2\u02d9\u02da\b;\1\2\u02da\u02db"+
		"\5v<\2\u02db\u02e2\3\2\2\2\u02dc\u02dd\f\4\2\2\u02dd\u02de\5\u00a8U\2"+
		"\u02de\u02df\5v<\2\u02df\u02e1\3\2\2\2\u02e0\u02dc\3\2\2\2\u02e1\u02e4"+
		"\3\2\2\2\u02e2\u02e0\3\2\2\2\u02e2\u02e3\3\2\2\2\u02e3u\3\2\2\2\u02e4"+
		"\u02e2\3\2\2\2\u02e5\u02e6\5\u00aaV\2\u02e6\u02e7\5v<\2\u02e7\u02ea\3"+
		"\2\2\2\u02e8\u02ea\5x=\2\u02e9\u02e5\3\2\2\2\u02e9\u02e8\3\2\2\2\u02ea"+
		"w\3\2\2\2\u02eb\u02ec\5z>\2\u02ec\u02ed\5\u00acW\2\u02ed\u02f0\3\2\2\2"+
		"\u02ee\u02f0\5z>\2\u02ef\u02eb\3\2\2\2\u02ef\u02ee\3\2\2\2\u02f0y\3\2"+
		"\2\2\u02f1\u02f2\7\5\2\2\u02f2\u02f3\5h\65\2\u02f3\u02f4\7\6\2\2\u02f4"+
		"\u02fb\3\2\2\2\u02f5\u02fb\5Z.\2\u02f6\u02fb\5\\/\2\u02f7\u02fb\5`\61"+
		"\2\u02f8\u02fb\5^\60\2\u02f9\u02fb\5\u0086D\2\u02fa\u02f1\3\2\2\2\u02fa"+
		"\u02f5\3\2\2\2\u02fa\u02f6\3\2\2\2\u02fa\u02f7\3\2\2\2\u02fa\u02f8\3\2"+
		"\2\2\u02fa\u02f9\3\2\2\2\u02fb{\3\2\2\2\u02fc\u02fd\7\b\2\2\u02fd\u02fe"+
		"\5\u0080A\2\u02fe\u02ff\7\t\2\2\u02ff\u030b\3\2\2\2\u0300\u0301\7\b\2"+
		"\2\u0301\u0304\5~@\2\u0302\u0303\7\7\2\2\u0303\u0305\5~@\2\u0304\u0302"+
		"\3\2\2\2\u0305\u0306\3\2\2\2\u0306\u0304\3\2\2\2\u0306\u0307\3\2\2\2\u0307"+
		"\u0308\3\2\2\2\u0308\u0309\7\t\2\2\u0309\u030b\3\2\2\2\u030a\u02fc\3\2"+
		"\2\2\u030a\u0300\3\2\2\2\u030b}\3\2\2\2\u030c\u030d\7\b\2\2\u030d\u030e"+
		"\5\u0080A\2\u030e\u030f\7\t\2\2\u030f\177\3\2\2\2\u0310\u0315\5h\65\2"+
		"\u0311\u0312\7\7\2\2\u0312\u0314\5h\65\2\u0313\u0311\3\2\2\2\u0314\u0317"+
		"\3\2\2\2\u0315\u0313\3\2\2\2\u0315\u0316\3\2\2\2\u0316\u0081\3\2\2\2\u0317"+
		"\u0315\3\2\2\2\u0318\u031a\7\5\2\2\u0319\u031b\5\u0080A\2\u031a\u0319"+
		"\3\2\2\2\u031a\u031b\3\2\2\2\u031b\u031c\3\2\2\2\u031c\u031d\7\6\2\2\u031d"+
		"\u0083\3\2\2\2\u031e\u0321\7\61\2\2\u031f\u0321\5\u0088E\2\u0320\u031e"+
		"\3\2\2\2\u0320\u031f\3\2\2\2\u0321\u0085\3\2\2\2\u0322\u0329\5\u008eH"+
		"\2\u0323\u0329\5\u0090I\2\u0324\u0329\5\u0092J\2\u0325\u0329\5\u0094K"+
		"\2\u0326\u0329\5\u0096L\2\u0327\u0329\5\u0098M\2\u0328\u0322\3\2\2\2\u0328"+
		"\u0323\3\2\2\2\u0328\u0324\3\2\2\2\u0328\u0325\3\2\2\2\u0328\u0326\3\2"+
		"\2\2\u0328\u0327\3\2\2\2\u0329\u0087\3\2\2\2\u032a\u0331\7\r\2\2\u032b"+
		"\u0331\7\16\2\2\u032c\u0331\7\17\2\2\u032d\u0331\7\20\2\2\u032e\u0331"+
		"\7\21\2\2\u032f\u0331\5\u008aF\2\u0330\u032a\3\2\2\2\u0330\u032b\3\2\2"+
		"\2\u0330\u032c\3\2\2\2\u0330\u032d\3\2\2\2\u0330\u032e\3\2\2\2\u0330\u032f"+
		"\3\2\2\2\u0331\u0089\3\2\2\2\u0332\u0333\7S\2\2\u0333\u008b\3\2\2\2\u0334"+
		"\u0335\7;\2\2\u0335\u008d\3\2\2\2\u0336\u0337\7O\2\2\u0337\u008f\3\2\2"+
		"\2\u0338\u0339\7N\2\2\u0339\u0091\3\2\2\2\u033a\u033b\7Q\2\2\u033b\u0093"+
		"\3\2\2\2\u033c\u033d\7P\2\2\u033d\u0095\3\2\2\2\u033e\u033f\t\3\2\2\u033f"+
		"\u0097\3\2\2\2\u0340\u0341\7L\2\2\u0341\u0099\3\2\2\2\u0342\u0343\t\4"+
		"\2\2\u0343\u009b\3\2\2\2\u0344\u0345\t\5\2\2\u0345\u009d\3\2\2\2\u0346"+
		"\u0347\t\6\2\2\u0347\u009f\3\2\2\2\u0348\u0349\t\7\2\2\u0349\u00a1\3\2"+
		"\2\2\u034a\u034b\t\b\2\2\u034b\u00a3\3\2\2\2\u034c\u034d\t\t\2\2\u034d"+
		"\u00a5\3\2\2\2\u034e\u034f\t\n\2\2\u034f\u00a7\3\2\2\2\u0350\u0351\t\13"+
		"\2\2\u0351\u00a9\3\2\2\2\u0352\u0353\t\f\2\2\u0353\u00ab\3\2\2\2\u0354"+
		"\u0355\t\r\2\2\u0355\u00ad\3\2\2\2L\u00b2\u00b4\u00c7\u00ce\u00d6\u00e0"+
		"\u00e6\u00ed\u00f1\u00f9\u0101\u0116\u0120\u0137\u013e\u014d\u0151\u0155"+
		"\u0160\u0162\u016e\u017a\u0181\u0187\u018e\u0190\u0194\u019a\u01a1\u01a7"+
		"\u01b5\u01b9\u01c4\u01d0\u01db\u01e7\u01f3\u01ff\u020b\u0217\u0223\u022a"+
		"\u0233\u023f\u0245\u024e\u0254\u025c\u0262\u0269\u0270\u0276\u027c\u0281"+
		"\u0286\u028c\u028f\u029a\u02a6\u02b2\u02be\u02ca\u02d6\u02e2\u02e9\u02ef"+
		"\u02fa\u0306\u030a\u0315\u031a\u0320\u0328\u0330";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}