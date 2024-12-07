package ch.compiler.AST.expression.nonConstant.unary.pre;

import ch.compiler.AST.expression.nonConstant.ExprNode;
import ch.compiler.AST.expression.nonConstant.unary.post.PostExprNode;

public class NegExprNode extends PostExprNode {

    public NegExprNode(ExprNode expr) {
        super(expr);
    }

}
