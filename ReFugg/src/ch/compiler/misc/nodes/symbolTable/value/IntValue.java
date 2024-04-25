package ch.compiler.misc.nodes.symbolTable.value;

public class IntValue extends Value<Integer>{

	private int value;
	
	public IntValue(int value) {
		this.value = value;
	}
	
	public Integer getValue() {
		return value;
	}

	@Override
	public String getType() {
		return ValueTypes.INT.toString();
	}

}
