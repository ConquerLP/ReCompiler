package ch.compiler.visitor.ASTgenerator.statement;

import ch.compiler.AST.expression.nonConstant.binary.op.OrExprNode;
import ch.compiler.AST.statement.StatementNode;
import ch.compiler.parser.ReFuggBaseVisitor;
import ch.compiler.parser.ReFuggParser;
import ch.compiler.visitor.ASTgenerator.expression.nonConstant.VExpr;
import ch.compiler.visitor.ASTgenerator.expression.vars.VVar;
import ch.compiler.visitor.ASTgenerator.statement.loop.VFor;

public class VStatement extends ReFuggBaseVisitor<StatementNode> {

    @Override
    public StatementNode visitStmt(ReFuggParser.StmtContext ctx) {
        if (ctx.ifStmt() != null) {
            return new VIf().visitIfStmt(ctx.ifStmt());
        } else if (ctx.forStmt() != null) {
            return new VFor().visitForStmt(ctx.forStmt());
        }


        return super.visitStmt(ctx);
    }

    @Override
    public StatementNode visitForStart(ReFuggParser.ForStartContext ctx) {
        if (ctx.varDec() != null) {
            return new VVar().visitVarDec(ctx.varDec());
        } else if(ctx.orExpression() != null) {
            return new VExpr().visitOrExpression(ctx.orExpression());
        } else return null;
    }

    @Override
    public OrExprNode visitForCheck(ReFuggParser.ForCheckContext ctx) {
        if(ctx.orExpression() != null) {
            return new VExpr().visitOrExpression(ctx.orExpression());
        } else return null;
    }

    @Override
    public OrExprNode visitForAction(ReFuggParser.ForActionContext ctx) {
        if(ctx.orExpression() != null) {
            return new VExpr().visitOrExpression(ctx.orExpression());
        } else return null;
    }
}
