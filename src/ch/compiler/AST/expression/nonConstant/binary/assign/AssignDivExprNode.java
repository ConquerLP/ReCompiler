package ch.compiler.AST.expression.nonConstant.binary.assign;

public class AssignDivExprNode extends AssignExprNode {
    public boolean evaluate() {
        return false;
    }
}
