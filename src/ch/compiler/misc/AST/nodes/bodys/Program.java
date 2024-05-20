package ch.compiler.misc.AST.nodes.bodys;

import ch.compiler.misc.AST.nodes.declaration.GlobalDeclaration;
import ch.compiler.misc.AST.nodes.statements.Label;
import ch.compiler.misc.AST.nodes.symbolTable.SymbolTable;
import ch.compiler.misc.AST.nodes.symbolTable.SymbolTableEntry;

import java.util.ArrayList;
import java.util.List;

public class Program {

    private MainFunction main;
    private SymbolTable globalSymbols = new SymbolTable();
    private List<Function> functions = new ArrayList<>();
    private List<ClassDec> classes = new ArrayList<>();
    private List<GlobalDeclaration> globalVars = new ArrayList<>();
    private List<Label> labels = new ArrayList<>();

    public void addEntry(SymbolTableEntry entry) throws RuntimeException {
        globalSymbols.add(entry);
    }

    public void setMain(MainFunction main) {
        this.main = main;
    }

    public MainFunction getMain() {
        return main;
    }

    public SymbolTable getTable() {
        return globalSymbols;
    }

    public void addFunction(Function f) {
        functions.add(f);
    }

    public void addClass(ClassDec c) {
        classes.add(c);
    }

    public void addGlobalVar(GlobalDeclaration g) {
        globalVars.add(g);
    }

    public void addLabel(Label l) {
        labels.add(l);
    }

}
