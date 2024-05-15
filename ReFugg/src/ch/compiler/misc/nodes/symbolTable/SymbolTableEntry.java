package ch.compiler.misc.nodes.symbolTable;

public abstract class SymbolTableEntry {

	protected String name;
	
	public SymbolTableEntry(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
}
