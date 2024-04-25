

public class ConstMathExpExpo extends ConstBinaryExp {

	public ConstMathExpExpo (ConstExpNode left, ConstExpNode right) {
		super(left, right);
	}

	public ConstExpNode evaluate() {
		ConstExpNode leftEvaluated = left.evaluate();
		ConstExpNode rightEvaluated = right.evaluate();
		switch(evalueateType()) {
			 case INT: {
				 int leftExp = ((IntLiteral)leftEvaluated).getValue();
				 int leftExp = ((IntLiteral)rightEvaluated).getValue();
				return new IntLiteral(leftExp ^ rightExp);
			}
			 case DOUBLE: {
				 double leftExp = ((DoubleLiteral)leftEvaluated).getValue();
				 double leftExp = ((DoubleLiteral)rightEvaluated).getValue();
				return new DoubleLiteral(leftExp ^ rightExp);
			}
			 case CHAR: {
				 char leftExp = ((CharLiteral)leftEvaluated).getValue();
				 char leftExp = ((CharLiteral)rightEvaluated).getValue();
				return new CharLiteral(leftExp ^ rightExp);
			}
			 case STRING: {
				 String leftExp = ((StringLiteral)leftEvaluated).getValue();
				 String leftExp = ((StringLiteral)rightEvaluated).getValue();
				return new StringLiteral(leftExp ^ rightExp);
			}
		}
		return null;
	}

}