package ch.compiler.visitor.ASTgenerator.expression.constant;

import ch.compiler.AST.expression.constant.access.*;
import ch.compiler.AST.expression.constant.c_ExprNode;
import ch.compiler.parser.ReFuggBaseVisitor;
import ch.compiler.parser.ReFuggParser;

import static ch.compiler.utils.ASTUtils.withPosition;

public class VConstAccess extends ReFuggBaseVisitor<c_ExprNode> {

    @Override
    public c_ExprNode visitConstVar(ReFuggParser.ConstVarContext ctx) {
        return withPosition(new c_VarExprNode(ctx.getText()), ctx);
    }

    @Override
    public c_ExprNode visitConstArrayAccess(ReFuggParser.ConstArrayAccessContext ctx) {
        c_ArrayExprNode arrayExprNode = new c_ArrayExprNode(ctx.identifier().getText());
        ctx.constExpr().forEach(constExprContext -> {
            arrayExprNode.add(visitConstExpr(constExprContext));
        });
        return withPosition(arrayExprNode, ctx);
    }

}
