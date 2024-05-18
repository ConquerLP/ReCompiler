package ch.compiler.misc.visitors.statements;

import ch.compiler.misc.nodes.declaration.VarDeclaration;
import ch.compiler.misc.nodes.expression.ExpressionNode;
import ch.compiler.misc.nodes.statements.*;
import ch.compiler.misc.visitors.expression.*;
import ch.compiler.parser.ReFuggBaseVisitor;
import ch.compiler.parser.ReFuggParser;

public class VisitorStatement extends ReFuggBaseVisitor<Statement> {

    @Override
    public Statement visitStmt(ReFuggParser.StmtContext ctx) {
        if (ctx.ifStmt() != null) {
            return visitIfStmt(ctx.ifStmt());
        } else if (ctx.whileStmt() != null) {
            return visitWhileStmt(ctx.whileStmt());
        } else if (ctx.doWhileStmt() != null) {
            return visitDoWhileStmt(ctx.doWhileStmt());
        } else if (ctx.forStmt() != null) {
            return visitForStmt(ctx.forStmt());
        }
        return null;
    }

    @Override
    public If visitIfStmt(ReFuggParser.IfStmtContext ctx) {
        if (ctx.getChildCount() > 3) {
            return new If(new VisitorExpression().visitCheck(ctx.check()),
                    visitStmt(ctx.stmt(0)),
                    visitStmt(ctx.stmt(1)));
        } else {
            return new If(new VisitorExpression().visitCheck(ctx.check()),
                    visitStmt(ctx.stmt(0)));

        }
    }

    @Override
    public Statement visitWhileStmt(ReFuggParser.WhileStmtContext ctx) {
        return new While(new VisitorExpression().visitCheck(ctx.check()),
                new VisitorBlock().visitBlock(ctx.block()));
    }

    @Override
    public Statement visitDoWhileStmt(ReFuggParser.DoWhileStmtContext ctx) {
        return new DoWhile(new VisitorExpression().visitCheck(ctx.check()),
                new VisitorBlock().visitBlock(ctx.block()));
    }

    @Override
    public Statement visitForStmt(ReFuggParser.ForStmtContext ctx) {
        return new For(new VisitorVarDec().visitVarDec(ctx.varDec()),
                new VisitorExpression().visitOrExpression(ctx.orExpression(0)),
                new VisitorExpression().visitOrExpression(ctx.orExpression(1)),
                new VisitorExpression().visitOrExpression(ctx.orExpression(2)),
                new VisitorBlock().visitBlock(ctx.block()));
    }

}
