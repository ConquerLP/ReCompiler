package ch.compiler.misc.AST.nodes.bodys;

import ch.compiler.misc.AST.nodes.statements.Block;
import ch.compiler.misc.AST.nodes.symbolTable.*;

public class Function implements SymbolEntry, Resolvable {

	private String name;
	private SymbolTable param;
	private Block block;
	private Type returnType;
	
	public Function(String name, Type type) {
		this.name = name;
		returnType = type;
	}

	public SymbolTableEntry toEntry() {
		return new EntryFunction(name, returnType);
	}

	public void setTable(SymbolTable t) {
		param = t;
	}

	public void setBlock(Block block) {
		this.block = block;
	}

	@Override
	public void resolve(SymbolTable table) throws RuntimeException {
		SymbolTable	local = new SymbolTable();
		local.add(table);
		local.add(param);
		local.add(block.getSymbolTable());
	}
}
