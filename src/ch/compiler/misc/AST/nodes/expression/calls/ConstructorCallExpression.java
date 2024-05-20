package ch.compiler.misc.AST.nodes.expression.calls;

import ch.compiler.misc.AST.nodes.expression.ExpressionNode;
import ch.compiler.misc.AST.nodes.expression.access.ArrayAccess;

import java.util.ArrayList;
import java.util.List;

public class ConstructorCallExpression extends ExpressionNode {

    private List<ExpressionNode> arguments = new ArrayList<>();
    private List<ExpressionNode> callTails = new ArrayList<>();
    private List<ArrayAccess> arrayAccesses = new ArrayList<>();
    private String className;

    public ConstructorCallExpression(String className, List<ExpressionNode> arguments,
                                     List<ExpressionNode> callTails, List<ArrayAccess> arrayAccesses) {
        super(CALL);
        this.className = className;
        arguments.addAll(arguments);
        callTails.addAll(callTails);
        arrayAccesses.addAll(arrayAccesses);
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
