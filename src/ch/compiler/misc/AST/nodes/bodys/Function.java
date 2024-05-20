package ch.compiler.misc.AST.nodes.bodys;

import ch.compiler.misc.AST.nodes.statements.Block;
import ch.compiler.misc.AST.nodes.symbolTable.*;

public class Function implements SymbolEntry {

	private String name;
	private SymbolTable param;
	private Block block;
	private Type returnType;
	
	public Function(String name, Type type) {
		this.name = name;
		returnType = type;
	}

	@Override
	public SymbolTableEntry toEntry() {
		return new EntryFunction(name, returnType);
	}

	public void setTable(SymbolTable t) {
		param = t;
	}

	public void setBlock(Block block) {
		this.block = block;
	}
	
}
