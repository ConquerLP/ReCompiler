package ch.compiler.misc.nodes.declaration;

import ch.compiler.misc.nodes.expression.ExpressionNode;
import ch.compiler.misc.nodes.symbolTable.Type;

public class VarDeclaration extends Declaration {

    private ExpressionNode exp;

    public VarDeclaration(Type type, String identifier) {
        super(type, identifier);
    }

    public VarDeclaration(Type type, String identifier, ExpressionNode exp) {
        super(type, identifier);
        this.exp = exp;
    }
    
}
