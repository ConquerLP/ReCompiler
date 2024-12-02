package ch.compiler.visitor.ASTgenerator.statement.loop;

import ch.compiler.AST.statement.loop.WhileNode;
import ch.compiler.parser.ReFuggBaseVisitor;
import ch.compiler.parser.ReFuggParser;
import ch.compiler.visitor.ASTgenerator.statement.VCheck;
import ch.compiler.visitor.ASTgenerator.statement.block.VLoopBlock;

public class VWhile extends ReFuggBaseVisitor<WhileNode> {

    @Override
    public WhileNode visitWhileStmt(ReFuggParser.WhileStmtContext ctx) {
        return new WhileNode(new VCheck().visitCheck(ctx.check()),
                new VLoopBlock().visitLoopBlock(ctx.loopBlock()));
    }

}
