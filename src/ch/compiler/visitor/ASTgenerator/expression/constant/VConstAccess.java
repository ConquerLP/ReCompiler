package ch.compiler.visitor.ASTgenerator.expression.constant;

import ch.compiler.AST.expression.constant.access.*;
import ch.compiler.AST.expression.constant.c_ExprNode;
import ch.compiler.parser.ReFuggBaseVisitor;
import ch.compiler.parser.ReFuggParser;

public class VConstAccess extends ReFuggBaseVisitor<c_ExprNode> {

    @Override
    public c_ExprNode visitConstVar(ReFuggParser.ConstVarContext ctx) {
        return new c_VarExprNode(ctx.getText());
    }

    @Override
    public c_ExprNode visitConstArrayAccess(ReFuggParser.ConstArrayAccessContext ctx) {
        c_ArrayExprNode arrayExprNode = new c_ArrayExprNode(ctx.identifier().getText());
        ctx.constExpr().forEach(constExprContext -> {
            arrayExprNode.add(visitConstExpr(constExprContext));
        });
        return arrayExprNode;
    }

}
