package ch.compiler.AST.expression.nonConstant.unary.pre;

import ch.compiler.AST.expression.nonConstant.unary.post.PostExprNode;

public class NotExprNode extends PostExprNode {

    public boolean evaluate() {
        return false;
    }
}
