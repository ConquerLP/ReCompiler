package ch.compiler.misc.visitors.bodys.function;

import ch.compiler.misc.nodes.symbolTable.SymbolTable;
import ch.compiler.misc.visitors.expression.VisitorArgList;
import ch.compiler.parser.ReFuggBaseVisitor;
import ch.compiler.parser.ReFuggParser;

public class VisitorFParam extends ReFuggBaseVisitor<SymbolTable> {

    @Override
    public SymbolTable visitFParam(ReFuggParser.FParamContext ctx) {
        return new VisitorArgList().visitArgList(ctx.argList());
    }
}
