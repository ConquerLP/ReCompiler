package ch.compiler.misc.nodes.statements;

import ch.compiler.misc.nodes.expression.ExpressionNode;
import ch.compiler.misc.nodes.expression.VarDec;

public class For extends Statement{

	public VarDec varDec;
	public ExpressionNode[] expressions;
	public Block block;
	
}
