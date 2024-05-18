package ch.compiler.misc.visitors.expression;

import ch.compiler.misc.nodes.declaration.VarDeclaration;
import ch.compiler.parser.ReFuggBaseVisitor;
import ch.compiler.parser.ReFuggParser;

public class VisitorVarDec extends ReFuggBaseVisitor<VarDeclaration> {

    @Override
    public VarDeclaration visitVarDec(ReFuggParser.VarDecContext ctx) {

    }
}
