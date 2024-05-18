// Generated from ReFugg.g4 by ANTLR 4.7.2
package ch.compiler.parser;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link ReFuggParser}.
 */
public interface ReFuggListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link ReFuggParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(ReFuggParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReFuggParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(ReFuggParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReFuggParser#main}.
	 * @param ctx the parse tree
	 */
	void enterMain(ReFuggParser.MainContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReFuggParser#main}.
	 * @param ctx the parse tree
	 */
	void exitMain(ReFuggParser.MainContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReFuggParser#func}.
	 * @param ctx the parse tree
	 */
	void enterFunc(ReFuggParser.FuncContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReFuggParser#func}.
	 * @param ctx the parse tree
	 */
	void exitFunc(ReFuggParser.FuncContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReFuggParser#fHeader}.
	 * @param ctx the parse tree
	 */
	void enterFHeader(ReFuggParser.FHeaderContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReFuggParser#fHeader}.
	 * @param ctx the parse tree
	 */
	void exitFHeader(ReFuggParser.FHeaderContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReFuggParser#fParam}.
	 * @param ctx the parse tree
	 */
	void enterFParam(ReFuggParser.FParamContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReFuggParser#fParam}.
	 * @param ctx the parse tree
	 */
	void exitFParam(ReFuggParser.FParamContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReFuggParser#argList}.
	 * @param ctx the parse tree
	 */
	void enterArgList(ReFuggParser.ArgListContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReFuggParser#argList}.
	 * @param ctx the parse tree
	 */
	void exitArgList(ReFuggParser.ArgListContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReFuggParser#classDec}.
	 * @param ctx the parse tree
	 */
	void enterClassDec(ReFuggParser.ClassDecContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReFuggParser#classDec}.
	 * @param ctx the parse tree
	 */
	void exitClassDec(ReFuggParser.ClassDecContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReFuggParser#complexClassInsides}.
	 * @param ctx the parse tree
	 */
	void enterComplexClassInsides(ReFuggParser.ComplexClassInsidesContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReFuggParser#complexClassInsides}.
	 * @param ctx the parse tree
	 */
	void exitComplexClassInsides(ReFuggParser.ComplexClassInsidesContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReFuggParser#classInsides}.
	 * @param ctx the parse tree
	 */
	void enterClassInsides(ReFuggParser.ClassInsidesContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReFuggParser#classInsides}.
	 * @param ctx the parse tree
	 */
	void exitClassInsides(ReFuggParser.ClassInsidesContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReFuggParser#poly}.
	 * @param ctx the parse tree
	 */
	void enterPoly(ReFuggParser.PolyContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReFuggParser#poly}.
	 * @param ctx the parse tree
	 */
	void exitPoly(ReFuggParser.PolyContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReFuggParser#visibilty}.
	 * @param ctx the parse tree
	 */
	void enterVisibilty(ReFuggParser.VisibiltyContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReFuggParser#visibilty}.
	 * @param ctx the parse tree
	 */
	void exitVisibilty(ReFuggParser.VisibiltyContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReFuggParser#classConstructor}.
	 * @param ctx the parse tree
	 */
	void enterClassConstructor(ReFuggParser.ClassConstructorContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReFuggParser#classConstructor}.
	 * @param ctx the parse tree
	 */
	void exitClassConstructor(ReFuggParser.ClassConstructorContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReFuggParser#method}.
	 * @param ctx the parse tree
	 */
	void enterMethod(ReFuggParser.MethodContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReFuggParser#method}.
	 * @param ctx the parse tree
	 */
	void exitMethod(ReFuggParser.MethodContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReFuggParser#classField}.
	 * @param ctx the parse tree
	 */
	void enterClassField(ReFuggParser.ClassFieldContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReFuggParser#classField}.
	 * @param ctx the parse tree
	 */
	void exitClassField(ReFuggParser.ClassFieldContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReFuggParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(ReFuggParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReFuggParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(ReFuggParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReFuggParser#stmt}.
	 * @param ctx the parse tree
	 */
	void enterStmt(ReFuggParser.StmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReFuggParser#stmt}.
	 * @param ctx the parse tree
	 */
	void exitStmt(ReFuggParser.StmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReFuggParser#ifStmt}.
	 * @param ctx the parse tree
	 */
	void enterIfStmt(ReFuggParser.IfStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReFuggParser#ifStmt}.
	 * @param ctx the parse tree
	 */
	void exitIfStmt(ReFuggParser.IfStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReFuggParser#whileStmt}.
	 * @param ctx the parse tree
	 */
	void enterWhileStmt(ReFuggParser.WhileStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReFuggParser#whileStmt}.
	 * @param ctx the parse tree
	 */
	void exitWhileStmt(ReFuggParser.WhileStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReFuggParser#doWhileStmt}.
	 * @param ctx the parse tree
	 */
	void enterDoWhileStmt(ReFuggParser.DoWhileStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReFuggParser#doWhileStmt}.
	 * @param ctx the parse tree
	 */
	void exitDoWhileStmt(ReFuggParser.DoWhileStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReFuggParser#forStmt}.
	 * @param ctx the parse tree
	 */
	void enterForStmt(ReFuggParser.ForStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReFuggParser#forStmt}.
	 * @param ctx the parse tree
	 */
	void exitForStmt(ReFuggParser.ForStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReFuggParser#jumpStmt}.
	 * @param ctx the parse tree
	 */
	void enterJumpStmt(ReFuggParser.JumpStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReFuggParser#jumpStmt}.
	 * @param ctx the parse tree
	 */
	void exitJumpStmt(ReFuggParser.JumpStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReFuggParser#label}.
	 * @param ctx the parse tree
	 */
	void enterLabel(ReFuggParser.LabelContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReFuggParser#label}.
	 * @param ctx the parse tree
	 */
	void exitLabel(ReFuggParser.LabelContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReFuggParser#switchCase}.
	 * @param ctx the parse tree
	 */
	void enterSwitchCase(ReFuggParser.SwitchCaseContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReFuggParser#switchCase}.
	 * @param ctx the parse tree
	 */
	void exitSwitchCase(ReFuggParser.SwitchCaseContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReFuggParser#caseBlock}.
	 * @param ctx the parse tree
	 */
	void enterCaseBlock(ReFuggParser.CaseBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReFuggParser#caseBlock}.
	 * @param ctx the parse tree
	 */
	void exitCaseBlock(ReFuggParser.CaseBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReFuggParser#check}.
	 * @param ctx the parse tree
	 */
	void enterCheck(ReFuggParser.CheckContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReFuggParser#check}.
	 * @param ctx the parse tree
	 */
	void exitCheck(ReFuggParser.CheckContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReFuggParser#varDec}.
	 * @param ctx the parse tree
	 */
	void enterVarDec(ReFuggParser.VarDecContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReFuggParser#varDec}.
	 * @param ctx the parse tree
	 */
	void exitVarDec(ReFuggParser.VarDecContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReFuggParser#globalVar}.
	 * @param ctx the parse tree
	 */
	void enterGlobalVar(ReFuggParser.GlobalVarContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReFuggParser#globalVar}.
	 * @param ctx the parse tree
	 */
	void exitGlobalVar(ReFuggParser.GlobalVarContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReFuggParser#constArray}.
	 * @param ctx the parse tree
	 */
	void enterConstArray(ReFuggParser.ConstArrayContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReFuggParser#constArray}.
	 * @param ctx the parse tree
	 */
	void exitConstArray(ReFuggParser.ConstArrayContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReFuggParser#constList}.
	 * @param ctx the parse tree
	 */
	void enterConstList(ReFuggParser.ConstListContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReFuggParser#constList}.
	 * @param ctx the parse tree
	 */
	void exitConstList(ReFuggParser.ConstListContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReFuggParser#constSubList}.
	 * @param ctx the parse tree
	 */
	void enterConstSubList(ReFuggParser.ConstSubListContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReFuggParser#constSubList}.
	 * @param ctx the parse tree
	 */
	void exitConstSubList(ReFuggParser.ConstSubListContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReFuggParser#constExprMany}.
	 * @param ctx the parse tree
	 */
	void enterConstExprMany(ReFuggParser.ConstExprManyContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReFuggParser#constExprMany}.
	 * @param ctx the parse tree
	 */
	void exitConstExprMany(ReFuggParser.ConstExprManyContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReFuggParser#constVar}.
	 * @param ctx the parse tree
	 */
	void enterConstVar(ReFuggParser.ConstVarContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReFuggParser#constVar}.
	 * @param ctx the parse tree
	 */
	void exitConstVar(ReFuggParser.ConstVarContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReFuggParser#constArrayAccess}.
	 * @param ctx the parse tree
	 */
	void enterConstArrayAccess(ReFuggParser.ConstArrayAccessContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReFuggParser#constArrayAccess}.
	 * @param ctx the parse tree
	 */
	void exitConstArrayAccess(ReFuggParser.ConstArrayAccessContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReFuggParser#constExpr}.
	 * @param ctx the parse tree
	 */
	void enterConstExpr(ReFuggParser.ConstExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReFuggParser#constExpr}.
	 * @param ctx the parse tree
	 */
	void exitConstExpr(ReFuggParser.ConstExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReFuggParser#constJoin}.
	 * @param ctx the parse tree
	 */
	void enterConstJoin(ReFuggParser.ConstJoinContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReFuggParser#constJoin}.
	 * @param ctx the parse tree
	 */
	void exitConstJoin(ReFuggParser.ConstJoinContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReFuggParser#constEQ}.
	 * @param ctx the parse tree
	 */
	void enterConstEQ(ReFuggParser.ConstEQContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReFuggParser#constEQ}.
	 * @param ctx the parse tree
	 */
	void exitConstEQ(ReFuggParser.ConstEQContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReFuggParser#constRel}.
	 * @param ctx the parse tree
	 */
	void enterConstRel(ReFuggParser.ConstRelContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReFuggParser#constRel}.
	 * @param ctx the parse tree
	 */
	void exitConstRel(ReFuggParser.ConstRelContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReFuggParser#constLogic}.
	 * @param ctx the parse tree
	 */
	void enterConstLogic(ReFuggParser.ConstLogicContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReFuggParser#constLogic}.
	 * @param ctx the parse tree
	 */
	void exitConstLogic(ReFuggParser.ConstLogicContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReFuggParser#constTerm}.
	 * @param ctx the parse tree
	 */
	void enterConstTerm(ReFuggParser.ConstTermContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReFuggParser#constTerm}.
	 * @param ctx the parse tree
	 */
	void exitConstTerm(ReFuggParser.ConstTermContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReFuggParser#constExpo}.
	 * @param ctx the parse tree
	 */
	void enterConstExpo(ReFuggParser.ConstExpoContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReFuggParser#constExpo}.
	 * @param ctx the parse tree
	 */
	void exitConstExpo(ReFuggParser.ConstExpoContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReFuggParser#constUnary}.
	 * @param ctx the parse tree
	 */
	void enterConstUnary(ReFuggParser.ConstUnaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReFuggParser#constUnary}.
	 * @param ctx the parse tree
	 */
	void exitConstUnary(ReFuggParser.ConstUnaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReFuggParser#constFactor}.
	 * @param ctx the parse tree
	 */
	void enterConstFactor(ReFuggParser.ConstFactorContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReFuggParser#constFactor}.
	 * @param ctx the parse tree
	 */
	void exitConstFactor(ReFuggParser.ConstFactorContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReFuggParser#arrayAccess}.
	 * @param ctx the parse tree
	 */
	void enterArrayAccess(ReFuggParser.ArrayAccessContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReFuggParser#arrayAccess}.
	 * @param ctx the parse tree
	 */
	void exitArrayAccess(ReFuggParser.ArrayAccessContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReFuggParser#methodCall}.
	 * @param ctx the parse tree
	 */
	void enterMethodCall(ReFuggParser.MethodCallContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReFuggParser#methodCall}.
	 * @param ctx the parse tree
	 */
	void exitMethodCall(ReFuggParser.MethodCallContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReFuggParser#newObject}.
	 * @param ctx the parse tree
	 */
	void enterNewObject(ReFuggParser.NewObjectContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReFuggParser#newObject}.
	 * @param ctx the parse tree
	 */
	void exitNewObject(ReFuggParser.NewObjectContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReFuggParser#fCall}.
	 * @param ctx the parse tree
	 */
	void enterFCall(ReFuggParser.FCallContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReFuggParser#fCall}.
	 * @param ctx the parse tree
	 */
	void exitFCall(ReFuggParser.FCallContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReFuggParser#thisAcces}.
	 * @param ctx the parse tree
	 */
	void enterThisAcces(ReFuggParser.ThisAccesContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReFuggParser#thisAcces}.
	 * @param ctx the parse tree
	 */
	void exitThisAcces(ReFuggParser.ThisAccesContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReFuggParser#varAcces}.
	 * @param ctx the parse tree
	 */
	void enterVarAcces(ReFuggParser.VarAccesContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReFuggParser#varAcces}.
	 * @param ctx the parse tree
	 */
	void exitVarAcces(ReFuggParser.VarAccesContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReFuggParser#lh_expression}.
	 * @param ctx the parse tree
	 */
	void enterLh_expression(ReFuggParser.Lh_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReFuggParser#lh_expression}.
	 * @param ctx the parse tree
	 */
	void exitLh_expression(ReFuggParser.Lh_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReFuggParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(ReFuggParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReFuggParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(ReFuggParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReFuggParser#orExpression}.
	 * @param ctx the parse tree
	 */
	void enterOrExpression(ReFuggParser.OrExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReFuggParser#orExpression}.
	 * @param ctx the parse tree
	 */
	void exitOrExpression(ReFuggParser.OrExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReFuggParser#andExpression}.
	 * @param ctx the parse tree
	 */
	void enterAndExpression(ReFuggParser.AndExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReFuggParser#andExpression}.
	 * @param ctx the parse tree
	 */
	void exitAndExpression(ReFuggParser.AndExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReFuggParser#equalityExpression}.
	 * @param ctx the parse tree
	 */
	void enterEqualityExpression(ReFuggParser.EqualityExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReFuggParser#equalityExpression}.
	 * @param ctx the parse tree
	 */
	void exitEqualityExpression(ReFuggParser.EqualityExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReFuggParser#relationalExpression}.
	 * @param ctx the parse tree
	 */
	void enterRelationalExpression(ReFuggParser.RelationalExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReFuggParser#relationalExpression}.
	 * @param ctx the parse tree
	 */
	void exitRelationalExpression(ReFuggParser.RelationalExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReFuggParser#additiveExpression}.
	 * @param ctx the parse tree
	 */
	void enterAdditiveExpression(ReFuggParser.AdditiveExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReFuggParser#additiveExpression}.
	 * @param ctx the parse tree
	 */
	void exitAdditiveExpression(ReFuggParser.AdditiveExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReFuggParser#multiplicativeExpression}.
	 * @param ctx the parse tree
	 */
	void enterMultiplicativeExpression(ReFuggParser.MultiplicativeExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReFuggParser#multiplicativeExpression}.
	 * @param ctx the parse tree
	 */
	void exitMultiplicativeExpression(ReFuggParser.MultiplicativeExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReFuggParser#exponentiationExpression}.
	 * @param ctx the parse tree
	 */
	void enterExponentiationExpression(ReFuggParser.ExponentiationExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReFuggParser#exponentiationExpression}.
	 * @param ctx the parse tree
	 */
	void exitExponentiationExpression(ReFuggParser.ExponentiationExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReFuggParser#unaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterUnaryExpression(ReFuggParser.UnaryExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReFuggParser#unaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitUnaryExpression(ReFuggParser.UnaryExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReFuggParser#postExpression}.
	 * @param ctx the parse tree
	 */
	void enterPostExpression(ReFuggParser.PostExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReFuggParser#postExpression}.
	 * @param ctx the parse tree
	 */
	void exitPostExpression(ReFuggParser.PostExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReFuggParser#primary}.
	 * @param ctx the parse tree
	 */
	void enterPrimary(ReFuggParser.PrimaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReFuggParser#primary}.
	 * @param ctx the parse tree
	 */
	void exitPrimary(ReFuggParser.PrimaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReFuggParser#list}.
	 * @param ctx the parse tree
	 */
	void enterList(ReFuggParser.ListContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReFuggParser#list}.
	 * @param ctx the parse tree
	 */
	void exitList(ReFuggParser.ListContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReFuggParser#subList}.
	 * @param ctx the parse tree
	 */
	void enterSubList(ReFuggParser.SubListContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReFuggParser#subList}.
	 * @param ctx the parse tree
	 */
	void exitSubList(ReFuggParser.SubListContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReFuggParser#expressionMany}.
	 * @param ctx the parse tree
	 */
	void enterExpressionMany(ReFuggParser.ExpressionManyContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReFuggParser#expressionMany}.
	 * @param ctx the parse tree
	 */
	void exitExpressionMany(ReFuggParser.ExpressionManyContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReFuggParser#fArgs}.
	 * @param ctx the parse tree
	 */
	void enterFArgs(ReFuggParser.FArgsContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReFuggParser#fArgs}.
	 * @param ctx the parse tree
	 */
	void exitFArgs(ReFuggParser.FArgsContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReFuggParser#returntype}.
	 * @param ctx the parse tree
	 */
	void enterReturntype(ReFuggParser.ReturntypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReFuggParser#returntype}.
	 * @param ctx the parse tree
	 */
	void exitReturntype(ReFuggParser.ReturntypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReFuggParser#assignOP}.
	 * @param ctx the parse tree
	 */
	void enterAssignOP(ReFuggParser.AssignOPContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReFuggParser#assignOP}.
	 * @param ctx the parse tree
	 */
	void exitAssignOP(ReFuggParser.AssignOPContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReFuggParser#orOP}.
	 * @param ctx the parse tree
	 */
	void enterOrOP(ReFuggParser.OrOPContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReFuggParser#orOP}.
	 * @param ctx the parse tree
	 */
	void exitOrOP(ReFuggParser.OrOPContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReFuggParser#andOP}.
	 * @param ctx the parse tree
	 */
	void enterAndOP(ReFuggParser.AndOPContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReFuggParser#andOP}.
	 * @param ctx the parse tree
	 */
	void exitAndOP(ReFuggParser.AndOPContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReFuggParser#eqOP}.
	 * @param ctx the parse tree
	 */
	void enterEqOP(ReFuggParser.EqOPContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReFuggParser#eqOP}.
	 * @param ctx the parse tree
	 */
	void exitEqOP(ReFuggParser.EqOPContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReFuggParser#relOP}.
	 * @param ctx the parse tree
	 */
	void enterRelOP(ReFuggParser.RelOPContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReFuggParser#relOP}.
	 * @param ctx the parse tree
	 */
	void exitRelOP(ReFuggParser.RelOPContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReFuggParser#addOP}.
	 * @param ctx the parse tree
	 */
	void enterAddOP(ReFuggParser.AddOPContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReFuggParser#addOP}.
	 * @param ctx the parse tree
	 */
	void exitAddOP(ReFuggParser.AddOPContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReFuggParser#multOP}.
	 * @param ctx the parse tree
	 */
	void enterMultOP(ReFuggParser.MultOPContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReFuggParser#multOP}.
	 * @param ctx the parse tree
	 */
	void exitMultOP(ReFuggParser.MultOPContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReFuggParser#expOP}.
	 * @param ctx the parse tree
	 */
	void enterExpOP(ReFuggParser.ExpOPContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReFuggParser#expOP}.
	 * @param ctx the parse tree
	 */
	void exitExpOP(ReFuggParser.ExpOPContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReFuggParser#preOP}.
	 * @param ctx the parse tree
	 */
	void enterPreOP(ReFuggParser.PreOPContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReFuggParser#preOP}.
	 * @param ctx the parse tree
	 */
	void exitPreOP(ReFuggParser.PreOPContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReFuggParser#postOP}.
	 * @param ctx the parse tree
	 */
	void enterPostOP(ReFuggParser.PostOPContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReFuggParser#postOP}.
	 * @param ctx the parse tree
	 */
	void exitPostOP(ReFuggParser.PostOPContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReFuggParser#constant}.
	 * @param ctx the parse tree
	 */
	void enterConstant(ReFuggParser.ConstantContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReFuggParser#constant}.
	 * @param ctx the parse tree
	 */
	void exitConstant(ReFuggParser.ConstantContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReFuggParser#complexType}.
	 * @param ctx the parse tree
	 */
	void enterComplexType(ReFuggParser.ComplexTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReFuggParser#complexType}.
	 * @param ctx the parse tree
	 */
	void exitComplexType(ReFuggParser.ComplexTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReFuggParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(ReFuggParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReFuggParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(ReFuggParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReFuggParser#identifier}.
	 * @param ctx the parse tree
	 */
	void enterIdentifier(ReFuggParser.IdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReFuggParser#identifier}.
	 * @param ctx the parse tree
	 */
	void exitIdentifier(ReFuggParser.IdentifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReFuggParser#typemodifier}.
	 * @param ctx the parse tree
	 */
	void enterTypemodifier(ReFuggParser.TypemodifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReFuggParser#typemodifier}.
	 * @param ctx the parse tree
	 */
	void exitTypemodifier(ReFuggParser.TypemodifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReFuggParser#doubleRule}.
	 * @param ctx the parse tree
	 */
	void enterDoubleRule(ReFuggParser.DoubleRuleContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReFuggParser#doubleRule}.
	 * @param ctx the parse tree
	 */
	void exitDoubleRule(ReFuggParser.DoubleRuleContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReFuggParser#intRule}.
	 * @param ctx the parse tree
	 */
	void enterIntRule(ReFuggParser.IntRuleContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReFuggParser#intRule}.
	 * @param ctx the parse tree
	 */
	void exitIntRule(ReFuggParser.IntRuleContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReFuggParser#stringRule}.
	 * @param ctx the parse tree
	 */
	void enterStringRule(ReFuggParser.StringRuleContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReFuggParser#stringRule}.
	 * @param ctx the parse tree
	 */
	void exitStringRule(ReFuggParser.StringRuleContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReFuggParser#charRule}.
	 * @param ctx the parse tree
	 */
	void enterCharRule(ReFuggParser.CharRuleContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReFuggParser#charRule}.
	 * @param ctx the parse tree
	 */
	void exitCharRule(ReFuggParser.CharRuleContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReFuggParser#booleanRule}.
	 * @param ctx the parse tree
	 */
	void enterBooleanRule(ReFuggParser.BooleanRuleContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReFuggParser#booleanRule}.
	 * @param ctx the parse tree
	 */
	void exitBooleanRule(ReFuggParser.BooleanRuleContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReFuggParser#refRule}.
	 * @param ctx the parse tree
	 */
	void enterRefRule(ReFuggParser.RefRuleContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReFuggParser#refRule}.
	 * @param ctx the parse tree
	 */
	void exitRefRule(ReFuggParser.RefRuleContext ctx);
}