package ch.compiler.AST.misc;

public class Visibility {

    public static final int PUBLIC = 0, PROTECTED = 1, PRIVATE = 2;
    private final int visibility;

    public Visibility(String visibility) {
        switch (visibility) {
            case "public":
                this.visibility = PUBLIC;
                break;
            case "protected":
                this.visibility = PROTECTED;
                break;
            case "private":
                this.visibility = PRIVATE;
                break;
            default:
                throw new IllegalArgumentException("Invalid visibility: " + visibility);
        }
    }

}
