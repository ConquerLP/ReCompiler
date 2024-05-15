package ch.compiler.misc.nodes.constantExpression.unary;

import ch.compiler.misc.nodes.constantExpression.ConstExpNode;

public abstract class ConstUnaryExp extends ConstExpNode {

	protected ConstExpNode exp;

	public ConstUnaryExp(ConstExpNode exp, int type){
		super(type);
		this.exp = exp;
	}

	public int evaluateType(){
		return exp.evaluateType();
	}
	
}