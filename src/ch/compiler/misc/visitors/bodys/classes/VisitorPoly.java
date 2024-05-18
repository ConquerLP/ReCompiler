package ch.compiler.misc.visitors.bodys.classes;

import ch.compiler.parser.ReFuggBaseVisitor;
import ch.compiler.parser.ReFuggParser;
import org.antlr.v4.runtime.RuleContext;

import java.util.List;
import java.util.stream.Collectors;

public class VisitorPoly extends ReFuggBaseVisitor<List<String>> {

    @Override
    public List<String> visitPoly(ReFuggParser.PolyContext ctx) {
        return ctx.identifier().stream().map(RuleContext::getText).collect(Collectors.toList());
    }
}
