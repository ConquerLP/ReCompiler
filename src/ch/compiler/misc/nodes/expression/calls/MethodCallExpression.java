package ch.compiler.misc.nodes.expression.calls;

import ch.compiler.misc.nodes.expression.ExpressionNode;

import java.util.ArrayList;
import java.util.List;

public class MethodCallExpression extends ExpressionNode {

    private List<ExpressionNode> arguments;

    public MethodCallExpression() {
        super(CALL);
        arguments = new ArrayList<>();
    }

    @Override
    public ExpressionNode evaluate() {
        return null;
    }

    @Override
    public int evaluateType() {
        return 0;
    }

    public void addArguments(List<ExpressionNode> arguments) {
        arguments.addAll(arguments);
    }
}
