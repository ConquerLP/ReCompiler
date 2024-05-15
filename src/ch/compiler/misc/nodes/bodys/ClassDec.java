package ch.compiler.misc.nodes.bodys;

import java.util.List;
import java.util.ArrayList;

import ch.compiler.misc.nodes.statements.Block;
import ch.compiler.misc.nodes.symbolTable.SymbolTable;

public class ClassDec {

	public SymbolTable symbols;
	public List<ClassMethod> methods;
	public List<ClassConstructor> constructors;
	public List<ClassDec> superClasses;
	
	
}
