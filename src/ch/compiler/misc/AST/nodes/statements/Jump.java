package ch.compiler.misc.AST.nodes.statements;

import ch.compiler.misc.AST.nodes.expression.ExpressionNode;

public class Jump extends Statement {

    private JumpType jumpType;
    private ExpressionNode expression;
    private String whereToGo;

    public Jump(JumpType jumpType) {
        this.jumpType = jumpType;
    }

	public Jump(JumpType jumpType, ExpressionNode expression) {
		this.jumpType = jumpType;
		this.expression = expression;
	}

	public Jump(JumpType jumpType, String whereToGo) {
		this.jumpType = jumpType;
		this.whereToGo = whereToGo;
	}

}
