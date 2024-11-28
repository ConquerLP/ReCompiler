package ch.compiler.AST.expression.nonConstant.unary.pre;

import ch.compiler.AST.expression.nonConstant.unary.post.PostExprNode;

public class NegExprNode extends PostExprNode {

    public boolean evaluate() {
        return false;
    }
}
