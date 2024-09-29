package ch.compiler.misc.AST.visitors.expression;

import ch.compiler.misc.AST.nodes.symbolTable.EntryVariable;
import ch.compiler.misc.AST.nodes.symbolTable.SymbolTable;
import ch.compiler.misc.AST.visitors.expression.type.VisitorType;
import ch.compiler.parser.ReFuggBaseVisitor;
import ch.compiler.parser.ReFuggParser.ArgListContext;

public class VisitorArgList extends ReFuggBaseVisitor<SymbolTable> {

    @Override
    public SymbolTable visitArgList(ArgListContext ctx) {
        SymbolTable table = new SymbolTable();
        if (ctx == null) return table;
        ctx.arg().forEach(arg -> table.add(
                new EntryVariable(arg.identifier().getText(), new VisitorType().visitCompositeType(arg.type(), arg.constArray()))));
        return table;
    }

}
