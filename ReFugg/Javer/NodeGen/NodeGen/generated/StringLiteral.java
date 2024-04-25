


public class StringLiteral extends ConstExpNode {
	
	private final String value;

	public StringLiteral(String value) {
		this.value = value;
	}

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
