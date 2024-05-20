package ch.compiler.misc.AST.visitors.bodys.classes;

import ch.compiler.misc.AST.nodes.bodys.ClassInside;
import ch.compiler.misc.AST.nodes.symbolTable.Access;
import ch.compiler.misc.AST.visitors.bodys.*;
import ch.compiler.parser.ReFuggBaseVisitor;
import ch.compiler.parser.ReFuggParser;

import java.util.ArrayList;
import java.util.List;

public class VisitorComplexClassInsides extends ReFuggBaseVisitor<List<ClassInside>> {

    @Override
    public List<ClassInside> visitComplexClassInsides(ReFuggParser.ComplexClassInsidesContext ctx) {
        List<ClassInside> classInsides = new ArrayList<>();
        List<ReFuggParser.ClassInsidesContext> classInsidesContext = ctx.classInsides();
        Access access = new VisitorVisibilityModifier().visitVisibilty(ctx.visibilty());
        classInsidesContext.forEach(classInside -> {
            ClassInside c = new VisitorClassInside().visitClassInsides(classInside);
            c.setAccess(access);
            classInsides.add(c);
        });
        return classInsides;
    }
}