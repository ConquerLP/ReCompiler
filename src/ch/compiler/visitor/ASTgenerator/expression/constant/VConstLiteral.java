package ch.compiler.visitor.ASTgenerator.expression.constant;

import ch.compiler.AST.expression.constant.c_ExprNode;
import ch.compiler.AST.expression.constant.literals.*;
import ch.compiler.parser.ReFuggBaseVisitor;
import ch.compiler.parser.ReFuggParser;

import static ch.compiler.utils.ASTUtils.withPosition;

public class VConstLiteral extends ReFuggBaseVisitor<c_ExprNode> {

    @Override
    public c_ExprNode visitConstant(ReFuggParser.ConstantContext ctx) {
        if(ctx.doubleRule() != null) {
            return withPosition(new c_DoubleExprNode(Double.parseDouble(ctx.doubleRule().getText())), ctx);
        } else if(ctx.intRule() != null) {
            return withPosition(new c_IntExprNode(Integer.parseInt(ctx.intRule().getText())), ctx);
        } else if(ctx.booleanRule() != null) {
            return withPosition(new c_BooleanExprNode(Boolean.parseBoolean(ctx.booleanRule().getText())), ctx);
        } else if(ctx.stringRule() != null) {
            return withPosition(new c_StringExprNode(ctx.stringRule().getText()), ctx);
        } else if(ctx.charRule() != null) {
            return withPosition(new c_CharExprNode(ctx.charRule().getText().charAt(0)), ctx);
        } else if(ctx.refRule() != null) {
            if("null".equals(ctx.refRule().getText())) {
                return withPosition(new c_ReferenceExprNode(c_ReferenceExprNode.NULL), ctx);
            } else {
                throw new RuntimeException("Unknown reference: " + ctx.refRule().getText());
            }
        } else throw new RuntimeException("Unknown constant: " + ctx.getText());
    }

}
