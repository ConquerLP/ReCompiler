package ch.compiler.AST.expression.constant.access;

public class c_VarExprNode extends c_AccessExprNode {

    private final String name;

    public c_VarExprNode(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "";
    }
}
