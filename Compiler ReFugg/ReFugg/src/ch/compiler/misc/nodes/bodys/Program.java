package ch.compiler.misc.nodes.bodys;

import java.util.List;

import ch.compiler.misc.nodes.expression.GlobalVarDec;
import ch.compiler.misc.nodes.statements.Label;
import ch.compiler.misc.nodes.symbolTable.SymbolTable;

import java.util.ArrayList;

public class Program {
	
	private List<Function> functions;
	private List<ClassDec> classes;
	private List<GlobalVarDec> globals;
	private List<Label> labels;
	private MainFunction main;
	private SymbolTable globalSymbols;

	public Program() {
		globalSymbols = new SymbolTable();
		functions = new ArrayList<>();
		classes = new ArrayList<>();
		globals = new ArrayList<>();
		labels = new ArrayList<>();
	}

	public void addFunction(Function f) {
		functions.add(f);
	}
	
	public void addClass(ClassDec c) {
		classes.add(c);
	}
	
	public void addGlobalVar(GlobalVarDec g) {
		globals.add(g);
	}
	
	public void addLabel(Label l) {
		labels.add(l);
	}
	
	public void setMain(MainFunction main) {
		this.main = main;
	}
	
	public SymbolTable getTable() {
		return globalSymbols;
	}
	
}
