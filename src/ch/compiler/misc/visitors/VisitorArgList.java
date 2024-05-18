package ch.compiler.misc.visitors;

import ch.compiler.misc.nodes.symbolTable.EntryVariable;
import ch.compiler.misc.nodes.symbolTable.SymbolTable;
import ch.compiler.misc.visitors.expression.type.VisitorComplexType;
import ch.compiler.parser.ReFuggBaseVisitor;
import ch.compiler.parser.ReFuggParser;
import ch.compiler.parser.ReFuggParser.ArgListContext;

import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class VisitorArgList extends ReFuggBaseVisitor<SymbolTable> {

    @Override
    public SymbolTable visitArgList(ArgListContext ctx) {
        SymbolTable table = new SymbolTable();
        if(ctx == null) return table;
        Map<ReFuggParser.ComplexTypeContext, ReFuggParser.IdentifierContext> resultMap = IntStream.range(0, ctx.complexType().size())
                .boxed()
                .collect(Collectors.toMap(ctx.complexType()::get, ctx.identifier()::get));
        resultMap.forEach((key, value) -> table.add(new EntryVariable(value.getText(), new VisitorComplexType().visitComplexType(key))));
        return table;
    }

}
