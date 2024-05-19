package ch.compiler.misc.visitors.bodys.classes;

import ch.compiler.misc.nodes.bodys.ClassDec;
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
        ctx.complexClassInsides().forEach(c -> classDec.add(new VisitorComplexClassInsides().visitComplexClassInsides(c)));
        return classDec;
    }
}