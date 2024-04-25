package ch.compiler.misc.nodes.symbolTable;

import java.util.List;

import ch.compiler.misc.nodes.symbolTable.value.Value;

import java.util.ArrayList;

public abstract class SymbolTableEntry {

	protected String name;
	
	public SymbolTableEntry(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
}
