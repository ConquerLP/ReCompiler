package ch.compiler.AST.expression.nonConstant.literals;


public class ReferenceExprNode extends ConstantExprNode {

    public boolean evaluate() {
        return false;
    }
}
