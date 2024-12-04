package ch.compiler.visitor.ASTgenerator.typeModifier;

import ch.compiler.AST.misc.TypeModifier;
import ch.compiler.parser.ReFuggBaseVisitor;
import ch.compiler.parser.ReFuggParser;

public class VTypeModifier extends ReFuggBaseVisitor<TypeModifier> {

    @Override
    public TypeModifier visitTypemodifier(ReFuggParser.TypemodifierContext ctx) {
        if(ctx != null) {
            return new TypeModifier(ctx.getText());
        } else {
            return null;
        }
    }
}
