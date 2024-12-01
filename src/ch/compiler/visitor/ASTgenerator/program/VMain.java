package ch.compiler.visitor.ASTgenerator.program;

import ch.compiler.AST.program.MainNode;
import ch.compiler.parser.ReFuggBaseVisitor;
import ch.compiler.parser.ReFuggParser;
import ch.compiler.visitor.ASTgenerator.statement.block.VFunctionBlock;

public class VMain extends ReFuggBaseVisitor<MainNode> {

    @Override
    public MainNode visitMain(ReFuggParser.MainContext ctx) {
        return new MainNode(new VFunctionBlock().visit(ctx.functionBlock()));
    }

}
