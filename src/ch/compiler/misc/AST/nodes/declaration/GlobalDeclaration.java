package ch.compiler.misc.AST.nodes.declaration;

import ch.compiler.misc.AST.nodes.expression.ExpressionNode;
import ch.compiler.misc.AST.nodes.symbolTable.*;

public class GlobalDeclaration extends Declaration implements SymbolEntry, Resolvable {

    public GlobalDeclaration(Type type, String identifier, ExpressionNode exp) {
        super(type, identifier, exp);
    }

    @Override
    public SymbolTableEntry toEntry() {
        return new EntryVariable(name, type);
    }

    @Override
    public void resolve(SymbolTable table) throws RuntimeException {

    }
}
