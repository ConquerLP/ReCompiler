package ch.compiler.misc.visitors.expression.type;

import ch.compiler.misc.nodes.symbolTable.Type;
import ch.compiler.parser.ReFuggBaseVisitor;
import ch.compiler.parser.ReFuggParser;

public class VisitorReturnType extends ReFuggBaseVisitor<Type> {

    @Override
    public Type visitReturntype(ReFuggParser.ReturntypeContext ctx) {
        if(!ctx.getText().equals("void")){
            return new VisitorComplexType().visitComplexType(ctx.complexType());
        } else {
            return new Type("void");
        }
    }
}
