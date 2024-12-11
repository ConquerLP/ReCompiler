package ch.compiler.visitor.ASTgenerator.classes;

import ch.compiler.parser.ReFuggBaseVisitor;
import ch.compiler.parser.ReFuggParser;

public class VPoly extends ReFuggBaseVisitor<String> {

    @Override
    public String visitPoly(ReFuggParser.PolyContext ctx) {
        return ctx == null ? "" : ctx.getText();
    }

}
