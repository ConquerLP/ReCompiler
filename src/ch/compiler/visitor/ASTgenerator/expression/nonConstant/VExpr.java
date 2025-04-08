package ch.compiler.visitor.ASTgenerator.expression.nonConstant;

import ch.compiler.AST.expression.nonConstant.ExprNode;
import ch.compiler.AST.expression.nonConstant.binary.assign.*;
import ch.compiler.parser.ReFuggBaseVisitor;
import ch.compiler.parser.ReFuggParser;
import ch.compiler.utils.Position;

public class VExpr extends ReFuggBaseVisitor<ExprNode> {

    @Override
    public ExprNode visitExpression(ReFuggParser.ExpressionContext ctx) {
        new Position(ctx);
        if (ctx.assignOP() != null) {
            ExprNode right;
            if (ctx.expression() != null) {
                right = new VExpr().visitExpression(ctx.expression());
            } else if (ctx.list() != null) {
                right = new VList().visitList(ctx.list());
            } else {
                throw new RuntimeException("Right expression invalid.");
            }
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
