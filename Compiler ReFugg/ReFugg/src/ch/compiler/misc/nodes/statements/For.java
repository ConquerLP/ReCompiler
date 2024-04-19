package ch.compiler.misc.nodes.statements;

import ch.compiler.misc.nodes.expression.Expression;
import ch.compiler.misc.nodes.expression.VarDec;

public class For extends Statement{

	public VarDec varDec;
	public Expression[] expressions;
	public Block block;
	
}
