package ch.compiler.misc.nodes.declaration;

import ch.compiler.misc.nodes.statements.Statement;
import ch.compiler.misc.nodes.symbolTable.Type;

public abstract class Declaration extends Statement {

    private final Type type;
    private final String name;

    public Declaration(Type type, String name){
        this.name = name;
        this.type = type;
    }

}
