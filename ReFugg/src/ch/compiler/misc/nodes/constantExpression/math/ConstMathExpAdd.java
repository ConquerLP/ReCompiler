package ch.compiler.misc.nodes.constantExpression.math;

import ch.compiler.misc.nodes.constantExpression.ConstBinaryExp;
import ch.compiler.misc.nodes.constantExpression.ConstExpNode;
import ch.compiler.misc.nodes.constantExpression.literals.*;

public class ConstMathExpAdd extends ConstBinaryExp {

	public ConstMathExpAdd(ConstExpNode left, ConstExpNode right){
		super(left, right);
	}
	
	public ConstExpNode evaluate(){
		ConstExpNode leftEvaluated = left.evaluate();
		ConstExpNode rightEvaluated = right.evaluate();
		switch(evaluateType()){
			case INT: {
				int leftExp = ((IntLiteral)leftEvaluated).getValue();
				int rightExp = ((IntLiteral)rightEvaluated).getValue();
				return new IntLiteral(leftExp + rightExp);
			}
			case DOUBLE: {
				double leftExp = ((IntLiteral)leftEvaluated).getValue();
				double rightExp = ((IntLiteral)rightEvaluated).getValue();
				return new DoubleLiteral(leftExp + rightExp);
			}
		}
		return null;
	}
	
}