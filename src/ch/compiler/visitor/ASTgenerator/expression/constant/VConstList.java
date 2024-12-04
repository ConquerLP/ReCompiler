package ch.compiler.visitor.ASTgenerator.expression.constant;

import ch.compiler.AST.expression.constant.c_ExprNode;
import ch.compiler.AST.expression.constant.list.c_ListExprNode;
import ch.compiler.parser.ReFuggBaseVisitor;
import ch.compiler.parser.ReFuggParser;

public class VConstList extends ReFuggBaseVisitor<c_ListExprNode> {

    @Override
    public c_ListExprNode visitConstList(ReFuggParser.ConstListContext ctx) {
        return super.visitConstList(ctx);
    }

    @Override
    public c_ListExprNode visitConstSubList(ReFuggParser.ConstSubListContext ctx) {
        return super.visitConstSubList(ctx);
    }
}
