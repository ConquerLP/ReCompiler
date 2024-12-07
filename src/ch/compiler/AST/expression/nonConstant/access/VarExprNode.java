package ch.compiler.AST.expression.nonConstant.access;

public class VarExprNode extends AccessExprNode {

    private final String varName;

    public VarExprNode(String varName) {
        this.varName = varName;
    }

}
