package ch.compiler.misc.AST.nodes.expression.access;

import ch.compiler.misc.AST.nodes.expression.ExpressionNode;

public class ArrayAccess {

    private ExpressionNode expression;

    public ArrayAccess(ExpressionNode expression) {
        this.expression = expression;
    }

}
