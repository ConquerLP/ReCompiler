package ch.compiler.misc.AST.nodes.statements;

import ch.compiler.misc.AST.nodes.declaration.VarDeclaration;
import ch.compiler.misc.AST.nodes.expression.ExpressionNode;

public class For extends Statement{

	private Block block;
	private ExpressionNode first;
	private ExpressionNode second;
	private ExpressionNode third;
	private VarDeclaration varDeclaration;

	public For(VarDeclaration varDeclaration, ExpressionNode first, ExpressionNode second, ExpressionNode third, Block block) {
		this.varDeclaration = varDeclaration;
		this.first = first;
		this.second = second;
		this.third = third;
		this.block = block;
	}

}
