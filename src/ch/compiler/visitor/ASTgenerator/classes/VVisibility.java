package ch.compiler.visitor.ASTgenerator.classes;

import ch.compiler.parser.ReFuggBaseVisitor;
import ch.compiler.parser.ReFuggParser;

public class VVisibility extends ReFuggBaseVisitor<String> {

    @Override
    public String visitVisibilty(ReFuggParser.VisibiltyContext ctx) {
        return ctx.getText();
    }

}
