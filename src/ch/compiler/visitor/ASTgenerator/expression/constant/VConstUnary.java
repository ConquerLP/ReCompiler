package ch.compiler.visitor.ASTgenerator.expression.constant;

import ch.compiler.AST.expression.constant.c_ExprNode;
import ch.compiler.AST.expression.constant.unary.pre.*;
import ch.compiler.parser.ReFuggBaseVisitor;
import ch.compiler.parser.ReFuggParser;

public class VConstUnary extends ReFuggBaseVisitor<c_ExprNode> {

    @Override
    public c_ExprNode visitConstUnary(ReFuggParser.ConstUnaryContext ctx) {
        c_ExprNode exprNode = new VConstExpr().visitConstFactor(ctx.constFactor());
        if(ctx.preOP() != null) {
            return switch (ctx.preOP().getText()) {
                case "!", "not" -> new c_NotExprNode(exprNode);
                case "-" -> new c_NegExprNode(exprNode);
                case "+" -> new c_PlusExprNode(exprNode);
                default -> throw new RuntimeException("Unknown unary operator: " + ctx.preOP().getText());
            };
        } else {
            return exprNode;
        }
    }

}
