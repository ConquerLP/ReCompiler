


public class CharLiteral extends ConstExpNode {
	
	private final Char value;

	public CharLiteral(Char value) {
		this.value = value;
	}

	public ConstExpNode evaluate() {
		return this;
	}

	public Char getValue() {
		return value;
	}

	public int evaluateType() {
		return CHAR;
	}
}
