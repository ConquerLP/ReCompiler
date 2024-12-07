package ch.compiler.AST.expression.nonConstant.binary.op;

import ch.compiler.AST.expression.nonConstant.ExprNode;
import ch.compiler.AST.expression.nonConstant.binary.BinaryExprNode;

public class OrExprNode extends BinaryExprNode {

    public OrExprNode(ExprNode left, ExprNode right) {
        super(left, right);
    }

}
