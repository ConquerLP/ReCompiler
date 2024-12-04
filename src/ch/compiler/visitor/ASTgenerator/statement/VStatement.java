package ch.compiler.visitor.ASTgenerator.statement;

import ch.compiler.AST.expression.nonConstant.binary.op.OrExprNode;
import ch.compiler.AST.statement.StatementNode;
import ch.compiler.parser.ReFuggBaseVisitor;
import ch.compiler.parser.ReFuggParser;
import ch.compiler.visitor.ASTgenerator.expression.nonConstant.VExpr;
import ch.compiler.visitor.ASTgenerator.expression.vars.VVar;
import ch.compiler.visitor.ASTgenerator.statement.block.VFunctionBlock;
import ch.compiler.visitor.ASTgenerator.statement.loop.VFor;
import ch.compiler.visitor.ASTgenerator.statement.loop.VWhile;
import ch.compiler.visitor.ASTgenerator.statement.switchNode.VSwitchCase;

public class VStatement extends ReFuggBaseVisitor<StatementNode> {

    @Override
    public StatementNode visitStmt(ReFuggParser.StmtContext ctx) {
        if (ctx.ifStmt() != null) {
            return new VIf().visitIfStmt(ctx.ifStmt());
        } else if (ctx.whileStmt() != null) {
            return new VWhile().visitWhileStmt(ctx.whileStmt());
        } else if (ctx.doWhileStmt() != null) {
            return new VWhile().visitDoWhileStmt(ctx.doWhileStmt());
        } else if (ctx.forStmt() != null) {
            return new VFor().visitForStmt(ctx.forStmt());
        } else if (ctx.switchCase() != null) {
            return new VSwitchCase().visitSwitchCase(ctx.switchCase());
        } else if(ctx.functionBlock() != null) {
            return new VFunctionBlock().visitFunctionBlock(ctx.functionBlock());
        } else if(ctx.varDec() != null) {
            return new VVar().visitVarDec(ctx.varDec());
        } else if(ctx.expression() != null) {
            return new VExpr().visitExpression(ctx.expression());
        } else throw new RuntimeException("Unknown statement type");
    }

    @Override
    public StatementNode visitForStart(ReFuggParser.ForStartContext ctx) {
        if (ctx.varDec() != null) {
            return new VVar().visitVarDec(ctx.varDec());
        } else if (ctx.orExpression() != null) {
            return new VExpr().visitOrExpression(ctx.orExpression());
        } else return null;
    }

    @Override
    public OrExprNode visitForCheck(ReFuggParser.ForCheckContext ctx) {
        if (ctx.orExpression() != null) {
            return new VExpr().visitOrExpression(ctx.orExpression());
        } else return null;
    }

    @Override
    public OrExprNode visitForAction(ReFuggParser.ForActionContext ctx) {
        if (ctx.orExpression() != null) {
            return new VExpr().visitOrExpression(ctx.orExpression());
        } else return null;
    }
}
