package ch.compiler.misc.AST.visitors.bodys.classes;

import ch.compiler.misc.AST.nodes.bodys.ClassMember;
import ch.compiler.misc.AST.visitors.expression.type.*;
import ch.compiler.parser.ReFuggBaseVisitor;
import ch.compiler.parser.ReFuggParser;

public class VisitorClassMember extends ReFuggBaseVisitor<ClassMember>{

    @Override
    public ClassMember visitClassField(ReFuggParser.ClassFieldContext ctx) {
        return new ClassMember(new VisitorType().visitType(ctx.type()),
                ctx.identifier().getText(),
                new VisitorTypeModifier().visitTypemodifier(ctx.typemodifier())
        );
    }
}