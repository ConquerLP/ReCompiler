package ch.compiler.AST.expression.nonConstant.binary.op;

import ch.compiler.AST.expression.nonConstant.binary.BinaryExprNode;

public class ModExprNode extends BinaryExprNode {

    public boolean evaluate() {
        return false;
    }
}
