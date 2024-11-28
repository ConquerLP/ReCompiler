package ch.compiler.AST.expression.nonConstant.binary.assign;

public class AssignModExprNode extends AssignExprNode {
    public boolean evaluate() {
        return false;
    }
}
