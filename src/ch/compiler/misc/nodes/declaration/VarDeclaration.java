package ch.compiler.misc.nodes.declaration;

import ch.compiler.misc.nodes.constantExpression.ConstExpNode;
import ch.compiler.misc.nodes.symbolTable.Type;

public class VarDeclaration extends Declaration {

    //private final ConstExpNode exp;

    public VarDeclaration(Type type, ConstExpNode exp) {
        super(type, null);
        //this.exp = exp;
    }
    
}
