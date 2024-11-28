package ch.compiler.AST.expression.nonConstant.binary.assign;

public class AssignMinusExprNode extends AssignExprNode {
    public boolean evaluate() {
        return false;
    }
}
