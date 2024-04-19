package ch.compiler.misc.nodes.expression;

import ch.compiler.misc.nodes.expression.enums.AssignOperation;

public class Assign extends Expression{

	public ID id;
	public ArraySize depth;
	public AssignOperation assignOperation;
	public Expression expression;
	
}
