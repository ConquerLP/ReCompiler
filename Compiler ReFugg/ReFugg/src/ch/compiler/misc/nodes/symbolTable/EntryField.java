package ch.compiler.misc.nodes.symbolTable;

public class EntryField extends SymbolTableEntry{

	private Type type;
	private Access a;
	
	public EntryField(String name, Access a) {
		super(name);
		this.a = a;
	}
	
	public void setType(Type type) {
		this.type = type;
	}
	
	public Type getType() {
		return type;
	}
	
}
