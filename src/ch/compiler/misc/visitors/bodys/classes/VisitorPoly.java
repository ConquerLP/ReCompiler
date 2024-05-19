package ch.compiler.misc.visitors.bodys.classes;

import ch.compiler.parser.ReFuggBaseVisitor;
import ch.compiler.parser.ReFuggParser;

import java.util.List;
import java.util.stream.Collectors;

public class VisitorPoly extends ReFuggBaseVisitor<List<String>> {

    @Override
    public List<String> visitPoly(ReFuggParser.PolyContext ctx) {
        return ctx.identifier().stream().map(c -> c.getText()).collect(Collectors.toList());
    }
}
