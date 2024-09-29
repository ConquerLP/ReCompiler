// Generated from ReFugg.g4 by ANTLR 4.7.2
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
	 * Enter a parse tree produced by the {@code ifStatement}
	 * labeled alternative in {@link ReFuggParser#stmt}.
	 * @param ctx the parse tree
	 */
	void enterIfStatement(ReFuggParser.IfStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ifStatement}
	 * labeled alternative in {@link ReFuggParser#stmt}.
	 * @param ctx the parse tree
	 */
	void exitIfStatement(ReFuggParser.IfStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code whileStatement}
	 * labeled alternative in {@link ReFuggParser#stmt}.
	 * @param ctx the parse tree
	 */
	void enterWhileStatement(ReFuggParser.WhileStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code whileStatement}
	 * labeled alternative in {@link ReFuggParser#stmt}.
	 * @param ctx the parse tree
	 */
	void exitWhileStatement(ReFuggParser.WhileStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code doWhileStatement}
	 * labeled alternative in {@link ReFuggParser#stmt}.
	 * @param ctx the parse tree
	 */
	void enterDoWhileStatement(ReFuggParser.DoWhileStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code doWhileStatement}
	 * labeled alternative in {@link ReFuggParser#stmt}.
	 * @param ctx the parse tree
	 */
	void exitDoWhileStatement(ReFuggParser.DoWhileStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code forStatement}
	 * labeled alternative in {@link ReFuggParser#stmt}.
	 * @param ctx the parse tree
	 */
	void enterForStatement(ReFuggParser.ForStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code forStatement}
	 * labeled alternative in {@link ReFuggParser#stmt}.
	 * @param ctx the parse tree
	 */
	void exitForStatement(ReFuggParser.ForStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code switchStatement}
	 * labeled alternative in {@link ReFuggParser#stmt}.
	 * @param ctx the parse tree
	 */
	void enterSwitchStatement(ReFuggParser.SwitchStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code switchStatement}
	 * labeled alternative in {@link ReFuggParser#stmt}.
	 * @param ctx the parse tree
	 */
	void exitSwitchStatement(ReFuggParser.SwitchStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code labelStatement}
	 * labeled alternative in {@link ReFuggParser#stmt}.
	 * @param ctx the parse tree
	 */
	void enterLabelStatement(ReFuggParser.LabelStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code labelStatement}
	 * labeled alternative in {@link ReFuggParser#stmt}.
	 * @param ctx the parse tree
	 */
	void exitLabelStatement(ReFuggParser.LabelStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code blockStatement}
	 * labeled alternative in {@link ReFuggParser#stmt}.
	 * @param ctx the parse tree
	 */
	void enterBlockStatement(ReFuggParser.BlockStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code blockStatement}
	 * labeled alternative in {@link ReFuggParser#stmt}.
	 * @param ctx the parse tree
	 */
	void exitBlockStatement(ReFuggParser.BlockStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code varDecStatement}
	 * labeled alternative in {@link ReFuggParser#stmt}.
	 * @param ctx the parse tree
	 */
	void enterVarDecStatement(ReFuggParser.VarDecStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code varDecStatement}
	 * labeled alternative in {@link ReFuggParser#stmt}.
	 * @param ctx the parse tree
	 */
	void exitVarDecStatement(ReFuggParser.VarDecStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code asssignStatement}
	 * labeled alternative in {@link ReFuggParser#stmt}.
	 * @param ctx the parse tree
	 */
	void enterAsssignStatement(ReFuggParser.AsssignStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code asssignStatement}
	 * labeled alternative in {@link ReFuggParser#stmt}.
	 * @param ctx the parse tree
	 */
	void exitAsssignStatement(ReFuggParser.AsssignStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exprStatement}
	 * labeled alternative in {@link ReFuggParser#stmt}.
	 * @param ctx the parse tree
	 */
	void enterExprStatement(ReFuggParser.ExprStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exprStatement}
	 * labeled alternative in {@link ReFuggParser#stmt}.
	 * @param ctx the parse tree
	 */
	void exitExprStatement(ReFuggParser.ExprStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code jumpStatement}
	 * labeled alternative in {@link ReFuggParser#stmt}.
	 * @param ctx the parse tree
	 */
	void enterJumpStatement(ReFuggParser.JumpStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code jumpStatement}
	 * labeled alternative in {@link ReFuggParser#stmt}.
	 * @param ctx the parse tree
	 */
	void exitJumpStatement(ReFuggParser.JumpStatementContext ctx);
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
	 * Enter a parse tree produced by the {@code breakStatement}
	 * labeled alternative in {@link ReFuggParser#jumpStmt}.
	 * @param ctx the parse tree
	 */
	void enterBreakStatement(ReFuggParser.BreakStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code breakStatement}
	 * labeled alternative in {@link ReFuggParser#jumpStmt}.
	 * @param ctx the parse tree
	 */
	void exitBreakStatement(ReFuggParser.BreakStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code continueStatement}
	 * labeled alternative in {@link ReFuggParser#jumpStmt}.
	 * @param ctx the parse tree
	 */
	void enterContinueStatement(ReFuggParser.ContinueStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code continueStatement}
	 * labeled alternative in {@link ReFuggParser#jumpStmt}.
	 * @param ctx the parse tree
	 */
	void exitContinueStatement(ReFuggParser.ContinueStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code gotoStatement}
	 * labeled alternative in {@link ReFuggParser#jumpStmt}.
	 * @param ctx the parse tree
	 */
	void enterGotoStatement(ReFuggParser.GotoStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code gotoStatement}
	 * labeled alternative in {@link ReFuggParser#jumpStmt}.
	 * @param ctx the parse tree
	 */
	void exitGotoStatement(ReFuggParser.GotoStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code returnStatement}
	 * labeled alternative in {@link ReFuggParser#jumpStmt}.
	 * @param ctx the parse tree
	 */
	void enterReturnStatement(ReFuggParser.ReturnStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code returnStatement}
	 * labeled alternative in {@link ReFuggParser#jumpStmt}.
	 * @param ctx the parse tree
	 */
	void exitReturnStatement(ReFuggParser.ReturnStatementContext ctx);
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
	 * Enter a parse tree produced by the {@code caseStatement}
	 * labeled alternative in {@link ReFuggParser#caseBlock}.
	 * @param ctx the parse tree
	 */
	void enterCaseStatement(ReFuggParser.CaseStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code caseStatement}
	 * labeled alternative in {@link ReFuggParser#caseBlock}.
	 * @param ctx the parse tree
	 */
	void exitCaseStatement(ReFuggParser.CaseStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code defaultStatement}
	 * labeled alternative in {@link ReFuggParser#caseBlock}.
	 * @param ctx the parse tree
	 */
	void enterDefaultStatement(ReFuggParser.DefaultStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code defaultStatement}
	 * labeled alternative in {@link ReFuggParser#caseBlock}.
	 * @param ctx the parse tree
	 */
	void exitDefaultStatement(ReFuggParser.DefaultStatementContext ctx);
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
	 * Enter a parse tree produced by {@link ReFuggParser#assign}.
	 * @param ctx the parse tree
	 */
	void enterAssign(ReFuggParser.AssignContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReFuggParser#assign}.
	 * @param ctx the parse tree
	 */
	void exitAssign(ReFuggParser.AssignContext ctx);
	/**
	 * Enter a parse tree produced by the {@code globalNoInit}
	 * labeled alternative in {@link ReFuggParser#globalVar}.
	 * @param ctx the parse tree
	 */
	void enterGlobalNoInit(ReFuggParser.GlobalNoInitContext ctx);
	/**
	 * Exit a parse tree produced by the {@code globalNoInit}
	 * labeled alternative in {@link ReFuggParser#globalVar}.
	 * @param ctx the parse tree
	 */
	void exitGlobalNoInit(ReFuggParser.GlobalNoInitContext ctx);
	/**
	 * Enter a parse tree produced by the {@code globalYesInit}
	 * labeled alternative in {@link ReFuggParser#globalVar}.
	 * @param ctx the parse tree
	 */
	void enterGlobalYesInit(ReFuggParser.GlobalYesInitContext ctx);
	/**
	 * Exit a parse tree produced by the {@code globalYesInit}
	 * labeled alternative in {@link ReFuggParser#globalVar}.
	 * @param ctx the parse tree
	 */
	void exitGlobalYesInit(ReFuggParser.GlobalYesInitContext ctx);
	/**
	 * Enter a parse tree produced by the {@code constKnownArraysize}
	 * labeled alternative in {@link ReFuggParser#constArray}.
	 * @param ctx the parse tree
	 */
	void enterConstKnownArraysize(ReFuggParser.ConstKnownArraysizeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code constKnownArraysize}
	 * labeled alternative in {@link ReFuggParser#constArray}.
	 * @param ctx the parse tree
	 */
	void exitConstKnownArraysize(ReFuggParser.ConstKnownArraysizeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code constUnknownArraysize}
	 * labeled alternative in {@link ReFuggParser#constArray}.
	 * @param ctx the parse tree
	 */
	void enterConstUnknownArraysize(ReFuggParser.ConstUnknownArraysizeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code constUnknownArraysize}
	 * labeled alternative in {@link ReFuggParser#constArray}.
	 * @param ctx the parse tree
	 */
	void exitConstUnknownArraysize(ReFuggParser.ConstUnknownArraysizeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code constListNoSub}
	 * labeled alternative in {@link ReFuggParser#constList}.
	 * @param ctx the parse tree
	 */
	void enterConstListNoSub(ReFuggParser.ConstListNoSubContext ctx);
	/**
	 * Exit a parse tree produced by the {@code constListNoSub}
	 * labeled alternative in {@link ReFuggParser#constList}.
	 * @param ctx the parse tree
	 */
	void exitConstListNoSub(ReFuggParser.ConstListNoSubContext ctx);
	/**
	 * Enter a parse tree produced by the {@code constListYesSub}
	 * labeled alternative in {@link ReFuggParser#constList}.
	 * @param ctx the parse tree
	 */
	void enterConstListYesSub(ReFuggParser.ConstListYesSubContext ctx);
	/**
	 * Exit a parse tree produced by the {@code constListYesSub}
	 * labeled alternative in {@link ReFuggParser#constList}.
	 * @param ctx the parse tree
	 */
	void exitConstListYesSub(ReFuggParser.ConstListYesSubContext ctx);
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
	 * Enter a parse tree produced by the {@code constExprConst}
	 * labeled alternative in {@link ReFuggParser#constFactor}.
	 * @param ctx the parse tree
	 */
	void enterConstExprConst(ReFuggParser.ConstExprConstContext ctx);
	/**
	 * Exit a parse tree produced by the {@code constExprConst}
	 * labeled alternative in {@link ReFuggParser#constFactor}.
	 * @param ctx the parse tree
	 */
	void exitConstExprConst(ReFuggParser.ConstExprConstContext ctx);
	/**
	 * Enter a parse tree produced by the {@code constExprParenth}
	 * labeled alternative in {@link ReFuggParser#constFactor}.
	 * @param ctx the parse tree
	 */
	void enterConstExprParenth(ReFuggParser.ConstExprParenthContext ctx);
	/**
	 * Exit a parse tree produced by the {@code constExprParenth}
	 * labeled alternative in {@link ReFuggParser#constFactor}.
	 * @param ctx the parse tree
	 */
	void exitConstExprParenth(ReFuggParser.ConstExprParenthContext ctx);
	/**
	 * Enter a parse tree produced by the {@code constExprList}
	 * labeled alternative in {@link ReFuggParser#constFactor}.
	 * @param ctx the parse tree
	 */
	void enterConstExprList(ReFuggParser.ConstExprListContext ctx);
	/**
	 * Exit a parse tree produced by the {@code constExprList}
	 * labeled alternative in {@link ReFuggParser#constFactor}.
	 * @param ctx the parse tree
	 */
	void exitConstExprList(ReFuggParser.ConstExprListContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReFuggParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(ReFuggParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReFuggParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(ReFuggParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReFuggParser#join}.
	 * @param ctx the parse tree
	 */
	void enterJoin(ReFuggParser.JoinContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReFuggParser#join}.
	 * @param ctx the parse tree
	 */
	void exitJoin(ReFuggParser.JoinContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReFuggParser#eq}.
	 * @param ctx the parse tree
	 */
	void enterEq(ReFuggParser.EqContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReFuggParser#eq}.
	 * @param ctx the parse tree
	 */
	void exitEq(ReFuggParser.EqContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReFuggParser#rel}.
	 * @param ctx the parse tree
	 */
	void enterRel(ReFuggParser.RelContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReFuggParser#rel}.
	 * @param ctx the parse tree
	 */
	void exitRel(ReFuggParser.RelContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReFuggParser#logic}.
	 * @param ctx the parse tree
	 */
	void enterLogic(ReFuggParser.LogicContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReFuggParser#logic}.
	 * @param ctx the parse tree
	 */
	void exitLogic(ReFuggParser.LogicContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReFuggParser#term}.
	 * @param ctx the parse tree
	 */
	void enterTerm(ReFuggParser.TermContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReFuggParser#term}.
	 * @param ctx the parse tree
	 */
	void exitTerm(ReFuggParser.TermContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReFuggParser#expo}.
	 * @param ctx the parse tree
	 */
	void enterExpo(ReFuggParser.ExpoContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReFuggParser#expo}.
	 * @param ctx the parse tree
	 */
	void exitExpo(ReFuggParser.ExpoContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReFuggParser#unary}.
	 * @param ctx the parse tree
	 */
	void enterUnary(ReFuggParser.UnaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReFuggParser#unary}.
	 * @param ctx the parse tree
	 */
	void exitUnary(ReFuggParser.UnaryContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exprParenth}
	 * labeled alternative in {@link ReFuggParser#factor}.
	 * @param ctx the parse tree
	 */
	void enterExprParenth(ReFuggParser.ExprParenthContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exprParenth}
	 * labeled alternative in {@link ReFuggParser#factor}.
	 * @param ctx the parse tree
	 */
	void exitExprParenth(ReFuggParser.ExprParenthContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exprfCall}
	 * labeled alternative in {@link ReFuggParser#factor}.
	 * @param ctx the parse tree
	 */
	void enterExprfCall(ReFuggParser.ExprfCallContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exprfCall}
	 * labeled alternative in {@link ReFuggParser#factor}.
	 * @param ctx the parse tree
	 */
	void exitExprfCall(ReFuggParser.ExprfCallContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exprmethCall}
	 * labeled alternative in {@link ReFuggParser#factor}.
	 * @param ctx the parse tree
	 */
	void enterExprmethCall(ReFuggParser.ExprmethCallContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exprmethCall}
	 * labeled alternative in {@link ReFuggParser#factor}.
	 * @param ctx the parse tree
	 */
	void exitExprmethCall(ReFuggParser.ExprmethCallContext ctx);
	/**
	 * Enter a parse tree produced by the {@code expridentifier}
	 * labeled alternative in {@link ReFuggParser#factor}.
	 * @param ctx the parse tree
	 */
	void enterExpridentifier(ReFuggParser.ExpridentifierContext ctx);
	/**
	 * Exit a parse tree produced by the {@code expridentifier}
	 * labeled alternative in {@link ReFuggParser#factor}.
	 * @param ctx the parse tree
	 */
	void exitExpridentifier(ReFuggParser.ExpridentifierContext ctx);
	/**
	 * Enter a parse tree produced by the {@code expridentifierIndex}
	 * labeled alternative in {@link ReFuggParser#factor}.
	 * @param ctx the parse tree
	 */
	void enterExpridentifierIndex(ReFuggParser.ExpridentifierIndexContext ctx);
	/**
	 * Exit a parse tree produced by the {@code expridentifierIndex}
	 * labeled alternative in {@link ReFuggParser#factor}.
	 * @param ctx the parse tree
	 */
	void exitExpridentifierIndex(ReFuggParser.ExpridentifierIndexContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exprCreate}
	 * labeled alternative in {@link ReFuggParser#factor}.
	 * @param ctx the parse tree
	 */
	void enterExprCreate(ReFuggParser.ExprCreateContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exprCreate}
	 * labeled alternative in {@link ReFuggParser#factor}.
	 * @param ctx the parse tree
	 */
	void exitExprCreate(ReFuggParser.ExprCreateContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exprConstant}
	 * labeled alternative in {@link ReFuggParser#factor}.
	 * @param ctx the parse tree
	 */
	void enterExprConstant(ReFuggParser.ExprConstantContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exprConstant}
	 * labeled alternative in {@link ReFuggParser#factor}.
	 * @param ctx the parse tree
	 */
	void exitExprConstant(ReFuggParser.ExprConstantContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exprThis}
	 * labeled alternative in {@link ReFuggParser#factor}.
	 * @param ctx the parse tree
	 */
	void enterExprThis(ReFuggParser.ExprThisContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exprThis}
	 * labeled alternative in {@link ReFuggParser#factor}.
	 * @param ctx the parse tree
	 */
	void exitExprThis(ReFuggParser.ExprThisContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exprList}
	 * labeled alternative in {@link ReFuggParser#factor}.
	 * @param ctx the parse tree
	 */
	void enterExprList(ReFuggParser.ExprListContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exprList}
	 * labeled alternative in {@link ReFuggParser#factor}.
	 * @param ctx the parse tree
	 */
	void exitExprList(ReFuggParser.ExprListContext ctx);
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
	 * Enter a parse tree produced by the {@code MethCallidentifier}
	 * labeled alternative in {@link ReFuggParser#methCall}.
	 * @param ctx the parse tree
	 */
	void enterMethCallidentifier(ReFuggParser.MethCallidentifierContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MethCallidentifier}
	 * labeled alternative in {@link ReFuggParser#methCall}.
	 * @param ctx the parse tree
	 */
	void exitMethCallidentifier(ReFuggParser.MethCallidentifierContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MethCallThis}
	 * labeled alternative in {@link ReFuggParser#methCall}.
	 * @param ctx the parse tree
	 */
	void enterMethCallThis(ReFuggParser.MethCallThisContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MethCallThis}
	 * labeled alternative in {@link ReFuggParser#methCall}.
	 * @param ctx the parse tree
	 */
	void exitMethCallThis(ReFuggParser.MethCallThisContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReFuggParser#methCallTail}.
	 * @param ctx the parse tree
	 */
	void enterMethCallTail(ReFuggParser.MethCallTailContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReFuggParser#methCallTail}.
	 * @param ctx the parse tree
	 */
	void exitMethCallTail(ReFuggParser.MethCallTailContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReFuggParser#create}.
	 * @param ctx the parse tree
	 */
	void enterCreate(ReFuggParser.CreateContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReFuggParser#create}.
	 * @param ctx the parse tree
	 */
	void exitCreate(ReFuggParser.CreateContext ctx);
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
	 * Enter a parse tree produced by {@link ReFuggParser#index}.
	 * @param ctx the parse tree
	 */
	void enterIndex(ReFuggParser.IndexContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReFuggParser#index}.
	 * @param ctx the parse tree
	 */
	void exitIndex(ReFuggParser.IndexContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReFuggParser#thisAccess}.
	 * @param ctx the parse tree
	 */
	void enterThisAccess(ReFuggParser.ThisAccessContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReFuggParser#thisAccess}.
	 * @param ctx the parse tree
	 */
	void exitThisAccess(ReFuggParser.ThisAccessContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exprListNoSub}
	 * labeled alternative in {@link ReFuggParser#list}.
	 * @param ctx the parse tree
	 */
	void enterExprListNoSub(ReFuggParser.ExprListNoSubContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exprListNoSub}
	 * labeled alternative in {@link ReFuggParser#list}.
	 * @param ctx the parse tree
	 */
	void exitExprListNoSub(ReFuggParser.ExprListNoSubContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exprListYesSub}
	 * labeled alternative in {@link ReFuggParser#list}.
	 * @param ctx the parse tree
	 */
	void enterExprListYesSub(ReFuggParser.ExprListYesSubContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exprListYesSub}
	 * labeled alternative in {@link ReFuggParser#list}.
	 * @param ctx the parse tree
	 */
	void exitExprListYesSub(ReFuggParser.ExprListYesSubContext ctx);
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
	 * Enter a parse tree produced by {@link ReFuggParser#exprMany}.
	 * @param ctx the parse tree
	 */
	void enterExprMany(ReFuggParser.ExprManyContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReFuggParser#exprMany}.
	 * @param ctx the parse tree
	 */
	void exitExprMany(ReFuggParser.ExprManyContext ctx);
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
	 * Enter a parse tree produced by {@link ReFuggParser#logicOp}.
	 * @param ctx the parse tree
	 */
	void enterLogicOp(ReFuggParser.LogicOpContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReFuggParser#logicOp}.
	 * @param ctx the parse tree
	 */
	void exitLogicOp(ReFuggParser.LogicOpContext ctx);
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
	 * Enter a parse tree produced by {@link ReFuggParser#or}.
	 * @param ctx the parse tree
	 */
	void enterOr(ReFuggParser.OrContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReFuggParser#or}.
	 * @param ctx the parse tree
	 */
	void exitOr(ReFuggParser.OrContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReFuggParser#and}.
	 * @param ctx the parse tree
	 */
	void enterAnd(ReFuggParser.AndContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReFuggParser#and}.
	 * @param ctx the parse tree
	 */
	void exitAnd(ReFuggParser.AndContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReFuggParser#notNeg}.
	 * @param ctx the parse tree
	 */
	void enterNotNeg(ReFuggParser.NotNegContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReFuggParser#notNeg}.
	 * @param ctx the parse tree
	 */
	void exitNotNeg(ReFuggParser.NotNegContext ctx);
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
	 * Enter a parse tree produced by {@link ReFuggParser#add}.
	 * @param ctx the parse tree
	 */
	void enterAdd(ReFuggParser.AddContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReFuggParser#add}.
	 * @param ctx the parse tree
	 */
	void exitAdd(ReFuggParser.AddContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReFuggParser#mult}.
	 * @param ctx the parse tree
	 */
	void enterMult(ReFuggParser.MultContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReFuggParser#mult}.
	 * @param ctx the parse tree
	 */
	void exitMult(ReFuggParser.MultContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReFuggParser#expoOp}.
	 * @param ctx the parse tree
	 */
	void enterExpoOp(ReFuggParser.ExpoOpContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReFuggParser#expoOp}.
	 * @param ctx the parse tree
	 */
	void exitExpoOp(ReFuggParser.ExpoOpContext ctx);
}