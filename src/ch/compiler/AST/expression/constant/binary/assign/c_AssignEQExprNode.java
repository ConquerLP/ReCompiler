package ch.compiler.AST.expression.constant.binary.assign;

import ch.compiler.AST.expression.constant.c_ExprNode;

public class c_AssignEQExprNode extends c_AssignExprNode {

    public c_AssignEQExprNode(c_ExprNode left, c_ExprNode right) {
        super(left, right);
    }

    @Override
    public String toString() {
        return "";
    }
}
