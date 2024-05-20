package ch.compiler.misc.AST.nodes.bodys;

import ch.compiler.misc.AST.nodes.symbolTable.Access;
import ch.compiler.misc.AST.nodes.symbolTable.Type;

public abstract class ClassInside {

    private Access access;
    private Type type;
    private String name;

    public ClassInside(Access access, Type type, String name) {
        this.access = access;
        this.type = type;
        this.name = name;
    }

    public ClassInside(Type type, String name) {
        this.type = type;
        this.name = name;
    }

    public void setAccess(Access access) {
        this.access = access;
    }

}
