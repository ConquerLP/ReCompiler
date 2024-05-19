package ch.compiler.misc.nodes.expression.literals;
import ch.compiler.misc.nodes.expression.ExpressionNode;

public class IntegerLiteral extends ExpressionNode {
	
	private final Integer value;

	public IntegerLiteral(Integer value) {
		super(INT);
		this.value = value;
	}

	@Override
	public ExpressionNode evaluate() {
		return this;
	}

	public Integer getValue() {
		return value;
	}

	public int evaluateType() {
		return INT;
	}
}
