package ch.compiler.misc.AST.visitors.bodys.classes;

import ch.compiler.misc.AST.nodes.bodys.ClassInside;
import ch.compiler.parser.ReFuggBaseVisitor;
import ch.compiler.parser.ReFuggParser;

public class VisitorClassInside extends ReFuggBaseVisitor<ClassInside> {

    @Override
    public ClassInside visitClassInside(ReFuggParser.ClassInsideContext ctx) {
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
