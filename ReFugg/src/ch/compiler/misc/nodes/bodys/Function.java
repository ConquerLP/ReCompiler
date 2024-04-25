package ch.compiler.misc.nodes.bodys;

import ch.compiler.misc.nodes.statements.Block;
import ch.compiler.misc.nodes.symbolTable.EntryFunction;
import ch.compiler.misc.nodes.symbolTable.SymbolTable;
import ch.compiler.misc.nodes.symbolTable.SymbolTableEntry;
import ch.compiler.misc.nodes.symbolTable.Type;

public class Function {

	public String name;
	public SymbolTable param;
	public Block block;
	public Type returnType;
	
	public Function(String name, Type type) {
		this.name = name;
		returnType = type;
	}
	
	public void setTable(SymbolTable t) {
		param = t;
	}
	
	public EntryFunction getEntry() {
		return null;
	}
	
	public void setBlock(Block block) {
		this.block = block;
	}
	
}
