package ch.compiler.misc.AST.nodes.symbolTable;

public interface Resolvable {

    void resolve(SymbolTable table) throws RuntimeException;

}
