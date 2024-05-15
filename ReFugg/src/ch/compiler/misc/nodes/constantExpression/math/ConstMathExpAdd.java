package ch.compiler.misc.nodes.constantExpression.math;
import ch.compiler.misc.nodes.constantExpression.ConstBinaryExp;
import ch.compiler.misc.nodes.constantExpression.ConstExpNode;
import ch.compiler.misc.nodes.expression.literals.CharacterLiteral;
import ch.compiler.misc.nodes.expression.literals.DoubleLiteral;
import ch.compiler.misc.nodes.expression.literals.IntegerLiteral;
import ch.compiler.misc.nodes.expression.literals.StringLiteral;

public class ConstMathExpAdd extends ConstBinaryExp {

	public ConstMathExpAdd (ConstExpNode left, ConstExpNode right, int type) {
		super(left, right, type);
	}

	@Override
	public ConstExpNode evaluate() {
		ConstExpNode leftEvaluated = left.evaluate();
		ConstExpNode rightEvaluated = right.evaluate();
		switch(type) {
			 case INT: {
				 int leftExp = ((IntegerLiteral)leftEvaluated).getValue();
				 int rightExp = ((IntegerLiteral)rightEvaluated).getValue();
				return new IntegerLiteral((int)(leftExp + rightExp));
			}
			 case DOUBLE: {
				 double leftExp = ((DoubleLiteral)leftEvaluated).getValue();
				 double rightExp = ((DoubleLiteral)rightEvaluated).getValue();
				return new DoubleLiteral((double)(leftExp + rightExp));
			}
			 case CHAR: {
				 char leftExp = ((CharacterLiteral)leftEvaluated).getValue();
				 char rightExp = ((CharacterLiteral)rightEvaluated).getValue();
				return new CharacterLiteral((char)(leftExp + rightExp));
			}
			 case STRING: {
				 String leftExp = ((StringLiteral)leftEvaluated).getValue();
				 String rightExp = ((StringLiteral)rightEvaluated).getValue();
				return new StringLiteral((String)(leftExp + rightExp));
			}
		}
		return null;
	}
}