package ch.compiler.misc.nodes.declaration;


import ch.compiler.misc.nodes.constantExpression.ConstExpNode;
import ch.compiler.misc.nodes.symbolTable.Type;

public class GlobalDeclaration extends Declaration {

    private final ConstExpNode exp;

    public GlobalDeclaration(Type type, String name, ConstExpNode exp) {
        super(type, name);
        this.exp = exp;
    }

    public GlobalDeclaration(Type type, String name) {
        super(type, name);
        this.exp = null;
    }

}
