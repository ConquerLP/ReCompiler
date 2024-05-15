package ch.compiler.misc.nodes.constantExpression.unary;

import ch.compiler.misc.nodes.constantExpression.ConstExpNode;
import ch.compiler.misc.nodes.expression.literals.BooleanLiteral;

public class ConstNotExp extends ConstUnaryExp {

    public ConstNotExp(ConstExpNode exp, int type) {
        super(exp, type);
    }

    @Override
    public ConstExpNode evaluate() {
        return new BooleanLiteral(!((((BooleanLiteral)exp.evaluate()).getValue())));
    }
}
