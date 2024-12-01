package ch.compiler.visitor.ASTgenerator.expression.constant;

import ch.compiler.AST.expression.constant.c_ExprNode;
import ch.compiler.parser.ReFuggBaseVisitor;
import ch.compiler.parser.ReFuggParser;

public class VConstExpr extends ReFuggBaseVisitor<c_ExprNode> {

    @Override
    public c_ExprNode visitConstArray(ReFuggParser.ConstArrayContext ctx) {
        return super.visitConstArray(ctx);
    }
}
