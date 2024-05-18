package ch.compiler.misc.visitors.expression.type;

import ch.compiler.misc.nodes.expression.literals.IntegerLiteral;
import ch.compiler.misc.nodes.symbolTable.Type;
import ch.compiler.misc.visitors.expression.constant.VisitorConstantExpression;
import ch.compiler.parser.ReFuggBaseVisitor;
import ch.compiler.parser.ReFuggParser;

public class VisitorComplexType extends ReFuggBaseVisitor<Type> {

    @Override
    public Type visitType(ReFuggParser.TypeContext ctx) {
        if (ctx.identifier() != null) {
            return new Type(ctx.identifier().getText());
        } else {
            return new Type(ctx.getText());
        }
    }

    @Override
    public Type visitComplexType(ReFuggParser.ComplexTypeContext ctx) {
        Type type = visitType(ctx.type());
        ctx.constArray().forEach(constArray -> type.addDim(((IntegerLiteral) new VisitorConstantExpression().visitConstArray(constArray)).getValue()));
        return type;
    }
}
