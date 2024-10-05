package ch.compiler.misc.AST.nodes.expression.access;

import ch.compiler.misc.AST.nodes.expression.ExpressionNode;

import java.util.List;

public class AccessNode extends ExpressionNode {

    private List<ExpressionNode> expressions;

    public AccessNode(int type, List<ExpressionNode> expressions) {
        super(0);
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
