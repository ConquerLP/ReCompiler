package ch.compiler.misc.nodes.constantExpression.relative;

import ch.compiler.misc.nodes.constantExpression.ConstBinaryExp;
import ch.compiler.misc.nodes.constantExpression.ConstExpNode;
import ch.compiler.misc.nodes.expression.literals.BooleanLiteral;
import ch.compiler.misc.nodes.expression.literals.CharacterLiteral;
import ch.compiler.misc.nodes.expression.literals.DoubleLiteral;
import ch.compiler.misc.nodes.expression.literals.IntegerLiteral;

public class ConstRelExpGE extends ConstBinaryExp {

    public ConstRelExpGE(ConstExpNode left, ConstExpNode right, int type) {
        super(left, right, type);
    }

    @Override
    public ConstExpNode evaluate() {
        ConstExpNode leftEvaluated = left.evaluate();
        ConstExpNode rightEvaluated = right.evaluate();
        switch(evaluateType()) {
            case INT: {
                int leftExp = ((IntegerLiteral)leftEvaluated).getValue();
                int rightExp = ((IntegerLiteral)rightEvaluated).getValue();
                return new BooleanLiteral(leftExp >= rightExp);
            }
            case DOUBLE: {
                double leftExp = ((DoubleLiteral)leftEvaluated).getValue();
                double rightExp = ((DoubleLiteral)rightEvaluated).getValue();
                return new BooleanLiteral(leftExp >= rightExp);
            }
            case CHAR: {
                char leftExp = ((CharacterLiteral)leftEvaluated).getValue();
                char rightExp = ((CharacterLiteral)rightEvaluated).getValue();
                return new BooleanLiteral(leftExp >= rightExp);
            }
        }
        return null;
    }
}
