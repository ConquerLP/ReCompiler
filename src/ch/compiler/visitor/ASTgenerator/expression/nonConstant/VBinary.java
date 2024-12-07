package ch.compiler.visitor.ASTgenerator.expression.nonConstant;

import ch.compiler.AST.expression.nonConstant.ExprNode;
import ch.compiler.AST.expression.nonConstant.binary.BinaryExprNode;
import ch.compiler.AST.expression.nonConstant.binary.eq.*;
import ch.compiler.AST.expression.nonConstant.binary.op.*;
import ch.compiler.AST.expression.nonConstant.binary.rel.GEExprNode;
import ch.compiler.AST.expression.nonConstant.binary.rel.*;
import ch.compiler.parser.ReFuggBaseVisitor;
import ch.compiler.parser.ReFuggParser;

public class VBinary extends ReFuggBaseVisitor<ExprNode> {

    @Override
    public ExprNode visitOrExpression(ReFuggParser.OrExpressionContext ctx) {
        if (ctx.orOP() != null) {
            return new OrExprNode(visitOrExpression(ctx.orExpression()), visitAndExpression(ctx.andExpression()));
        } else {
            return visitAndExpression(ctx.andExpression());
        }
    }

    @Override
    public ExprNode visitAndExpression(ReFuggParser.AndExpressionContext ctx) {
        if (ctx.andOP() != null) {
            return new AndExprNode(visitAndExpression(ctx.andExpression()), visitEqualityExpression(ctx.equalityExpression()));
        } else {
            return visitEqualityExpression(ctx.equalityExpression());
        }
    }

    @Override
    public ExprNode visitEqualityExpression(ReFuggParser.EqualityExpressionContext ctx) {
        if (ctx.eqOP() != null) {
            return switch (ctx.eqOP().getText()) {
                case "==" ->
                        new EQExprNode(visitEqualityExpression(ctx.equalityExpression()), visitRelationalExpression(ctx.relationalExpression()));
                case "!=" ->
                        new NQExprNode(visitEqualityExpression(ctx.equalityExpression()), visitRelationalExpression(ctx.relationalExpression()));
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
                        new LTExprNode(visitRelationalExpression(ctx.relationalExpression()), visitAdditiveExpression(ctx.additiveExpression()));
                case "<=" ->
                        new LEExprNode(visitRelationalExpression(ctx.relationalExpression()), visitAdditiveExpression(ctx.additiveExpression()));
                case ">" ->
                        new GTExprNode(visitRelationalExpression(ctx.relationalExpression()), visitAdditiveExpression(ctx.additiveExpression()));
                case ">=" ->
                        new GEExprNode(visitRelationalExpression(ctx.relationalExpression()), visitAdditiveExpression(ctx.additiveExpression()));
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
                        new AddExprNode(visitAdditiveExpression(ctx.additiveExpression()), visitMultiplicativeExpression(ctx.multiplicativeExpression()));
                case "-" ->
                        new SubExprNode(visitAdditiveExpression(ctx.additiveExpression()), visitMultiplicativeExpression(ctx.multiplicativeExpression()));
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
                        new MultExprNode(visitMultiplicativeExpression(ctx.multiplicativeExpression()), visitExponentiationExpression(ctx.exponentiationExpression()));
                case "/" ->
                        new DivExprNode(visitMultiplicativeExpression(ctx.multiplicativeExpression()), visitExponentiationExpression(ctx.exponentiationExpression()));
                case "%" ->
                        new ModExprNode(visitMultiplicativeExpression(ctx.multiplicativeExpression()), visitExponentiationExpression(ctx.exponentiationExpression()));
                default -> throw new RuntimeException("Unknown equality operator: " + ctx.multOP().getText());
            };
        } else {
            return visitExponentiationExpression(ctx.exponentiationExpression());
        }
    }

    @Override
    public ExprNode visitExponentiationExpression(ReFuggParser.ExponentiationExpressionContext ctx) {
        if (ctx.expOP() != null) {
            new ExpoExprNode(visitExponentiationExpression(ctx.exponentiationExpression()), visitUnaryExpression(ctx.unaryExpression()));
        } else {
            return new VUnary().visitUnaryExpression(ctx.unaryExpression());
        }
        throw new RuntimeException("Unknown exponential operator: " + ctx.expOP().getText());
    }
}
