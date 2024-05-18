package ch.compiler.misc.visitors.statements;

import ch.compiler.misc.nodes.statements.Block;
import ch.compiler.misc.nodes.statements.Label;
import ch.compiler.misc.visitors.VisitorHelper;
import ch.compiler.parser.ReFuggBaseVisitor;
import ch.compiler.parser.ReFuggParser;

public class VisitorLabel extends ReFuggBaseVisitor<Label>{

    @Override
    public Label visitLabel(ReFuggParser.LabelContext ctx) {
        String id = VisitorHelper.getIdentifier(ctx);
        Block block = new VisitorBlock().visitBlock((ReFuggParser.BlockContext) ctx.getChild(2));
        return new Label(block, id);
    }
}
