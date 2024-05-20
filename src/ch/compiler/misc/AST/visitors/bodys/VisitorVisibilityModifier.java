package ch.compiler.misc.AST.visitors.bodys;

import ch.compiler.misc.AST.nodes.symbolTable.Access;
import ch.compiler.parser.ReFuggBaseVisitor;
import ch.compiler.parser.ReFuggParser;

public class VisitorVisibilityModifier extends ReFuggBaseVisitor<Access> {

    @Override
    public Access visitVisibilty(ReFuggParser.VisibiltyContext ctx) {
        if (ctx.getText().equals(Access.PRIVATE.toString())) {
            return Access.PRIVATE;
        } else if (ctx.getText().equals(Access.PROTECTED.toString())) {
            return Access.PROTECTED;
        } else if (ctx.getText().equals(Access.PUBLIC.toString())) {
            return Access.PUBLIC;
        } else {
            return null;
        }
    }
}
