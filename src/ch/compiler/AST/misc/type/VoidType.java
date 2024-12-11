package ch.compiler.AST.misc.type;

public class VoidType extends Type {

    public VoidType() {
        super("void");
    }

    @Override
    public String toString() {
        return "void";
    }
}
