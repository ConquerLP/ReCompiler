package ch.compiler.misc.visitors.bodys;

import ch.compiler.misc.nodes.bodys.ClassInside;
import ch.compiler.parser.ReFuggBaseVisitor;
import ch.compiler.parser.ReFuggParser;

public class VisitorClassInside extends ReFuggBaseVisitor<ClassInside> {

    @Override
    public ClassInside visitClassInsides(ReFuggParser.ClassInsidesContext ctx) {
        Object child = ctx.getChild(0);
        if (child instanceof ReFuggParser.MethodContext) {
            return new VisitorClassMethod().visitMethod((ReFuggParser.MethodContext) child);
        } else if (child instanceof ReFuggParser.ClassConstructorContext) {
            return new VisitorClassConstructor().visitClassConstructor((ReFuggParser.ClassConstructorContext) child);
        } else if (child instanceof ReFuggParser.ClassFieldContext) {
            return new VisitorClassMember().visitClassField((ReFuggParser.ClassFieldContext) child);
        } else {
            return null;
        }
    }
}
