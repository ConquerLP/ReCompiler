package ch.compiler.misc.visitors.bodys.classes;

import ch.compiler.misc.nodes.bodys.ClassMember;
import ch.compiler.misc.visitors.expression.type.*;
import ch.compiler.parser.ReFuggBaseVisitor;
import ch.compiler.parser.ReFuggParser;

public class VisitorClassMember extends ReFuggBaseVisitor<ClassMember>{

    @Override
    public ClassMember visitClassField(ReFuggParser.ClassFieldContext ctx) {
        return new ClassMember(new VisitorComplexType().visitComplexType(ctx.complexType()),
                ctx.identifier().getText(),
                new VisitorTypeModifier().visitTypemodifier(ctx.typemodifier())
        );
    }
}