package ch.compiler.visitor.ASTgenerator.statement.block;

import ch.compiler.AST.statement.block.LoopBlock;
import ch.compiler.parser.ReFuggBaseVisitor;
import ch.compiler.parser.ReFuggParser;

public class VLoopBlock extends ReFuggBaseVisitor<LoopBlock> {

    @Override
    public LoopBlock visitLoopBlock(ReFuggParser.LoopBlockContext ctx) {
        LoopBlock loopBlock = new LoopBlock();
        ctx.loopBlockStmt().forEach(stmt -> {
            loopBlock.addStatement(new VBlockPart().visitLoopBlockStmt(stmt));
        });
        return loopBlock;
    }

}
