package ch.compiler.utils;

import ch.compiler.AST.ASTNode;
import org.antlr.v4.runtime.ParserRuleContext;

public class ASTUtils {

    public static <T extends ASTNode> T withPosition(T node, ParserRuleContext ctx) {
        node.setPosition(new Position(ctx));
        return node;
    }

}
