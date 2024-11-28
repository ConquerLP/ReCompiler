package ch.compiler.AST.expression.nonConstant.literals;


public class BooleanExprNode extends ConstantExprNode {

    public boolean evaluate() {
        return false;
    }
}
