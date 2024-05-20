package ch.compiler.misc.AST.visitors.bodys;

import ch.compiler.misc.AST.nodes.bodys.MainFunction;
import ch.compiler.misc.AST.visitors.statements.VisitorStatement;
import ch.compiler.parser.ReFuggBaseVisitor;
import ch.compiler.parser.ReFuggParser.MainContext;

public class VisitorMainFunction extends ReFuggBaseVisitor<MainFunction> {

    @Override
    public MainFunction visitMain(MainContext ctx) {
        MainFunction main = new MainFunction(new VisitorStatement().visitBlock(ctx.block()));
        return main;
    }

}