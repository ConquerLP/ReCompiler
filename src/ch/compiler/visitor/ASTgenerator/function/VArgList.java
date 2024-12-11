package ch.compiler.visitor.ASTgenerator.function;

import ch.compiler.AST.expression.vars.ArgVarDecNode;
import ch.compiler.parser.ReFuggBaseVisitor;
import ch.compiler.parser.ReFuggParser;

import java.util.ArrayList;
import java.util.List;

public class VArgList extends ReFuggBaseVisitor<List<ArgVarDecNode>> {

    @Override
    public List<ArgVarDecNode> visitArgList(ReFuggParser.ArgListContext ctx) {
        List<ArgVarDecNode> args = new ArrayList<>();
        if(ctx != null) {
            ctx.varDescription().forEach(arg -> {
                args.add(new ArgVarDecNode(VVarDesc.getVarName(arg), new VVarDesc().visitVarDescription(arg)));
            });
        }
        return args;
    }
}
