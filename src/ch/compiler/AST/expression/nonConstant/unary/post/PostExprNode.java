package ch.compiler.AST.expression.nonConstant.unary.post;

import ch.compiler.AST.expression.nonConstant.ExprNode;
import ch.compiler.AST.expression.nonConstant.unary.UnaryExprNode;

public abstract class PostExprNode extends UnaryExprNode {

    public PostExprNode(ExprNode expr) {
        super(expr);
    }
}
