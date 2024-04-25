package ch.compiler.misc.nodes.symbolTable;

import java.util.HashMap;

public class SymbolTable {
	
	private HashMap<String, SymbolTableEntry> entries;
	
	public SymbolTable() {
		entries = new HashMap<>();
	}
	
	public void add(SymbolTableEntry entry) {
		entries.put(entry.getName(), entry);
	}
	
}
