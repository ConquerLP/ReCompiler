package ch.compiler.misc.nodes.constantExpression.math;
import ch.compiler.misc.nodes.constantExpression.ConstBinaryExp;
import ch.compiler.misc.nodes.constantExpression.ConstExpNode;
import ch.compiler.misc.nodes.expression.literals.DoubleLiteral;
import ch.compiler.misc.nodes.expression.literals.IntegerLiteral;


public class ConstMathExpDiv extends ConstBinaryExp {

	public ConstMathExpDiv (ConstExpNode left, ConstExpNode right, int type) {
		super(left, right, type);
	}

	public ConstExpNode evaluate() {
		ConstExpNode leftEvaluated = left.evaluate();
		ConstExpNode rightEvaluated = right.evaluate();
		switch(evaluateType()) {
			 case INT: {
				 int leftExp = ((IntegerLiteral)leftEvaluated).getValue();
				 int rightExp = ((IntegerLiteral)rightEvaluated).getValue();
				return new IntegerLiteral((int)(leftExp / rightExp));
			}
			 case DOUBLE: {
				 double leftExp = ((DoubleLiteral)leftEvaluated).getValue();
				 double rightExp = ((DoubleLiteral)rightEvaluated).getValue();
				return new DoubleLiteral((double)(leftExp / rightExp));
			}
		}
		return null;
	}

}