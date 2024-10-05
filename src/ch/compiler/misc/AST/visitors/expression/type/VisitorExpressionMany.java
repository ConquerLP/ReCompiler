package ch.compiler.misc.AST.visitors.expression.type;

import ch.compiler.misc.AST.nodes.expression.ExpressionNode;
import ch.compiler.misc.AST.visitors.expression.VisitorExpression;
import ch.compiler.parser.ReFuggBaseVisitor;
import ch.compiler.parser.ReFuggParser;

import java.util.ArrayList;
import java.util.List;

public class VisitorExpressionMany extends ReFuggBaseVisitor<List<ExpressionNode>> {

    @Override
    public List<ExpressionNode> visitConstSubList(ReFuggParser.ConstSubListContext ctx) {
        return visitConstExprMany(ctx.constExprMany());
    }

    @Override
    public List<ExpressionNode> visitConstExprMany(ReFuggParser.ConstExprManyContext ctx) {
        List<ExpressionNode> nodes = new ArrayList<>();
        ctx.constExpr().forEach(constExpr -> {
            nodes.add(new VisitorExpression().visitConstExpr(constExpr));
        });
        return nodes;
    }

    @Override
    public List<ExpressionNode> visitSubList(ReFuggParser.SubListContext ctx) {
        return visitExpressionMany(ctx.expressionMany());
    }

    @Override
    public List<ExpressionNode> visitExpressionMany(ReFuggParser.ExpressionManyContext ctx) {
        List<ExpressionNode> nodes = new ArrayList<>();
        ctx.orExpression().forEach(expression -> {
            nodes.add(new VisitorExpression().visitOrExpression(expression));
        });
        return nodes;
    }

    @Override
    public List<ExpressionNode> visitFArgs(ReFuggParser.FArgsContext ctx) {
        return visitExpressionMany(ctx.expressionMany());
    }

}
