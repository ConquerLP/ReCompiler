package ch.compiler.visitor.ASTgenerator.expression.nonConstant;

import ch.compiler.AST.expression.nonConstant.ExprNode;
import ch.compiler.AST.expression.nonConstant.binary.eq.*;
import ch.compiler.AST.expression.nonConstant.binary.op.*;
import ch.compiler.AST.expression.nonConstant.binary.rel.GEExprNode;
import ch.compiler.AST.expression.nonConstant.binary.rel.*;
import ch.compiler.parser.ReFuggBaseVisitor;
import ch.compiler.parser.ReFuggParser;

import static ch.compiler.utils.ASTUtils.withPosition;

public class VBinary extends ReFuggBaseVisitor<ExprNode> {

    @Override
    public ExprNode visitOrExpression(ReFuggParser.OrExpressionContext ctx) {
        if (ctx.orOP() != null) {
            return withPosition(new OrExprNode(visitOrExpression(ctx.orExpression()),
                    visitAndExpression(ctx.andExpression())), ctx);
        } else {
            return visitAndExpression(ctx.andExpression());
        }
    }

    @Override
    public ExprNode visitAndExpression(ReFuggParser.AndExpressionContext ctx) {
        if (ctx.andOP() != null) {
            return withPosition(new AndExprNode(visitAndExpression(ctx.andExpression()),
                    visitEqualityExpression(ctx.equalityExpression())), ctx);
        } else {
            return visitEqualityExpression(ctx.equalityExpression());
        }
    }

    @Override
    public ExprNode visitEqualityExpression(ReFuggParser.EqualityExpressionContext ctx) {
        if (ctx.eqOP() != null) {
            return switch (ctx.eqOP().getText()) {
                case "==" ->
                        withPosition(new EQExprNode(visitEqualityExpression(ctx.equalityExpression()),
                                visitRelationalExpression(ctx.relationalExpression())), ctx);
                case "!=" ->
                        withPosition(new NQExprNode(visitEqualityExpression(ctx.equalityExpression()),
                                visitRelationalExpression(ctx.relationalExpression())), ctx);
                default -> throw new RuntimeException("Unknown equality operator: " + ctx.eqOP().getText());
            };
        } else {
            return visitRelationalExpression(ctx.relationalExpression());
        }
    }

    @Override
    public ExprNode visitRelationalExpression(ReFuggParser.RelationalExpressionContext ctx) {
        if (ctx.relOP() != null) {
            return switch (ctx.relOP().getText()) {
                case "<" ->
                        withPosition(new LTExprNode(visitRelationalExpression(ctx.relationalExpression()),
                                visitAdditiveExpression(ctx.additiveExpression())), ctx);
                case "<=" ->
                        withPosition(new LEExprNode(visitRelationalExpression(ctx.relationalExpression()),
                                visitAdditiveExpression(ctx.additiveExpression())), ctx);
                case ">" ->
                        withPosition(new GTExprNode(visitRelationalExpression(ctx.relationalExpression()),
                                visitAdditiveExpression(ctx.additiveExpression())), ctx);
                case ">=" ->
                        withPosition(new GEExprNode(visitRelationalExpression(ctx.relationalExpression()),
                                visitAdditiveExpression(ctx.additiveExpression())), ctx);
                default -> throw new RuntimeException("Unknown equality operator: " + ctx.relOP().getText());
            };
        } else {
            return visitAdditiveExpression(ctx.additiveExpression());
        }
    }

    @Override
    public ExprNode visitAdditiveExpression(ReFuggParser.AdditiveExpressionContext ctx) {
        if (ctx.addOP() != null) {
            return switch (ctx.addOP().getText()) {
                case "+" ->
                        withPosition(new AddExprNode(visitAdditiveExpression(ctx.additiveExpression()),
                                visitMultiplicativeExpression(ctx.multiplicativeExpression())), ctx);
                case "-" ->
                        withPosition(new SubExprNode(visitAdditiveExpression(ctx.additiveExpression()),
                                visitMultiplicativeExpression(ctx.multiplicativeExpression())), ctx);
                default -> throw new RuntimeException("Unknown equality operator: " + ctx.addOP().getText());
            };
        } else {
            return visitMultiplicativeExpression(ctx.multiplicativeExpression());
        }
    }

    @Override
    public ExprNode visitMultiplicativeExpression(ReFuggParser.MultiplicativeExpressionContext ctx) {
        if (ctx.multOP() != null) {
            return switch (ctx.multOP().getText()) {
                case "*" ->
                        withPosition(new MultExprNode(visitMultiplicativeExpression(ctx.multiplicativeExpression()),
                                visitExponentiationExpression(ctx.exponentiationExpression())), ctx);
                case "/" ->
                        withPosition(new DivExprNode(visitMultiplicativeExpression(ctx.multiplicativeExpression()),
                                visitExponentiationExpression(ctx.exponentiationExpression())), ctx);
                case "%" ->
                        withPosition(new ModExprNode(visitMultiplicativeExpression(ctx.multiplicativeExpression()),
                                visitExponentiationExpression(ctx.exponentiationExpression())), ctx);
                default -> throw new RuntimeException("Unknown equality operator: " + ctx.multOP().getText());
            };
        } else {
            return visitExponentiationExpression(ctx.exponentiationExpression());
        }
    }

    @Override
    public ExprNode visitExponentiationExpression(ReFuggParser.ExponentiationExpressionContext ctx) {
        if (ctx.expOP() != null) {
            withPosition(new ExpoExprNode(visitExponentiationExpression(ctx.exponentiationExpression()),
                    visitUnaryExpression(ctx.unaryExpression())), ctx);
        } else {
            return withPosition(new VUnary().visitUnaryExpression(ctx.unaryExpression()), ctx);
        }
        throw new RuntimeException("Unknown exponential operator: " + ctx.expOP().getText());
    }

}
