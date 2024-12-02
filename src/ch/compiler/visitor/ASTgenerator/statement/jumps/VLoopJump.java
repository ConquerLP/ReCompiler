package ch.compiler.visitor.ASTgenerator.statement.jumps;

import ch.compiler.AST.statement.StatementNode;
import ch.compiler.AST.statement.jumps.function.ReturnNode;
import ch.compiler.AST.statement.jumps.goTo.GotoNode;
import ch.compiler.AST.statement.jumps.loop.BreakNode;
import ch.compiler.AST.statement.jumps.loop.ContinueNode;
import ch.compiler.parser.ReFuggBaseVisitor;
import ch.compiler.parser.ReFuggParser;
import ch.compiler.visitor.ASTgenerator.expression.nonConstant.VExpr;

public class VLoopJump extends ReFuggBaseVisitor<StatementNode> {

    @Override
    public StatementNode visitLoopJumpStmt(ReFuggParser.LoopJumpStmtContext ctx) {
        if ("break".equals(ctx.getText())) {
            return new BreakNode();
        } else if ("continue".equals(ctx.getText())) {
            return new ContinueNode();
        } else if (ctx.identifier() != null) {
            return new GotoNode(ctx.identifier().getText());
        } else {
            if (ctx.expression() != null) {
                return new ReturnNode(new VExpr().visitExpression(ctx.expression()));
            } else {
                return new ReturnNode();
            }
        }
    }

}
