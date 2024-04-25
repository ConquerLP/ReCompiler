package ch.compiler.misc.nodes.constantExpression.literals;

import ch.compiler.misc.nodes.constantExpression.ConstExpNode;

public class IntLiteral extends ConstExpNode {
	
	private final int value;
	
	public IntLiteral(int value){
		this.value = value;
	}

	public ConstExpNode evaluate(){
		return this;
	}
	
	public int getValue(){
		return value;
	}
	
	public int evaluateType(){
		return INT;
	}

}