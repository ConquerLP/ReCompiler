package ch.compiler.AST.expression.constant.binary.op;

import ch.compiler.AST.expression.constant.c_ExprNode;

public class c_OrExprNode extends c_OpExprNode {

    public c_OrExprNode(c_ExprNode left, c_ExprNode right) {
        super(left, right);
    }
}
