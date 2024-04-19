package ch.compiler.misc.nodes.constexpression;

import ch.compiler.misc.nodes.symbolTable.value.Value;

public abstract class ConstantExpression {

	private ConstantExpression left;
	private ConstantExpression right;
	
	
	public Value processValue() {
		return null;
	}
	
	
	
	
}
