package ch.compiler.visitor.ASTgenerator.function;

import ch.compiler.AST.misc.Type;
import ch.compiler.parser.ReFuggBaseVisitor;
import ch.compiler.parser.ReFuggParser;

public class VFHeader extends ReFuggBaseVisitor<Type> {

    @Override
    public Type visitFHeader(ReFuggParser.FHeaderContext ctx) {
        if("void".equals(ctx.returntype().getText())) {
            return new Type("void");
        } else {
            return new Type(ctx.returntype().type().getText());
        }
    }

    public String getFunctionName(ReFuggParser.FHeaderContext ctx) {
        return ctx.identifier().getText();
    }
}
