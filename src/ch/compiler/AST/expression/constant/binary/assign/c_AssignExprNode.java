package ch.compiler.AST.expression.constant.binary.assign;

import ch.compiler.AST.expression.constant.binary.c_BinaryExprNode;
import ch.compiler.AST.expression.constant.c_ExprNode;

public abstract class c_AssignExprNode extends c_BinaryExprNode {

    public c_AssignExprNode(c_ExprNode left, c_ExprNode right) {
        super(left, right);
    }

}
