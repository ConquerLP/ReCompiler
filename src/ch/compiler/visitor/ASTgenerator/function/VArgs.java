package ch.compiler.visitor.ASTgenerator.function;

import ch.compiler.AST.expression.vars.ArgVarDecNode;
import ch.compiler.parser.ReFuggBaseVisitor;
import ch.compiler.parser.ReFuggParser;

import java.util.ArrayList;
import java.util.List;

public class VArgs extends ReFuggBaseVisitor<List<ArgVarDecNode>> {

    @Override
    public List<ArgVarDecNode> visitArgList(ReFuggParser.ArgListContext ctx) {
        List<ArgVarDecNode> args = new ArrayList<>();
        VArg argVisitor = new VArg();
        ctx.arg().forEach(arg -> args.add(argVisitor.visitArg(arg)));
        return args;
    }
}
