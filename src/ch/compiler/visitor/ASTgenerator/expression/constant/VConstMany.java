package ch.compiler.visitor.ASTgenerator.expression.constant;

import ch.compiler.AST.expression.constant.c_ExprNode;
import ch.compiler.parser.ReFuggBaseVisitor;
import ch.compiler.parser.ReFuggParser;

import java.util.ArrayList;
import java.util.List;

public class VConstMany extends ReFuggBaseVisitor<List<c_ExprNode>> {

    @Override
    public List<c_ExprNode> visitConstExprMany(ReFuggParser.ConstExprManyContext ctx) {
        List<c_ExprNode> list = new ArrayList<>();
        ctx.constExpr().forEach(constExprContext -> {
            list.add(new VConstExpr().visitConstExpr(constExprContext));
        });
        return list;
    }

}
