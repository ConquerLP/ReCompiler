package ch.compiler.misc.AST.nodes.bodys;

import ch.compiler.misc.AST.nodes.statements.Block;
import ch.compiler.misc.AST.nodes.symbolTable.Access;
import ch.compiler.misc.AST.nodes.symbolTable.SymbolTable;
import ch.compiler.misc.AST.nodes.symbolTable.Type;

public class ClassConstructor extends ClassInside{

	public SymbolTable symbols;
	public Block block;

	public ClassConstructor(Access access, String name, Type type, SymbolTable symbols, Block block) {
		super(access, type, name);
		this.block = block;
		this.symbols = symbols;
	}

	public ClassConstructor(String name, Type type, SymbolTable symbols, Block block) {
		super(type, name);
		this.block = block;
		this.symbols = symbols;
	}

}