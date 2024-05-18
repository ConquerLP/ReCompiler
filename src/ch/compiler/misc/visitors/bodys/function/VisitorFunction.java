package ch.compiler.misc.visitors.bodys.function;

import ch.compiler.misc.nodes.bodys.Function;
import ch.compiler.misc.visitors.expression.type.VisitorReturnType;
import ch.compiler.misc.visitors.statements.VisitorBlock;
import ch.compiler.parser.ReFuggBaseVisitor;
import ch.compiler.parser.ReFuggParser;
import ch.compiler.parser.ReFuggParser.FuncContext;

public class VisitorFunction extends ReFuggBaseVisitor<Function> {

    @Override
    public Function visitFunc(FuncContext ctx) {
        ReFuggParser.FHeaderContext header = ctx.fHeader();
        Function function = new Function(
                header.identifier().getText(),
                new VisitorReturnType().visitReturntype(header.returntype())
        );
        function.setTable(new VisitorFParam().visitFParam(ctx.fParam()));
        function.setBlock(new VisitorBlock().visitBlock(ctx.block()));
        return function;
    }

}