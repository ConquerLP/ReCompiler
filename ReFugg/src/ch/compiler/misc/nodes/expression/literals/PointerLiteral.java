package ch.compiler.misc.nodes.expression.literals;

import ch.compiler.misc.nodes.constantExpression.ConstExpNode;

public abstract class PointerLiteral extends ConstExpNode {

    public PointerLiteral(int type) {
        super(type);
    }
}
