package ch.compiler.misc.nodes.statements;

import java.util.List;
import java.util.ArrayList;

import ch.compiler.misc.nodes.expression.Expression;

public class Switch extends Statement{
	
	public Expression expression;
	public List<CaseBlock> caseBlocks;
	
}
