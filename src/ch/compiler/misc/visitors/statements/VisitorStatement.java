package ch.compiler.misc.visitors.statements;

import ch.compiler.misc.nodes.statements.*;
import ch.compiler.misc.visitors.expression.*;
import ch.compiler.misc.visitors.expression.constant.VisitorConstantExpression;
import ch.compiler.misc.visitors.expression.type.VisitorVarDec;
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
        } else if (ctx.switchCase() != null) {
            return visitSwitchCase(ctx.switchCase());
        } else if (ctx.jumpStmt() != null) {
            return visitJumpStmt(ctx.jumpStmt());
        } else if (ctx.block() != null) {
            return visitBlock(ctx.block());
        } else if (ctx.varDec() != null) {
            return new VisitorVarDec().visitVarDec(ctx.varDec());
        } else if (ctx.expression() != null) {
            return new VisitorExpression().visitExpression(ctx.expression());
        } else {
            return null;
        }
    }

    @Override
    public Block visitBlock(ReFuggParser.BlockContext ctx) {
        Block block = new Block();
        ctx.stmt().forEach(b -> block.addStatement(new VisitorStatement().visitStmt(b)));
        return block;
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
                visitBlock(ctx.block()));
    }

    @Override
    public Statement visitDoWhileStmt(ReFuggParser.DoWhileStmtContext ctx) {
        return new DoWhile(new VisitorExpression().visitCheck(ctx.check()),
                visitBlock(ctx.block()));
    }

    @Override
    public Statement visitForStmt(ReFuggParser.ForStmtContext ctx) {
        return new For(new VisitorVarDec().visitVarDec(ctx.varDec()),
                new VisitorExpression().visitOrExpression(ctx.orExpression(0)),
                new VisitorExpression().visitOrExpression(ctx.orExpression(1)),
                new VisitorExpression().visitOrExpression(ctx.orExpression(2)),
                visitBlock(ctx.block()));
    }

    @Override
    public Statement visitSwitchCase(ReFuggParser.SwitchCaseContext ctx) {
        Switch switchStatement = new Switch(new VisitorExpression().visitCheck(ctx.check()));
        ctx.caseBlock().forEach(caseBlock -> switchStatement.addCaseBlock((CaseBlock) visitCaseBlock(caseBlock)));
        return switchStatement;
    }

    @Override
    public Statement visitCaseBlock(ReFuggParser.CaseBlockContext ctx) {
        if("default".equals(ctx.getText())) {
            return new CaseBlock(visitBlock(ctx.block()));
        } else {
            return new CaseBlock(new VisitorConstantExpression().visitConstExpr(ctx.constExpr()),
                    visitBlock(ctx.block()));
        }
    }

    @Override
    public Statement visitJumpStmt(ReFuggParser.JumpStmtContext ctx) {
        if("break".equals(ctx.getText())) {
            return new Jump(JumpType.BREAK);
        } else if("continue".equals(ctx.getText())) {
            return new Jump(JumpType.CONTINUE);
        } else if("goto".equals(ctx.getText())) {
            return new Jump(JumpType.GOTO, ctx.identifier().getText());
        } else {
            return new Jump(JumpType.RETURN, new VisitorExpression().visitOrExpression(ctx.orExpression()));
        }
    }

}
