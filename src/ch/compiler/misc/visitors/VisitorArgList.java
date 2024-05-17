package ch.compiler.misc.visitors;

import ch.compiler.misc.nodes.symbolTable.EntryVariable;
import ch.compiler.misc.nodes.symbolTable.SymbolTable;
import ch.compiler.parser.ReFuggBaseVisitor;
import ch.compiler.parser.ReFuggParser.ArgListContext;
import ch.compiler.parser.ReFuggParser.IdentifierContext;
import ch.compiler.parser.ReFuggParser.TypeContext;

public class VisitorArgList extends ReFuggBaseVisitor<SymbolTable> {

    @Override
    public SymbolTable visitArgList(ArgListContext ctx) {
        String dataType = "";
        String id = "";
        SymbolTable table = new SymbolTable();
        for (int i = 0; i < ctx.getChildCount(); i++) {
            if (ctx.getChild(i) instanceof TypeContext) {
                dataType = ctx.getChild(i).getText();
            } else if (ctx.getChild(i) instanceof IdentifierContext) {
                id = ctx.getChild(i).getText();
                table.add(constructEntry(id, dataType));
                dataType = "";
                id = "";
            }
        }
        return table;
    }

    private EntryVariable constructEntry(String id, String type) {
        EntryVariable e = new EntryVariable(id);
        return e;
    }


}
