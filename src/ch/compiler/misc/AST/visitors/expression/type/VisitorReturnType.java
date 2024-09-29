package ch.compiler.misc.AST.visitors.expression.type;

import ch.compiler.misc.AST.nodes.symbolTable.DataType;
import ch.compiler.misc.AST.nodes.symbolTable.Type;
import ch.compiler.parser.ReFuggBaseVisitor;
import ch.compiler.parser.ReFuggParser;

public class VisitorReturnType extends ReFuggBaseVisitor<Type> {

    @Override
    public Type visitReturntype(ReFuggParser.ReturntypeContext ctx) {
        if (ctx.type() != null) {
            return new VisitorType().visitType(ctx.type());
        } else {
            return new Type(DataType.VOID.toString());
        }
    }

}
