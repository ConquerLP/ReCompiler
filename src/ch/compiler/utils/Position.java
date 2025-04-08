package ch.compiler.utils;

import org.antlr.v4.runtime.ParserRuleContext;

public class Position {

    private final int line;
    private final int col;

    public Position (ParserRuleContext ctx) {
        line = ctx.getStart().getLine();
        col = ctx.getStart().getCharPositionInLine();
    }

    @Override
    public String toString() {
        return "<" + line + ":" + col + ">";
    }

}
