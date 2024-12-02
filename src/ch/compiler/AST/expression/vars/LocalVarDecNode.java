package ch.compiler.AST.expression.vars;

import ch.compiler.AST.misc.type.Type;

public class LocalVarDecNode extends VarDecNode {
    public LocalVarDecNode(String name, Type type) {
        super(name, type);
    }
}
