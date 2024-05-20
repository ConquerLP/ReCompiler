package ch.compiler.misc.AST.visitors.expression;

import ch.compiler.misc.AST.nodes.expression.ExpressionNode;
import ch.compiler.parser.ReFuggBaseVisitor;
import ch.compiler.parser.ReFuggParser;

import java.util.ArrayList;
import java.util.List;

public class VisitorFArgs extends ReFuggBaseVisitor<List<ExpressionNode>> {

    @Override
    public List<ExpressionNode> visitFArgs(ReFuggParser.FArgsContext ctx) {
        if (ctx.expressionMany() != null) {
            return visitExpressionMany(ctx.expressionMany());
        } else {
            return null;
        }
    }

    @Override
    public List<ExpressionNode> visitExpressionMany(ReFuggParser.ExpressionManyContext ctx) {
        List<ExpressionNode> expressions = new ArrayList<>();
        ctx.orExpression().forEach(expression -> expressions.add(new VisitorExpression().visitOrExpression(expression)));
        return expressions;
    }

}
