package ch.compiler.misc.nodes.expression;

import ch.compiler.misc.nodes.expression.enums.LogicOperation;

public class Logic extends Expression{

	public LogicOperation logicOperation;
	public Expression left;
	public Expression right;
	
}
