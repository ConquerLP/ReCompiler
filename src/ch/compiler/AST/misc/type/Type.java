package ch.compiler.AST.misc.type;

public abstract class Type {

    protected String name;

    public Type(String name) {
        this.name = name;
    }

    public Type() {
        this.name = "";
    }

    @Override
    public abstract String toString();
}
