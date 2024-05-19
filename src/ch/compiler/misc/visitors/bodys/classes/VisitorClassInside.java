package ch.compiler.misc.visitors.bodys.classes;

import ch.compiler.misc.nodes.bodys.ClassInside;
import ch.compiler.parser.ReFuggBaseVisitor;
import ch.compiler.parser.ReFuggParser;

public class VisitorClassInside extends ReFuggBaseVisitor<ClassInside> {

    @Override
    public ClassInside visitClassInsides(ReFuggParser.ClassInsidesContext ctx) {
        if (ctx.classConstructor() != null) {
            return new VisitorClassConstructor().visitClassConstructor(ctx.classConstructor());
        } else if (ctx.classField() != null) {
            return new VisitorClassMember().visitClassField(ctx.classField());
        } else if (ctx.method() != null) {
            return new VisitorClassMethod().visitMethod(ctx.method());
        } else {
            return null;
        }
    }
}
