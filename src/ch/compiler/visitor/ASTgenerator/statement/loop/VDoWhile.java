package ch.compiler.visitor.ASTgenerator.statement.loop;

import ch.compiler.AST.statement.loop.DoWhileNode;
import ch.compiler.parser.ReFuggBaseVisitor;
import ch.compiler.parser.ReFuggParser;
import ch.compiler.visitor.ASTgenerator.statement.VCheck;
import ch.compiler.visitor.ASTgenerator.statement.block.VLoopBlock;

public class VDoWhile extends ReFuggBaseVisitor<DoWhileNode> {

    @Override
    public DoWhileNode visitDoWhileStmt(ReFuggParser.DoWhileStmtContext ctx) {
        return new DoWhileNode(new VCheck().visitCheck(ctx.check()),
                new VLoopBlock().visitLoopBlock(ctx.loopBlock()));
    }

}
