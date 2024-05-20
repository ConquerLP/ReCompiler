package ch.compiler.misc.AST.visitors.expression;

import ch.compiler.misc.AST.nodes.expression.access.ArrayAccess;
import ch.compiler.parser.ReFuggBaseVisitor;
import ch.compiler.parser.ReFuggParser;

public class VisitorArrayAccess extends ReFuggBaseVisitor<ArrayAccess> {

    @Override
    public ArrayAccess visitArrayAccess(ReFuggParser.ArrayAccessContext ctx) {
        return new ArrayAccess(new VisitorExpression().visit(ctx.orExpression()));
    }

}
