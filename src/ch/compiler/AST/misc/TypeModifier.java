package ch.compiler.AST.misc;

import ch.compiler.AST.misc.type.Type;

public class TypeModifier {

    public final int FINAL = 0, STATIC = 1, NONE = 2;
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
                this.modifier = NONE;
        }
    }

    public TypeModifier() {
        this.modifier = NONE;
    }

    @Override
    public String toString() {
        String modifier = switch (this.modifier) {
            case FINAL -> "final";
            case STATIC -> "static";
            case NONE -> "none";
            default -> throw new IllegalArgumentException("Invalid modifier: " + this.modifier);
        };
        return String.format("%-10s", modifier);
    }

}
