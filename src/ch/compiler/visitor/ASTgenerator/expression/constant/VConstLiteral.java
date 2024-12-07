package ch.compiler.visitor.ASTgenerator.expression.constant;

import ch.compiler.AST.expression.constant.c_ExprNode;
import ch.compiler.AST.expression.constant.literals.*;
import ch.compiler.parser.ReFuggBaseVisitor;
import ch.compiler.parser.ReFuggParser;

public class VConstLiteral extends ReFuggBaseVisitor<c_ExprNode> {

    @Override
    public c_ExprNode visitConstant(ReFuggParser.ConstantContext ctx) {
        if(ctx.doubleRule() != null) {
            return new c_DoubleExprNode(Double.parseDouble(ctx.doubleRule().getText()));
        } else if(ctx.intRule() != null) {
            return new c_IntExprNode(Integer.parseInt(ctx.intRule().getText()));
        } else if(ctx.booleanRule() != null) {
            return new c_BooleanExprNode(Boolean.parseBoolean(ctx.booleanRule().getText()));
        } else if(ctx.stringRule() != null) {
            return new c_StringExprNode(ctx.stringRule().getText());
        } else if(ctx.charRule() != null) {
            return new c_CharExprNode(ctx.charRule().getText().charAt(0));
        } else if(ctx.refRule() != null) {
            if("null".equals(ctx.refRule().getText())) {
                return new c_ReferenceExprNode(c_ReferenceExprNode.NULL);
            } else {
                throw new RuntimeException("Unknown reference: " + ctx.refRule().getText());
            }
        } else throw new RuntimeException("Unknown constant: " + ctx.getText());
    }

}
