package ch.compiler.AST.expression.nonConstant.literals;


public class IntExprNode extends ConstantExprNode {

    public boolean evaluate() {
        return false;
    }
}
