package ch.compiler.misc.AST.nodes.expression.access;

import ch.compiler.misc.AST.nodes.expression.ExpressionNode;

import java.util.List;

public class ExpressionTail extends ExpressionNode {

    private List<ExpressionNode> expressions;
    private ExpressionNode first;

    public ExpressionTail(ExpressionNode first, List<ExpressionNode> expressions) {
        super(0);
        this.first = first;
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
