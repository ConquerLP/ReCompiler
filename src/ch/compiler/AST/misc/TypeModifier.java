package ch.compiler.AST.misc;

public class TypeModifier {

    public final int FINAL = 0, STATIC = 1;
    private final int modifier;

    public TypeModifier(String modifier) {
        switch (modifier) {
            case "final":
                this.modifier = FINAL;
                break;
            case "static":
                this.modifier = STATIC;
                break;
            default:
                throw new IllegalArgumentException("Invalid type modifier: " + modifier);
        }
    }

}
