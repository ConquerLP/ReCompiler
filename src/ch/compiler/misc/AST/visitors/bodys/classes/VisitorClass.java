package ch.compiler.misc.AST.visitors.bodys.classes;

import ch.compiler.misc.AST.nodes.bodys.ClassDec;
import ch.compiler.parser.ReFuggBaseVisitor;
import ch.compiler.parser.ReFuggParser;

public class VisitorClass extends ReFuggBaseVisitor<ClassDec> {

    @Override
    public ClassDec visitClassDec(ReFuggParser.ClassDecContext ctx) {
        ClassDec classDec = new ClassDec(ctx.identifier().getText());
        ReFuggParser.PolyContext poly = ctx.poly();
        if (poly != null) {
            classDec.addSuperClass(new VisitorPoly().visitPoly(poly));
        }
        ctx.classInside().forEach(c -> classDec.add(new VisitorClassInside().visitClassInside(c)));
        return classDec;
    }
}