package ch.compiler.misc.visitors;

import ch.compiler.misc.nodes.symbolTable.EntryVariable;
import ch.compiler.misc.nodes.symbolTable.SymbolTable;
import ch.compiler.misc.nodes.symbolTable.Type;
import ch.compiler.misc.visitors.expression.type.VisitorComplexType;
import ch.compiler.parser.ReFuggBaseVisitor;
import ch.compiler.parser.ReFuggParser;
import ch.compiler.parser.ReFuggParser.ArgListContext;
import ch.compiler.parser.ReFuggParser.IdentifierContext;

public class VisitorArgList extends ReFuggBaseVisitor<SymbolTable> {

    @Override
    public SymbolTable visitArgList(ArgListContext ctx) {
        Type type = null;
        String id = null;
        SymbolTable table = new SymbolTable();
        for (int i = 0; i < ctx.getChildCount(); i++) {
            Object child = ctx.getChild(i);
            if(child instanceof ReFuggParser.ComplexTypeContext) {
                type = new VisitorComplexType().visitComplexType((ReFuggParser.ComplexTypeContext) child);
            } else if(child instanceof IdentifierContext) {
                id = ((IdentifierContext) child).getText();
                table.add(new EntryVariable(id, type));
                type = null;
                id = null;
            }
        }
        return table;
    }

}
