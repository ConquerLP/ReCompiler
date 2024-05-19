package ch.compiler.misc.visitors.statements;

import ch.compiler.misc.nodes.statements.Label;
import ch.compiler.parser.ReFuggBaseVisitor;
import ch.compiler.parser.ReFuggParser;

public class VisitorLabel extends ReFuggBaseVisitor<Label>{

    @Override
    public Label visitLabel(ReFuggParser.LabelContext ctx) {
        return new Label(new VisitorStatement().visitBlock(ctx.block()), ctx.identifier().getText());
    }
}
