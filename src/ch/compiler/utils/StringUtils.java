package ch.compiler.utils;

public class StringUtils {

    public static String normalizeTrailingNewline(String input) {
        if (input == null) return "\n";
        String stripped = input.replaceAll("(\r?\n)+$", "");
        return stripped + "\n";
    }

}
