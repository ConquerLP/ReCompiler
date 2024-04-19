package ch.compiler.misc.nodes.symbolTable;

import ch.compiler.misc.nodes.symbolTable.value.Value;

public class EntryVariable extends SymbolTableEntry{

	private Type dataType;
	private Value initialValue;
	
	public EntryVariable(String name) {
		super(name);
	}
	
	public void setDataType(Type type) {
		this.dataType = type;
	}
	
	public void setValue(Value v) {
		initialValue = v;
	}
	
	public Type getDataType() {
		return dataType;
	}
	
	public Value getValue() {
		return initialValue;
	}
	
}
