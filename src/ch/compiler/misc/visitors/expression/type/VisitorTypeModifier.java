package ch.compiler.misc.visitors.expression.type;

import ch.compiler.misc.nodes.symbolTable.TypeModifier;
import ch.compiler.parser.ReFuggBaseVisitor;
import ch.compiler.parser.ReFuggParser;

public class VisitorTypeModifier extends ReFuggBaseVisitor<TypeModifier> {

    @Override
    public TypeModifier visitTypemodifier(ReFuggParser.TypemodifierContext ctx) {
        if (ctx.getText().equals(TypeModifier.STATIC.toString())) {
            return TypeModifier.STATIC;
        } else if (ctx.getText().equals(TypeModifier.FINAL.toString())) {
            return TypeModifier.FINAL;
        }
        return null;
    }
}
