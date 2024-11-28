package ch.compiler.AST.expression.nonConstant.literals;


public class StringExprNode extends ConstantExprNode {

    public boolean evaluate() {
        return false;
    }
}
