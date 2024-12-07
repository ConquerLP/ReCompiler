package ch.compiler.visitor.ASTgenerator.expression.nonConstant;

import ch.compiler.AST.expression.nonConstant.ExprNode;
import ch.compiler.AST.expression.nonConstant.literals.*;
import ch.compiler.parser.ReFuggBaseVisitor;
import ch.compiler.parser.ReFuggParser;

public class VLiterals extends ReFuggBaseVisitor<ExprNode> {

    @Override
    public ExprNode visitConstant(ReFuggParser.ConstantContext ctx) {
        if (ctx.doubleRule() != null) {
            return new DoubleExprNode(Double.parseDouble(ctx.doubleRule().getText()));
        } else if (ctx.intRule() != null) {
            return new IntExprNode(Integer.parseInt(ctx.intRule().getText()));
        } else if (ctx.booleanRule() != null) {
            return new BooleanExprNode(Boolean.parseBoolean(ctx.booleanRule().getText()));
        } else if (ctx.stringRule() != null) {
            return new StringExprNode(ctx.stringRule().getText());
        } else if (ctx.charRule() != null) {
            return new CharExprNode(ctx.charRule().getText().charAt(0));
        } else if (ctx.refRule() != null) {
            if(ctx.refRule().getText().equals("null")) {
                return new ReferenceExprNode(ReferenceExprNode.NULL);
            } else {
                throw new RuntimeException("Unknown reference: " + ctx.refRule().getText());
            }
        } else throw new RuntimeException("Unknown constant: " + ctx.getText());
    }

}
