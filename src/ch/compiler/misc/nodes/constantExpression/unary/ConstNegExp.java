package ch.compiler.misc.nodes.constantExpression.unary;

import ch.compiler.misc.nodes.constantExpression.ConstExpNode;
import ch.compiler.misc.nodes.expression.literals.DoubleLiteral;
import ch.compiler.misc.nodes.expression.literals.IntegerLiteral;

public class ConstNegExp extends ConstUnaryExp {

    public ConstNegExp(ConstExpNode exp, int type) {
        super(exp, type);
    }

    @Override
    public ConstExpNode evaluate() {
        ConstExpNode expEvaluated = exp.evaluate();
        switch(evaluateType()) {
            case INT: {
                int expExp = ((IntegerLiteral)expEvaluated).getValue();
                return new IntegerLiteral((-1)*expExp);
            }
            case DOUBLE: {
                double expExp = ((DoubleLiteral)expEvaluated).getValue();
                return new DoubleLiteral((-1.0)*expExp);
            }
        }
        return null;
    }
}
