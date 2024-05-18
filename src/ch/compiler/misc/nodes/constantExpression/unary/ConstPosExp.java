package ch.compiler.misc.nodes.constantExpression.unary;

import ch.compiler.misc.nodes.constantExpression.ConstExpNode;
import ch.compiler.misc.nodes.expression.literals.DoubleLiteral;
import ch.compiler.misc.nodes.expression.literals.IntegerLiteral;

public class ConstPosExp extends ConstUnaryExp {

    public ConstPosExp(ConstExpNode exp, int type) {
        super(exp, type);
    }

    @Override
    public ConstExpNode evaluate() {
        return exp.evaluate();
    }
}
