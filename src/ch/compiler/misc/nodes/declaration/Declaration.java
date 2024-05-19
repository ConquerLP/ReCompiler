package ch.compiler.misc.nodes.declaration;

import ch.compiler.misc.nodes.expression.ExpressionNode;
import ch.compiler.misc.nodes.statements.Statement;
import ch.compiler.misc.nodes.symbolTable.Type;

public abstract class Declaration extends Statement {

    private final Type type;
    private final String name;
    private final ExpressionNode exp;

    public Declaration(Type type, String name, ExpressionNode exp){
        this.name = name;
        this.type = type;
        this.exp = exp;
    }

}
