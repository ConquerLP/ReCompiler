package ch.compiler.visitor.ASTgenerator.expression.nonConstant;

import ch.compiler.AST.expression.nonConstant.ExprNode;
import ch.compiler.AST.expression.nonConstant.literals.*;
import ch.compiler.parser.ReFuggBaseVisitor;
import ch.compiler.parser.ReFuggParser;

import static ch.compiler.utils.ASTUtils.withPosition;

public class VLiterals extends ReFuggBaseVisitor<ExprNode> {

    @Override
    public ExprNode visitConstant(ReFuggParser.ConstantContext ctx) {
        if (ctx.doubleRule() != null) {
            return withPosition(new DoubleExprNode(Double.parseDouble(ctx.doubleRule().getText())), ctx);
        } else if (ctx.intRule() != null) {
            return withPosition(new IntExprNode(Integer.parseInt(ctx.intRule().getText())), ctx);
        } else if (ctx.booleanRule() != null) {
            return withPosition(new BooleanExprNode(Boolean.parseBoolean(ctx.booleanRule().getText())), ctx);
        } else if (ctx.stringRule() != null) {
            return withPosition(new StringExprNode(ctx.stringRule().getText()), ctx);
        } else if (ctx.charRule() != null) {
            return withPosition(new CharExprNode(ctx.charRule().getText().charAt(0)), ctx);
        } else if (ctx.refRule() != null) {
            if(ctx.refRule().getText().equals("null")) {
                return withPosition(new ReferenceExprNode(ReferenceExprNode.NULL), ctx);
            } else {
                throw new RuntimeException("Unknown reference: " + ctx.refRule().getText());
            }
        } else throw new RuntimeException("Unknown constant: " + ctx.getText());
    }

}
