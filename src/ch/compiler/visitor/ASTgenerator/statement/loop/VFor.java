package ch.compiler.visitor.ASTgenerator.statement.loop;

import ch.compiler.AST.expression.nonConstant.ExprNode;
import ch.compiler.AST.statement.StatementNode;
import ch.compiler.AST.statement.loop.ForNode;
import ch.compiler.parser.ReFuggBaseVisitor;
import ch.compiler.parser.ReFuggParser;
import ch.compiler.visitor.ASTgenerator.statement.VStatement;
import ch.compiler.visitor.ASTgenerator.statement.block.VLoopBlock;

public class VFor extends ReFuggBaseVisitor<ForNode> {

    @Override
    public ForNode visitForStmt(ReFuggParser.ForStmtContext ctx) {
        StatementNode start = new VStatement().visitForStart(ctx.forStart());
        ExprNode check = new VStatement().visitForCheck(ctx.forCheck());
        ExprNode action = new VStatement().visitForAction(ctx.forAction());
        return new ForNode(start, check, action, new VLoopBlock().visitLoopBlock(ctx.loopBlock()));
    }
}
