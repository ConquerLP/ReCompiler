package ch.compiler.AST.misc;

public class Type {

    public static final int BOOLEAN = 0, INT = 1, DOUBLE = 2, STRING = 3, CHAR = 4,
            CLASS = 5, ARRAY = 6, VOID = 7, FUNCTION = 8, REFERENCE = 9;
    private int type;
    private String name;

    public Type(String name) {
        switch (name) {
            case "boolean":
                type = BOOLEAN;
                break;
            case "int":
                type = INT;
                break;
            case "double":
                type = DOUBLE;
                break;
            case "String":
                type = STRING;
                break;
            case "char":
                type = CHAR;
                break;
            case "void":
                type = VOID;
                break;
            default:
                type = CLASS;
        }
        this.name = name;
    }

    public void toArray() {
        type = ARRAY;
    }

}
