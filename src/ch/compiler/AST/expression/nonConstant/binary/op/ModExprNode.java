package ch.compiler.AST.expression.nonConstant.binary.op;

import ch.compiler.AST.expression.nonConstant.ExprNode;
import ch.compiler.AST.expression.nonConstant.binary.BinaryExprNode;

public class ModExprNode extends BinaryExprNode {

    public ModExprNode(ExprNode left, ExprNode right) {
        super(left, right);
    }

    @Override
    public String toString() {
        return "";
    }
}
