package ch.compiler.misc.nodes.expression.literals;

import ch.compiler.misc.nodes.expression.ExpressionNode;

public abstract class PointerLiteral extends ExpressionNode {

    public PointerLiteral(int type) {
        super(type);
    }
    
}
