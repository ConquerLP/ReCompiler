package ch.compiler.AST.expression.nonConstant.unary.pre;

import ch.compiler.AST.expression.nonConstant.ExprNode;
import ch.compiler.AST.expression.nonConstant.unary.post.PostExprNode;

public class NotExprNode extends PostExprNode {

    public NotExprNode(ExprNode expr) {
        super(expr);
    }

    @Override
    public String toString() {
        return "";
    }
}
