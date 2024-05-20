package ch.compiler.misc.AST.visitors.expression.type;

import ch.compiler.misc.AST.nodes.expression.literals.IntegerLiteral;
import ch.compiler.misc.AST.nodes.symbolTable.Type;
import ch.compiler.misc.AST.visitors.expression.VisitorExpression;
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
        ctx.simpleArray()
                .forEach(simpleArray ->
                        type.addDim(((IntegerLiteral) new VisitorExpression().visitSimpleArray(simpleArray)).getValue()));
        return type;
    }
}
