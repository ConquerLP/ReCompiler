package ch.compiler.visitor.ASTgenerator.expression.constant;

import ch.compiler.AST.expression.constant.c_ExprNode;
import ch.compiler.parser.ReFuggBaseVisitor;
import ch.compiler.parser.ReFuggParser;

public class VConstExpr extends ReFuggBaseVisitor<c_ExprNode> {

    @Override
    public c_ExprNode visitConstArray(ReFuggParser.ConstArrayContext ctx) {
        return super.visitConstArray(ctx);
    }

    @Override
    public c_ExprNode visitConstInit(ReFuggParser.ConstInitContext ctx) {
        if(ctx.constExpr() != null ){
            return visitConstExpr(ctx.constExpr());
        } else if(ctx.constList() != null) {
            return new VConstList().visitConstList(ctx.constList());
        } else {
            throw new IllegalArgumentException("Unknown constant type");
        }
    }

    @Override
    public c_ExprNode visitConstExpr(ReFuggParser.ConstExprContext ctx) {
        return super.visitConstExpr(ctx);
    }
}
