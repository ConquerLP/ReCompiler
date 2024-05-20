package ch.compiler.misc.AST.visitors.expression.type;

import ch.compiler.misc.AST.nodes.symbolTable.Type;
import ch.compiler.parser.ReFuggBaseVisitor;
import ch.compiler.parser.ReFuggParser;

public class VisitorReturnType extends ReFuggBaseVisitor<Type> {

    @Override
    public Type visitReturntype(ReFuggParser.ReturntypeContext ctx) {
        if (!"void".equals(ctx.getText())) {
            return new VisitorComplexType().visitComplexType(ctx.complexType());
        } else{
            return new Type("void");
        }
    }
}
