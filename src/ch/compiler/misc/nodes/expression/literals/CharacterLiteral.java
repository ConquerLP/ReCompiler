package ch.compiler.misc.nodes.expression.literals;
import ch.compiler.misc.nodes.constantExpression.ConstExpNode;

public class CharacterLiteral extends ConstExpNode {
	
	private final Character value;

	public CharacterLiteral(Character value) {
		super(CHAR);
		this.value = value;
	}

	@Override
	public ConstExpNode evaluate() {
		return this;
	}

	public Character getValue() {
		return value;
	}

	public int evaluateType() {
		return CHAR;
	}
}
