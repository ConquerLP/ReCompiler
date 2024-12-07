package ch.compiler.visitor.ASTgenerator.expression.nonConstant;

import ch.compiler.AST.expression.nonConstant.ExprNode;
import ch.compiler.AST.expression.nonConstant.unary.post.DecExprNode;
import ch.compiler.AST.expression.nonConstant.unary.post.IncExprNode;
import ch.compiler.AST.expression.nonConstant.unary.pre.*;
import ch.compiler.parser.ReFuggBaseVisitor;
import ch.compiler.parser.ReFuggParser;

public class VUnary extends ReFuggBaseVisitor<ExprNode> {

    @Override
    public ExprNode visitUnaryExpression(ReFuggParser.UnaryExpressionContext ctx) {
        if(ctx.preOP() != null) {
            switch(ctx.preOP().getText()) {
                case "!", "not" -> {
                    return new NotExprNode(visitUnaryExpression(ctx.unaryExpression()));
                }
                case "-" -> {
                    return new NegExprNode(visitUnaryExpression(ctx.unaryExpression()));
                }
                case "+" -> {
                    return visitUnaryExpression(ctx.unaryExpression());
                }
                default -> throw new RuntimeException("Unknown unary operator: " + ctx.preOP().getText());
            }
        } else {
            return visitPostExpression(ctx.postExpression());
        }
    }

    @Override
    public ExprNode visitPostExpression(ReFuggParser.PostExpressionContext ctx) {
        if(ctx.postOP() != null) {
            switch(ctx.postOP().getText()) {
                case "++" -> {
                    return new IncExprNode(new VPrimary().visitPrimary(ctx.primary()));
                }
                case "--" -> {
                    return new DecExprNode(new VPrimary().visitPrimary(ctx.primary()));
                }
                default -> throw new RuntimeException("Unknown post operator: " + ctx.postOP().getText());
            }
        } else {
            return new VPrimary().visitPrimary(ctx.primary());
        }
    }

}
