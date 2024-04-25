package ch.compiler.misc.nodes.expression;

import ch.compiler.misc.nodes.expression.enums.RelOperation;

public class Relative extends Expression{
	
	public RelOperation relOperation;
	public Expression left;
	public Expression right;
	
}
