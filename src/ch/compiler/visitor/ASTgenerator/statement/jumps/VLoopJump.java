package ch.compiler.visitor.ASTgenerator.statement.jumps;

import ch.compiler.AST.statement.StatementNode;
import ch.compiler.AST.statement.jumps.function.ReturnNode;
import ch.compiler.AST.statement.jumps.goTo.GotoNode;
import ch.compiler.AST.statement.jumps.loop.BreakNode;
import ch.compiler.AST.statement.jumps.loop.ContinueNode;
import ch.compiler.parser.ReFuggBaseVisitor;
import ch.compiler.parser.ReFuggParser;
import ch.compiler.visitor.ASTgenerator.expression.nonConstant.VExpr;

import static ch.compiler.utils.ASTUtils.withPosition;

public class VLoopJump extends ReFuggBaseVisitor<StatementNode> {

    @Override
    public StatementNode visitLoopJumpStmt(ReFuggParser.LoopJumpStmtContext ctx) {
        if ("break".equals(ctx.getText())) {
            return withPosition(new BreakNode(), ctx);
        } else if ("continue".equals(ctx.getText())) {
            return withPosition(new ContinueNode(), ctx);
        } else if (ctx.identifier() != null) {
            return withPosition(new GotoNode(ctx.identifier().getText()), ctx);
        } else {
            if (ctx.expression() != null) {
                return withPosition(new ReturnNode(new VExpr().visitExpression(ctx.expression())), ctx);
            } else {
                return withPosition(new ReturnNode(), ctx);
            }
        }
    }

}
