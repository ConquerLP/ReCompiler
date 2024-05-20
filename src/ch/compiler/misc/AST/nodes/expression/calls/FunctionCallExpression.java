package ch.compiler.misc.AST.nodes.expression.calls;

import ch.compiler.misc.AST.nodes.expression.ExpressionNode;

import java.util.ArrayList;
import java.util.List;

public class FunctionCallExpression extends ExpressionNode {

    private List<ExpressionNode> arguments = new ArrayList<>();
    private List<ExpressionNode> callTails = new ArrayList<>();
    private List<ExpressionNode> arrayAccesses = new ArrayList<>();
    private String name;

    public FunctionCallExpression(String name) {
        super(CALL);
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

    public void addArguments(List<ExpressionNode> arguments) {
        arguments.addAll(arguments);
    }

    public void addCallTails(List<ExpressionNode> callTails) {
        callTails.addAll(callTails);
    }

    public void addArrayAccesses(List<ExpressionNode> arrayAccesses) {
        arrayAccesses.addAll(arrayAccesses);
    }

}
