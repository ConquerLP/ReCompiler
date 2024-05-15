// Generated from ReFugg.g4 by ANTLR 4.7.2
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
	 * Visit a parse tree produced by {@link ReFuggParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(ReFuggParser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ifStatement}
	 * labeled alternative in {@link ReFuggParser#stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfStatement(ReFuggParser.IfStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code whileStatement}
	 * labeled alternative in {@link ReFuggParser#stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhileStatement(ReFuggParser.WhileStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code doWhileStatement}
	 * labeled alternative in {@link ReFuggParser#stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDoWhileStatement(ReFuggParser.DoWhileStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code forStatement}
	 * labeled alternative in {@link ReFuggParser#stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForStatement(ReFuggParser.ForStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code switchStatement}
	 * labeled alternative in {@link ReFuggParser#stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSwitchStatement(ReFuggParser.SwitchStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code labelStatement}
	 * labeled alternative in {@link ReFuggParser#stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLabelStatement(ReFuggParser.LabelStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code blockStatement}
	 * labeled alternative in {@link ReFuggParser#stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlockStatement(ReFuggParser.BlockStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code varDecStatement}
	 * labeled alternative in {@link ReFuggParser#stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarDecStatement(ReFuggParser.VarDecStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code asssignStatement}
	 * labeled alternative in {@link ReFuggParser#stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAsssignStatement(ReFuggParser.AsssignStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exprStatement}
	 * labeled alternative in {@link ReFuggParser#stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprStatement(ReFuggParser.ExprStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code jumpStatement}
	 * labeled alternative in {@link ReFuggParser#stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJumpStatement(ReFuggParser.JumpStatementContext ctx);
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
	 * Visit a parse tree produced by the {@code breakStatement}
	 * labeled alternative in {@link ReFuggParser#jumpStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBreakStatement(ReFuggParser.BreakStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code continueStatement}
	 * labeled alternative in {@link ReFuggParser#jumpStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitContinueStatement(ReFuggParser.ContinueStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code gotoStatement}
	 * labeled alternative in {@link ReFuggParser#jumpStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGotoStatement(ReFuggParser.GotoStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code returnStatement}
	 * labeled alternative in {@link ReFuggParser#jumpStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnStatement(ReFuggParser.ReturnStatementContext ctx);
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
	 * Visit a parse tree produced by the {@code caseStatement}
	 * labeled alternative in {@link ReFuggParser#caseBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCaseStatement(ReFuggParser.CaseStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code defaultStatement}
	 * labeled alternative in {@link ReFuggParser#caseBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefaultStatement(ReFuggParser.DefaultStatementContext ctx);
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
	 * Visit a parse tree produced by {@link ReFuggParser#assign}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssign(ReFuggParser.AssignContext ctx);
	/**
	 * Visit a parse tree produced by the {@code globalNoInit}
	 * labeled alternative in {@link ReFuggParser#globalVar}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGlobalNoInit(ReFuggParser.GlobalNoInitContext ctx);
	/**
	 * Visit a parse tree produced by the {@code globalYesInit}
	 * labeled alternative in {@link ReFuggParser#globalVar}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGlobalYesInit(ReFuggParser.GlobalYesInitContext ctx);
	/**
	 * Visit a parse tree produced by the {@code constKnownArraysize}
	 * labeled alternative in {@link ReFuggParser#constArray}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstKnownArraysize(ReFuggParser.ConstKnownArraysizeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code constUnknownArraysize}
	 * labeled alternative in {@link ReFuggParser#constArray}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstUnknownArraysize(ReFuggParser.ConstUnknownArraysizeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code constListNoSub}
	 * labeled alternative in {@link ReFuggParser#constList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstListNoSub(ReFuggParser.ConstListNoSubContext ctx);
	/**
	 * Visit a parse tree produced by the {@code constListYesSub}
	 * labeled alternative in {@link ReFuggParser#constList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstListYesSub(ReFuggParser.ConstListYesSubContext ctx);
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
	 * Visit a parse tree produced by the {@code constExprConst}
	 * labeled alternative in {@link ReFuggParser#constFactor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstExprConst(ReFuggParser.ConstExprConstContext ctx);
	/**
	 * Visit a parse tree produced by the {@code constExprParenth}
	 * labeled alternative in {@link ReFuggParser#constFactor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstExprParenth(ReFuggParser.ConstExprParenthContext ctx);
	/**
	 * Visit a parse tree produced by the {@code constExprList}
	 * labeled alternative in {@link ReFuggParser#constFactor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstExprList(ReFuggParser.ConstExprListContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReFuggParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr(ReFuggParser.ExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReFuggParser#join}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJoin(ReFuggParser.JoinContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReFuggParser#eq}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEq(ReFuggParser.EqContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReFuggParser#rel}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRel(ReFuggParser.RelContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReFuggParser#logic}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogic(ReFuggParser.LogicContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReFuggParser#term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTerm(ReFuggParser.TermContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReFuggParser#expo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpo(ReFuggParser.ExpoContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReFuggParser#unary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnary(ReFuggParser.UnaryContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exprParenth}
	 * labeled alternative in {@link ReFuggParser#factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprParenth(ReFuggParser.ExprParenthContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exprfCall}
	 * labeled alternative in {@link ReFuggParser#factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprfCall(ReFuggParser.ExprfCallContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exprmethCall}
	 * labeled alternative in {@link ReFuggParser#factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprmethCall(ReFuggParser.ExprmethCallContext ctx);
	/**
	 * Visit a parse tree produced by the {@code expridentifier}
	 * labeled alternative in {@link ReFuggParser#factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpridentifier(ReFuggParser.ExpridentifierContext ctx);
	/**
	 * Visit a parse tree produced by the {@code expridentifierIndex}
	 * labeled alternative in {@link ReFuggParser#factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpridentifierIndex(ReFuggParser.ExpridentifierIndexContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exprCreate}
	 * labeled alternative in {@link ReFuggParser#factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprCreate(ReFuggParser.ExprCreateContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exprConstant}
	 * labeled alternative in {@link ReFuggParser#factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprConstant(ReFuggParser.ExprConstantContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exprThis}
	 * labeled alternative in {@link ReFuggParser#factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprThis(ReFuggParser.ExprThisContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exprList}
	 * labeled alternative in {@link ReFuggParser#factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprList(ReFuggParser.ExprListContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReFuggParser#fCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFCall(ReFuggParser.FCallContext ctx);
	/**
	 * Visit a parse tree produced by the {@code MethCallidentifier}
	 * labeled alternative in {@link ReFuggParser#methCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethCallidentifier(ReFuggParser.MethCallidentifierContext ctx);
	/**
	 * Visit a parse tree produced by the {@code MethCallThis}
	 * labeled alternative in {@link ReFuggParser#methCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethCallThis(ReFuggParser.MethCallThisContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReFuggParser#methCallTail}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethCallTail(ReFuggParser.MethCallTailContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReFuggParser#create}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate(ReFuggParser.CreateContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReFuggParser#fArgs}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFArgs(ReFuggParser.FArgsContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReFuggParser#index}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIndex(ReFuggParser.IndexContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReFuggParser#thisAccess}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitThisAccess(ReFuggParser.ThisAccessContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exprListNoSub}
	 * labeled alternative in {@link ReFuggParser#list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprListNoSub(ReFuggParser.ExprListNoSubContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exprListYesSub}
	 * labeled alternative in {@link ReFuggParser#list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprListYesSub(ReFuggParser.ExprListYesSubContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReFuggParser#subList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubList(ReFuggParser.SubListContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReFuggParser#exprMany}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprMany(ReFuggParser.ExprManyContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReFuggParser#returntype}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturntype(ReFuggParser.ReturntypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReFuggParser#logicOp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogicOp(ReFuggParser.LogicOpContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReFuggParser#assignOP}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignOP(ReFuggParser.AssignOPContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReFuggParser#postOP}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPostOP(ReFuggParser.PostOPContext ctx);
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
	 * Visit a parse tree produced by {@link ReFuggParser#or}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOr(ReFuggParser.OrContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReFuggParser#and}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnd(ReFuggParser.AndContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReFuggParser#notNeg}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNotNeg(ReFuggParser.NotNegContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReFuggParser#eqOP}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEqOP(ReFuggParser.EqOPContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReFuggParser#add}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAdd(ReFuggParser.AddContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReFuggParser#mult}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMult(ReFuggParser.MultContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReFuggParser#expoOp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpoOp(ReFuggParser.ExpoOpContext ctx);
}