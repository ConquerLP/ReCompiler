package ch.compiler.misc.nodes.constantExpression.bool;

import ch.compiler.misc.nodes.constantExpression.ConstBinaryExp;
import ch.compiler.misc.nodes.constantExpression.ConstExpNode;
import ch.compiler.misc.nodes.expression.literals.BooleanLiteral;
import ch.compiler.misc.nodes.expression.literals.CharacterLiteral;
import ch.compiler.misc.nodes.expression.literals.DoubleLiteral;
import ch.compiler.misc.nodes.expression.literals.IntegerLiteral;

public class ConstBooleanExpAnd extends ConstBinaryExp {

    public ConstBooleanExpAnd(ConstExpNode left, ConstExpNode right) {
        super(left, right, BOOLEAN);
    }

    @Override
    public ConstExpNode evaluate() {
        ConstExpNode leftEvaluated = left.evaluate();
        ConstExpNode rightEvaluated = right.evaluate();
        switch(evaluateType()) {
            case INT: {
                int leftExp = ((IntegerLiteral)leftEvaluated).getValue();
                int rightExp = ((IntegerLiteral)rightEvaluated).getValue();
                return new BooleanLiteral(leftExp != 0 && rightExp != 0);
            }
            case DOUBLE: {
                double leftExp = ((DoubleLiteral)leftEvaluated).getValue();
                double rightExp = ((DoubleLiteral)rightEvaluated).getValue();
                return new BooleanLiteral(leftExp != 0.0 && rightExp != 0.0);
            }
            case CHAR: {
                char leftExp = ((CharacterLiteral)leftEvaluated).getValue();
                char rightExp = ((CharacterLiteral)rightEvaluated).getValue();
                return new BooleanLiteral(leftExp != 0 && rightExp != 0);
            }
        }
        return null;
    }
}
