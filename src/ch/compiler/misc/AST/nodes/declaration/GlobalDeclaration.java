package ch.compiler.misc.AST.nodes.declaration;

import ch.compiler.misc.AST.nodes.expression.ExpressionNode;
import ch.compiler.misc.AST.nodes.symbolTable.EntryVariable;
import ch.compiler.misc.AST.nodes.symbolTable.SymbolTableEntry;
import ch.compiler.misc.AST.nodes.symbolTable.Type;

public class GlobalDeclaration extends Declaration {

    public GlobalDeclaration(Type type, String identifier, ExpressionNode exp) {
        super(type, identifier, exp);
    }

    @Override
    public SymbolTableEntry toEntry() {
        return new EntryVariable(name, type);
    }
}
