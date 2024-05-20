package ch.compiler.misc.AST.nodes.declaration;

import ch.compiler.misc.AST.nodes.expression.ExpressionNode;
import ch.compiler.misc.AST.nodes.statements.Statement;
import ch.compiler.misc.AST.nodes.symbolTable.SymbolEntry;
import ch.compiler.misc.AST.nodes.symbolTable.Type;

public abstract class Declaration extends Statement implements SymbolEntry {

    protected final Type type;
    protected final String name;
    protected final ExpressionNode exp;

    public Declaration(Type type, String name, ExpressionNode exp){
        this.name = name;
        this.type = type;
        this.exp = exp;
    }

}
