package ch.compiler.misc.visitors.expression;

import ch.compiler.misc.nodes.expression.ExpressionNode;
import ch.compiler.parser.ReFuggBaseVisitor;
import ch.compiler.parser.ReFuggParser;

public class VisitorExpression extends ReFuggBaseVisitor<ExpressionNode> {

    @Override
    public ExpressionNode visitCheck(ReFuggParser.CheckContext ctx) {
        return visitOrExpression(ctx.orExpression());
    }

    @Override
    public ExpressionNode visitLh_expression(ReFuggParser.Lh_expressionContext ctx) {
        return super.visitLh_expression(ctx);
    }

    @Override
    public ExpressionNode visitExpression(ReFuggParser.ExpressionContext ctx) {
        return super.visitExpression(ctx);
    }

    @Override
    public ExpressionNode visitOrExpression(ReFuggParser.OrExpressionContext ctx) {
        return super.visitOrExpression(ctx);
    }

    @Override
    public ExpressionNode visitAndExpression(ReFuggParser.AndExpressionContext ctx) {
        return super.visitAndExpression(ctx);
    }

    @Override
    public ExpressionNode visitEqualityExpression(ReFuggParser.EqualityExpressionContext ctx) {
        return super.visitEqualityExpression(ctx);
    }

    @Override
    public ExpressionNode visitRelationalExpression(ReFuggParser.RelationalExpressionContext ctx) {
        return super.visitRelationalExpression(ctx);
    }

    @Override
    public ExpressionNode visitAdditiveExpression(ReFuggParser.AdditiveExpressionContext ctx) {
        return super.visitAdditiveExpression(ctx);
    }

    @Override
    public ExpressionNode visitMultiplicativeExpression(ReFuggParser.MultiplicativeExpressionContext ctx) {
        return super.visitMultiplicativeExpression(ctx);
    }

    @Override
    public ExpressionNode visitExponentiationExpression(ReFuggParser.ExponentiationExpressionContext ctx) {
        return super.visitExponentiationExpression(ctx);
    }

    @Override
    public ExpressionNode visitUnaryExpression(ReFuggParser.UnaryExpressionContext ctx) {
        return super.visitUnaryExpression(ctx);
    }

    @Override
    public ExpressionNode visitPostExpression(ReFuggParser.PostExpressionContext ctx) {
        return super.visitPostExpression(ctx);
    }

    @Override
    public ExpressionNode visitExpressionMany(ReFuggParser.ExpressionManyContext ctx) {
        return super.visitExpressionMany(ctx);
    }
}
