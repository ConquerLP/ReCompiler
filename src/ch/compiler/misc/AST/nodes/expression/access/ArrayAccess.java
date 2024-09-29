package ch.compiler.misc.AST.nodes.expression.access;

import ch.compiler.misc.AST.nodes.expression.ExpressionNode;

import java.util.List;

public class ArrayAccess extends ExpressionNode{

    private List<ExpressionNode> expressions;
    private VarAccess varAccess;

    public ArrayAccess(VarAccess varAccess, List<ExpressionNode> expressions) {
        super(ARRAY);
        this.varAccess = varAccess;
        this.expressions = expressions;
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
