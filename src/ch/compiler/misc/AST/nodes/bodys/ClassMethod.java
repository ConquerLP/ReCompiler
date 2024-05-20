package ch.compiler.misc.AST.nodes.bodys;

import ch.compiler.misc.AST.nodes.statements.Block;
import ch.compiler.misc.AST.nodes.symbolTable.Access;
import ch.compiler.misc.AST.nodes.symbolTable.SymbolTable;
import ch.compiler.misc.AST.nodes.symbolTable.Type;

public class ClassMethod extends ClassInside {

	private SymbolTable table;
	private Block block;

	public ClassMethod(Access access, String name, Type type, SymbolTable table, Block block) {
		super(access, type, name);
		this.table = table;
		this.block = block;
	}

	public ClassMethod(Type type, String name){
		super(type, name);
	}

	public void setBlock(Block block) {
		this.block = block;
	}

	public void setTable(SymbolTable table) {
		this.table = table;
	}

}
