package ch.compiler.utils;

import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.Token;

public class Position {

    private final int line;
    private final int col;

    public Position (ParserRuleContext ctx) {
        if (ctx == null) {
            line = -1;
            col = -1;
        } else {
            line = ctx.getStart().getLine();
            col = ctx.getStart().getCharPositionInLine();
        }
    }

    @Override
    public String toString() {
        return " <" + col + ":" + line + "> ";
    }

}
