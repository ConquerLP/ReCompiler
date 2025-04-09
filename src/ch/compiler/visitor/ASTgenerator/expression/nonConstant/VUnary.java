package ch.compiler.visitor.ASTgenerator.expression.nonConstant;

import ch.compiler.AST.expression.nonConstant.ExprNode;
import ch.compiler.AST.expression.nonConstant.unary.post.DecExprNode;
import ch.compiler.AST.expression.nonConstant.unary.post.IncExprNode;
import ch.compiler.AST.expression.nonConstant.unary.pre.*;
import ch.compiler.parser.ReFuggBaseVisitor;
import ch.compiler.parser.ReFuggParser;

import static ch.compiler.utils.ASTUtils.withPosition;

public class VUnary extends ReFuggBaseVisitor<ExprNode> {

    @Override
    public ExprNode visitUnaryExpression(ReFuggParser.UnaryExpressionContext ctx) {
        if(ctx.preOP() != null) {
            switch(ctx.preOP().getText()) {
                case "!", "not" -> {
                    return withPosition(new NotExprNode(visitUnaryExpression(ctx.unaryExpression())), ctx);
                }
                case "-" -> {
                    return withPosition(new NegExprNode(visitUnaryExpression(ctx.unaryExpression())), ctx);
                }
                case "+" -> {
                    return withPosition(new PlusExprNode(visitUnaryExpression(ctx.unaryExpression())), ctx);
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
                    return withPosition(new IncExprNode(new VPrimary().visitPrimary(ctx.primary())), ctx);
                }
                case "--" -> {
                    return withPosition(new DecExprNode(new VPrimary().visitPrimary(ctx.primary())), ctx);
                }
                default -> throw new RuntimeException("Unknown post operator: " + ctx.postOP().getText());
            }
        } else {
            return new VPrimary().visitPrimary(ctx.primary());
        }
    }

}
