package ch.compiler.visitor.ASTgenerator.expression.constant;

import ch.compiler.AST.expression.constant.list.c_ListExprNode;
import ch.compiler.parser.ReFuggBaseVisitor;
import ch.compiler.parser.ReFuggParser;

public class VConstList extends ReFuggBaseVisitor<c_ListExprNode> {

    @Override
    public c_ListExprNode visitConstList(ReFuggParser.ConstListContext ctx) {
        c_ListExprNode list = new c_ListExprNode();
        if(ctx.constExprMany() != null) {
            list.addExpressions(new VConstMany().visitConstExprMany(ctx.constExprMany()));
        }
        if (ctx.constSubList() != null) {
            ctx.constSubList().forEach(subListContext -> {
                list.addExpression(visitConstSubList(subListContext));
            });
        }
        return list;
    }

    @Override
    public c_ListExprNode visitConstSubList(ReFuggParser.ConstSubListContext ctx) {
        c_ListExprNode list = new c_ListExprNode();
        list.addExpressions(new VConstMany().visitConstExprMany(ctx.constExprMany()));
        return list;
    }

}
