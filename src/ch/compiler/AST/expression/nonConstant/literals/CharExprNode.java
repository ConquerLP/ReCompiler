package ch.compiler.AST.expression.nonConstant.literals;


public class CharExprNode extends ConstantExprNode {

    public boolean evaluate() {
        return false;
    }
}
