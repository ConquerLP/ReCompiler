package ch.compiler.misc.nodes.symbolTable.value;

public class BooleanValue extends Value{

	private boolean value;
	
	public BooleanValue(String value) {
		this.value = Boolean.parseBoolean(value);
	}

	public Boolean getValue() {
		return value;
	}
	

	
}
