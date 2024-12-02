package ch.compiler.visitor.ASTgenerator.statement.block;

import ch.compiler.AST.statement.block.FunctionBlock;
import ch.compiler.AST.statement.block.LoopBlock;
import ch.compiler.parser.ReFuggBaseVisitor;
import ch.compiler.parser.ReFuggParser;

public class VFunctionBlock extends ReFuggBaseVisitor<FunctionBlock> {

    @Override
    public FunctionBlock visitFunctionBlock(ReFuggParser.FunctionBlockContext ctx) {
        FunctionBlock functionBlock = new FunctionBlock();
        ctx.functionBlockStmt().forEach(stmt -> {
            functionBlock.addStatement(new VBlockPart().visitFunctionBlockStmt(stmt));
        });
        return functionBlock;
    }

}
