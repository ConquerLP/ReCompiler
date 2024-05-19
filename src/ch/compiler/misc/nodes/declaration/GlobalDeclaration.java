package ch.compiler.misc.nodes.declaration;

import ch.compiler.misc.nodes.expression.ExpressionNode;
import ch.compiler.misc.nodes.symbolTable.Type;

public class GlobalDeclaration extends Declaration {

    public GlobalDeclaration(Type type, String identifier, ExpressionNode exp) {
        super(type, identifier, exp);
    }

}
