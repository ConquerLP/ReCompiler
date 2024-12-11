package ch.compiler.AST.expression.nonConstant.unary.pre;

import ch.compiler.AST.expression.nonConstant.ExprNode;
import ch.compiler.AST.expression.nonConstant.unary.UnaryExprNode;

public abstract class PreExprNode extends UnaryExprNode {

    public PreExprNode(ExprNode expr) {
        super(expr);
    }
}
