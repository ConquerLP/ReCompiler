package ch.compiler.utils;

import java.io.*;
import ch.compiler.AST.ASTNode;
import org.antlr.v4.runtime.ParserRuleContext;

public class ASTUtils {

    public static <T extends ASTNode> T withPosition(T node, ParserRuleContext ctx) {
        node.setPosition(new Position(ctx));
        return node;
    }

    public static void writeASTToFile(ASTNode root, String filename) {
        try (PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter(filename)))) {
            root.dumpTree(out, 0);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
