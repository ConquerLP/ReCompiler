package ch.compiler.misc.AST.nodes.expression.access;

import ch.compiler.misc.AST.nodes.expression.ExpressionNode;

import java.util.List;

public class ArrayAccess extends AccessNode{

    private VarAccessNode varAccess;

    public ArrayAccess(VarAccessNode varAccess, List<ExpressionNode> expressions) {
        super(ARRAY, expressions);
        this.varAccess = varAccess;
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
