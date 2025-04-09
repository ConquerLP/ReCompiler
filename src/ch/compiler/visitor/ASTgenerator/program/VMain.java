package ch.compiler.visitor.ASTgenerator.program;

import ch.compiler.AST.program.MainNode;
import ch.compiler.parser.ReFuggBaseVisitor;
import ch.compiler.parser.ReFuggParser;
import ch.compiler.visitor.ASTgenerator.statement.block.VFunctionBlock;

import static ch.compiler.utils.ASTUtils.withPosition;

public class VMain extends ReFuggBaseVisitor<MainNode> {

    @Override
    public MainNode visitMain(ReFuggParser.MainContext ctx) {
        return withPosition(new MainNode(new VFunctionBlock().visitFunctionBlock(ctx.functionBlock())), ctx);
    }

}
