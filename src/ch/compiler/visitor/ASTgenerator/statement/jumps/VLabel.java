package ch.compiler.visitor.ASTgenerator.statement.jumps;

import ch.compiler.AST.statement.jumps.goTo.LabelNode;
import ch.compiler.parser.ReFuggBaseVisitor;
import ch.compiler.parser.ReFuggParser;
import ch.compiler.visitor.ASTgenerator.statement.block.VFunctionBlock;

public class VLabel extends ReFuggBaseVisitor<LabelNode> {
    @Override
    public LabelNode visitLabel(ReFuggParser.LabelContext ctx) {
        return new LabelNode(ctx.identifier().getText(), new VFunctionBlock().visitFunctionBlock(ctx.functionBlock()));
    }
}
