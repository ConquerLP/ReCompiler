package ch.compiler.misc.AST.nodes.expression.literals;

import ch.compiler.misc.AST.nodes.expression.ExpressionNode;

public abstract class PointerLiteral extends ExpressionNode {

    public PointerLiteral(int type) {
        super(type);
    }
    
}
