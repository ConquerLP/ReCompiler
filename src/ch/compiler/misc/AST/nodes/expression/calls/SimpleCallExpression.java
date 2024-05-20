package ch.compiler.misc.AST.nodes.expression.calls;

import ch.compiler.misc.AST.nodes.expression.ExpressionNode;

import java.util.ArrayList;
import java.util.List;

public class SimpleCallExpression extends ExpressionNode {

    private List<ExpressionNode> arguments = new ArrayList<>();
    private String functionName;

    public SimpleCallExpression(String functionName, List<ExpressionNode> arguments) {
        super(CALL);
        this.functionName = functionName;
        arguments.addAll(arguments);
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
