package ch.compiler.misc.visitors.bodys.function;

import ch.compiler.misc.nodes.symbolTable.SymbolTable;
import ch.compiler.misc.visitors.VisitorArgList;
import ch.compiler.parser.ReFuggBaseVisitor;
import ch.compiler.parser.ReFuggParser;

public class VisitorFParam extends ReFuggBaseVisitor<SymbolTable> {

    @Override
    public SymbolTable visitFParam(ReFuggParser.FParamContext ctx) {
        if(ctx.getChildCount() < 2) {
            return new VisitorArgList().visitArgList((ReFuggParser.ArgListContext) ctx.getChild(1));

        } else {
            return new SymbolTable();
        }
    }
}
