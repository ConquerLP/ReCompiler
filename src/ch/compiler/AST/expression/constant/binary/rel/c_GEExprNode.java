package ch.compiler.AST.expression.constant.binary.rel;

import ch.compiler.AST.expression.constant.c_ExprNode;

public class c_GEExprNode extends c_RelExprNode {


    public c_GEExprNode(c_ExprNode left, c_ExprNode right) {
        super(left, right);
    }
    @Override
    public String toString() {
        return "";
    }
}
