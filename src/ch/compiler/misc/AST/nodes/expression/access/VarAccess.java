package ch.compiler.misc.AST.nodes.expression.access;

import ch.compiler.misc.AST.nodes.expression.ExpressionNode;

public class VarAccess extends ExpressionNode {

    private String name;

    public VarAccess(int type, String name) {
        super(type);
        this.name = name;
    }

    @Override
    public ExpressionNode evaluate() {
        return null;
    }

    @Override
    public int evaluateType() {
        return 0;
    }
}
