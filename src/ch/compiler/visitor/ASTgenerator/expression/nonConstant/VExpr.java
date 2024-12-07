package ch.compiler.visitor.ASTgenerator.expression.nonConstant;

import ch.compiler.AST.expression.nonConstant.ExprNode;
import ch.compiler.AST.expression.nonConstant.binary.assign.*;
import ch.compiler.parser.ReFuggBaseVisitor;
import ch.compiler.parser.ReFuggParser;

public class VExpr extends ReFuggBaseVisitor<ExprNode> {

    @Override
    public ExprNode visitExpression(ReFuggParser.ExpressionContext ctx) {
        if(ctx.assignOP() != null) {
            ExprNode right = new VExpr().visitExpression(ctx.expression());
            return switch (ctx.assignOP().getText()) {
                case "=" -> new AssignEQExprNode(new VLHExpr().visitLh_expression(ctx.lh_expression()), right);
                case "+=" -> new AssignPlusExprNode(new VLHExpr().visitLh_expression(ctx.lh_expression()), right);
                case "-=" -> new AssignMinusExprNode(new VLHExpr().visitLh_expression(ctx.lh_expression()), right);
                case "*=" -> new AssignMultExprNode(new VLHExpr().visitLh_expression(ctx.lh_expression()), right);
                case "/=" -> new AssignDivExprNode(new VLHExpr().visitLh_expression(ctx.lh_expression()), right);
                case "%=" -> new AssignModExprNode(new VLHExpr().visitLh_expression(ctx.lh_expression()), right);
                case "**=", "^=" ->
                        new AssignExpoExprNode(new VLHExpr().visitLh_expression(ctx.lh_expression()), right);
                default -> throw new RuntimeException("Unknown assign operator: " + ctx.assignOP().getText());
            };
        } else {
            return new VBinary().visitOrExpression(ctx.orExpression());
        }
    }

}
