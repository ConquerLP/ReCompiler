package ch.compiler.misc.nodes.expression;

import ch.compiler.misc.nodes.expression.enums.MathOperation;

public class Math extends Expression{

	public MathOperation mathOperation;
	public Expression left;
	public Expression right;
	
}
