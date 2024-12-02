package ch.compiler.visitor.ASTgenerator.statement.jumps;

import ch.compiler.AST.statement.StatementNode;
import ch.compiler.AST.statement.jumps.goTo.GotoNode;
import ch.compiler.AST.statement.jumps.function.ReturnNode;
import ch.compiler.parser.ReFuggBaseVisitor;
import ch.compiler.parser.ReFuggParser;
import ch.compiler.visitor.ASTgenerator.expression.nonConstant.VExpr;

public class VFunctionJump extends ReFuggBaseVisitor<StatementNode> {

    @Override
    public StatementNode visitFunctionJumpStmt(ReFuggParser.FunctionJumpStmtContext ctx) {
        if (ctx.identifier() != null) {
            return new GotoNode(ctx.identifier().getText());
        } else {
            return new ReturnNode(new VExpr().visitExpression(ctx.expression()));
        }
    }

}
