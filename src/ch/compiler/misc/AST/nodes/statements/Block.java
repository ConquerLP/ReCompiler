package ch.compiler.misc.AST.nodes.statements;

import ch.compiler.misc.AST.nodes.symbolTable.SymbolEntry;
import ch.compiler.misc.AST.nodes.symbolTable.SymbolTable;
import ch.compiler.misc.AST.nodes.symbolTable.SymbolTableEntry;

import java.util.ArrayList;
import java.util.List;

public class Block extends Statement {

    private List<Statement> statements = new ArrayList<>();
    private SymbolTable symbolTable = new SymbolTable();

    public void addStatement(Statement statement) {
        statements.add(statement);
        if (statement instanceof Block) {
            ((Block) statement).getSymbolTable().getEntries().forEach(this::addEntry);
        }
    }

    public List<Statement> getStatements() {
        return statements;
    }

    private void addEntry(SymbolTableEntry entry) {
        symbolTable.add(entry);
    }

    public SymbolTable getSymbolTable() {
        return symbolTable;
    }

}
