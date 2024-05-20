package ch.compiler.misc.AST.nodes.declaration;

import ch.compiler.misc.AST.nodes.expression.ExpressionNode;
import ch.compiler.misc.AST.nodes.symbolTable.SymbolTableEntry;
import ch.compiler.misc.AST.nodes.symbolTable.Type;

public class VarDeclaration extends Declaration {

    public VarDeclaration(Type type, String identifier, ExpressionNode exp) {
        super(type, identifier, exp);
    }

    public VarDeclaration(Type type, String identifier) {
        super(type, identifier, null);
    }

    @Override
    public SymbolTableEntry toEntry() {
        return null;
    }
}
