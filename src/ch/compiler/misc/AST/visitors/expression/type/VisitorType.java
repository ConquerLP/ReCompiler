package ch.compiler.misc.AST.visitors.expression.type;

import ch.compiler.misc.AST.nodes.symbolTable.Type;
import ch.compiler.parser.ReFuggBaseVisitor;
import ch.compiler.parser.ReFuggParser;

import java.util.List;

public class VisitorType extends ReFuggBaseVisitor<Type> {

    @Override
    public Type visitType(ReFuggParser.TypeContext ctx) {
        if (ctx.identifier() != null) {
            return new Type(ctx.identifier().getText());
        } else {
            return new Type(ctx.getText());
        }
    }

    public Type visitCompositeType(ReFuggParser.TypeContext ctx, List<ReFuggParser.ConstArrayContext> constArray, ReFuggParser.TypemodifierContext typemodifier) {
        Type type = visitType(ctx);
        if (constArray != null) {
            type.addDim(constArray.size());
        }
        type.setTypeModifier(new VisitorTypeModifier().visitTypemodifier(typemodifier));
        return type;
    }

    public Type visitCompositeType(ReFuggParser.TypeContext ctx, List<ReFuggParser.ConstArrayContext> constArray) {
        Type type = visitType(ctx);
        if (constArray != null) {
            type.addDim(constArray.size());
        }
        return type;
    }

}
