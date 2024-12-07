package ch.compiler.visitor.ASTgenerator.expression.nonConstant;

import ch.compiler.AST.expression.nonConstant.ExprNode;
import ch.compiler.AST.expression.nonConstant.list.ListExprNode;
import ch.compiler.parser.ReFuggBaseVisitor;
import ch.compiler.parser.ReFuggParser;

public class VList extends ReFuggBaseVisitor<ExprNode> {

    @Override
    public ExprNode visitList(ReFuggParser.ListContext ctx) {
        ListExprNode list = new ListExprNode();
        if(ctx.expressionMany() != null) {
            list.addExpressions(new VManyExpr().visitExpressionMany(ctx.expressionMany()));
        }
        if (ctx.subList() != null) {
            ctx.subList().forEach(subListContext -> {
                list.addExpression(visitSubList(subListContext));
            });
        }
        return list;
    }

    @Override
    public ExprNode visitSubList(ReFuggParser.SubListContext ctx) {
        ListExprNode list = new ListExprNode();
        list.addExpressions(new VManyExpr().visitExpressionMany(ctx.expressionMany()));
        return list;
    }

}
