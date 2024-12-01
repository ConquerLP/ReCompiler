// Generated from ReFugg.g4 by ANTLR 4.7.2
package ch.compiler.parser;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link ReFuggParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface ReFuggVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link ReFuggParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(ReFuggParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReFuggParser#main}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMain(ReFuggParser.MainContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReFuggParser#func}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunc(ReFuggParser.FuncContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReFuggParser#fHeader}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFHeader(ReFuggParser.FHeaderContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReFuggParser#fParam}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFParam(ReFuggParser.FParamContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReFuggParser#arg}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArg(ReFuggParser.ArgContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReFuggParser#argList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgList(ReFuggParser.ArgListContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReFuggParser#classDec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassDec(ReFuggParser.ClassDecContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReFuggParser#classInsideGroup}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassInsideGroup(ReFuggParser.ClassInsideGroupContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReFuggParser#classInside}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassInside(ReFuggParser.ClassInsideContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReFuggParser#poly}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPoly(ReFuggParser.PolyContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReFuggParser#visibilty}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVisibilty(ReFuggParser.VisibiltyContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReFuggParser#classConstructor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassConstructor(ReFuggParser.ClassConstructorContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReFuggParser#method}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethod(ReFuggParser.MethodContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReFuggParser#classField}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassField(ReFuggParser.ClassFieldContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReFuggParser#functionBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionBlock(ReFuggParser.FunctionBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReFuggParser#loopBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLoopBlock(ReFuggParser.LoopBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReFuggParser#stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStmt(ReFuggParser.StmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReFuggParser#ifStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfStmt(ReFuggParser.IfStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReFuggParser#whileStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhileStmt(ReFuggParser.WhileStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReFuggParser#doWhileStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDoWhileStmt(ReFuggParser.DoWhileStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReFuggParser#forStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForStmt(ReFuggParser.ForStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReFuggParser#functionJumpStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionJumpStmt(ReFuggParser.FunctionJumpStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReFuggParser#loopJumpStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLoopJumpStmt(ReFuggParser.LoopJumpStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReFuggParser#label}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLabel(ReFuggParser.LabelContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReFuggParser#switchCase}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSwitchCase(ReFuggParser.SwitchCaseContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReFuggParser#caseBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCaseBlock(ReFuggParser.CaseBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReFuggParser#check}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCheck(ReFuggParser.CheckContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReFuggParser#varDec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarDec(ReFuggParser.VarDecContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReFuggParser#globalVar}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGlobalVar(ReFuggParser.GlobalVarContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReFuggParser#constArray}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstArray(ReFuggParser.ConstArrayContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReFuggParser#constList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstList(ReFuggParser.ConstListContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReFuggParser#constSubList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstSubList(ReFuggParser.ConstSubListContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReFuggParser#constExprMany}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstExprMany(ReFuggParser.ConstExprManyContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReFuggParser#constVar}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstVar(ReFuggParser.ConstVarContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReFuggParser#constArrayAccess}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstArrayAccess(ReFuggParser.ConstArrayAccessContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReFuggParser#constExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstExpr(ReFuggParser.ConstExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReFuggParser#constJoin}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstJoin(ReFuggParser.ConstJoinContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReFuggParser#constEQ}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstEQ(ReFuggParser.ConstEQContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReFuggParser#constRel}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstRel(ReFuggParser.ConstRelContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReFuggParser#constLogic}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstLogic(ReFuggParser.ConstLogicContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReFuggParser#constTerm}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstTerm(ReFuggParser.ConstTermContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReFuggParser#constExpo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstExpo(ReFuggParser.ConstExpoContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReFuggParser#constUnary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstUnary(ReFuggParser.ConstUnaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReFuggParser#constFactor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstFactor(ReFuggParser.ConstFactorContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReFuggParser#arrayAccess}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayAccess(ReFuggParser.ArrayAccessContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReFuggParser#methodCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodCall(ReFuggParser.MethodCallContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReFuggParser#newObject}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNewObject(ReFuggParser.NewObjectContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReFuggParser#fCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFCall(ReFuggParser.FCallContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReFuggParser#thisAcces}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitThisAcces(ReFuggParser.ThisAccesContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReFuggParser#varAcces}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarAcces(ReFuggParser.VarAccesContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReFuggParser#exprTail}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprTail(ReFuggParser.ExprTailContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReFuggParser#lh_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLh_expression(ReFuggParser.Lh_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReFuggParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(ReFuggParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReFuggParser#orExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrExpression(ReFuggParser.OrExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReFuggParser#andExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAndExpression(ReFuggParser.AndExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReFuggParser#equalityExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEqualityExpression(ReFuggParser.EqualityExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReFuggParser#relationalExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelationalExpression(ReFuggParser.RelationalExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReFuggParser#additiveExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAdditiveExpression(ReFuggParser.AdditiveExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReFuggParser#multiplicativeExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiplicativeExpression(ReFuggParser.MultiplicativeExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReFuggParser#exponentiationExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExponentiationExpression(ReFuggParser.ExponentiationExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReFuggParser#unaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnaryExpression(ReFuggParser.UnaryExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReFuggParser#postExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPostExpression(ReFuggParser.PostExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReFuggParser#primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimary(ReFuggParser.PrimaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReFuggParser#list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitList(ReFuggParser.ListContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReFuggParser#subList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubList(ReFuggParser.SubListContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReFuggParser#expressionMany}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionMany(ReFuggParser.ExpressionManyContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReFuggParser#fArgs}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFArgs(ReFuggParser.FArgsContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReFuggParser#returntype}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturntype(ReFuggParser.ReturntypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReFuggParser#constant}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstant(ReFuggParser.ConstantContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReFuggParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(ReFuggParser.TypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReFuggParser#identifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifier(ReFuggParser.IdentifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReFuggParser#typemodifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypemodifier(ReFuggParser.TypemodifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReFuggParser#doubleRule}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDoubleRule(ReFuggParser.DoubleRuleContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReFuggParser#intRule}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntRule(ReFuggParser.IntRuleContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReFuggParser#stringRule}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringRule(ReFuggParser.StringRuleContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReFuggParser#charRule}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCharRule(ReFuggParser.CharRuleContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReFuggParser#booleanRule}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBooleanRule(ReFuggParser.BooleanRuleContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReFuggParser#refRule}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRefRule(ReFuggParser.RefRuleContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReFuggParser#assignOP}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignOP(ReFuggParser.AssignOPContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReFuggParser#orOP}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrOP(ReFuggParser.OrOPContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReFuggParser#andOP}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAndOP(ReFuggParser.AndOPContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReFuggParser#eqOP}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEqOP(ReFuggParser.EqOPContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReFuggParser#relOP}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelOP(ReFuggParser.RelOPContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReFuggParser#addOP}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddOP(ReFuggParser.AddOPContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReFuggParser#multOP}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultOP(ReFuggParser.MultOPContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReFuggParser#expOP}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpOP(ReFuggParser.ExpOPContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReFuggParser#preOP}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPreOP(ReFuggParser.PreOPContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReFuggParser#postOP}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPostOP(ReFuggParser.PostOPContext ctx);
}