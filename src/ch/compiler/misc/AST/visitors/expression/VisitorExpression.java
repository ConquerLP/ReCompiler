package ch.compiler.misc.AST.visitors.expression;

import ch.compiler.misc.AST.nodes.expression.ExpressionNode;
import ch.compiler.parser.ReFuggBaseVisitor;
import ch.compiler.parser.ReFuggParser;

public class VisitorExpression extends ReFuggBaseVisitor<ExpressionNode> {

    @Override
    public ExpressionNode visitConstArray(ReFuggParser.ConstArrayContext ctx) {
        return super.visitConstArray(ctx);
    }

    @Override
    public ExpressionNode visitConstList(ReFuggParser.ConstListContext ctx) {
        return super.visitConstList(ctx);
    }

    @Override
    public ExpressionNode visitConstSubList(ReFuggParser.ConstSubListContext ctx) {
        return super.visitConstSubList(ctx);
    }

    @Override
    public ExpressionNode visitConstExprMany(ReFuggParser.ConstExprManyContext ctx) {
        return super.visitConstExprMany(ctx);
    }

    @Override
    public ExpressionNode visitConstVar(ReFuggParser.ConstVarContext ctx) {
        return super.visitConstVar(ctx);
    }

    @Override
    public ExpressionNode visitConstArrayAccess(ReFuggParser.ConstArrayAccessContext ctx) {
        return super.visitConstArrayAccess(ctx);
    }

    @Override
    public ExpressionNode visitConstExpr(ReFuggParser.ConstExprContext ctx) {
        return super.visitConstExpr(ctx);
    }

    @Override
    public ExpressionNode visitConstJoin(ReFuggParser.ConstJoinContext ctx) {
        return super.visitConstJoin(ctx);
    }

    @Override
    public ExpressionNode visitConstEQ(ReFuggParser.ConstEQContext ctx) {
        return super.visitConstEQ(ctx);
    }

    @Override
    public ExpressionNode visitConstRel(ReFuggParser.ConstRelContext ctx) {
        return super.visitConstRel(ctx);
    }

    @Override
    public ExpressionNode visitConstLogic(ReFuggParser.ConstLogicContext ctx) {
        return super.visitConstLogic(ctx);
    }

    @Override
    public ExpressionNode visitConstTerm(ReFuggParser.ConstTermContext ctx) {
        return super.visitConstTerm(ctx);
    }

    @Override
    public ExpressionNode visitConstExpo(ReFuggParser.ConstExpoContext ctx) {
        return super.visitConstExpo(ctx);
    }

    @Override
    public ExpressionNode visitConstUnary(ReFuggParser.ConstUnaryContext ctx) {
        return super.visitConstUnary(ctx);
    }

    @Override
    public ExpressionNode visitConstFactor(ReFuggParser.ConstFactorContext ctx) {
        return super.visitConstFactor(ctx);
    }

    @Override
    public ExpressionNode visitArrayAccess(ReFuggParser.ArrayAccessContext ctx) {
        return super.visitArrayAccess(ctx);
    }

    @Override
    public ExpressionNode visitMethodCall(ReFuggParser.MethodCallContext ctx) {
        return super.visitMethodCall(ctx);
    }

    @Override
    public ExpressionNode visitNewObject(ReFuggParser.NewObjectContext ctx) {
        return super.visitNewObject(ctx);
    }

    @Override
    public ExpressionNode visitFCall(ReFuggParser.FCallContext ctx) {
        return super.visitFCall(ctx);
    }

    @Override
    public ExpressionNode visitThisAcces(ReFuggParser.ThisAccesContext ctx) {
        return super.visitThisAcces(ctx);
    }

    @Override
    public ExpressionNode visitVarAcces(ReFuggParser.VarAccesContext ctx) {
        return super.visitVarAcces(ctx);
    }

    @Override
    public ExpressionNode visitExprTail(ReFuggParser.ExprTailContext ctx) {
        return super.visitExprTail(ctx);
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
    public ExpressionNode visitPrimary(ReFuggParser.PrimaryContext ctx) {
        return super.visitPrimary(ctx);
    }

    @Override
    public ExpressionNode visitList(ReFuggParser.ListContext ctx) {
        return super.visitList(ctx);
    }

    @Override
    public ExpressionNode visitSubList(ReFuggParser.SubListContext ctx) {
        return super.visitSubList(ctx);
    }

    @Override
    public ExpressionNode visitExpressionMany(ReFuggParser.ExpressionManyContext ctx) {
        return super.visitExpressionMany(ctx);
    }

    @Override
    public ExpressionNode visitFArgs(ReFuggParser.FArgsContext ctx) {
        return super.visitFArgs(ctx);
    }

    @Override
    public ExpressionNode visitReturntype(ReFuggParser.ReturntypeContext ctx) {
        return super.visitReturntype(ctx);
    }

    @Override
    public ExpressionNode visitConstant(ReFuggParser.ConstantContext ctx) {
        return super.visitConstant(ctx);
    }
}
