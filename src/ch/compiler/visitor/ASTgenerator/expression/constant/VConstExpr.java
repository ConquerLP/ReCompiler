package ch.compiler.visitor.ASTgenerator.expression.constant;

import ch.compiler.AST.expression.constant.binary.op.c_OrExprNode;
import ch.compiler.AST.expression.constant.c_ConstArray;
import ch.compiler.AST.expression.constant.c_ExprNode;
import ch.compiler.parser.ReFuggBaseVisitor;
import ch.compiler.parser.ReFuggParser;

public class VConstExpr extends ReFuggBaseVisitor<c_ExprNode> {

    @Override
    public c_ExprNode visitConstArray(ReFuggParser.ConstArrayContext ctx) {
        if(ctx.constExpr() != null) {
            return new c_ConstArray(visitConstExpr(ctx.constExpr()));
        } else {
            return new c_ConstArray();
        }
    }

    @Override
    public c_ExprNode visitConstInit(ReFuggParser.ConstInitContext ctx) {
        if (ctx.constExpr() != null) {
            return visitConstExpr(ctx.constExpr());
        } else if (ctx.constList() != null) {
            return new VConstList().visitConstList(ctx.constList());
        } else {
            throw new RuntimeException("Unknown constant type: " + ctx.getText());
        }
    }

    @Override
    public c_ExprNode visitConstExpr(ReFuggParser.ConstExprContext ctx) {
        if (ctx.orOP() != null) {
            return new c_OrExprNode(visitConstExpr(ctx.constExpr()), new VConstBinary().visitConstJoin(ctx.constJoin()));
        } else {
            return new VConstBinary().visitConstJoin(ctx.constJoin());
        }
    }

    @Override
    public c_ExprNode visitConstFactor(ReFuggParser.ConstFactorContext ctx) {
        if (ctx.constant() != null) {
            return new VConstLiteral().visitConstant(ctx.constant());
        } else if (ctx.constExpr() != null) {
            return visitConstExpr(ctx.constExpr());
        } else if (ctx.constVar() != null) {
            return new VConstAccess().visitConstVar(ctx.constVar());
        } else if (ctx.constArrayAccess() != null) {
            return new VConstAccess().visitConstArrayAccess(ctx.constArrayAccess());
        } else {
            throw new RuntimeException("Unknown constant factor: " + ctx.getText());
        }
    }

}
