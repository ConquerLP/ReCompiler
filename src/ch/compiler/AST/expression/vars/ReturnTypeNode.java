package ch.compiler.AST.expression.vars;

import ch.compiler.AST.misc.type.Type;

public class ReturnTypeNode extends VarDecNode {

    public ReturnTypeNode(String name, Type type) {
        super(name, type);
    }

}
