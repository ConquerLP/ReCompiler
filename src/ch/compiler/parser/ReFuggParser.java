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
		T__38=39, T__39=40, T__40=41, T__41=42, MAIN=43, FUNC=44, CLASS=45, VOID=46, 
		FIELD=47, VAR=48, GLOBAL=49, METH=50, CONST=51, ISA=52, PRIVATE=53, PUBLIC=54, 
		PROTECTED=55, STATIC=56, FINAL=57, IF=58, ELSE=59, WHILE=60, DO=61, FOR=62, 
		CONTINUE=63, BREAK=64, GOTO=65, RETURN=66, LABEL=67, SWITCH=68, CASE=69, 
		DEFAULT=70, TRUE=71, FALSE=72, THIS=73, NULL=74, NEW=75, INT_LIT=76, DOUBLE_LIT=77, 
		CHAR_LIT=78, STRING_LIT=79, ID=80, COMMENT=81, BIG_COMMENT=82, WS=83;
	public static final int
		RULE_program = 0, RULE_main = 1, RULE_func = 2, RULE_fHeader = 3, RULE_fParam = 4, 
		RULE_argList = 5, RULE_classDec = 6, RULE_complexClassInsides = 7, RULE_classInsides = 8, 
		RULE_poly = 9, RULE_visibilty = 10, RULE_classConstructor = 11, RULE_method = 12, 
		RULE_classField = 13, RULE_block = 14, RULE_stmt = 15, RULE_ifStmt = 16, 
		RULE_whileStmt = 17, RULE_doWhileStmt = 18, RULE_forStmt = 19, RULE_jumpStmt = 20, 
		RULE_label = 21, RULE_switchCase = 22, RULE_caseBlock = 23, RULE_check = 24, 
		RULE_varDec = 25, RULE_globalVar = 26, RULE_simpleArray = 27, RULE_arrayAccess = 28, 
		RULE_simpleCall = 29, RULE_newObject = 30, RULE_fCall = 31, RULE_thisAcces = 32, 
		RULE_varAcces = 33, RULE_callTail = 34, RULE_lh_expression = 35, RULE_expression = 36, 
		RULE_orExpression = 37, RULE_andExpression = 38, RULE_equalityExpression = 39, 
		RULE_relationalExpression = 40, RULE_additiveExpression = 41, RULE_multiplicativeExpression = 42, 
		RULE_exponentiationExpression = 43, RULE_unaryExpression = 44, RULE_postExpression = 45, 
		RULE_primary = 46, RULE_list = 47, RULE_subList = 48, RULE_expressionMany = 49, 
		RULE_fArgs = 50, RULE_returntype = 51, RULE_assignOP = 52, RULE_orOP = 53, 
		RULE_andOP = 54, RULE_eqOP = 55, RULE_relOP = 56, RULE_addOP = 57, RULE_multOP = 58, 
		RULE_expOP = 59, RULE_preOP = 60, RULE_postOP = 61, RULE_constant = 62, 
		RULE_complexType = 63, RULE_type = 64, RULE_identifier = 65, RULE_typemodifier = 66, 
		RULE_doubleRule = 67, RULE_intRule = 68, RULE_stringRule = 69, RULE_charRule = 70, 
		RULE_booleanRule = 71, RULE_refRule = 72;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "main", "func", "fHeader", "fParam", "argList", "classDec", 
			"complexClassInsides", "classInsides", "poly", "visibilty", "classConstructor", 
			"method", "classField", "block", "stmt", "ifStmt", "whileStmt", "doWhileStmt", 
			"forStmt", "jumpStmt", "label", "switchCase", "caseBlock", "check", "varDec", 
			"globalVar", "simpleArray", "arrayAccess", "simpleCall", "newObject", 
			"fCall", "thisAcces", "varAcces", "callTail", "lh_expression", "expression", 
			"orExpression", "andExpression", "equalityExpression", "relationalExpression", 
			"additiveExpression", "multiplicativeExpression", "exponentiationExpression", 
			"unaryExpression", "postExpression", "primary", "list", "subList", "expressionMany", 
			"fArgs", "returntype", "assignOP", "orOP", "andOP", "eqOP", "relOP", 
			"addOP", "multOP", "expOP", "preOP", "postOP", "constant", "complexType", 
			"type", "identifier", "typemodifier", "doubleRule", "intRule", "stringRule", 
			"charRule", "booleanRule", "refRule"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'['", "']'", "'('", "')'", "','", "'{'", "'}'", "';'", "':'", 
			"'='", "'.'", "'+='", "'-='", "'*='", "'/='", "'%='", "'||'", "'or'", 
			"'&&'", "'and'", "'=='", "'!='", "'is'", "'is not'", "'<'", "'<='", "'>'", 
			"'>='", "'+'", "'-'", "'*'", "'/'", "'%'", "'^'", "'!'", "'++'", "'--'", 
			"'double'", "'int'", "'string'", "'char'", "'boolean'", "'main:'", "'func:'", 
			"'class:'", "'void'", "'field:'", "'var:'", "'global:'", "'method:'", 
			"'constructor:'", "'isa:'", "'private:'", "'public:'", "'protected:'", 
			"'static'", "'final'", "'if'", "'else'", "'while'", "'do'", "'for'", 
			"'continue'", "'break'", "'goto'", "'return'", "'label:'", "'switch'", 
			"'case'", "'default'", "'true'", "'false'", "'this'", "'null'", "'new'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, "MAIN", "FUNC", "CLASS", "VOID", 
			"FIELD", "VAR", "GLOBAL", "METH", "CONST", "ISA", "PRIVATE", "PUBLIC", 
			"PROTECTED", "STATIC", "FINAL", "IF", "ELSE", "WHILE", "DO", "FOR", "CONTINUE", 
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
			while (((((_la - 44)) & ~0x3f) == 0 && ((1L << (_la - 44)) & ((1L << (FUNC - 44)) | (1L << (CLASS - 44)) | (1L << (GLOBAL - 44)) | (1L << (LABEL - 44)))) != 0)) {
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
			if (((((_la - 38)) & ~0x3f) == 0 && ((1L << (_la - 38)) & ((1L << (T__37 - 38)) | (1L << (T__38 - 38)) | (1L << (T__39 - 38)) | (1L << (T__40 - 38)) | (1L << (T__41 - 38)) | (1L << (ID - 38)))) != 0)) {
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
		public List<ComplexTypeContext> complexType() {
			return getRuleContexts(ComplexTypeContext.class);
		}
		public ComplexTypeContext complexType(int i) {
			return getRuleContext(ComplexTypeContext.class,i);
		}
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
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
			complexType();
			setState(183);
			identifier();
			setState(190);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__4) {
				{
				{
				setState(184);
				match(T__4);
				setState(185);
				complexType();
				setState(186);
				identifier();
				}
				}
				setState(192);
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
		public List<ComplexClassInsidesContext> complexClassInsides() {
			return getRuleContexts(ComplexClassInsidesContext.class);
		}
		public ComplexClassInsidesContext complexClassInsides(int i) {
			return getRuleContext(ComplexClassInsidesContext.class,i);
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
			setState(193);
			match(CLASS);
			setState(194);
			identifier();
			setState(196);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ISA) {
				{
				setState(195);
				poly();
				}
			}

			setState(198);
			match(T__5);
			setState(202);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PRIVATE) | (1L << PUBLIC) | (1L << PROTECTED))) != 0)) {
				{
				{
				setState(199);
				complexClassInsides();
				}
				}
				setState(204);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(205);
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

	public static class ComplexClassInsidesContext extends ParserRuleContext {
		public VisibiltyContext visibilty() {
			return getRuleContext(VisibiltyContext.class,0);
		}
		public List<ClassInsidesContext> classInsides() {
			return getRuleContexts(ClassInsidesContext.class);
		}
		public ClassInsidesContext classInsides(int i) {
			return getRuleContext(ClassInsidesContext.class,i);
		}
		public ComplexClassInsidesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_complexClassInsides; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReFuggListener ) ((ReFuggListener)listener).enterComplexClassInsides(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReFuggListener ) ((ReFuggListener)listener).exitComplexClassInsides(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReFuggVisitor ) return ((ReFuggVisitor<? extends T>)visitor).visitComplexClassInsides(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComplexClassInsidesContext complexClassInsides() throws RecognitionException {
		ComplexClassInsidesContext _localctx = new ComplexClassInsidesContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_complexClassInsides);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(207);
			visibilty();
			setState(209); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(208);
				classInsides();
				}
				}
				setState(211); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << FIELD) | (1L << METH) | (1L << CONST))) != 0) );
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

	public static class ClassInsidesContext extends ParserRuleContext {
		public ClassConstructorContext classConstructor() {
			return getRuleContext(ClassConstructorContext.class,0);
		}
		public ClassFieldContext classField() {
			return getRuleContext(ClassFieldContext.class,0);
		}
		public MethodContext method() {
			return getRuleContext(MethodContext.class,0);
		}
		public ClassInsidesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classInsides; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReFuggListener ) ((ReFuggListener)listener).enterClassInsides(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReFuggListener ) ((ReFuggListener)listener).exitClassInsides(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReFuggVisitor ) return ((ReFuggVisitor<? extends T>)visitor).visitClassInsides(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassInsidesContext classInsides() throws RecognitionException {
		ClassInsidesContext _localctx = new ClassInsidesContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_classInsides);
		try {
			setState(216);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CONST:
				enterOuterAlt(_localctx, 1);
				{
				setState(213);
				classConstructor();
				}
				break;
			case FIELD:
				enterOuterAlt(_localctx, 2);
				{
				setState(214);
				classField();
				}
				break;
			case METH:
				enterOuterAlt(_localctx, 3);
				{
				setState(215);
				method();
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
			setState(218);
			match(ISA);
			setState(219);
			identifier();
			setState(224);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__4) {
				{
				{
				setState(220);
				match(T__4);
				setState(221);
				identifier();
				}
				}
				setState(226);
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
			setState(227);
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
			setState(229);
			match(CONST);
			setState(230);
			identifier();
			setState(231);
			fParam();
			setState(232);
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
			setState(234);
			match(METH);
			setState(235);
			fHeader();
			setState(236);
			fParam();
			setState(237);
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
		public ComplexTypeContext complexType() {
			return getRuleContext(ComplexTypeContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TypemodifierContext typemodifier() {
			return getRuleContext(TypemodifierContext.class,0);
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
			setState(239);
			match(FIELD);
			setState(241);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==FINAL) {
				{
				setState(240);
				typemodifier();
				}
			}

			setState(243);
			complexType();
			setState(244);
			identifier();
			setState(245);
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
		enterRule(_localctx, 28, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(247);
			match(T__5);
			setState(251);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__5) | (1L << T__28) | (1L << T__29) | (1L << T__34) | (1L << T__37) | (1L << T__38) | (1L << T__39) | (1L << T__40) | (1L << T__41) | (1L << IF) | (1L << WHILE) | (1L << DO) | (1L << FOR) | (1L << CONTINUE))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (BREAK - 64)) | (1L << (GOTO - 64)) | (1L << (RETURN - 64)) | (1L << (LABEL - 64)) | (1L << (SWITCH - 64)) | (1L << (TRUE - 64)) | (1L << (FALSE - 64)) | (1L << (THIS - 64)) | (1L << (NULL - 64)) | (1L << (NEW - 64)) | (1L << (INT_LIT - 64)) | (1L << (DOUBLE_LIT - 64)) | (1L << (CHAR_LIT - 64)) | (1L << (STRING_LIT - 64)) | (1L << (ID - 64)))) != 0)) {
				{
				{
				setState(248);
				stmt();
				}
				}
				setState(253);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(254);
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
			setState(274);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(256);
				ifStmt();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(257);
				whileStmt();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(258);
				doWhileStmt();
				setState(259);
				match(T__7);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(261);
				forStmt();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(262);
				switchCase();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(263);
				label();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(264);
				block();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(265);
				varDec();
				setState(266);
				match(T__7);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(268);
				expression();
				setState(269);
				match(T__7);
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(271);
				jumpStmt();
				setState(272);
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
			setState(276);
			match(IF);
			setState(277);
			check();
			setState(278);
			stmt();
			setState(281);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				{
				setState(279);
				match(ELSE);
				setState(280);
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
			setState(283);
			match(WHILE);
			setState(284);
			check();
			setState(285);
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
			setState(287);
			match(DO);
			setState(288);
			block();
			setState(289);
			match(WHILE);
			setState(290);
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
			setState(292);
			match(FOR);
			setState(293);
			match(T__2);
			setState(296);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				{
				setState(294);
				varDec();
				}
				break;
			case 2:
				{
				setState(295);
				orExpression(0);
				}
				break;
			}
			setState(298);
			match(T__7);
			setState(300);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__5) | (1L << T__28) | (1L << T__29) | (1L << T__34))) != 0) || ((((_la - 71)) & ~0x3f) == 0 && ((1L << (_la - 71)) & ((1L << (TRUE - 71)) | (1L << (FALSE - 71)) | (1L << (THIS - 71)) | (1L << (NULL - 71)) | (1L << (NEW - 71)) | (1L << (INT_LIT - 71)) | (1L << (DOUBLE_LIT - 71)) | (1L << (CHAR_LIT - 71)) | (1L << (STRING_LIT - 71)) | (1L << (ID - 71)))) != 0)) {
				{
				setState(299);
				orExpression(0);
				}
			}

			setState(302);
			match(T__7);
			setState(304);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__5) | (1L << T__28) | (1L << T__29) | (1L << T__34))) != 0) || ((((_la - 71)) & ~0x3f) == 0 && ((1L << (_la - 71)) & ((1L << (TRUE - 71)) | (1L << (FALSE - 71)) | (1L << (THIS - 71)) | (1L << (NULL - 71)) | (1L << (NEW - 71)) | (1L << (INT_LIT - 71)) | (1L << (DOUBLE_LIT - 71)) | (1L << (CHAR_LIT - 71)) | (1L << (STRING_LIT - 71)) | (1L << (ID - 71)))) != 0)) {
				{
				setState(303);
				orExpression(0);
				}
			}

			setState(306);
			match(T__3);
			setState(307);
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
		public OrExpressionContext orExpression() {
			return getRuleContext(OrExpressionContext.class,0);
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
			setState(317);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BREAK:
				enterOuterAlt(_localctx, 1);
				{
				setState(309);
				match(BREAK);
				}
				break;
			case CONTINUE:
				enterOuterAlt(_localctx, 2);
				{
				setState(310);
				match(CONTINUE);
				}
				break;
			case GOTO:
				enterOuterAlt(_localctx, 3);
				{
				setState(311);
				match(GOTO);
				setState(312);
				identifier();
				}
				break;
			case RETURN:
				enterOuterAlt(_localctx, 4);
				{
				setState(313);
				match(RETURN);
				setState(315);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__5) | (1L << T__28) | (1L << T__29) | (1L << T__34))) != 0) || ((((_la - 71)) & ~0x3f) == 0 && ((1L << (_la - 71)) & ((1L << (TRUE - 71)) | (1L << (FALSE - 71)) | (1L << (THIS - 71)) | (1L << (NULL - 71)) | (1L << (NEW - 71)) | (1L << (INT_LIT - 71)) | (1L << (DOUBLE_LIT - 71)) | (1L << (CHAR_LIT - 71)) | (1L << (STRING_LIT - 71)) | (1L << (ID - 71)))) != 0)) {
					{
					setState(314);
					orExpression(0);
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
			setState(319);
			match(LABEL);
			setState(320);
			identifier();
			setState(321);
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
			setState(323);
			match(SWITCH);
			setState(324);
			check();
			setState(325);
			match(T__5);
			setState(327); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(326);
				caseBlock();
				}
				}
				setState(329); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==CASE || _la==DEFAULT );
			setState(331);
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
		public ConstantContext constant() {
			return getRuleContext(ConstantContext.class,0);
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
			setState(341);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CASE:
				enterOuterAlt(_localctx, 1);
				{
				setState(333);
				match(CASE);
				setState(334);
				constant();
				setState(335);
				match(T__8);
				setState(336);
				block();
				}
				break;
			case DEFAULT:
				enterOuterAlt(_localctx, 2);
				{
				setState(338);
				match(DEFAULT);
				setState(339);
				match(T__8);
				setState(340);
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
			setState(343);
			match(T__2);
			setState(344);
			orExpression(0);
			setState(345);
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
		public ComplexTypeContext complexType() {
			return getRuleContext(ComplexTypeContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public OrExpressionContext orExpression() {
			return getRuleContext(OrExpressionContext.class,0);
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
			setState(347);
			complexType();
			setState(348);
			identifier();
			setState(351);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__9) {
				{
				setState(349);
				match(T__9);
				setState(350);
				orExpression(0);
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
		public ComplexTypeContext complexType() {
			return getRuleContext(ComplexTypeContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TypemodifierContext typemodifier() {
			return getRuleContext(TypemodifierContext.class,0);
		}
		public ConstantContext constant() {
			return getRuleContext(ConstantContext.class,0);
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
			setState(353);
			match(GLOBAL);
			setState(355);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==FINAL) {
				{
				setState(354);
				typemodifier();
				}
			}

			setState(357);
			complexType();
			setState(358);
			identifier();
			setState(361);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__9) {
				{
				setState(359);
				match(T__9);
				setState(360);
				constant();
				}
			}

			setState(363);
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

	public static class SimpleArrayContext extends ParserRuleContext {
		public OrExpressionContext orExpression() {
			return getRuleContext(OrExpressionContext.class,0);
		}
		public SimpleArrayContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simpleArray; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReFuggListener ) ((ReFuggListener)listener).enterSimpleArray(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReFuggListener ) ((ReFuggListener)listener).exitSimpleArray(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReFuggVisitor ) return ((ReFuggVisitor<? extends T>)visitor).visitSimpleArray(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SimpleArrayContext simpleArray() throws RecognitionException {
		SimpleArrayContext _localctx = new SimpleArrayContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_simpleArray);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(365);
			match(T__0);
			setState(367);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__5) | (1L << T__28) | (1L << T__29) | (1L << T__34))) != 0) || ((((_la - 71)) & ~0x3f) == 0 && ((1L << (_la - 71)) & ((1L << (TRUE - 71)) | (1L << (FALSE - 71)) | (1L << (THIS - 71)) | (1L << (NULL - 71)) | (1L << (NEW - 71)) | (1L << (INT_LIT - 71)) | (1L << (DOUBLE_LIT - 71)) | (1L << (CHAR_LIT - 71)) | (1L << (STRING_LIT - 71)) | (1L << (ID - 71)))) != 0)) {
				{
				setState(366);
				orExpression(0);
				}
			}

			setState(369);
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

	public static class ArrayAccessContext extends ParserRuleContext {
		public OrExpressionContext orExpression() {
			return getRuleContext(OrExpressionContext.class,0);
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
		enterRule(_localctx, 56, RULE_arrayAccess);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(371);
			match(T__0);
			setState(372);
			orExpression(0);
			setState(373);
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

	public static class SimpleCallContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public FArgsContext fArgs() {
			return getRuleContext(FArgsContext.class,0);
		}
		public SimpleCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simpleCall; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReFuggListener ) ((ReFuggListener)listener).enterSimpleCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReFuggListener ) ((ReFuggListener)listener).exitSimpleCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReFuggVisitor ) return ((ReFuggVisitor<? extends T>)visitor).visitSimpleCall(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SimpleCallContext simpleCall() throws RecognitionException {
		SimpleCallContext _localctx = new SimpleCallContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_simpleCall);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(375);
			identifier();
			setState(376);
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
		public List<CallTailContext> callTail() {
			return getRuleContexts(CallTailContext.class);
		}
		public CallTailContext callTail(int i) {
			return getRuleContext(CallTailContext.class,i);
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
		enterRule(_localctx, 60, RULE_newObject);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(378);
			match(NEW);
			setState(379);
			identifier();
			setState(380);
			fArgs();
			setState(384);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(381);
					arrayAccess();
					}
					} 
				}
				setState(386);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
			}
			setState(390);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,26,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(387);
					callTail();
					}
					} 
				}
				setState(392);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,26,_ctx);
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
		public List<CallTailContext> callTail() {
			return getRuleContexts(CallTailContext.class);
		}
		public CallTailContext callTail(int i) {
			return getRuleContext(CallTailContext.class,i);
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
		enterRule(_localctx, 62, RULE_fCall);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(393);
			identifier();
			setState(394);
			fArgs();
			setState(398);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,27,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(395);
					arrayAccess();
					}
					} 
				}
				setState(400);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,27,_ctx);
			}
			setState(404);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(401);
					callTail();
					}
					} 
				}
				setState(406);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
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
		public List<CallTailContext> callTail() {
			return getRuleContexts(CallTailContext.class);
		}
		public CallTailContext callTail(int i) {
			return getRuleContext(CallTailContext.class,i);
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
		enterRule(_localctx, 64, RULE_thisAcces);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(407);
			match(THIS);
			setState(411);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(408);
					callTail();
					}
					} 
				}
				setState(413);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
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
		public List<CallTailContext> callTail() {
			return getRuleContexts(CallTailContext.class);
		}
		public CallTailContext callTail(int i) {
			return getRuleContext(CallTailContext.class,i);
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
		enterRule(_localctx, 66, RULE_varAcces);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(414);
			identifier();
			setState(418);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,30,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(415);
					arrayAccess();
					}
					} 
				}
				setState(420);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,30,_ctx);
			}
			setState(424);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,31,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(421);
					callTail();
					}
					} 
				}
				setState(426);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,31,_ctx);
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

	public static class CallTailContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public SimpleCallContext simpleCall() {
			return getRuleContext(SimpleCallContext.class,0);
		}
		public List<ArrayAccessContext> arrayAccess() {
			return getRuleContexts(ArrayAccessContext.class);
		}
		public ArrayAccessContext arrayAccess(int i) {
			return getRuleContext(ArrayAccessContext.class,i);
		}
		public CallTailContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_callTail; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReFuggListener ) ((ReFuggListener)listener).enterCallTail(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReFuggListener ) ((ReFuggListener)listener).exitCallTail(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReFuggVisitor ) return ((ReFuggVisitor<? extends T>)visitor).visitCallTail(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CallTailContext callTail() throws RecognitionException {
		CallTailContext _localctx = new CallTailContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_callTail);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(427);
			match(T__10);
			setState(430);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
			case 1:
				{
				setState(428);
				identifier();
				}
				break;
			case 2:
				{
				setState(429);
				simpleCall();
				}
				break;
			}
			setState(435);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,33,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(432);
					arrayAccess();
					}
					} 
				}
				setState(437);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,33,_ctx);
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
		enterRule(_localctx, 70, RULE_lh_expression);
		try {
			setState(440);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case THIS:
				enterOuterAlt(_localctx, 1);
				{
				setState(438);
				thisAcces();
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(439);
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
		enterRule(_localctx, 72, RULE_expression);
		try {
			setState(447);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,35,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(442);
				lh_expression();
				setState(443);
				assignOP();
				setState(444);
				expression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(446);
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
		int _startState = 74;
		enterRecursionRule(_localctx, 74, RULE_orExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(450);
			andExpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(458);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,36,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new OrExpressionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_orExpression);
					setState(452);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(453);
					orOP();
					setState(454);
					andExpression(0);
					}
					} 
				}
				setState(460);
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
		int _startState = 76;
		enterRecursionRule(_localctx, 76, RULE_andExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(462);
			equalityExpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(470);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,37,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new AndExpressionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_andExpression);
					setState(464);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(465);
					andOP();
					setState(466);
					equalityExpression(0);
					}
					} 
				}
				setState(472);
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
		int _startState = 78;
		enterRecursionRule(_localctx, 78, RULE_equalityExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(474);
			relationalExpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(482);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,38,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new EqualityExpressionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_equalityExpression);
					setState(476);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(477);
					eqOP();
					setState(478);
					relationalExpression(0);
					}
					} 
				}
				setState(484);
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
		int _startState = 80;
		enterRecursionRule(_localctx, 80, RULE_relationalExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(486);
			additiveExpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(494);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,39,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new RelationalExpressionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_relationalExpression);
					setState(488);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(489);
					relOP();
					setState(490);
					additiveExpression(0);
					}
					} 
				}
				setState(496);
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
		int _startState = 82;
		enterRecursionRule(_localctx, 82, RULE_additiveExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(498);
			multiplicativeExpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(506);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,40,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new AdditiveExpressionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_additiveExpression);
					setState(500);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(501);
					addOP();
					setState(502);
					multiplicativeExpression(0);
					}
					} 
				}
				setState(508);
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
		int _startState = 84;
		enterRecursionRule(_localctx, 84, RULE_multiplicativeExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(510);
			exponentiationExpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(518);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,41,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new MultiplicativeExpressionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_multiplicativeExpression);
					setState(512);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(513);
					multOP();
					setState(514);
					exponentiationExpression(0);
					}
					} 
				}
				setState(520);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,41,_ctx);
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
		int _startState = 86;
		enterRecursionRule(_localctx, 86, RULE_exponentiationExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(522);
			unaryExpression();
			}
			_ctx.stop = _input.LT(-1);
			setState(530);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,42,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ExponentiationExpressionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_exponentiationExpression);
					setState(524);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(525);
					expOP();
					setState(526);
					unaryExpression();
					}
					} 
				}
				setState(532);
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
		enterRule(_localctx, 88, RULE_unaryExpression);
		try {
			setState(537);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__28:
			case T__29:
			case T__34:
				enterOuterAlt(_localctx, 1);
				{
				setState(533);
				preOP();
				setState(534);
				unaryExpression();
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
				setState(536);
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
		enterRule(_localctx, 90, RULE_postExpression);
		try {
			setState(543);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,44,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(539);
				primary();
				setState(540);
				postOP();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(542);
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
		public ListContext list() {
			return getRuleContext(ListContext.class,0);
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
		enterRule(_localctx, 92, RULE_primary);
		try {
			setState(555);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,45,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(545);
				match(T__2);
				setState(546);
				orExpression(0);
				setState(547);
				match(T__3);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(549);
				newObject();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(550);
				fCall();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(551);
				varAcces();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(552);
				thisAcces();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(553);
				list();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(554);
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
		enterRule(_localctx, 94, RULE_list);
		int _la;
		try {
			setState(571);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,47,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(557);
				match(T__5);
				setState(558);
				expressionMany();
				setState(559);
				match(T__6);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(561);
				match(T__5);
				setState(562);
				subList();
				setState(565); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(563);
					match(T__4);
					setState(564);
					subList();
					}
					}
					setState(567); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==T__4 );
				setState(569);
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
		enterRule(_localctx, 96, RULE_subList);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(573);
			match(T__5);
			setState(574);
			expressionMany();
			setState(575);
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
		enterRule(_localctx, 98, RULE_expressionMany);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(577);
			orExpression(0);
			setState(582);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__4) {
				{
				{
				setState(578);
				match(T__4);
				setState(579);
				orExpression(0);
				}
				}
				setState(584);
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
		enterRule(_localctx, 100, RULE_fArgs);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(585);
			match(T__2);
			setState(587);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__5) | (1L << T__28) | (1L << T__29) | (1L << T__34))) != 0) || ((((_la - 71)) & ~0x3f) == 0 && ((1L << (_la - 71)) & ((1L << (TRUE - 71)) | (1L << (FALSE - 71)) | (1L << (THIS - 71)) | (1L << (NULL - 71)) | (1L << (NEW - 71)) | (1L << (INT_LIT - 71)) | (1L << (DOUBLE_LIT - 71)) | (1L << (CHAR_LIT - 71)) | (1L << (STRING_LIT - 71)) | (1L << (ID - 71)))) != 0)) {
				{
				setState(586);
				expressionMany();
				}
			}

			setState(589);
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
		public ComplexTypeContext complexType() {
			return getRuleContext(ComplexTypeContext.class,0);
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
		enterRule(_localctx, 102, RULE_returntype);
		try {
			setState(593);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VOID:
				enterOuterAlt(_localctx, 1);
				{
				setState(591);
				match(VOID);
				}
				break;
			case T__37:
			case T__38:
			case T__39:
			case T__40:
			case T__41:
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(592);
				complexType();
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
		enterRule(_localctx, 104, RULE_assignOP);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(595);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__9) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15))) != 0)) ) {
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
		enterRule(_localctx, 106, RULE_orOP);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(597);
			_la = _input.LA(1);
			if ( !(_la==T__16 || _la==T__17) ) {
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
		enterRule(_localctx, 108, RULE_andOP);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(599);
			_la = _input.LA(1);
			if ( !(_la==T__18 || _la==T__19) ) {
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
		enterRule(_localctx, 110, RULE_eqOP);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(601);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__23))) != 0)) ) {
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
		enterRule(_localctx, 112, RULE_relOP);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(603);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__24) | (1L << T__25) | (1L << T__26) | (1L << T__27))) != 0)) ) {
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
		enterRule(_localctx, 114, RULE_addOP);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(605);
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
		enterRule(_localctx, 116, RULE_multOP);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(607);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__30) | (1L << T__31) | (1L << T__32))) != 0)) ) {
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
		enterRule(_localctx, 118, RULE_expOP);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(609);
			match(T__33);
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
		enterRule(_localctx, 120, RULE_preOP);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(611);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__28) | (1L << T__29) | (1L << T__34))) != 0)) ) {
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
		enterRule(_localctx, 122, RULE_postOP);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(613);
			_la = _input.LA(1);
			if ( !(_la==T__35 || _la==T__36) ) {
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
		enterRule(_localctx, 124, RULE_constant);
		try {
			setState(621);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DOUBLE_LIT:
				enterOuterAlt(_localctx, 1);
				{
				setState(615);
				doubleRule();
				}
				break;
			case INT_LIT:
				enterOuterAlt(_localctx, 2);
				{
				setState(616);
				intRule();
				}
				break;
			case STRING_LIT:
				enterOuterAlt(_localctx, 3);
				{
				setState(617);
				stringRule();
				}
				break;
			case CHAR_LIT:
				enterOuterAlt(_localctx, 4);
				{
				setState(618);
				charRule();
				}
				break;
			case TRUE:
			case FALSE:
				enterOuterAlt(_localctx, 5);
				{
				setState(619);
				booleanRule();
				}
				break;
			case THIS:
			case NULL:
				enterOuterAlt(_localctx, 6);
				{
				setState(620);
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

	public static class ComplexTypeContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public List<SimpleArrayContext> simpleArray() {
			return getRuleContexts(SimpleArrayContext.class);
		}
		public SimpleArrayContext simpleArray(int i) {
			return getRuleContext(SimpleArrayContext.class,i);
		}
		public ComplexTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_complexType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReFuggListener ) ((ReFuggListener)listener).enterComplexType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReFuggListener ) ((ReFuggListener)listener).exitComplexType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReFuggVisitor ) return ((ReFuggVisitor<? extends T>)visitor).visitComplexType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComplexTypeContext complexType() throws RecognitionException {
		ComplexTypeContext _localctx = new ComplexTypeContext(_ctx, getState());
		enterRule(_localctx, 126, RULE_complexType);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(623);
			type();
			setState(627);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,52,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(624);
					simpleArray();
					}
					} 
				}
				setState(629);
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
			setState(636);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__37:
				enterOuterAlt(_localctx, 1);
				{
				setState(630);
				match(T__37);
				}
				break;
			case T__38:
				enterOuterAlt(_localctx, 2);
				{
				setState(631);
				match(T__38);
				}
				break;
			case T__39:
				enterOuterAlt(_localctx, 3);
				{
				setState(632);
				match(T__39);
				}
				break;
			case T__40:
				enterOuterAlt(_localctx, 4);
				{
				setState(633);
				match(T__40);
				}
				break;
			case T__41:
				enterOuterAlt(_localctx, 5);
				{
				setState(634);
				match(T__41);
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 6);
				{
				setState(635);
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
			setState(638);
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
		enterRule(_localctx, 132, RULE_typemodifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(640);
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
		enterRule(_localctx, 134, RULE_doubleRule);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(642);
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
		enterRule(_localctx, 136, RULE_intRule);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(644);
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
		enterRule(_localctx, 138, RULE_stringRule);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(646);
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
		enterRule(_localctx, 140, RULE_charRule);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(648);
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
		enterRule(_localctx, 142, RULE_booleanRule);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(650);
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
		public TerminalNode THIS() { return getToken(ReFuggParser.THIS, 0); }
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
		enterRule(_localctx, 144, RULE_refRule);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(652);
			_la = _input.LA(1);
			if ( !(_la==THIS || _la==NULL) ) {
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
		case 37:
			return orExpression_sempred((OrExpressionContext)_localctx, predIndex);
		case 38:
			return andExpression_sempred((AndExpressionContext)_localctx, predIndex);
		case 39:
			return equalityExpression_sempred((EqualityExpressionContext)_localctx, predIndex);
		case 40:
			return relationalExpression_sempred((RelationalExpressionContext)_localctx, predIndex);
		case 41:
			return additiveExpression_sempred((AdditiveExpressionContext)_localctx, predIndex);
		case 42:
			return multiplicativeExpression_sempred((MultiplicativeExpressionContext)_localctx, predIndex);
		case 43:
			return exponentiationExpression_sempred((ExponentiationExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean orExpression_sempred(OrExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean andExpression_sempred(AndExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean equalityExpression_sempred(EqualityExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean relationalExpression_sempred(RelationalExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 3:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean additiveExpression_sempred(AdditiveExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 4:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean multiplicativeExpression_sempred(MultiplicativeExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 5:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean exponentiationExpression_sempred(ExponentiationExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 6:
			return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3U\u0291\4\2\t\2\4"+
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
		"\u00af\13\5\3\5\3\5\3\6\3\6\5\6\u00b5\n\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7"+
		"\3\7\7\7\u00bf\n\7\f\7\16\7\u00c2\13\7\3\b\3\b\3\b\5\b\u00c7\n\b\3\b\3"+
		"\b\7\b\u00cb\n\b\f\b\16\b\u00ce\13\b\3\b\3\b\3\t\3\t\6\t\u00d4\n\t\r\t"+
		"\16\t\u00d5\3\n\3\n\3\n\5\n\u00db\n\n\3\13\3\13\3\13\3\13\7\13\u00e1\n"+
		"\13\f\13\16\13\u00e4\13\13\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16"+
		"\3\16\3\16\3\17\3\17\5\17\u00f4\n\17\3\17\3\17\3\17\3\17\3\20\3\20\7\20"+
		"\u00fc\n\20\f\20\16\20\u00ff\13\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\5\21"+
		"\u0115\n\21\3\22\3\22\3\22\3\22\3\22\5\22\u011c\n\22\3\23\3\23\3\23\3"+
		"\23\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\5\25\u012b\n\25\3\25"+
		"\3\25\5\25\u012f\n\25\3\25\3\25\5\25\u0133\n\25\3\25\3\25\3\25\3\26\3"+
		"\26\3\26\3\26\3\26\3\26\5\26\u013e\n\26\5\26\u0140\n\26\3\27\3\27\3\27"+
		"\3\27\3\30\3\30\3\30\3\30\6\30\u014a\n\30\r\30\16\30\u014b\3\30\3\30\3"+
		"\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\5\31\u0158\n\31\3\32\3\32\3\32"+
		"\3\32\3\33\3\33\3\33\3\33\5\33\u0162\n\33\3\34\3\34\5\34\u0166\n\34\3"+
		"\34\3\34\3\34\3\34\5\34\u016c\n\34\3\34\3\34\3\35\3\35\5\35\u0172\n\35"+
		"\3\35\3\35\3\36\3\36\3\36\3\36\3\37\3\37\3\37\3 \3 \3 \3 \7 \u0181\n "+
		"\f \16 \u0184\13 \3 \7 \u0187\n \f \16 \u018a\13 \3!\3!\3!\7!\u018f\n"+
		"!\f!\16!\u0192\13!\3!\7!\u0195\n!\f!\16!\u0198\13!\3\"\3\"\7\"\u019c\n"+
		"\"\f\"\16\"\u019f\13\"\3#\3#\7#\u01a3\n#\f#\16#\u01a6\13#\3#\7#\u01a9"+
		"\n#\f#\16#\u01ac\13#\3$\3$\3$\5$\u01b1\n$\3$\7$\u01b4\n$\f$\16$\u01b7"+
		"\13$\3%\3%\5%\u01bb\n%\3&\3&\3&\3&\3&\5&\u01c2\n&\3\'\3\'\3\'\3\'\3\'"+
		"\3\'\3\'\7\'\u01cb\n\'\f\'\16\'\u01ce\13\'\3(\3(\3(\3(\3(\3(\3(\7(\u01d7"+
		"\n(\f(\16(\u01da\13(\3)\3)\3)\3)\3)\3)\3)\7)\u01e3\n)\f)\16)\u01e6\13"+
		")\3*\3*\3*\3*\3*\3*\3*\7*\u01ef\n*\f*\16*\u01f2\13*\3+\3+\3+\3+\3+\3+"+
		"\3+\7+\u01fb\n+\f+\16+\u01fe\13+\3,\3,\3,\3,\3,\3,\3,\7,\u0207\n,\f,\16"+
		",\u020a\13,\3-\3-\3-\3-\3-\3-\3-\7-\u0213\n-\f-\16-\u0216\13-\3.\3.\3"+
		".\3.\5.\u021c\n.\3/\3/\3/\3/\5/\u0222\n/\3\60\3\60\3\60\3\60\3\60\3\60"+
		"\3\60\3\60\3\60\3\60\5\60\u022e\n\60\3\61\3\61\3\61\3\61\3\61\3\61\3\61"+
		"\3\61\6\61\u0238\n\61\r\61\16\61\u0239\3\61\3\61\5\61\u023e\n\61\3\62"+
		"\3\62\3\62\3\62\3\63\3\63\3\63\7\63\u0247\n\63\f\63\16\63\u024a\13\63"+
		"\3\64\3\64\5\64\u024e\n\64\3\64\3\64\3\65\3\65\5\65\u0254\n\65\3\66\3"+
		"\66\3\67\3\67\38\38\39\39\3:\3:\3;\3;\3<\3<\3=\3=\3>\3>\3?\3?\3@\3@\3"+
		"@\3@\3@\3@\5@\u0270\n@\3A\3A\7A\u0274\nA\fA\16A\u0277\13A\3B\3B\3B\3B"+
		"\3B\3B\5B\u027f\nB\3C\3C\3D\3D\3E\3E\3F\3F\3G\3G\3H\3H\3I\3I\3J\3J\3J"+
		"\2\tLNPRTVXK\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64"+
		"\668:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprtvxz|~\u0080\u0082\u0084\u0086\u0088"+
		"\u008a\u008c\u008e\u0090\u0092\2\16\3\2\679\4\2\f\f\16\22\3\2\23\24\3"+
		"\2\25\26\3\2\27\32\3\2\33\36\3\2\37 \3\2!#\4\2\37 %%\3\2&\'\3\2IJ\3\2"+
		"KL\2\u0298\2\u009a\3\2\2\2\4\u00a0\3\2\2\2\6\u00a3\3\2\2\2\b\u00a8\3\2"+
		"\2\2\n\u00b2\3\2\2\2\f\u00b8\3\2\2\2\16\u00c3\3\2\2\2\20\u00d1\3\2\2\2"+
		"\22\u00da\3\2\2\2\24\u00dc\3\2\2\2\26\u00e5\3\2\2\2\30\u00e7\3\2\2\2\32"+
		"\u00ec\3\2\2\2\34\u00f1\3\2\2\2\36\u00f9\3\2\2\2 \u0114\3\2\2\2\"\u0116"+
		"\3\2\2\2$\u011d\3\2\2\2&\u0121\3\2\2\2(\u0126\3\2\2\2*\u013f\3\2\2\2,"+
		"\u0141\3\2\2\2.\u0145\3\2\2\2\60\u0157\3\2\2\2\62\u0159\3\2\2\2\64\u015d"+
		"\3\2\2\2\66\u0163\3\2\2\28\u016f\3\2\2\2:\u0175\3\2\2\2<\u0179\3\2\2\2"+
		">\u017c\3\2\2\2@\u018b\3\2\2\2B\u0199\3\2\2\2D\u01a0\3\2\2\2F\u01ad\3"+
		"\2\2\2H\u01ba\3\2\2\2J\u01c1\3\2\2\2L\u01c3\3\2\2\2N\u01cf\3\2\2\2P\u01db"+
		"\3\2\2\2R\u01e7\3\2\2\2T\u01f3\3\2\2\2V\u01ff\3\2\2\2X\u020b\3\2\2\2Z"+
		"\u021b\3\2\2\2\\\u0221\3\2\2\2^\u022d\3\2\2\2`\u023d\3\2\2\2b\u023f\3"+
		"\2\2\2d\u0243\3\2\2\2f\u024b\3\2\2\2h\u0253\3\2\2\2j\u0255\3\2\2\2l\u0257"+
		"\3\2\2\2n\u0259\3\2\2\2p\u025b\3\2\2\2r\u025d\3\2\2\2t\u025f\3\2\2\2v"+
		"\u0261\3\2\2\2x\u0263\3\2\2\2z\u0265\3\2\2\2|\u0267\3\2\2\2~\u026f\3\2"+
		"\2\2\u0080\u0271\3\2\2\2\u0082\u027e\3\2\2\2\u0084\u0280\3\2\2\2\u0086"+
		"\u0282\3\2\2\2\u0088\u0284\3\2\2\2\u008a\u0286\3\2\2\2\u008c\u0288\3\2"+
		"\2\2\u008e\u028a\3\2\2\2\u0090\u028c\3\2\2\2\u0092\u028e\3\2\2\2\u0094"+
		"\u0099\5\6\4\2\u0095\u0099\5\16\b\2\u0096\u0099\5\66\34\2\u0097\u0099"+
		"\5,\27\2\u0098\u0094\3\2\2\2\u0098\u0095\3\2\2\2\u0098\u0096\3\2\2\2\u0098"+
		"\u0097\3\2\2\2\u0099\u009c\3\2\2\2\u009a\u0098\3\2\2\2\u009a\u009b\3\2"+
		"\2\2\u009b\u009d\3\2\2\2\u009c\u009a\3\2\2\2\u009d\u009e\5\4\3\2\u009e"+
		"\u009f\7\2\2\3\u009f\3\3\2\2\2\u00a0\u00a1\7-\2\2\u00a1\u00a2\5\36\20"+
		"\2\u00a2\5\3\2\2\2\u00a3\u00a4\7.\2\2\u00a4\u00a5\5\b\5\2\u00a5\u00a6"+
		"\5\n\6\2\u00a6\u00a7\5\36\20\2\u00a7\7\3\2\2\2\u00a8\u00ad\5h\65\2\u00a9"+
		"\u00aa\7\3\2\2\u00aa\u00ac\7\4\2\2\u00ab\u00a9\3\2\2\2\u00ac\u00af\3\2"+
		"\2\2\u00ad\u00ab\3\2\2\2\u00ad\u00ae\3\2\2\2\u00ae\u00b0\3\2\2\2\u00af"+
		"\u00ad\3\2\2\2\u00b0\u00b1\5\u0084C\2\u00b1\t\3\2\2\2\u00b2\u00b4\7\5"+
		"\2\2\u00b3\u00b5\5\f\7\2\u00b4\u00b3\3\2\2\2\u00b4\u00b5\3\2\2\2\u00b5"+
		"\u00b6\3\2\2\2\u00b6\u00b7\7\6\2\2\u00b7\13\3\2\2\2\u00b8\u00b9\5\u0080"+
		"A\2\u00b9\u00c0\5\u0084C\2\u00ba\u00bb\7\7\2\2\u00bb\u00bc\5\u0080A\2"+
		"\u00bc\u00bd\5\u0084C\2\u00bd\u00bf\3\2\2\2\u00be\u00ba\3\2\2\2\u00bf"+
		"\u00c2\3\2\2\2\u00c0\u00be\3\2\2\2\u00c0\u00c1\3\2\2\2\u00c1\r\3\2\2\2"+
		"\u00c2\u00c0\3\2\2\2\u00c3\u00c4\7/\2\2\u00c4\u00c6\5\u0084C\2\u00c5\u00c7"+
		"\5\24\13\2\u00c6\u00c5\3\2\2\2\u00c6\u00c7\3\2\2\2\u00c7\u00c8\3\2\2\2"+
		"\u00c8\u00cc\7\b\2\2\u00c9\u00cb\5\20\t\2\u00ca\u00c9\3\2\2\2\u00cb\u00ce"+
		"\3\2\2\2\u00cc\u00ca\3\2\2\2\u00cc\u00cd\3\2\2\2\u00cd\u00cf\3\2\2\2\u00ce"+
		"\u00cc\3\2\2\2\u00cf\u00d0\7\t\2\2\u00d0\17\3\2\2\2\u00d1\u00d3\5\26\f"+
		"\2\u00d2\u00d4\5\22\n\2\u00d3\u00d2\3\2\2\2\u00d4\u00d5\3\2\2\2\u00d5"+
		"\u00d3\3\2\2\2\u00d5\u00d6\3\2\2\2\u00d6\21\3\2\2\2\u00d7\u00db\5\30\r"+
		"\2\u00d8\u00db\5\34\17\2\u00d9\u00db\5\32\16\2\u00da\u00d7\3\2\2\2\u00da"+
		"\u00d8\3\2\2\2\u00da\u00d9\3\2\2\2\u00db\23\3\2\2\2\u00dc\u00dd\7\66\2"+
		"\2\u00dd\u00e2\5\u0084C\2\u00de\u00df\7\7\2\2\u00df\u00e1\5\u0084C\2\u00e0"+
		"\u00de\3\2\2\2\u00e1\u00e4\3\2\2\2\u00e2\u00e0\3\2\2\2\u00e2\u00e3\3\2"+
		"\2\2\u00e3\25\3\2\2\2\u00e4\u00e2\3\2\2\2\u00e5\u00e6\t\2\2\2\u00e6\27"+
		"\3\2\2\2\u00e7\u00e8\7\65\2\2\u00e8\u00e9\5\u0084C\2\u00e9\u00ea\5\n\6"+
		"\2\u00ea\u00eb\5\36\20\2\u00eb\31\3\2\2\2\u00ec\u00ed\7\64\2\2\u00ed\u00ee"+
		"\5\b\5\2\u00ee\u00ef\5\n\6\2\u00ef\u00f0\5\36\20\2\u00f0\33\3\2\2\2\u00f1"+
		"\u00f3\7\61\2\2\u00f2\u00f4\5\u0086D\2\u00f3\u00f2\3\2\2\2\u00f3\u00f4"+
		"\3\2\2\2\u00f4\u00f5\3\2\2\2\u00f5\u00f6\5\u0080A\2\u00f6\u00f7\5\u0084"+
		"C\2\u00f7\u00f8\7\n\2\2\u00f8\35\3\2\2\2\u00f9\u00fd\7\b\2\2\u00fa\u00fc"+
		"\5 \21\2\u00fb\u00fa\3\2\2\2\u00fc\u00ff\3\2\2\2\u00fd\u00fb\3\2\2\2\u00fd"+
		"\u00fe\3\2\2\2\u00fe\u0100\3\2\2\2\u00ff\u00fd\3\2\2\2\u0100\u0101\7\t"+
		"\2\2\u0101\37\3\2\2\2\u0102\u0115\5\"\22\2\u0103\u0115\5$\23\2\u0104\u0105"+
		"\5&\24\2\u0105\u0106\7\n\2\2\u0106\u0115\3\2\2\2\u0107\u0115\5(\25\2\u0108"+
		"\u0115\5.\30\2\u0109\u0115\5,\27\2\u010a\u0115\5\36\20\2\u010b\u010c\5"+
		"\64\33\2\u010c\u010d\7\n\2\2\u010d\u0115\3\2\2\2\u010e\u010f\5J&\2\u010f"+
		"\u0110\7\n\2\2\u0110\u0115\3\2\2\2\u0111\u0112\5*\26\2\u0112\u0113\7\n"+
		"\2\2\u0113\u0115\3\2\2\2\u0114\u0102\3\2\2\2\u0114\u0103\3\2\2\2\u0114"+
		"\u0104\3\2\2\2\u0114\u0107\3\2\2\2\u0114\u0108\3\2\2\2\u0114\u0109\3\2"+
		"\2\2\u0114\u010a\3\2\2\2\u0114\u010b\3\2\2\2\u0114\u010e\3\2\2\2\u0114"+
		"\u0111\3\2\2\2\u0115!\3\2\2\2\u0116\u0117\7<\2\2\u0117\u0118\5\62\32\2"+
		"\u0118\u011b\5 \21\2\u0119\u011a\7=\2\2\u011a\u011c\5 \21\2\u011b\u0119"+
		"\3\2\2\2\u011b\u011c\3\2\2\2\u011c#\3\2\2\2\u011d\u011e\7>\2\2\u011e\u011f"+
		"\5\62\32\2\u011f\u0120\5\36\20\2\u0120%\3\2\2\2\u0121\u0122\7?\2\2\u0122"+
		"\u0123\5\36\20\2\u0123\u0124\7>\2\2\u0124\u0125\5\62\32\2\u0125\'\3\2"+
		"\2\2\u0126\u0127\7@\2\2\u0127\u012a\7\5\2\2\u0128\u012b\5\64\33\2\u0129"+
		"\u012b\5L\'\2\u012a\u0128\3\2\2\2\u012a\u0129\3\2\2\2\u012a\u012b\3\2"+
		"\2\2\u012b\u012c\3\2\2\2\u012c\u012e\7\n\2\2\u012d\u012f\5L\'\2\u012e"+
		"\u012d\3\2\2\2\u012e\u012f\3\2\2\2\u012f\u0130\3\2\2\2\u0130\u0132\7\n"+
		"\2\2\u0131\u0133\5L\'\2\u0132\u0131\3\2\2\2\u0132\u0133\3\2\2\2\u0133"+
		"\u0134\3\2\2\2\u0134\u0135\7\6\2\2\u0135\u0136\5\36\20\2\u0136)\3\2\2"+
		"\2\u0137\u0140\7B\2\2\u0138\u0140\7A\2\2\u0139\u013a\7C\2\2\u013a\u0140"+
		"\5\u0084C\2\u013b\u013d\7D\2\2\u013c\u013e\5L\'\2\u013d\u013c\3\2\2\2"+
		"\u013d\u013e\3\2\2\2\u013e\u0140\3\2\2\2\u013f\u0137\3\2\2\2\u013f\u0138"+
		"\3\2\2\2\u013f\u0139\3\2\2\2\u013f\u013b\3\2\2\2\u0140+\3\2\2\2\u0141"+
		"\u0142\7E\2\2\u0142\u0143\5\u0084C\2\u0143\u0144\5\36\20\2\u0144-\3\2"+
		"\2\2\u0145\u0146\7F\2\2\u0146\u0147\5\62\32\2\u0147\u0149\7\b\2\2\u0148"+
		"\u014a\5\60\31\2\u0149\u0148\3\2\2\2\u014a\u014b\3\2\2\2\u014b\u0149\3"+
		"\2\2\2\u014b\u014c\3\2\2\2\u014c\u014d\3\2\2\2\u014d\u014e\7\t\2\2\u014e"+
		"/\3\2\2\2\u014f\u0150\7G\2\2\u0150\u0151\5~@\2\u0151\u0152\7\13\2\2\u0152"+
		"\u0153\5\36\20\2\u0153\u0158\3\2\2\2\u0154\u0155\7H\2\2\u0155\u0156\7"+
		"\13\2\2\u0156\u0158\5\36\20\2\u0157\u014f\3\2\2\2\u0157\u0154\3\2\2\2"+
		"\u0158\61\3\2\2\2\u0159\u015a\7\5\2\2\u015a\u015b\5L\'\2\u015b\u015c\7"+
		"\6\2\2\u015c\63\3\2\2\2\u015d\u015e\5\u0080A\2\u015e\u0161\5\u0084C\2"+
		"\u015f\u0160\7\f\2\2\u0160\u0162\5L\'\2\u0161\u015f\3\2\2\2\u0161\u0162"+
		"\3\2\2\2\u0162\65\3\2\2\2\u0163\u0165\7\63\2\2\u0164\u0166\5\u0086D\2"+
		"\u0165\u0164\3\2\2\2\u0165\u0166\3\2\2\2\u0166\u0167\3\2\2\2\u0167\u0168"+
		"\5\u0080A\2\u0168\u016b\5\u0084C\2\u0169\u016a\7\f\2\2\u016a\u016c\5~"+
		"@\2\u016b\u0169\3\2\2\2\u016b\u016c\3\2\2\2\u016c\u016d\3\2\2\2\u016d"+
		"\u016e\7\n\2\2\u016e\67\3\2\2\2\u016f\u0171\7\3\2\2\u0170\u0172\5L\'\2"+
		"\u0171\u0170\3\2\2\2\u0171\u0172\3\2\2\2\u0172\u0173\3\2\2\2\u0173\u0174"+
		"\7\4\2\2\u01749\3\2\2\2\u0175\u0176\7\3\2\2\u0176\u0177\5L\'\2\u0177\u0178"+
		"\7\4\2\2\u0178;\3\2\2\2\u0179\u017a\5\u0084C\2\u017a\u017b\5f\64\2\u017b"+
		"=\3\2\2\2\u017c\u017d\7M\2\2\u017d\u017e\5\u0084C\2\u017e\u0182\5f\64"+
		"\2\u017f\u0181\5:\36\2\u0180\u017f\3\2\2\2\u0181\u0184\3\2\2\2\u0182\u0180"+
		"\3\2\2\2\u0182\u0183\3\2\2\2\u0183\u0188\3\2\2\2\u0184\u0182\3\2\2\2\u0185"+
		"\u0187\5F$\2\u0186\u0185\3\2\2\2\u0187\u018a\3\2\2\2\u0188\u0186\3\2\2"+
		"\2\u0188\u0189\3\2\2\2\u0189?\3\2\2\2\u018a\u0188\3\2\2\2\u018b\u018c"+
		"\5\u0084C\2\u018c\u0190\5f\64\2\u018d\u018f\5:\36\2\u018e\u018d\3\2\2"+
		"\2\u018f\u0192\3\2\2\2\u0190\u018e\3\2\2\2\u0190\u0191\3\2\2\2\u0191\u0196"+
		"\3\2\2\2\u0192\u0190\3\2\2\2\u0193\u0195\5F$\2\u0194\u0193\3\2\2\2\u0195"+
		"\u0198\3\2\2\2\u0196\u0194\3\2\2\2\u0196\u0197\3\2\2\2\u0197A\3\2\2\2"+
		"\u0198\u0196\3\2\2\2\u0199\u019d\7K\2\2\u019a\u019c\5F$\2\u019b\u019a"+
		"\3\2\2\2\u019c\u019f\3\2\2\2\u019d\u019b\3\2\2\2\u019d\u019e\3\2\2\2\u019e"+
		"C\3\2\2\2\u019f\u019d\3\2\2\2\u01a0\u01a4\5\u0084C\2\u01a1\u01a3\5:\36"+
		"\2\u01a2\u01a1\3\2\2\2\u01a3\u01a6\3\2\2\2\u01a4\u01a2\3\2\2\2\u01a4\u01a5"+
		"\3\2\2\2\u01a5\u01aa\3\2\2\2\u01a6\u01a4\3\2\2\2\u01a7\u01a9\5F$\2\u01a8"+
		"\u01a7\3\2\2\2\u01a9\u01ac\3\2\2\2\u01aa\u01a8\3\2\2\2\u01aa\u01ab\3\2"+
		"\2\2\u01abE\3\2\2\2\u01ac\u01aa\3\2\2\2\u01ad\u01b0\7\r\2\2\u01ae\u01b1"+
		"\5\u0084C\2\u01af\u01b1\5<\37\2\u01b0\u01ae\3\2\2\2\u01b0\u01af\3\2\2"+
		"\2\u01b1\u01b5\3\2\2\2\u01b2\u01b4\5:\36\2\u01b3\u01b2\3\2\2\2\u01b4\u01b7"+
		"\3\2\2\2\u01b5\u01b3\3\2\2\2\u01b5\u01b6\3\2\2\2\u01b6G\3\2\2\2\u01b7"+
		"\u01b5\3\2\2\2\u01b8\u01bb\5B\"\2\u01b9\u01bb\5D#\2\u01ba\u01b8\3\2\2"+
		"\2\u01ba\u01b9\3\2\2\2\u01bbI\3\2\2\2\u01bc\u01bd\5H%\2\u01bd\u01be\5"+
		"j\66\2\u01be\u01bf\5J&\2\u01bf\u01c2\3\2\2\2\u01c0\u01c2\5L\'\2\u01c1"+
		"\u01bc\3\2\2\2\u01c1\u01c0\3\2\2\2\u01c2K\3\2\2\2\u01c3\u01c4\b\'\1\2"+
		"\u01c4\u01c5\5N(\2\u01c5\u01cc\3\2\2\2\u01c6\u01c7\f\4\2\2\u01c7\u01c8"+
		"\5l\67\2\u01c8\u01c9\5N(\2\u01c9\u01cb\3\2\2\2\u01ca\u01c6\3\2\2\2\u01cb"+
		"\u01ce\3\2\2\2\u01cc\u01ca\3\2\2\2\u01cc\u01cd\3\2\2\2\u01cdM\3\2\2\2"+
		"\u01ce\u01cc\3\2\2\2\u01cf\u01d0\b(\1\2\u01d0\u01d1\5P)\2\u01d1\u01d8"+
		"\3\2\2\2\u01d2\u01d3\f\4\2\2\u01d3\u01d4\5n8\2\u01d4\u01d5\5P)\2\u01d5"+
		"\u01d7\3\2\2\2\u01d6\u01d2\3\2\2\2\u01d7\u01da\3\2\2\2\u01d8\u01d6\3\2"+
		"\2\2\u01d8\u01d9\3\2\2\2\u01d9O\3\2\2\2\u01da\u01d8\3\2\2\2\u01db\u01dc"+
		"\b)\1\2\u01dc\u01dd\5R*\2\u01dd\u01e4\3\2\2\2\u01de\u01df\f\4\2\2\u01df"+
		"\u01e0\5p9\2\u01e0\u01e1\5R*\2\u01e1\u01e3\3\2\2\2\u01e2\u01de\3\2\2\2"+
		"\u01e3\u01e6\3\2\2\2\u01e4\u01e2\3\2\2\2\u01e4\u01e5\3\2\2\2\u01e5Q\3"+
		"\2\2\2\u01e6\u01e4\3\2\2\2\u01e7\u01e8\b*\1\2\u01e8\u01e9\5T+\2\u01e9"+
		"\u01f0\3\2\2\2\u01ea\u01eb\f\4\2\2\u01eb\u01ec\5r:\2\u01ec\u01ed\5T+\2"+
		"\u01ed\u01ef\3\2\2\2\u01ee\u01ea\3\2\2\2\u01ef\u01f2\3\2\2\2\u01f0\u01ee"+
		"\3\2\2\2\u01f0\u01f1\3\2\2\2\u01f1S\3\2\2\2\u01f2\u01f0\3\2\2\2\u01f3"+
		"\u01f4\b+\1\2\u01f4\u01f5\5V,\2\u01f5\u01fc\3\2\2\2\u01f6\u01f7\f\4\2"+
		"\2\u01f7\u01f8\5t;\2\u01f8\u01f9\5V,\2\u01f9\u01fb\3\2\2\2\u01fa\u01f6"+
		"\3\2\2\2\u01fb\u01fe\3\2\2\2\u01fc\u01fa\3\2\2\2\u01fc\u01fd\3\2\2\2\u01fd"+
		"U\3\2\2\2\u01fe\u01fc\3\2\2\2\u01ff\u0200\b,\1\2\u0200\u0201\5X-\2\u0201"+
		"\u0208\3\2\2\2\u0202\u0203\f\4\2\2\u0203\u0204\5v<\2\u0204\u0205\5X-\2"+
		"\u0205\u0207\3\2\2\2\u0206\u0202\3\2\2\2\u0207\u020a\3\2\2\2\u0208\u0206"+
		"\3\2\2\2\u0208\u0209\3\2\2\2\u0209W\3\2\2\2\u020a\u0208\3\2\2\2\u020b"+
		"\u020c\b-\1\2\u020c\u020d\5Z.\2\u020d\u0214\3\2\2\2\u020e\u020f\f\4\2"+
		"\2\u020f\u0210\5x=\2\u0210\u0211\5Z.\2\u0211\u0213\3\2\2\2\u0212\u020e"+
		"\3\2\2\2\u0213\u0216\3\2\2\2\u0214\u0212\3\2\2\2\u0214\u0215\3\2\2\2\u0215"+
		"Y\3\2\2\2\u0216\u0214\3\2\2\2\u0217\u0218\5z>\2\u0218\u0219\5Z.\2\u0219"+
		"\u021c\3\2\2\2\u021a\u021c\5\\/\2\u021b\u0217\3\2\2\2\u021b\u021a\3\2"+
		"\2\2\u021c[\3\2\2\2\u021d\u021e\5^\60\2\u021e\u021f\5|?\2\u021f\u0222"+
		"\3\2\2\2\u0220\u0222\5^\60\2\u0221\u021d\3\2\2\2\u0221\u0220\3\2\2\2\u0222"+
		"]\3\2\2\2\u0223\u0224\7\5\2\2\u0224\u0225\5L\'\2\u0225\u0226\7\6\2\2\u0226"+
		"\u022e\3\2\2\2\u0227\u022e\5> \2\u0228\u022e\5@!\2\u0229\u022e\5D#\2\u022a"+
		"\u022e\5B\"\2\u022b\u022e\5`\61\2\u022c\u022e\5~@\2\u022d\u0223\3\2\2"+
		"\2\u022d\u0227\3\2\2\2\u022d\u0228\3\2\2\2\u022d\u0229\3\2\2\2\u022d\u022a"+
		"\3\2\2\2\u022d\u022b\3\2\2\2\u022d\u022c\3\2\2\2\u022e_\3\2\2\2\u022f"+
		"\u0230\7\b\2\2\u0230\u0231\5d\63\2\u0231\u0232\7\t\2\2\u0232\u023e\3\2"+
		"\2\2\u0233\u0234\7\b\2\2\u0234\u0237\5b\62\2\u0235\u0236\7\7\2\2\u0236"+
		"\u0238\5b\62\2\u0237\u0235\3\2\2\2\u0238\u0239\3\2\2\2\u0239\u0237\3\2"+
		"\2\2\u0239\u023a\3\2\2\2\u023a\u023b\3\2\2\2\u023b\u023c\7\t\2\2\u023c"+
		"\u023e\3\2\2\2\u023d\u022f\3\2\2\2\u023d\u0233\3\2\2\2\u023ea\3\2\2\2"+
		"\u023f\u0240\7\b\2\2\u0240\u0241\5d\63\2\u0241\u0242\7\t\2\2\u0242c\3"+
		"\2\2\2\u0243\u0248\5L\'\2\u0244\u0245\7\7\2\2\u0245\u0247\5L\'\2\u0246"+
		"\u0244\3\2\2\2\u0247\u024a\3\2\2\2\u0248\u0246\3\2\2\2\u0248\u0249\3\2"+
		"\2\2\u0249e\3\2\2\2\u024a\u0248\3\2\2\2\u024b\u024d\7\5\2\2\u024c\u024e"+
		"\5d\63\2\u024d\u024c\3\2\2\2\u024d\u024e\3\2\2\2\u024e\u024f\3\2\2\2\u024f"+
		"\u0250\7\6\2\2\u0250g\3\2\2\2\u0251\u0254\7\60\2\2\u0252\u0254\5\u0080"+
		"A\2\u0253\u0251\3\2\2\2\u0253\u0252\3\2\2\2\u0254i\3\2\2\2\u0255\u0256"+
		"\t\3\2\2\u0256k\3\2\2\2\u0257\u0258\t\4\2\2\u0258m\3\2\2\2\u0259\u025a"+
		"\t\5\2\2\u025ao\3\2\2\2\u025b\u025c\t\6\2\2\u025cq\3\2\2\2\u025d\u025e"+
		"\t\7\2\2\u025es\3\2\2\2\u025f\u0260\t\b\2\2\u0260u\3\2\2\2\u0261\u0262"+
		"\t\t\2\2\u0262w\3\2\2\2\u0263\u0264\7$\2\2\u0264y\3\2\2\2\u0265\u0266"+
		"\t\n\2\2\u0266{\3\2\2\2\u0267\u0268\t\13\2\2\u0268}\3\2\2\2\u0269\u0270"+
		"\5\u0088E\2\u026a\u0270\5\u008aF\2\u026b\u0270\5\u008cG\2\u026c\u0270"+
		"\5\u008eH\2\u026d\u0270\5\u0090I\2\u026e\u0270\5\u0092J\2\u026f\u0269"+
		"\3\2\2\2\u026f\u026a\3\2\2\2\u026f\u026b\3\2\2\2\u026f\u026c\3\2\2\2\u026f"+
		"\u026d\3\2\2\2\u026f\u026e\3\2\2\2\u0270\177\3\2\2\2\u0271\u0275\5\u0082"+
		"B\2\u0272\u0274\58\35\2\u0273\u0272\3\2\2\2\u0274\u0277\3\2\2\2\u0275"+
		"\u0273\3\2\2\2\u0275\u0276\3\2\2\2\u0276\u0081\3\2\2\2\u0277\u0275\3\2"+
		"\2\2\u0278\u027f\7(\2\2\u0279\u027f\7)\2\2\u027a\u027f\7*\2\2\u027b\u027f"+
		"\7+\2\2\u027c\u027f\7,\2\2\u027d\u027f\5\u0084C\2\u027e\u0278\3\2\2\2"+
		"\u027e\u0279\3\2\2\2\u027e\u027a\3\2\2\2\u027e\u027b\3\2\2\2\u027e\u027c"+
		"\3\2\2\2\u027e\u027d\3\2\2\2\u027f\u0083\3\2\2\2\u0280\u0281\7R\2\2\u0281"+
		"\u0085\3\2\2\2\u0282\u0283\7;\2\2\u0283\u0087\3\2\2\2\u0284\u0285\7O\2"+
		"\2\u0285\u0089\3\2\2\2\u0286\u0287\7N\2\2\u0287\u008b\3\2\2\2\u0288\u0289"+
		"\7Q\2\2\u0289\u008d\3\2\2\2\u028a\u028b\7P\2\2\u028b\u008f\3\2\2\2\u028c"+
		"\u028d\t\f\2\2\u028d\u0091\3\2\2\2\u028e\u028f\t\r\2\2\u028f\u0093\3\2"+
		"\2\28\u0098\u009a\u00ad\u00b4\u00c0\u00c6\u00cc\u00d5\u00da\u00e2\u00f3"+
		"\u00fd\u0114\u011b\u012a\u012e\u0132\u013d\u013f\u014b\u0157\u0161\u0165"+
		"\u016b\u0171\u0182\u0188\u0190\u0196\u019d\u01a4\u01aa\u01b0\u01b5\u01ba"+
		"\u01c1\u01cc\u01d8\u01e4\u01f0\u01fc\u0208\u0214\u021b\u0221\u022d\u0239"+
		"\u023d\u0248\u024d\u0253\u026f\u0275\u027e";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}