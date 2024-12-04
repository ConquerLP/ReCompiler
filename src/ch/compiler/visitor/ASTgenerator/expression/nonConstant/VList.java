package ch.compiler.visitor.ASTgenerator.expression.nonConstant;

import ch.compiler.AST.expression.nonConstant.list.ListExprNode;
import ch.compiler.parser.ReFuggBaseVisitor;
import ch.compiler.parser.ReFuggParser;

public class VList extends ReFuggBaseVisitor<ListExprNode> {

    @Override
    public ListExprNode visitList(ReFuggParser.ListContext ctx) {
        return super.visitList(ctx);
    }

    @Override
    public ListExprNode visitSubList(ReFuggParser.SubListContext ctx) {
        return super.visitSubList(ctx);
    }

}
