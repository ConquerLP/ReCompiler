package ch.compiler.misc.nodes.symbolTable.value;

public class UnknownValue extends Value {
	
	private String value;
	
	public UnknownValue(String value) {
		this.value = value;
	}

	public String getValue() {
		return value;
	}
	

}
