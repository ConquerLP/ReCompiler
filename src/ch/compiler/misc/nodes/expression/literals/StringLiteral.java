package ch.compiler.misc.nodes.expression.literals;
import ch.compiler.misc.nodes.constantExpression.ConstExpNode;

public class StringLiteral extends ConstExpNode {
	
	private final String value;

	public StringLiteral(String value) {
		super(STRING);
		this.value = value;
	}

	@Override
	public ConstExpNode evaluate() {
		return this;
	}

	public String getValue() {
		return value;
	}

	public int evaluateType() {
		return STRING;
	}
}
