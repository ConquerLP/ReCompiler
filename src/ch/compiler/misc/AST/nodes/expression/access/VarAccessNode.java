package ch.compiler.misc.AST.nodes.expression.access;

import ch.compiler.misc.AST.nodes.expression.ExpressionNode;

import java.util.List;

public class VarAccessNode extends AccessNode {

    private String name;

    public VarAccessNode(int type, String name, List<ExpressionNode> expressions) {
        super(type, expressions);
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
