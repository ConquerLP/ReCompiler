package ch.compiler.misc.AST.visitors.expression.type;

import ch.compiler.misc.AST.nodes.symbolTable.TypeModifier;
import ch.compiler.parser.ReFuggBaseVisitor;
import ch.compiler.parser.ReFuggParser;

public class VisitorTypeModifier extends ReFuggBaseVisitor<TypeModifier> {

    @Override
    public TypeModifier visitTypemodifier(ReFuggParser.TypemodifierContext ctx) {
        try {
            if (TypeModifier.FINAL.toString().equals(ctx.getText())) {
                return TypeModifier.FINAL;
            } else {
                return TypeModifier.NONE;
            }
        } catch (Exception e){
            return TypeModifier.NONE;
        }
    }
}
