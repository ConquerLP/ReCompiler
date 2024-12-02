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
		RULE_varDescription = 5, RULE_argList = 6, RULE_classDec = 7, RULE_classInsideGroup = 8, 
		RULE_classInside = 9, RULE_poly = 10, RULE_visibilty = 11, RULE_classConstructor = 12, 
		RULE_method = 13, RULE_classField = 14, RULE_functionBlock = 15, RULE_functionBlockStmt = 16, 
		RULE_loopBlock = 17, RULE_loopBlockStmt = 18, RULE_stmt = 19, RULE_ifStmt = 20, 
		RULE_whileStmt = 21, RULE_doWhileStmt = 22, RULE_forStmt = 23, RULE_functionJumpStmt = 24, 
		RULE_loopJumpStmt = 25, RULE_label = 26, RULE_switchCase = 27, RULE_caseBlock = 28, 
		RULE_check = 29, RULE_varDec = 30, RULE_globalVar = 31, RULE_constArray = 32, 
		RULE_constInit = 33, RULE_constList = 34, RULE_constSubList = 35, RULE_constExprMany = 36, 
		RULE_constVar = 37, RULE_constArrayAccess = 38, RULE_constExpr = 39, RULE_constJoin = 40, 
		RULE_constEQ = 41, RULE_constRel = 42, RULE_constLogic = 43, RULE_constTerm = 44, 
		RULE_constExpo = 45, RULE_constUnary = 46, RULE_constFactor = 47, RULE_arrayAccess = 48, 
		RULE_methodCall = 49, RULE_newObject = 50, RULE_fCall = 51, RULE_thisAcces = 52, 
		RULE_varAcces = 53, RULE_exprTail = 54, RULE_lh_expression = 55, RULE_expression = 56, 
		RULE_orExpression = 57, RULE_andExpression = 58, RULE_equalityExpression = 59, 
		RULE_relationalExpression = 60, RULE_additiveExpression = 61, RULE_multiplicativeExpression = 62, 
		RULE_exponentiationExpression = 63, RULE_unaryExpression = 64, RULE_postExpression = 65, 
		RULE_primary = 66, RULE_list = 67, RULE_subList = 68, RULE_expressionMany = 69, 
		RULE_fArgs = 70, RULE_returntype = 71, RULE_constant = 72, RULE_type = 73, 
		RULE_identifier = 74, RULE_typemodifier = 75, RULE_doubleRule = 76, RULE_intRule = 77, 
		RULE_stringRule = 78, RULE_charRule = 79, RULE_booleanRule = 80, RULE_refRule = 81, 
		RULE_assignOP = 82, RULE_orOP = 83, RULE_andOP = 84, RULE_eqOP = 85, RULE_relOP = 86, 
		RULE_addOP = 87, RULE_multOP = 88, RULE_expOP = 89, RULE_preOP = 90, RULE_postOP = 91, 
		RULE_arrayGroup = 92;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "main", "func", "fHeader", "fParam", "varDescription", "argList", 
			"classDec", "classInsideGroup", "classInside", "poly", "visibilty", "classConstructor", 
			"method", "classField", "functionBlock", "functionBlockStmt", "loopBlock", 
			"loopBlockStmt", "stmt", "ifStmt", "whileStmt", "doWhileStmt", "forStmt", 
			"functionJumpStmt", "loopJumpStmt", "label", "switchCase", "caseBlock", 
			"check", "varDec", "globalVar", "constArray", "constInit", "constList", 
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
			"preOP", "postOP", "arrayGroup"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'('", "')'", "','", "'{'", "'}'", "':'", "'='", "'['", "']'", 
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
			setState(192);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 45)) & ~0x3f) == 0 && ((1L << (_la - 45)) & ((1L << (FUNC - 45)) | (1L << (CLASS - 45)) | (1L << (GLOBAL - 45)) | (1L << (LABEL - 45)))) != 0)) {
				{
				setState(190);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case FUNC:
					{
					setState(186);
					func();
					}
					break;
				case CLASS:
					{
					setState(187);
					classDec();
					}
					break;
				case GLOBAL:
					{
					setState(188);
					globalVar();
					}
					break;
				case LABEL:
					{
					setState(189);
					label();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(194);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(195);
			main();
			setState(196);
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
			setState(198);
			match(MAIN);
			setState(199);
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
			setState(201);
			match(FUNC);
			setState(202);
			fHeader();
			setState(203);
			fParam();
			setState(204);
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
		public List<ArrayGroupContext> arrayGroup() {
			return getRuleContexts(ArrayGroupContext.class);
		}
		public ArrayGroupContext arrayGroup(int i) {
			return getRuleContext(ArrayGroupContext.class,i);
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
			setState(206);
			returntype();
			setState(210);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__7) {
				{
				{
				setState(207);
				arrayGroup();
				}
				}
				setState(212);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(213);
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
			setState(215);
			match(T__0);
			setState(217);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14))) != 0) || _la==ID) {
				{
				setState(216);
				argList();
				}
			}

			setState(219);
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

	public static class VarDescriptionContext extends ParserRuleContext {
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
		public VarDescriptionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varDescription; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReFuggListener ) ((ReFuggListener)listener).enterVarDescription(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReFuggListener ) ((ReFuggListener)listener).exitVarDescription(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReFuggVisitor ) return ((ReFuggVisitor<? extends T>)visitor).visitVarDescription(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarDescriptionContext varDescription() throws RecognitionException {
		VarDescriptionContext _localctx = new VarDescriptionContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_varDescription);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(221);
			type();
			setState(225);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__7) {
				{
				{
				setState(222);
				constArray();
				}
				}
				setState(227);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(228);
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
		public List<VarDescriptionContext> varDescription() {
			return getRuleContexts(VarDescriptionContext.class);
		}
		public VarDescriptionContext varDescription(int i) {
			return getRuleContext(VarDescriptionContext.class,i);
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
			setState(230);
			varDescription();
			setState(235);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__2) {
				{
				{
				setState(231);
				match(T__2);
				setState(232);
				varDescription();
				}
				}
				setState(237);
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
		public List<ClassInsideGroupContext> classInsideGroup() {
			return getRuleContexts(ClassInsideGroupContext.class);
		}
		public ClassInsideGroupContext classInsideGroup(int i) {
			return getRuleContext(ClassInsideGroupContext.class,i);
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
			setState(238);
			match(CLASS);
			setState(239);
			identifier();
			setState(241);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ISA) {
				{
				setState(240);
				poly();
				}
			}

			setState(243);
			match(T__3);
			setState(247);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PRIVATE) | (1L << PUBLIC) | (1L << PROTECTED))) != 0)) {
				{
				{
				setState(244);
				classInsideGroup();
				}
				}
				setState(249);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(250);
			match(T__4);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassInsideGroupContext extends ParserRuleContext {
		public VisibiltyContext visibilty() {
			return getRuleContext(VisibiltyContext.class,0);
		}
		public List<ClassInsideContext> classInside() {
			return getRuleContexts(ClassInsideContext.class);
		}
		public ClassInsideContext classInside(int i) {
			return getRuleContext(ClassInsideContext.class,i);
		}
		public ClassInsideGroupContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classInsideGroup; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReFuggListener ) ((ReFuggListener)listener).enterClassInsideGroup(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReFuggListener ) ((ReFuggListener)listener).exitClassInsideGroup(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReFuggVisitor ) return ((ReFuggVisitor<? extends T>)visitor).visitClassInsideGroup(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassInsideGroupContext classInsideGroup() throws RecognitionException {
		ClassInsideGroupContext _localctx = new ClassInsideGroupContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_classInsideGroup);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(252);
			visibilty();
			setState(254); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(253);
				classInside();
				}
				}
				setState(256); 
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
		enterRule(_localctx, 18, RULE_classInside);
		try {
			setState(261);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CONST:
				enterOuterAlt(_localctx, 1);
				{
				setState(258);
				classConstructor();
				}
				break;
			case FIELD:
				enterOuterAlt(_localctx, 2);
				{
				setState(259);
				classField();
				}
				break;
			case METH:
				enterOuterAlt(_localctx, 3);
				{
				setState(260);
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
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
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
		enterRule(_localctx, 20, RULE_poly);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(263);
			match(ISA);
			setState(264);
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
		enterRule(_localctx, 22, RULE_visibilty);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(266);
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
		enterRule(_localctx, 24, RULE_classConstructor);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(268);
			match(CONST);
			setState(269);
			identifier();
			setState(270);
			fParam();
			setState(271);
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
		enterRule(_localctx, 26, RULE_method);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(273);
			match(METH);
			setState(274);
			fHeader();
			setState(275);
			fParam();
			setState(276);
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
		public VarDescriptionContext varDescription() {
			return getRuleContext(VarDescriptionContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(ReFuggParser.SEMI, 0); }
		public ConstInitContext constInit() {
			return getRuleContext(ConstInitContext.class,0);
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
		enterRule(_localctx, 28, RULE_classField);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(278);
			match(FIELD);
			setState(279);
			typemodifier();
			setState(280);
			varDescription();
			setState(282);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__3 || _la==T__6) {
				{
				setState(281);
				constInit();
				}
			}

			setState(284);
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
		public List<FunctionBlockStmtContext> functionBlockStmt() {
			return getRuleContexts(FunctionBlockStmtContext.class);
		}
		public FunctionBlockStmtContext functionBlockStmt(int i) {
			return getRuleContext(FunctionBlockStmtContext.class,i);
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
		enterRule(_localctx, 30, RULE_functionBlock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(286);
			match(T__3);
			setState(290);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__3) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__32) | (1L << T__33) | (1L << T__39) | (1L << T__40) | (1L << FINAL) | (1L << STATIC) | (1L << IF) | (1L << WHILE) | (1L << DO) | (1L << FOR))) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (GOTO - 66)) | (1L << (RETURN - 66)) | (1L << (LABEL - 66)) | (1L << (SWITCH - 66)) | (1L << (TRUE - 66)) | (1L << (FALSE - 66)) | (1L << (THIS - 66)) | (1L << (NULL - 66)) | (1L << (NEW - 66)) | (1L << (INT_LIT - 66)) | (1L << (DOUBLE_LIT - 66)) | (1L << (CHAR_LIT - 66)) | (1L << (STRING_LIT - 66)) | (1L << (ID - 66)))) != 0)) {
				{
				{
				setState(287);
				functionBlockStmt();
				}
				}
				setState(292);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(293);
			match(T__4);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunctionBlockStmtContext extends ParserRuleContext {
		public StmtContext stmt() {
			return getRuleContext(StmtContext.class,0);
		}
		public FunctionJumpStmtContext functionJumpStmt() {
			return getRuleContext(FunctionJumpStmtContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(ReFuggParser.SEMI, 0); }
		public FunctionBlockStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionBlockStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReFuggListener ) ((ReFuggListener)listener).enterFunctionBlockStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReFuggListener ) ((ReFuggListener)listener).exitFunctionBlockStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReFuggVisitor ) return ((ReFuggVisitor<? extends T>)visitor).visitFunctionBlockStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionBlockStmtContext functionBlockStmt() throws RecognitionException {
		FunctionBlockStmtContext _localctx = new FunctionBlockStmtContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_functionBlockStmt);
		try {
			setState(299);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
			case T__3:
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
				enterOuterAlt(_localctx, 1);
				{
				setState(295);
				stmt();
				}
				break;
			case GOTO:
			case RETURN:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(296);
				functionJumpStmt();
				setState(297);
				match(SEMI);
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

	public static class LoopBlockContext extends ParserRuleContext {
		public List<LoopBlockStmtContext> loopBlockStmt() {
			return getRuleContexts(LoopBlockStmtContext.class);
		}
		public LoopBlockStmtContext loopBlockStmt(int i) {
			return getRuleContext(LoopBlockStmtContext.class,i);
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
		enterRule(_localctx, 34, RULE_loopBlock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(301);
			match(T__3);
			setState(305);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__3) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__32) | (1L << T__33) | (1L << T__39) | (1L << T__40) | (1L << FINAL) | (1L << STATIC) | (1L << IF) | (1L << WHILE) | (1L << DO) | (1L << FOR))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (CONTINUE - 64)) | (1L << (BREAK - 64)) | (1L << (GOTO - 64)) | (1L << (RETURN - 64)) | (1L << (LABEL - 64)) | (1L << (SWITCH - 64)) | (1L << (TRUE - 64)) | (1L << (FALSE - 64)) | (1L << (THIS - 64)) | (1L << (NULL - 64)) | (1L << (NEW - 64)) | (1L << (INT_LIT - 64)) | (1L << (DOUBLE_LIT - 64)) | (1L << (CHAR_LIT - 64)) | (1L << (STRING_LIT - 64)) | (1L << (ID - 64)))) != 0)) {
				{
				{
				setState(302);
				loopBlockStmt();
				}
				}
				setState(307);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(308);
			match(T__4);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LoopBlockStmtContext extends ParserRuleContext {
		public StmtContext stmt() {
			return getRuleContext(StmtContext.class,0);
		}
		public LoopJumpStmtContext loopJumpStmt() {
			return getRuleContext(LoopJumpStmtContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(ReFuggParser.SEMI, 0); }
		public LoopBlockStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_loopBlockStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReFuggListener ) ((ReFuggListener)listener).enterLoopBlockStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReFuggListener ) ((ReFuggListener)listener).exitLoopBlockStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReFuggVisitor ) return ((ReFuggVisitor<? extends T>)visitor).visitLoopBlockStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LoopBlockStmtContext loopBlockStmt() throws RecognitionException {
		LoopBlockStmtContext _localctx = new LoopBlockStmtContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_loopBlockStmt);
		try {
			setState(314);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
			case T__3:
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
				enterOuterAlt(_localctx, 1);
				{
				setState(310);
				stmt();
				}
				break;
			case CONTINUE:
			case BREAK:
			case GOTO:
			case RETURN:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(311);
				loopJumpStmt();
				setState(312);
				match(SEMI);
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
		enterRule(_localctx, 38, RULE_stmt);
		try {
			setState(331);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(316);
				ifStmt();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(317);
				whileStmt();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(318);
				doWhileStmt();
				setState(319);
				match(SEMI);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(321);
				forStmt();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(322);
				switchCase();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(323);
				label();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(324);
				functionBlock();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(325);
				varDec();
				setState(326);
				match(SEMI);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(328);
				expression();
				setState(329);
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
		enterRule(_localctx, 40, RULE_ifStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(333);
			match(IF);
			setState(334);
			check();
			setState(335);
			functionBlock();
			setState(338);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(336);
				match(ELSE);
				setState(337);
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
		enterRule(_localctx, 42, RULE_whileStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(340);
			match(WHILE);
			setState(341);
			check();
			setState(342);
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
		enterRule(_localctx, 44, RULE_doWhileStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(344);
			match(DO);
			setState(345);
			loopBlock();
			setState(346);
			match(WHILE);
			setState(347);
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
		enterRule(_localctx, 46, RULE_forStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(349);
			match(FOR);
			setState(350);
			match(T__0);
			setState(353);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				{
				setState(351);
				varDec();
				}
				break;
			case 2:
				{
				setState(352);
				orExpression(0);
				}
				break;
			}
			setState(355);
			match(SEMI);
			setState(357);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__32) | (1L << T__33) | (1L << T__39) | (1L << T__40))) != 0) || ((((_la - 72)) & ~0x3f) == 0 && ((1L << (_la - 72)) & ((1L << (TRUE - 72)) | (1L << (FALSE - 72)) | (1L << (THIS - 72)) | (1L << (NULL - 72)) | (1L << (NEW - 72)) | (1L << (INT_LIT - 72)) | (1L << (DOUBLE_LIT - 72)) | (1L << (CHAR_LIT - 72)) | (1L << (STRING_LIT - 72)) | (1L << (ID - 72)))) != 0)) {
				{
				setState(356);
				orExpression(0);
				}
			}

			setState(359);
			match(SEMI);
			setState(361);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__32) | (1L << T__33) | (1L << T__39) | (1L << T__40))) != 0) || ((((_la - 72)) & ~0x3f) == 0 && ((1L << (_la - 72)) & ((1L << (TRUE - 72)) | (1L << (FALSE - 72)) | (1L << (THIS - 72)) | (1L << (NULL - 72)) | (1L << (NEW - 72)) | (1L << (INT_LIT - 72)) | (1L << (DOUBLE_LIT - 72)) | (1L << (CHAR_LIT - 72)) | (1L << (STRING_LIT - 72)) | (1L << (ID - 72)))) != 0)) {
				{
				setState(360);
				orExpression(0);
				}
			}

			setState(363);
			match(T__1);
			setState(364);
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
		enterRule(_localctx, 48, RULE_functionJumpStmt);
		int _la;
		try {
			setState(372);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case GOTO:
				enterOuterAlt(_localctx, 1);
				{
				setState(366);
				match(GOTO);
				setState(367);
				identifier();
				}
				break;
			case RETURN:
				enterOuterAlt(_localctx, 2);
				{
				setState(368);
				match(RETURN);
				setState(370);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__32) | (1L << T__33) | (1L << T__39) | (1L << T__40))) != 0) || ((((_la - 72)) & ~0x3f) == 0 && ((1L << (_la - 72)) & ((1L << (TRUE - 72)) | (1L << (FALSE - 72)) | (1L << (THIS - 72)) | (1L << (NULL - 72)) | (1L << (NEW - 72)) | (1L << (INT_LIT - 72)) | (1L << (DOUBLE_LIT - 72)) | (1L << (CHAR_LIT - 72)) | (1L << (STRING_LIT - 72)) | (1L << (ID - 72)))) != 0)) {
					{
					setState(369);
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
		enterRule(_localctx, 50, RULE_loopJumpStmt);
		int _la;
		try {
			setState(382);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BREAK:
				enterOuterAlt(_localctx, 1);
				{
				setState(374);
				match(BREAK);
				}
				break;
			case CONTINUE:
				enterOuterAlt(_localctx, 2);
				{
				setState(375);
				match(CONTINUE);
				}
				break;
			case GOTO:
				enterOuterAlt(_localctx, 3);
				{
				setState(376);
				match(GOTO);
				setState(377);
				identifier();
				}
				break;
			case RETURN:
				enterOuterAlt(_localctx, 4);
				{
				setState(378);
				match(RETURN);
				setState(380);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__32) | (1L << T__33) | (1L << T__39) | (1L << T__40))) != 0) || ((((_la - 72)) & ~0x3f) == 0 && ((1L << (_la - 72)) & ((1L << (TRUE - 72)) | (1L << (FALSE - 72)) | (1L << (THIS - 72)) | (1L << (NULL - 72)) | (1L << (NEW - 72)) | (1L << (INT_LIT - 72)) | (1L << (DOUBLE_LIT - 72)) | (1L << (CHAR_LIT - 72)) | (1L << (STRING_LIT - 72)) | (1L << (ID - 72)))) != 0)) {
					{
					setState(379);
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
		enterRule(_localctx, 52, RULE_label);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(384);
			match(LABEL);
			setState(385);
			identifier();
			setState(387);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				{
				setState(386);
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
		enterRule(_localctx, 54, RULE_switchCase);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(389);
			match(SWITCH);
			setState(390);
			check();
			setState(391);
			match(T__3);
			setState(393); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(392);
				caseBlock();
				}
				}
				setState(395); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==CASE || _la==DEFAULT );
			setState(397);
			match(T__4);
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 56, RULE_caseBlock);
		try {
			setState(407);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CASE:
				enterOuterAlt(_localctx, 1);
				{
				setState(399);
				match(CASE);
				setState(400);
				constExpr(0);
				setState(401);
				match(T__5);
				setState(402);
				functionBlock();
				}
				break;
			case DEFAULT:
				enterOuterAlt(_localctx, 2);
				{
				setState(404);
				match(DEFAULT);
				setState(405);
				match(T__5);
				setState(406);
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
		enterRule(_localctx, 58, RULE_check);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(409);
			match(T__0);
			setState(410);
			orExpression(0);
			setState(411);
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

	public static class VarDecContext extends ParserRuleContext {
		public VarDescriptionContext varDescription() {
			return getRuleContext(VarDescriptionContext.class,0);
		}
		public TypemodifierContext typemodifier() {
			return getRuleContext(TypemodifierContext.class,0);
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
		enterRule(_localctx, 60, RULE_varDec);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(414);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==FINAL || _la==STATIC) {
				{
				setState(413);
				typemodifier();
				}
			}

			setState(416);
			varDescription();
			setState(422);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__6) {
				{
				setState(417);
				match(T__6);
				setState(420);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__0:
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
					setState(418);
					orExpression(0);
					}
					break;
				case T__3:
					{
					setState(419);
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
		public VarDescriptionContext varDescription() {
			return getRuleContext(VarDescriptionContext.class,0);
		}
		public ConstInitContext constInit() {
			return getRuleContext(ConstInitContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(ReFuggParser.SEMI, 0); }
		public TypemodifierContext typemodifier() {
			return getRuleContext(TypemodifierContext.class,0);
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
		enterRule(_localctx, 62, RULE_globalVar);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(424);
			match(GLOBAL);
			setState(426);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==FINAL || _la==STATIC) {
				{
				setState(425);
				typemodifier();
				}
			}

			setState(428);
			varDescription();
			setState(429);
			constInit();
			setState(430);
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
		enterRule(_localctx, 64, RULE_constArray);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(432);
			match(T__7);
			setState(434);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__32) | (1L << T__33) | (1L << T__39) | (1L << T__40))) != 0) || ((((_la - 72)) & ~0x3f) == 0 && ((1L << (_la - 72)) & ((1L << (TRUE - 72)) | (1L << (FALSE - 72)) | (1L << (NULL - 72)) | (1L << (INT_LIT - 72)) | (1L << (DOUBLE_LIT - 72)) | (1L << (CHAR_LIT - 72)) | (1L << (STRING_LIT - 72)) | (1L << (ID - 72)))) != 0)) {
				{
				setState(433);
				constExpr(0);
				}
			}

			setState(436);
			match(T__8);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConstInitContext extends ParserRuleContext {
		public ConstExprContext constExpr() {
			return getRuleContext(ConstExprContext.class,0);
		}
		public ConstListContext constList() {
			return getRuleContext(ConstListContext.class,0);
		}
		public ConstInitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constInit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReFuggListener ) ((ReFuggListener)listener).enterConstInit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReFuggListener ) ((ReFuggListener)listener).exitConstInit(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReFuggVisitor ) return ((ReFuggVisitor<? extends T>)visitor).visitConstInit(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstInitContext constInit() throws RecognitionException {
		ConstInitContext _localctx = new ConstInitContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_constInit);
		try {
			setState(441);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__6:
				enterOuterAlt(_localctx, 1);
				{
				setState(438);
				match(T__6);
				setState(439);
				constExpr(0);
				}
				break;
			case T__3:
				enterOuterAlt(_localctx, 2);
				{
				setState(440);
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
		enterRule(_localctx, 68, RULE_constList);
		int _la;
		try {
			setState(457);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,34,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(443);
				match(T__3);
				setState(444);
				constExprMany();
				setState(445);
				match(T__4);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(447);
				match(T__3);
				setState(448);
				constSubList();
				setState(451); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(449);
					match(T__2);
					setState(450);
					constSubList();
					}
					}
					setState(453); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==T__2 );
				setState(455);
				match(T__4);
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
		enterRule(_localctx, 70, RULE_constSubList);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(459);
			match(T__3);
			setState(460);
			constExprMany();
			setState(461);
			match(T__4);
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 72, RULE_constExprMany);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(463);
			constExpr(0);
			setState(468);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__2) {
				{
				{
				setState(464);
				match(T__2);
				setState(465);
				constExpr(0);
				}
				}
				setState(470);
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
		enterRule(_localctx, 74, RULE_constVar);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(471);
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
		enterRule(_localctx, 76, RULE_constArrayAccess);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(473);
			identifier();
			setState(478); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(474);
					match(T__7);
					setState(475);
					constExpr(0);
					setState(476);
					match(T__8);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(480); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,36,_ctx);
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
		int _startState = 78;
		enterRecursionRule(_localctx, 78, RULE_constExpr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(483);
			constJoin(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(491);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,37,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ConstExprContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_constExpr);
					setState(485);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(486);
					orOP();
					setState(487);
					constJoin(0);
					}
					} 
				}
				setState(493);
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
		int _startState = 80;
		enterRecursionRule(_localctx, 80, RULE_constJoin, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(495);
			constEQ(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(503);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,38,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ConstJoinContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_constJoin);
					setState(497);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(498);
					andOP();
					setState(499);
					constEQ(0);
					}
					} 
				}
				setState(505);
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
		int _startState = 82;
		enterRecursionRule(_localctx, 82, RULE_constEQ, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(507);
			constRel(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(515);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,39,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ConstEQContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_constEQ);
					setState(509);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(510);
					eqOP();
					setState(511);
					constRel(0);
					}
					} 
				}
				setState(517);
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
		int _startState = 84;
		enterRecursionRule(_localctx, 84, RULE_constRel, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(519);
			constLogic(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(527);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,40,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ConstRelContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_constRel);
					setState(521);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(522);
					relOP();
					setState(523);
					constLogic(0);
					}
					} 
				}
				setState(529);
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
		int _startState = 86;
		enterRecursionRule(_localctx, 86, RULE_constLogic, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(531);
			constTerm(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(539);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,41,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ConstLogicContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_constLogic);
					setState(533);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(534);
					addOP();
					setState(535);
					constTerm(0);
					}
					} 
				}
				setState(541);
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
		int _startState = 88;
		enterRecursionRule(_localctx, 88, RULE_constTerm, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(543);
			constExpo(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(551);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,42,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ConstTermContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_constTerm);
					setState(545);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(546);
					multOP();
					setState(547);
					constExpo(0);
					}
					} 
				}
				setState(553);
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
		int _startState = 90;
		enterRecursionRule(_localctx, 90, RULE_constExpo, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(555);
			constUnary();
			}
			_ctx.stop = _input.LT(-1);
			setState(563);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,43,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ConstExpoContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_constExpo);
					setState(557);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(558);
					expOP();
					setState(559);
					constUnary();
					}
					} 
				}
				setState(565);
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
		enterRule(_localctx, 92, RULE_constUnary);
		try {
			setState(570);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__32:
			case T__33:
			case T__39:
			case T__40:
				enterOuterAlt(_localctx, 1);
				{
				setState(566);
				preOP();
				setState(567);
				constFactor();
				}
				break;
			case T__0:
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
				setState(569);
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
		enterRule(_localctx, 94, RULE_constFactor);
		try {
			setState(579);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,45,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(572);
				constant();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(573);
				match(T__0);
				setState(574);
				constExpr(0);
				setState(575);
				match(T__1);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(577);
				constVar();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(578);
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
		enterRule(_localctx, 96, RULE_arrayAccess);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(581);
			match(T__7);
			setState(582);
			expression();
			setState(583);
			match(T__8);
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 98, RULE_methodCall);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(585);
			match(T__9);
			setState(586);
			identifier();
			setState(587);
			fArgs();
			setState(591);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,46,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(588);
					arrayAccess();
					}
					} 
				}
				setState(593);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,46,_ctx);
			}
			setState(597);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,47,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(594);
					exprTail();
					}
					} 
				}
				setState(599);
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
		enterRule(_localctx, 100, RULE_newObject);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(600);
			match(NEW);
			setState(601);
			identifier();
			setState(602);
			fArgs();
			setState(606);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,48,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(603);
					arrayAccess();
					}
					} 
				}
				setState(608);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,48,_ctx);
			}
			setState(612);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,49,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(609);
					exprTail();
					}
					} 
				}
				setState(614);
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
		enterRule(_localctx, 102, RULE_fCall);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(615);
			identifier();
			setState(616);
			fArgs();
			setState(620);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,50,_ctx);
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
				_alt = getInterpreter().adaptivePredict(_input,50,_ctx);
			}
			setState(626);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,51,_ctx);
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
		enterRule(_localctx, 104, RULE_thisAcces);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(629);
			match(THIS);
			setState(633);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,52,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(630);
					exprTail();
					}
					} 
				}
				setState(635);
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
		enterRule(_localctx, 106, RULE_varAcces);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(636);
			identifier();
			setState(640);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,53,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(637);
					arrayAccess();
					}
					} 
				}
				setState(642);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,53,_ctx);
			}
			setState(646);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,54,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(643);
					exprTail();
					}
					} 
				}
				setState(648);
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
		enterRule(_localctx, 108, RULE_exprTail);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(652);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,55,_ctx) ) {
			case 1:
				{
				{
				setState(649);
				match(T__9);
				setState(650);
				identifier();
				}
				}
				break;
			case 2:
				{
				setState(651);
				methodCall();
				}
				break;
			}
			setState(657);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,56,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(654);
					arrayAccess();
					}
					} 
				}
				setState(659);
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
		enterRule(_localctx, 110, RULE_lh_expression);
		try {
			setState(662);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case THIS:
				enterOuterAlt(_localctx, 1);
				{
				setState(660);
				thisAcces();
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(661);
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
		enterRule(_localctx, 112, RULE_expression);
		try {
			setState(671);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,59,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(664);
				lh_expression();
				setState(665);
				assignOP();
				setState(668);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__0:
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
					setState(666);
					expression();
					}
					break;
				case T__3:
					{
					setState(667);
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
				setState(670);
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
		int _startState = 114;
		enterRecursionRule(_localctx, 114, RULE_orExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(674);
			andExpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(682);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,60,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new OrExpressionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_orExpression);
					setState(676);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(677);
					orOP();
					setState(678);
					andExpression(0);
					}
					} 
				}
				setState(684);
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
		int _startState = 116;
		enterRecursionRule(_localctx, 116, RULE_andExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(686);
			equalityExpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(694);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,61,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new AndExpressionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_andExpression);
					setState(688);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(689);
					andOP();
					setState(690);
					equalityExpression(0);
					}
					} 
				}
				setState(696);
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
		int _startState = 118;
		enterRecursionRule(_localctx, 118, RULE_equalityExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(698);
			relationalExpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(706);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,62,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new EqualityExpressionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_equalityExpression);
					setState(700);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(701);
					eqOP();
					setState(702);
					relationalExpression(0);
					}
					} 
				}
				setState(708);
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
		int _startState = 120;
		enterRecursionRule(_localctx, 120, RULE_relationalExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(710);
			additiveExpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(718);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,63,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new RelationalExpressionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_relationalExpression);
					setState(712);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(713);
					relOP();
					setState(714);
					additiveExpression(0);
					}
					} 
				}
				setState(720);
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
		int _startState = 122;
		enterRecursionRule(_localctx, 122, RULE_additiveExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(722);
			multiplicativeExpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(730);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,64,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new AdditiveExpressionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_additiveExpression);
					setState(724);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(725);
					addOP();
					setState(726);
					multiplicativeExpression(0);
					}
					} 
				}
				setState(732);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,64,_ctx);
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
		int _startState = 124;
		enterRecursionRule(_localctx, 124, RULE_multiplicativeExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(734);
			exponentiationExpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(742);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,65,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new MultiplicativeExpressionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_multiplicativeExpression);
					setState(736);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(737);
					multOP();
					setState(738);
					exponentiationExpression(0);
					}
					} 
				}
				setState(744);
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
		int _startState = 126;
		enterRecursionRule(_localctx, 126, RULE_exponentiationExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(746);
			unaryExpression();
			}
			_ctx.stop = _input.LT(-1);
			setState(754);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,66,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ExponentiationExpressionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_exponentiationExpression);
					setState(748);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(749);
					expOP();
					setState(750);
					unaryExpression();
					}
					} 
				}
				setState(756);
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
		enterRule(_localctx, 128, RULE_unaryExpression);
		try {
			setState(761);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__32:
			case T__33:
			case T__39:
			case T__40:
				enterOuterAlt(_localctx, 1);
				{
				setState(757);
				preOP();
				setState(758);
				unaryExpression();
				}
				break;
			case T__0:
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
				setState(760);
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
		enterRule(_localctx, 130, RULE_postExpression);
		try {
			setState(767);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,68,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(763);
				primary();
				setState(764);
				postOP();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(766);
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
		enterRule(_localctx, 132, RULE_primary);
		try {
			setState(778);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,69,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(769);
				match(T__0);
				setState(770);
				orExpression(0);
				setState(771);
				match(T__1);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(773);
				newObject();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(774);
				fCall();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(775);
				varAcces();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(776);
				thisAcces();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(777);
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
		enterRule(_localctx, 134, RULE_list);
		int _la;
		try {
			setState(794);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,71,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(780);
				match(T__3);
				setState(781);
				expressionMany();
				setState(782);
				match(T__4);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(784);
				match(T__3);
				setState(785);
				subList();
				setState(788); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(786);
					match(T__2);
					setState(787);
					subList();
					}
					}
					setState(790); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==T__2 );
				setState(792);
				match(T__4);
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
		enterRule(_localctx, 136, RULE_subList);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(796);
			match(T__3);
			setState(797);
			expressionMany();
			setState(798);
			match(T__4);
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 138, RULE_expressionMany);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(800);
			orExpression(0);
			setState(805);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__2) {
				{
				{
				setState(801);
				match(T__2);
				setState(802);
				orExpression(0);
				}
				}
				setState(807);
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
		enterRule(_localctx, 140, RULE_fArgs);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(808);
			match(T__0);
			setState(810);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__32) | (1L << T__33) | (1L << T__39) | (1L << T__40))) != 0) || ((((_la - 72)) & ~0x3f) == 0 && ((1L << (_la - 72)) & ((1L << (TRUE - 72)) | (1L << (FALSE - 72)) | (1L << (THIS - 72)) | (1L << (NULL - 72)) | (1L << (NEW - 72)) | (1L << (INT_LIT - 72)) | (1L << (DOUBLE_LIT - 72)) | (1L << (CHAR_LIT - 72)) | (1L << (STRING_LIT - 72)) | (1L << (ID - 72)))) != 0)) {
				{
				setState(809);
				expressionMany();
				}
			}

			setState(812);
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
		enterRule(_localctx, 142, RULE_returntype);
		try {
			setState(816);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VOID:
				enterOuterAlt(_localctx, 1);
				{
				setState(814);
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
				setState(815);
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
		enterRule(_localctx, 144, RULE_constant);
		try {
			setState(824);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DOUBLE_LIT:
				enterOuterAlt(_localctx, 1);
				{
				setState(818);
				doubleRule();
				}
				break;
			case INT_LIT:
				enterOuterAlt(_localctx, 2);
				{
				setState(819);
				intRule();
				}
				break;
			case STRING_LIT:
				enterOuterAlt(_localctx, 3);
				{
				setState(820);
				stringRule();
				}
				break;
			case CHAR_LIT:
				enterOuterAlt(_localctx, 4);
				{
				setState(821);
				charRule();
				}
				break;
			case TRUE:
			case FALSE:
				enterOuterAlt(_localctx, 5);
				{
				setState(822);
				booleanRule();
				}
				break;
			case NULL:
				enterOuterAlt(_localctx, 6);
				{
				setState(823);
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
		enterRule(_localctx, 146, RULE_type);
		try {
			setState(832);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__10:
				enterOuterAlt(_localctx, 1);
				{
				setState(826);
				match(T__10);
				}
				break;
			case T__11:
				enterOuterAlt(_localctx, 2);
				{
				setState(827);
				match(T__11);
				}
				break;
			case T__12:
				enterOuterAlt(_localctx, 3);
				{
				setState(828);
				match(T__12);
				}
				break;
			case T__13:
				enterOuterAlt(_localctx, 4);
				{
				setState(829);
				match(T__13);
				}
				break;
			case T__14:
				enterOuterAlt(_localctx, 5);
				{
				setState(830);
				match(T__14);
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 6);
				{
				setState(831);
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
		enterRule(_localctx, 148, RULE_identifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(834);
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
		enterRule(_localctx, 150, RULE_typemodifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(836);
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
		enterRule(_localctx, 152, RULE_doubleRule);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(838);
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
		enterRule(_localctx, 154, RULE_intRule);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(840);
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
		enterRule(_localctx, 156, RULE_stringRule);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(842);
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
		enterRule(_localctx, 158, RULE_charRule);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(844);
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
		enterRule(_localctx, 160, RULE_booleanRule);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(846);
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
		enterRule(_localctx, 162, RULE_refRule);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(848);
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
		enterRule(_localctx, 164, RULE_assignOP);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(850);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__6) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__21))) != 0)) ) {
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
		enterRule(_localctx, 166, RULE_orOP);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(852);
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
		enterRule(_localctx, 168, RULE_andOP);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(854);
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
		enterRule(_localctx, 170, RULE_eqOP);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(856);
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
		enterRule(_localctx, 172, RULE_relOP);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(858);
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
		enterRule(_localctx, 174, RULE_addOP);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(860);
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
		enterRule(_localctx, 176, RULE_multOP);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(862);
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
		enterRule(_localctx, 178, RULE_expOP);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(864);
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
		enterRule(_localctx, 180, RULE_preOP);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(866);
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
		enterRule(_localctx, 182, RULE_postOP);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(868);
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

	public static class ArrayGroupContext extends ParserRuleContext {
		public ArrayGroupContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayGroup; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReFuggListener ) ((ReFuggListener)listener).enterArrayGroup(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReFuggListener ) ((ReFuggListener)listener).exitArrayGroup(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReFuggVisitor ) return ((ReFuggVisitor<? extends T>)visitor).visitArrayGroup(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayGroupContext arrayGroup() throws RecognitionException {
		ArrayGroupContext _localctx = new ArrayGroupContext(_ctx, getState());
		enterRule(_localctx, 184, RULE_arrayGroup);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(870);
			match(T__7);
			setState(871);
			match(T__8);
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
		case 39:
			return constExpr_sempred((ConstExprContext)_localctx, predIndex);
		case 40:
			return constJoin_sempred((ConstJoinContext)_localctx, predIndex);
		case 41:
			return constEQ_sempred((ConstEQContext)_localctx, predIndex);
		case 42:
			return constRel_sempred((ConstRelContext)_localctx, predIndex);
		case 43:
			return constLogic_sempred((ConstLogicContext)_localctx, predIndex);
		case 44:
			return constTerm_sempred((ConstTermContext)_localctx, predIndex);
		case 45:
			return constExpo_sempred((ConstExpoContext)_localctx, predIndex);
		case 57:
			return orExpression_sempred((OrExpressionContext)_localctx, predIndex);
		case 58:
			return andExpression_sempred((AndExpressionContext)_localctx, predIndex);
		case 59:
			return equalityExpression_sempred((EqualityExpressionContext)_localctx, predIndex);
		case 60:
			return relationalExpression_sempred((RelationalExpressionContext)_localctx, predIndex);
		case 61:
			return additiveExpression_sempred((AdditiveExpressionContext)_localctx, predIndex);
		case 62:
			return multiplicativeExpression_sempred((MultiplicativeExpressionContext)_localctx, predIndex);
		case 63:
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3W\u036c\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\4R\tR\4S\tS\4T\tT"+
		"\4U\tU\4V\tV\4W\tW\4X\tX\4Y\tY\4Z\tZ\4[\t[\4\\\t\\\4]\t]\4^\t^\3\2\3\2"+
		"\3\2\3\2\7\2\u00c1\n\2\f\2\16\2\u00c4\13\2\3\2\3\2\3\2\3\3\3\3\3\3\3\4"+
		"\3\4\3\4\3\4\3\4\3\5\3\5\7\5\u00d3\n\5\f\5\16\5\u00d6\13\5\3\5\3\5\3\6"+
		"\3\6\5\6\u00dc\n\6\3\6\3\6\3\7\3\7\7\7\u00e2\n\7\f\7\16\7\u00e5\13\7\3"+
		"\7\3\7\3\b\3\b\3\b\7\b\u00ec\n\b\f\b\16\b\u00ef\13\b\3\t\3\t\3\t\5\t\u00f4"+
		"\n\t\3\t\3\t\7\t\u00f8\n\t\f\t\16\t\u00fb\13\t\3\t\3\t\3\n\3\n\6\n\u0101"+
		"\n\n\r\n\16\n\u0102\3\13\3\13\3\13\5\13\u0108\n\13\3\f\3\f\3\f\3\r\3\r"+
		"\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20"+
		"\5\20\u011d\n\20\3\20\3\20\3\21\3\21\7\21\u0123\n\21\f\21\16\21\u0126"+
		"\13\21\3\21\3\21\3\22\3\22\3\22\3\22\5\22\u012e\n\22\3\23\3\23\7\23\u0132"+
		"\n\23\f\23\16\23\u0135\13\23\3\23\3\23\3\24\3\24\3\24\3\24\5\24\u013d"+
		"\n\24\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25"+
		"\3\25\3\25\5\25\u014e\n\25\3\26\3\26\3\26\3\26\3\26\5\26\u0155\n\26\3"+
		"\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31\5\31\u0164"+
		"\n\31\3\31\3\31\5\31\u0168\n\31\3\31\3\31\5\31\u016c\n\31\3\31\3\31\3"+
		"\31\3\32\3\32\3\32\3\32\5\32\u0175\n\32\5\32\u0177\n\32\3\33\3\33\3\33"+
		"\3\33\3\33\3\33\5\33\u017f\n\33\5\33\u0181\n\33\3\34\3\34\3\34\5\34\u0186"+
		"\n\34\3\35\3\35\3\35\3\35\6\35\u018c\n\35\r\35\16\35\u018d\3\35\3\35\3"+
		"\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\5\36\u019a\n\36\3\37\3\37\3\37"+
		"\3\37\3 \5 \u01a1\n \3 \3 \3 \3 \5 \u01a7\n \5 \u01a9\n \3!\3!\5!\u01ad"+
		"\n!\3!\3!\3!\3!\3\"\3\"\5\"\u01b5\n\"\3\"\3\"\3#\3#\3#\5#\u01bc\n#\3$"+
		"\3$\3$\3$\3$\3$\3$\3$\6$\u01c6\n$\r$\16$\u01c7\3$\3$\5$\u01cc\n$\3%\3"+
		"%\3%\3%\3&\3&\3&\7&\u01d5\n&\f&\16&\u01d8\13&\3\'\3\'\3(\3(\3(\3(\3(\6"+
		"(\u01e1\n(\r(\16(\u01e2\3)\3)\3)\3)\3)\3)\3)\7)\u01ec\n)\f)\16)\u01ef"+
		"\13)\3*\3*\3*\3*\3*\3*\3*\7*\u01f8\n*\f*\16*\u01fb\13*\3+\3+\3+\3+\3+"+
		"\3+\3+\7+\u0204\n+\f+\16+\u0207\13+\3,\3,\3,\3,\3,\3,\3,\7,\u0210\n,\f"+
		",\16,\u0213\13,\3-\3-\3-\3-\3-\3-\3-\7-\u021c\n-\f-\16-\u021f\13-\3.\3"+
		".\3.\3.\3.\3.\3.\7.\u0228\n.\f.\16.\u022b\13.\3/\3/\3/\3/\3/\3/\3/\7/"+
		"\u0234\n/\f/\16/\u0237\13/\3\60\3\60\3\60\3\60\5\60\u023d\n\60\3\61\3"+
		"\61\3\61\3\61\3\61\3\61\3\61\5\61\u0246\n\61\3\62\3\62\3\62\3\62\3\63"+
		"\3\63\3\63\3\63\7\63\u0250\n\63\f\63\16\63\u0253\13\63\3\63\7\63\u0256"+
		"\n\63\f\63\16\63\u0259\13\63\3\64\3\64\3\64\3\64\7\64\u025f\n\64\f\64"+
		"\16\64\u0262\13\64\3\64\7\64\u0265\n\64\f\64\16\64\u0268\13\64\3\65\3"+
		"\65\3\65\7\65\u026d\n\65\f\65\16\65\u0270\13\65\3\65\7\65\u0273\n\65\f"+
		"\65\16\65\u0276\13\65\3\66\3\66\7\66\u027a\n\66\f\66\16\66\u027d\13\66"+
		"\3\67\3\67\7\67\u0281\n\67\f\67\16\67\u0284\13\67\3\67\7\67\u0287\n\67"+
		"\f\67\16\67\u028a\13\67\38\38\38\58\u028f\n8\38\78\u0292\n8\f8\168\u0295"+
		"\138\39\39\59\u0299\n9\3:\3:\3:\3:\5:\u029f\n:\3:\5:\u02a2\n:\3;\3;\3"+
		";\3;\3;\3;\3;\7;\u02ab\n;\f;\16;\u02ae\13;\3<\3<\3<\3<\3<\3<\3<\7<\u02b7"+
		"\n<\f<\16<\u02ba\13<\3=\3=\3=\3=\3=\3=\3=\7=\u02c3\n=\f=\16=\u02c6\13"+
		"=\3>\3>\3>\3>\3>\3>\3>\7>\u02cf\n>\f>\16>\u02d2\13>\3?\3?\3?\3?\3?\3?"+
		"\3?\7?\u02db\n?\f?\16?\u02de\13?\3@\3@\3@\3@\3@\3@\3@\7@\u02e7\n@\f@\16"+
		"@\u02ea\13@\3A\3A\3A\3A\3A\3A\3A\7A\u02f3\nA\fA\16A\u02f6\13A\3B\3B\3"+
		"B\3B\5B\u02fc\nB\3C\3C\3C\3C\5C\u0302\nC\3D\3D\3D\3D\3D\3D\3D\3D\3D\5"+
		"D\u030d\nD\3E\3E\3E\3E\3E\3E\3E\3E\6E\u0317\nE\rE\16E\u0318\3E\3E\5E\u031d"+
		"\nE\3F\3F\3F\3F\3G\3G\3G\7G\u0326\nG\fG\16G\u0329\13G\3H\3H\5H\u032d\n"+
		"H\3H\3H\3I\3I\5I\u0333\nI\3J\3J\3J\3J\3J\3J\5J\u033b\nJ\3K\3K\3K\3K\3"+
		"K\3K\5K\u0343\nK\3L\3L\3M\3M\3N\3N\3O\3O\3P\3P\3Q\3Q\3R\3R\3S\3S\3T\3"+
		"T\3U\3U\3V\3V\3W\3W\3X\3X\3Y\3Y\3Z\3Z\3[\3[\3\\\3\\\3]\3]\3^\3^\3^\3^"+
		"\2\20PRTVXZ\\tvxz|~\u0080_\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$"+
		"&(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprtvxz|~\u0080\u0082\u0084"+
		"\u0086\u0088\u008a\u008c\u008e\u0090\u0092\u0094\u0096\u0098\u009a\u009c"+
		"\u009e\u00a0\u00a2\u00a4\u00a6\u00a8\u00aa\u00ac\u00ae\u00b0\u00b2\u00b4"+
		"\u00b6\u00b8\u00ba\2\17\3\28:\3\2;<\3\2JK\4\2\t\t\22\30\3\2\31\32\3\2"+
		"\33\34\3\2\35\36\3\2\37\"\3\2#$\3\2%\'\3\2()\4\2#$*+\3\2,-\2\u0376\2\u00c2"+
		"\3\2\2\2\4\u00c8\3\2\2\2\6\u00cb\3\2\2\2\b\u00d0\3\2\2\2\n\u00d9\3\2\2"+
		"\2\f\u00df\3\2\2\2\16\u00e8\3\2\2\2\20\u00f0\3\2\2\2\22\u00fe\3\2\2\2"+
		"\24\u0107\3\2\2\2\26\u0109\3\2\2\2\30\u010c\3\2\2\2\32\u010e\3\2\2\2\34"+
		"\u0113\3\2\2\2\36\u0118\3\2\2\2 \u0120\3\2\2\2\"\u012d\3\2\2\2$\u012f"+
		"\3\2\2\2&\u013c\3\2\2\2(\u014d\3\2\2\2*\u014f\3\2\2\2,\u0156\3\2\2\2."+
		"\u015a\3\2\2\2\60\u015f\3\2\2\2\62\u0176\3\2\2\2\64\u0180\3\2\2\2\66\u0182"+
		"\3\2\2\28\u0187\3\2\2\2:\u0199\3\2\2\2<\u019b\3\2\2\2>\u01a0\3\2\2\2@"+
		"\u01aa\3\2\2\2B\u01b2\3\2\2\2D\u01bb\3\2\2\2F\u01cb\3\2\2\2H\u01cd\3\2"+
		"\2\2J\u01d1\3\2\2\2L\u01d9\3\2\2\2N\u01db\3\2\2\2P\u01e4\3\2\2\2R\u01f0"+
		"\3\2\2\2T\u01fc\3\2\2\2V\u0208\3\2\2\2X\u0214\3\2\2\2Z\u0220\3\2\2\2\\"+
		"\u022c\3\2\2\2^\u023c\3\2\2\2`\u0245\3\2\2\2b\u0247\3\2\2\2d\u024b\3\2"+
		"\2\2f\u025a\3\2\2\2h\u0269\3\2\2\2j\u0277\3\2\2\2l\u027e\3\2\2\2n\u028e"+
		"\3\2\2\2p\u0298\3\2\2\2r\u02a1\3\2\2\2t\u02a3\3\2\2\2v\u02af\3\2\2\2x"+
		"\u02bb\3\2\2\2z\u02c7\3\2\2\2|\u02d3\3\2\2\2~\u02df\3\2\2\2\u0080\u02eb"+
		"\3\2\2\2\u0082\u02fb\3\2\2\2\u0084\u0301\3\2\2\2\u0086\u030c\3\2\2\2\u0088"+
		"\u031c\3\2\2\2\u008a\u031e\3\2\2\2\u008c\u0322\3\2\2\2\u008e\u032a\3\2"+
		"\2\2\u0090\u0332\3\2\2\2\u0092\u033a\3\2\2\2\u0094\u0342\3\2\2\2\u0096"+
		"\u0344\3\2\2\2\u0098\u0346\3\2\2\2\u009a\u0348\3\2\2\2\u009c\u034a\3\2"+
		"\2\2\u009e\u034c\3\2\2\2\u00a0\u034e\3\2\2\2\u00a2\u0350\3\2\2\2\u00a4"+
		"\u0352\3\2\2\2\u00a6\u0354\3\2\2\2\u00a8\u0356\3\2\2\2\u00aa\u0358\3\2"+
		"\2\2\u00ac\u035a\3\2\2\2\u00ae\u035c\3\2\2\2\u00b0\u035e\3\2\2\2\u00b2"+
		"\u0360\3\2\2\2\u00b4\u0362\3\2\2\2\u00b6\u0364\3\2\2\2\u00b8\u0366\3\2"+
		"\2\2\u00ba\u0368\3\2\2\2\u00bc\u00c1\5\6\4\2\u00bd\u00c1\5\20\t\2\u00be"+
		"\u00c1\5@!\2\u00bf\u00c1\5\66\34\2\u00c0\u00bc\3\2\2\2\u00c0\u00bd\3\2"+
		"\2\2\u00c0\u00be\3\2\2\2\u00c0\u00bf\3\2\2\2\u00c1\u00c4\3\2\2\2\u00c2"+
		"\u00c0\3\2\2\2\u00c2\u00c3\3\2\2\2\u00c3\u00c5\3\2\2\2\u00c4\u00c2\3\2"+
		"\2\2\u00c5\u00c6\5\4\3\2\u00c6\u00c7\7\2\2\3\u00c7\3\3\2\2\2\u00c8\u00c9"+
		"\7.\2\2\u00c9\u00ca\5 \21\2\u00ca\5\3\2\2\2\u00cb\u00cc\7/\2\2\u00cc\u00cd"+
		"\5\b\5\2\u00cd\u00ce\5\n\6\2\u00ce\u00cf\5 \21\2\u00cf\7\3\2\2\2\u00d0"+
		"\u00d4\5\u0090I\2\u00d1\u00d3\5\u00ba^\2\u00d2\u00d1\3\2\2\2\u00d3\u00d6"+
		"\3\2\2\2\u00d4\u00d2\3\2\2\2\u00d4\u00d5\3\2\2\2\u00d5\u00d7\3\2\2\2\u00d6"+
		"\u00d4\3\2\2\2\u00d7\u00d8\5\u0096L\2\u00d8\t\3\2\2\2\u00d9\u00db\7\3"+
		"\2\2\u00da\u00dc\5\16\b\2\u00db\u00da\3\2\2\2\u00db\u00dc\3\2\2\2\u00dc"+
		"\u00dd\3\2\2\2\u00dd\u00de\7\4\2\2\u00de\13\3\2\2\2\u00df\u00e3\5\u0094"+
		"K\2\u00e0\u00e2\5B\"\2\u00e1\u00e0\3\2\2\2\u00e2\u00e5\3\2\2\2\u00e3\u00e1"+
		"\3\2\2\2\u00e3\u00e4\3\2\2\2\u00e4\u00e6\3\2\2\2\u00e5\u00e3\3\2\2\2\u00e6"+
		"\u00e7\5\u0096L\2\u00e7\r\3\2\2\2\u00e8\u00ed\5\f\7\2\u00e9\u00ea\7\5"+
		"\2\2\u00ea\u00ec\5\f\7\2\u00eb\u00e9\3\2\2\2\u00ec\u00ef\3\2\2\2\u00ed"+
		"\u00eb\3\2\2\2\u00ed\u00ee\3\2\2\2\u00ee\17\3\2\2\2\u00ef\u00ed\3\2\2"+
		"\2\u00f0\u00f1\7\60\2\2\u00f1\u00f3\5\u0096L\2\u00f2\u00f4\5\26\f\2\u00f3"+
		"\u00f2\3\2\2\2\u00f3\u00f4\3\2\2\2\u00f4\u00f5\3\2\2\2\u00f5\u00f9\7\6"+
		"\2\2\u00f6\u00f8\5\22\n\2\u00f7\u00f6\3\2\2\2\u00f8\u00fb\3\2\2\2\u00f9"+
		"\u00f7\3\2\2\2\u00f9\u00fa\3\2\2\2\u00fa\u00fc\3\2\2\2\u00fb\u00f9\3\2"+
		"\2\2\u00fc\u00fd\7\7\2\2\u00fd\21\3\2\2\2\u00fe\u0100\5\30\r\2\u00ff\u0101"+
		"\5\24\13\2\u0100\u00ff\3\2\2\2\u0101\u0102\3\2\2\2\u0102\u0100\3\2\2\2"+
		"\u0102\u0103\3\2\2\2\u0103\23\3\2\2\2\u0104\u0108\5\32\16\2\u0105\u0108"+
		"\5\36\20\2\u0106\u0108\5\34\17\2\u0107\u0104\3\2\2\2\u0107\u0105\3\2\2"+
		"\2\u0107\u0106\3\2\2\2\u0108\25\3\2\2\2\u0109\u010a\7\67\2\2\u010a\u010b"+
		"\5\u0096L\2\u010b\27\3\2\2\2\u010c\u010d\t\2\2\2\u010d\31\3\2\2\2\u010e"+
		"\u010f\7\66\2\2\u010f\u0110\5\u0096L\2\u0110\u0111\5\n\6\2\u0111\u0112"+
		"\5 \21\2\u0112\33\3\2\2\2\u0113\u0114\7\65\2\2\u0114\u0115\5\b\5\2\u0115"+
		"\u0116\5\n\6\2\u0116\u0117\5 \21\2\u0117\35\3\2\2\2\u0118\u0119\7\62\2"+
		"\2\u0119\u011a\5\u0098M\2\u011a\u011c\5\f\7\2\u011b\u011d\5D#\2\u011c"+
		"\u011b\3\2\2\2\u011c\u011d\3\2\2\2\u011d\u011e\3\2\2\2\u011e\u011f\7S"+
		"\2\2\u011f\37\3\2\2\2\u0120\u0124\7\6\2\2\u0121\u0123\5\"\22\2\u0122\u0121"+
		"\3\2\2\2\u0123\u0126\3\2\2\2\u0124\u0122\3\2\2\2\u0124\u0125\3\2\2\2\u0125"+
		"\u0127\3\2\2\2\u0126\u0124\3\2\2\2\u0127\u0128\7\7\2\2\u0128!\3\2\2\2"+
		"\u0129\u012e\5(\25\2\u012a\u012b\5\62\32\2\u012b\u012c\7S\2\2\u012c\u012e"+
		"\3\2\2\2\u012d\u0129\3\2\2\2\u012d\u012a\3\2\2\2\u012e#\3\2\2\2\u012f"+
		"\u0133\7\6\2\2\u0130\u0132\5&\24\2\u0131\u0130\3\2\2\2\u0132\u0135\3\2"+
		"\2\2\u0133\u0131\3\2\2\2\u0133\u0134\3\2\2\2\u0134\u0136\3\2\2\2\u0135"+
		"\u0133\3\2\2\2\u0136\u0137\7\7\2\2\u0137%\3\2\2\2\u0138\u013d\5(\25\2"+
		"\u0139\u013a\5\64\33\2\u013a\u013b\7S\2\2\u013b\u013d\3\2\2\2\u013c\u0138"+
		"\3\2\2\2\u013c\u0139\3\2\2\2\u013d\'\3\2\2\2\u013e\u014e\5*\26\2\u013f"+
		"\u014e\5,\27\2\u0140\u0141\5.\30\2\u0141\u0142\7S\2\2\u0142\u014e\3\2"+
		"\2\2\u0143\u014e\5\60\31\2\u0144\u014e\58\35\2\u0145\u014e\5\66\34\2\u0146"+
		"\u014e\5 \21\2\u0147\u0148\5> \2\u0148\u0149\7S\2\2\u0149\u014e\3\2\2"+
		"\2\u014a\u014b\5r:\2\u014b\u014c\7S\2\2\u014c\u014e\3\2\2\2\u014d\u013e"+
		"\3\2\2\2\u014d\u013f\3\2\2\2\u014d\u0140\3\2\2\2\u014d\u0143\3\2\2\2\u014d"+
		"\u0144\3\2\2\2\u014d\u0145\3\2\2\2\u014d\u0146\3\2\2\2\u014d\u0147\3\2"+
		"\2\2\u014d\u014a\3\2\2\2\u014e)\3\2\2\2\u014f\u0150\7=\2\2\u0150\u0151"+
		"\5<\37\2\u0151\u0154\5 \21\2\u0152\u0153\7>\2\2\u0153\u0155\5 \21\2\u0154"+
		"\u0152\3\2\2\2\u0154\u0155\3\2\2\2\u0155+\3\2\2\2\u0156\u0157\7?\2\2\u0157"+
		"\u0158\5<\37\2\u0158\u0159\5$\23\2\u0159-\3\2\2\2\u015a\u015b\7@\2\2\u015b"+
		"\u015c\5$\23\2\u015c\u015d\7?\2\2\u015d\u015e\5<\37\2\u015e/\3\2\2\2\u015f"+
		"\u0160\7A\2\2\u0160\u0163\7\3\2\2\u0161\u0164\5> \2\u0162\u0164\5t;\2"+
		"\u0163\u0161\3\2\2\2\u0163\u0162\3\2\2\2\u0163\u0164\3\2\2\2\u0164\u0165"+
		"\3\2\2\2\u0165\u0167\7S\2\2\u0166\u0168\5t;\2\u0167\u0166\3\2\2\2\u0167"+
		"\u0168\3\2\2\2\u0168\u0169\3\2\2\2\u0169\u016b\7S\2\2\u016a\u016c\5t;"+
		"\2\u016b\u016a\3\2\2\2\u016b\u016c\3\2\2\2\u016c\u016d\3\2\2\2\u016d\u016e"+
		"\7\4\2\2\u016e\u016f\5$\23\2\u016f\61\3\2\2\2\u0170\u0171\7D\2\2\u0171"+
		"\u0177\5\u0096L\2\u0172\u0174\7E\2\2\u0173\u0175\5r:\2\u0174\u0173\3\2"+
		"\2\2\u0174\u0175\3\2\2\2\u0175\u0177\3\2\2\2\u0176\u0170\3\2\2\2\u0176"+
		"\u0172\3\2\2\2\u0177\63\3\2\2\2\u0178\u0181\7C\2\2\u0179\u0181\7B\2\2"+
		"\u017a\u017b\7D\2\2\u017b\u0181\5\u0096L\2\u017c\u017e\7E\2\2\u017d\u017f"+
		"\5r:\2\u017e\u017d\3\2\2\2\u017e\u017f\3\2\2\2\u017f\u0181\3\2\2\2\u0180"+
		"\u0178\3\2\2\2\u0180\u0179\3\2\2\2\u0180\u017a\3\2\2\2\u0180\u017c\3\2"+
		"\2\2\u0181\65\3\2\2\2\u0182\u0183\7F\2\2\u0183\u0185\5\u0096L\2\u0184"+
		"\u0186\5 \21\2\u0185\u0184\3\2\2\2\u0185\u0186\3\2\2\2\u0186\67\3\2\2"+
		"\2\u0187\u0188\7G\2\2\u0188\u0189\5<\37\2\u0189\u018b\7\6\2\2\u018a\u018c"+
		"\5:\36\2\u018b\u018a\3\2\2\2\u018c\u018d\3\2\2\2\u018d\u018b\3\2\2\2\u018d"+
		"\u018e\3\2\2\2\u018e\u018f\3\2\2\2\u018f\u0190\7\7\2\2\u01909\3\2\2\2"+
		"\u0191\u0192\7H\2\2\u0192\u0193\5P)\2\u0193\u0194\7\b\2\2\u0194\u0195"+
		"\5 \21\2\u0195\u019a\3\2\2\2\u0196\u0197\7I\2\2\u0197\u0198\7\b\2\2\u0198"+
		"\u019a\5 \21\2\u0199\u0191\3\2\2\2\u0199\u0196\3\2\2\2\u019a;\3\2\2\2"+
		"\u019b\u019c\7\3\2\2\u019c\u019d\5t;\2\u019d\u019e\7\4\2\2\u019e=\3\2"+
		"\2\2\u019f\u01a1\5\u0098M\2\u01a0\u019f\3\2\2\2\u01a0\u01a1\3\2\2\2\u01a1"+
		"\u01a2\3\2\2\2\u01a2\u01a8\5\f\7\2\u01a3\u01a6\7\t\2\2\u01a4\u01a7\5t"+
		";\2\u01a5\u01a7\5\u0088E\2\u01a6\u01a4\3\2\2\2\u01a6\u01a5\3\2\2\2\u01a7"+
		"\u01a9\3\2\2\2\u01a8\u01a3\3\2\2\2\u01a8\u01a9\3\2\2\2\u01a9?\3\2\2\2"+
		"\u01aa\u01ac\7\64\2\2\u01ab\u01ad\5\u0098M\2\u01ac\u01ab\3\2\2\2\u01ac"+
		"\u01ad\3\2\2\2\u01ad\u01ae\3\2\2\2\u01ae\u01af\5\f\7\2\u01af\u01b0\5D"+
		"#\2\u01b0\u01b1\7S\2\2\u01b1A\3\2\2\2\u01b2\u01b4\7\n\2\2\u01b3\u01b5"+
		"\5P)\2\u01b4\u01b3\3\2\2\2\u01b4\u01b5\3\2\2\2\u01b5\u01b6\3\2\2\2\u01b6"+
		"\u01b7\7\13\2\2\u01b7C\3\2\2\2\u01b8\u01b9\7\t\2\2\u01b9\u01bc\5P)\2\u01ba"+
		"\u01bc\5F$\2\u01bb\u01b8\3\2\2\2\u01bb\u01ba\3\2\2\2\u01bcE\3\2\2\2\u01bd"+
		"\u01be\7\6\2\2\u01be\u01bf\5J&\2\u01bf\u01c0\7\7\2\2\u01c0\u01cc\3\2\2"+
		"\2\u01c1\u01c2\7\6\2\2\u01c2\u01c5\5H%\2\u01c3\u01c4\7\5\2\2\u01c4\u01c6"+
		"\5H%\2\u01c5\u01c3\3\2\2\2\u01c6\u01c7\3\2\2\2\u01c7\u01c5\3\2\2\2\u01c7"+
		"\u01c8\3\2\2\2\u01c8\u01c9\3\2\2\2\u01c9\u01ca\7\7\2\2\u01ca\u01cc\3\2"+
		"\2\2\u01cb\u01bd\3\2\2\2\u01cb\u01c1\3\2\2\2\u01ccG\3\2\2\2\u01cd\u01ce"+
		"\7\6\2\2\u01ce\u01cf\5J&\2\u01cf\u01d0\7\7\2\2\u01d0I\3\2\2\2\u01d1\u01d6"+
		"\5P)\2\u01d2\u01d3\7\5\2\2\u01d3\u01d5\5P)\2\u01d4\u01d2\3\2\2\2\u01d5"+
		"\u01d8\3\2\2\2\u01d6\u01d4\3\2\2\2\u01d6\u01d7\3\2\2\2\u01d7K\3\2\2\2"+
		"\u01d8\u01d6\3\2\2\2\u01d9\u01da\5\u0096L\2\u01daM\3\2\2\2\u01db\u01e0"+
		"\5\u0096L\2\u01dc\u01dd\7\n\2\2\u01dd\u01de\5P)\2\u01de\u01df\7\13\2\2"+
		"\u01df\u01e1\3\2\2\2\u01e0\u01dc\3\2\2\2\u01e1\u01e2\3\2\2\2\u01e2\u01e0"+
		"\3\2\2\2\u01e2\u01e3\3\2\2\2\u01e3O\3\2\2\2\u01e4\u01e5\b)\1\2\u01e5\u01e6"+
		"\5R*\2\u01e6\u01ed\3\2\2\2\u01e7\u01e8\f\4\2\2\u01e8\u01e9\5\u00a8U\2"+
		"\u01e9\u01ea\5R*\2\u01ea\u01ec\3\2\2\2\u01eb\u01e7\3\2\2\2\u01ec\u01ef"+
		"\3\2\2\2\u01ed\u01eb\3\2\2\2\u01ed\u01ee\3\2\2\2\u01eeQ\3\2\2\2\u01ef"+
		"\u01ed\3\2\2\2\u01f0\u01f1\b*\1\2\u01f1\u01f2\5T+\2\u01f2\u01f9\3\2\2"+
		"\2\u01f3\u01f4\f\4\2\2\u01f4\u01f5\5\u00aaV\2\u01f5\u01f6\5T+\2\u01f6"+
		"\u01f8\3\2\2\2\u01f7\u01f3\3\2\2\2\u01f8\u01fb\3\2\2\2\u01f9\u01f7\3\2"+
		"\2\2\u01f9\u01fa\3\2\2\2\u01faS\3\2\2\2\u01fb\u01f9\3\2\2\2\u01fc\u01fd"+
		"\b+\1\2\u01fd\u01fe\5V,\2\u01fe\u0205\3\2\2\2\u01ff\u0200\f\4\2\2\u0200"+
		"\u0201\5\u00acW\2\u0201\u0202\5V,\2\u0202\u0204\3\2\2\2\u0203\u01ff\3"+
		"\2\2\2\u0204\u0207\3\2\2\2\u0205\u0203\3\2\2\2\u0205\u0206\3\2\2\2\u0206"+
		"U\3\2\2\2\u0207\u0205\3\2\2\2\u0208\u0209\b,\1\2\u0209\u020a\5X-\2\u020a"+
		"\u0211\3\2\2\2\u020b\u020c\f\4\2\2\u020c\u020d\5\u00aeX\2\u020d\u020e"+
		"\5X-\2\u020e\u0210\3\2\2\2\u020f\u020b\3\2\2\2\u0210\u0213\3\2\2\2\u0211"+
		"\u020f\3\2\2\2\u0211\u0212\3\2\2\2\u0212W\3\2\2\2\u0213\u0211\3\2\2\2"+
		"\u0214\u0215\b-\1\2\u0215\u0216\5Z.\2\u0216\u021d\3\2\2\2\u0217\u0218"+
		"\f\4\2\2\u0218\u0219\5\u00b0Y\2\u0219\u021a\5Z.\2\u021a\u021c\3\2\2\2"+
		"\u021b\u0217\3\2\2\2\u021c\u021f\3\2\2\2\u021d\u021b\3\2\2\2\u021d\u021e"+
		"\3\2\2\2\u021eY\3\2\2\2\u021f\u021d\3\2\2\2\u0220\u0221\b.\1\2\u0221\u0222"+
		"\5\\/\2\u0222\u0229\3\2\2\2\u0223\u0224\f\4\2\2\u0224\u0225\5\u00b2Z\2"+
		"\u0225\u0226\5\\/\2\u0226\u0228\3\2\2\2\u0227\u0223\3\2\2\2\u0228\u022b"+
		"\3\2\2\2\u0229\u0227\3\2\2\2\u0229\u022a\3\2\2\2\u022a[\3\2\2\2\u022b"+
		"\u0229\3\2\2\2\u022c\u022d\b/\1\2\u022d\u022e\5^\60\2\u022e\u0235\3\2"+
		"\2\2\u022f\u0230\f\4\2\2\u0230\u0231\5\u00b4[\2\u0231\u0232\5^\60\2\u0232"+
		"\u0234\3\2\2\2\u0233\u022f\3\2\2\2\u0234\u0237\3\2\2\2\u0235\u0233\3\2"+
		"\2\2\u0235\u0236\3\2\2\2\u0236]\3\2\2\2\u0237\u0235\3\2\2\2\u0238\u0239"+
		"\5\u00b6\\\2\u0239\u023a\5`\61\2\u023a\u023d\3\2\2\2\u023b\u023d\5`\61"+
		"\2\u023c\u0238\3\2\2\2\u023c\u023b\3\2\2\2\u023d_\3\2\2\2\u023e\u0246"+
		"\5\u0092J\2\u023f\u0240\7\3\2\2\u0240\u0241\5P)\2\u0241\u0242\7\4\2\2"+
		"\u0242\u0246\3\2\2\2\u0243\u0246\5L\'\2\u0244\u0246\5N(\2\u0245\u023e"+
		"\3\2\2\2\u0245\u023f\3\2\2\2\u0245\u0243\3\2\2\2\u0245\u0244\3\2\2\2\u0246"+
		"a\3\2\2\2\u0247\u0248\7\n\2\2\u0248\u0249\5r:\2\u0249\u024a\7\13\2\2\u024a"+
		"c\3\2\2\2\u024b\u024c\7\f\2\2\u024c\u024d\5\u0096L\2\u024d\u0251\5\u008e"+
		"H\2\u024e\u0250\5b\62\2\u024f\u024e\3\2\2\2\u0250\u0253\3\2\2\2\u0251"+
		"\u024f\3\2\2\2\u0251\u0252\3\2\2\2\u0252\u0257\3\2\2\2\u0253\u0251\3\2"+
		"\2\2\u0254\u0256\5n8\2\u0255\u0254\3\2\2\2\u0256\u0259\3\2\2\2\u0257\u0255"+
		"\3\2\2\2\u0257\u0258\3\2\2\2\u0258e\3\2\2\2\u0259\u0257\3\2\2\2\u025a"+
		"\u025b\7N\2\2\u025b\u025c\5\u0096L\2\u025c\u0260\5\u008eH\2\u025d\u025f"+
		"\5b\62\2\u025e\u025d\3\2\2\2\u025f\u0262\3\2\2\2\u0260\u025e\3\2\2\2\u0260"+
		"\u0261\3\2\2\2\u0261\u0266\3\2\2\2\u0262\u0260\3\2\2\2\u0263\u0265\5n"+
		"8\2\u0264\u0263\3\2\2\2\u0265\u0268\3\2\2\2\u0266\u0264\3\2\2\2\u0266"+
		"\u0267\3\2\2\2\u0267g\3\2\2\2\u0268\u0266\3\2\2\2\u0269\u026a\5\u0096"+
		"L\2\u026a\u026e\5\u008eH\2\u026b\u026d\5b\62\2\u026c\u026b\3\2\2\2\u026d"+
		"\u0270\3\2\2\2\u026e\u026c\3\2\2\2\u026e\u026f\3\2\2\2\u026f\u0274\3\2"+
		"\2\2\u0270\u026e\3\2\2\2\u0271\u0273\5n8\2\u0272\u0271\3\2\2\2\u0273\u0276"+
		"\3\2\2\2\u0274\u0272\3\2\2\2\u0274\u0275\3\2\2\2\u0275i\3\2\2\2\u0276"+
		"\u0274\3\2\2\2\u0277\u027b\7L\2\2\u0278\u027a\5n8\2\u0279\u0278\3\2\2"+
		"\2\u027a\u027d\3\2\2\2\u027b\u0279\3\2\2\2\u027b\u027c\3\2\2\2\u027ck"+
		"\3\2\2\2\u027d\u027b\3\2\2\2\u027e\u0282\5\u0096L\2\u027f\u0281\5b\62"+
		"\2\u0280\u027f\3\2\2\2\u0281\u0284\3\2\2\2\u0282\u0280\3\2\2\2\u0282\u0283"+
		"\3\2\2\2\u0283\u0288\3\2\2\2\u0284\u0282\3\2\2\2\u0285\u0287\5n8\2\u0286"+
		"\u0285\3\2\2\2\u0287\u028a\3\2\2\2\u0288\u0286\3\2\2\2\u0288\u0289\3\2"+
		"\2\2\u0289m\3\2\2\2\u028a\u0288\3\2\2\2\u028b\u028c\7\f\2\2\u028c\u028f"+
		"\5\u0096L\2\u028d\u028f\5d\63\2\u028e\u028b\3\2\2\2\u028e\u028d\3\2\2"+
		"\2\u028f\u0293\3\2\2\2\u0290\u0292\5b\62\2\u0291\u0290\3\2\2\2\u0292\u0295"+
		"\3\2\2\2\u0293\u0291\3\2\2\2\u0293\u0294\3\2\2\2\u0294o\3\2\2\2\u0295"+
		"\u0293\3\2\2\2\u0296\u0299\5j\66\2\u0297\u0299\5l\67\2\u0298\u0296\3\2"+
		"\2\2\u0298\u0297\3\2\2\2\u0299q\3\2\2\2\u029a\u029b\5p9\2\u029b\u029e"+
		"\5\u00a6T\2\u029c\u029f\5r:\2\u029d\u029f\5\u0088E\2\u029e\u029c\3\2\2"+
		"\2\u029e\u029d\3\2\2\2\u029f\u02a2\3\2\2\2\u02a0\u02a2\5t;\2\u02a1\u029a"+
		"\3\2\2\2\u02a1\u02a0\3\2\2\2\u02a2s\3\2\2\2\u02a3\u02a4\b;\1\2\u02a4\u02a5"+
		"\5v<\2\u02a5\u02ac\3\2\2\2\u02a6\u02a7\f\4\2\2\u02a7\u02a8\5\u00a8U\2"+
		"\u02a8\u02a9\5v<\2\u02a9\u02ab\3\2\2\2\u02aa\u02a6\3\2\2\2\u02ab\u02ae"+
		"\3\2\2\2\u02ac\u02aa\3\2\2\2\u02ac\u02ad\3\2\2\2\u02adu\3\2\2\2\u02ae"+
		"\u02ac\3\2\2\2\u02af\u02b0\b<\1\2\u02b0\u02b1\5x=\2\u02b1\u02b8\3\2\2"+
		"\2\u02b2\u02b3\f\4\2\2\u02b3\u02b4\5\u00aaV\2\u02b4\u02b5\5x=\2\u02b5"+
		"\u02b7\3\2\2\2\u02b6\u02b2\3\2\2\2\u02b7\u02ba\3\2\2\2\u02b8\u02b6\3\2"+
		"\2\2\u02b8\u02b9\3\2\2\2\u02b9w\3\2\2\2\u02ba\u02b8\3\2\2\2\u02bb\u02bc"+
		"\b=\1\2\u02bc\u02bd\5z>\2\u02bd\u02c4\3\2\2\2\u02be\u02bf\f\4\2\2\u02bf"+
		"\u02c0\5\u00acW\2\u02c0\u02c1\5z>\2\u02c1\u02c3\3\2\2\2\u02c2\u02be\3"+
		"\2\2\2\u02c3\u02c6\3\2\2\2\u02c4\u02c2\3\2\2\2\u02c4\u02c5\3\2\2\2\u02c5"+
		"y\3\2\2\2\u02c6\u02c4\3\2\2\2\u02c7\u02c8\b>\1\2\u02c8\u02c9\5|?\2\u02c9"+
		"\u02d0\3\2\2\2\u02ca\u02cb\f\4\2\2\u02cb\u02cc\5\u00aeX\2\u02cc\u02cd"+
		"\5|?\2\u02cd\u02cf\3\2\2\2\u02ce\u02ca\3\2\2\2\u02cf\u02d2\3\2\2\2\u02d0"+
		"\u02ce\3\2\2\2\u02d0\u02d1\3\2\2\2\u02d1{\3\2\2\2\u02d2\u02d0\3\2\2\2"+
		"\u02d3\u02d4\b?\1\2\u02d4\u02d5\5~@\2\u02d5\u02dc\3\2\2\2\u02d6\u02d7"+
		"\f\4\2\2\u02d7\u02d8\5\u00b0Y\2\u02d8\u02d9\5~@\2\u02d9\u02db\3\2\2\2"+
		"\u02da\u02d6\3\2\2\2\u02db\u02de\3\2\2\2\u02dc\u02da\3\2\2\2\u02dc\u02dd"+
		"\3\2\2\2\u02dd}\3\2\2\2\u02de\u02dc\3\2\2\2\u02df\u02e0\b@\1\2\u02e0\u02e1"+
		"\5\u0080A\2\u02e1\u02e8\3\2\2\2\u02e2\u02e3\f\4\2\2\u02e3\u02e4\5\u00b2"+
		"Z\2\u02e4\u02e5\5\u0080A\2\u02e5\u02e7\3\2\2\2\u02e6\u02e2\3\2\2\2\u02e7"+
		"\u02ea\3\2\2\2\u02e8\u02e6\3\2\2\2\u02e8\u02e9\3\2\2\2\u02e9\177\3\2\2"+
		"\2\u02ea\u02e8\3\2\2\2\u02eb\u02ec\bA\1\2\u02ec\u02ed\5\u0082B\2\u02ed"+
		"\u02f4\3\2\2\2\u02ee\u02ef\f\4\2\2\u02ef\u02f0\5\u00b4[\2\u02f0\u02f1"+
		"\5\u0082B\2\u02f1\u02f3\3\2\2\2\u02f2\u02ee\3\2\2\2\u02f3\u02f6\3\2\2"+
		"\2\u02f4\u02f2\3\2\2\2\u02f4\u02f5\3\2\2\2\u02f5\u0081\3\2\2\2\u02f6\u02f4"+
		"\3\2\2\2\u02f7\u02f8\5\u00b6\\\2\u02f8\u02f9\5\u0082B\2\u02f9\u02fc\3"+
		"\2\2\2\u02fa\u02fc\5\u0084C\2\u02fb\u02f7\3\2\2\2\u02fb\u02fa\3\2\2\2"+
		"\u02fc\u0083\3\2\2\2\u02fd\u02fe\5\u0086D\2\u02fe\u02ff\5\u00b8]\2\u02ff"+
		"\u0302\3\2\2\2\u0300\u0302\5\u0086D\2\u0301\u02fd\3\2\2\2\u0301\u0300"+
		"\3\2\2\2\u0302\u0085\3\2\2\2\u0303\u0304\7\3\2\2\u0304\u0305\5t;\2\u0305"+
		"\u0306\7\4\2\2\u0306\u030d\3\2\2\2\u0307\u030d\5f\64\2\u0308\u030d\5h"+
		"\65\2\u0309\u030d\5l\67\2\u030a\u030d\5j\66\2\u030b\u030d\5\u0092J\2\u030c"+
		"\u0303\3\2\2\2\u030c\u0307\3\2\2\2\u030c\u0308\3\2\2\2\u030c\u0309\3\2"+
		"\2\2\u030c\u030a\3\2\2\2\u030c\u030b\3\2\2\2\u030d\u0087\3\2\2\2\u030e"+
		"\u030f\7\6\2\2\u030f\u0310\5\u008cG\2\u0310\u0311\7\7\2\2\u0311\u031d"+
		"\3\2\2\2\u0312\u0313\7\6\2\2\u0313\u0316\5\u008aF\2\u0314\u0315\7\5\2"+
		"\2\u0315\u0317\5\u008aF\2\u0316\u0314\3\2\2\2\u0317\u0318\3\2\2\2\u0318"+
		"\u0316\3\2\2\2\u0318\u0319\3\2\2\2\u0319\u031a\3\2\2\2\u031a\u031b\7\7"+
		"\2\2\u031b\u031d\3\2\2\2\u031c\u030e\3\2\2\2\u031c\u0312\3\2\2\2\u031d"+
		"\u0089\3\2\2\2\u031e\u031f\7\6\2\2\u031f\u0320\5\u008cG\2\u0320\u0321"+
		"\7\7\2\2\u0321\u008b\3\2\2\2\u0322\u0327\5t;\2\u0323\u0324\7\5\2\2\u0324"+
		"\u0326\5t;\2\u0325\u0323\3\2\2\2\u0326\u0329\3\2\2\2\u0327\u0325\3\2\2"+
		"\2\u0327\u0328\3\2\2\2\u0328\u008d\3\2\2\2\u0329\u0327\3\2\2\2\u032a\u032c"+
		"\7\3\2\2\u032b\u032d\5\u008cG\2\u032c\u032b\3\2\2\2\u032c\u032d\3\2\2"+
		"\2\u032d\u032e\3\2\2\2\u032e\u032f\7\4\2\2\u032f\u008f\3\2\2\2\u0330\u0333"+
		"\7\61\2\2\u0331\u0333\5\u0094K\2\u0332\u0330\3\2\2\2\u0332\u0331\3\2\2"+
		"\2\u0333\u0091\3\2\2\2\u0334\u033b\5\u009aN\2\u0335\u033b\5\u009cO\2\u0336"+
		"\u033b\5\u009eP\2\u0337\u033b\5\u00a0Q\2\u0338\u033b\5\u00a2R\2\u0339"+
		"\u033b\5\u00a4S\2\u033a\u0334\3\2\2\2\u033a\u0335\3\2\2\2\u033a\u0336"+
		"\3\2\2\2\u033a\u0337\3\2\2\2\u033a\u0338\3\2\2\2\u033a\u0339\3\2\2\2\u033b"+
		"\u0093\3\2\2\2\u033c\u0343\7\r\2\2\u033d\u0343\7\16\2\2\u033e\u0343\7"+
		"\17\2\2\u033f\u0343\7\20\2\2\u0340\u0343\7\21\2\2\u0341\u0343\5\u0096"+
		"L\2\u0342\u033c\3\2\2\2\u0342\u033d\3\2\2\2\u0342\u033e\3\2\2\2\u0342"+
		"\u033f\3\2\2\2\u0342\u0340\3\2\2\2\u0342\u0341\3\2\2\2\u0343\u0095\3\2"+
		"\2\2\u0344\u0345\7T\2\2\u0345\u0097\3\2\2\2\u0346\u0347\t\3\2\2\u0347"+
		"\u0099\3\2\2\2\u0348\u0349\7P\2\2\u0349\u009b\3\2\2\2\u034a\u034b\7O\2"+
		"\2\u034b\u009d\3\2\2\2\u034c\u034d\7R\2\2\u034d\u009f\3\2\2\2\u034e\u034f"+
		"\7Q\2\2\u034f\u00a1\3\2\2\2\u0350\u0351\t\4\2\2\u0351\u00a3\3\2\2\2\u0352"+
		"\u0353\7M\2\2\u0353\u00a5\3\2\2\2\u0354\u0355\t\5\2\2\u0355\u00a7\3\2"+
		"\2\2\u0356\u0357\t\6\2\2\u0357\u00a9\3\2\2\2\u0358\u0359\t\7\2\2\u0359"+
		"\u00ab\3\2\2\2\u035a\u035b\t\b\2\2\u035b\u00ad\3\2\2\2\u035c\u035d\t\t"+
		"\2\2\u035d\u00af\3\2\2\2\u035e\u035f\t\n\2\2\u035f\u00b1\3\2\2\2\u0360"+
		"\u0361\t\13\2\2\u0361\u00b3\3\2\2\2\u0362\u0363\t\f\2\2\u0363\u00b5\3"+
		"\2\2\2\u0364\u0365\t\r\2\2\u0365\u00b7\3\2\2\2\u0366\u0367\t\16\2\2\u0367"+
		"\u00b9\3\2\2\2\u0368\u0369\7\n\2\2\u0369\u036a\7\13\2\2\u036a\u00bb\3"+
		"\2\2\2O\u00c0\u00c2\u00d4\u00db\u00e3\u00ed\u00f3\u00f9\u0102\u0107\u011c"+
		"\u0124\u012d\u0133\u013c\u014d\u0154\u0163\u0167\u016b\u0174\u0176\u017e"+
		"\u0180\u0185\u018d\u0199\u01a0\u01a6\u01a8\u01ac\u01b4\u01bb\u01c7\u01cb"+
		"\u01d6\u01e2\u01ed\u01f9\u0205\u0211\u021d\u0229\u0235\u023c\u0245\u0251"+
		"\u0257\u0260\u0266\u026e\u0274\u027b\u0282\u0288\u028e\u0293\u0298\u029e"+
		"\u02a1\u02ac\u02b8\u02c4\u02d0\u02dc\u02e8\u02f4\u02fb\u0301\u030c\u0318"+
		"\u031c\u0327\u032c\u0332\u033a\u0342";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}