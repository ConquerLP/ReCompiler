package ch.compiler.misc.nodes.bodys;

import java.util.List;
import java.util.ArrayList;

import ch.compiler.misc.nodes.statements.Block;
import ch.compiler.misc.nodes.symbolTable.SymbolTable;

public class ClassMethod {

	public AccessModifier accessModifier;
	public String name;
	public SymbolTable table;
	public Block block;
	
}
