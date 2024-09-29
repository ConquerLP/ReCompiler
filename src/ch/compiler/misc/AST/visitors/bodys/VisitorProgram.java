package ch.compiler.misc.AST.visitors.bodys;

import ch.compiler.misc.AST.nodes.bodys.ClassDec;
import ch.compiler.misc.AST.nodes.bodys.Function;
import ch.compiler.misc.AST.nodes.bodys.Program;
import ch.compiler.misc.AST.nodes.declaration.GlobalDeclaration;
import ch.compiler.misc.AST.visitors.bodys.classes.VisitorClass;
import ch.compiler.misc.AST.visitors.bodys.function.VisitorFunction;
import ch.compiler.misc.AST.visitors.expression.constant.VisitorGlobalVarDec;
import ch.compiler.misc.AST.visitors.statements.VisitorLabel;
import ch.compiler.misc.AST.nodes.statements.Label;
import ch.compiler.parser.ReFuggBaseVisitor;
import ch.compiler.parser.ReFuggParser;

public class VisitorProgram extends ReFuggBaseVisitor<Program> {

    @Override
    public Program visitProgram(ReFuggParser.ProgramContext ctx) {
        Program prg = new Program();
        ctx.func().forEach(func -> {
            Function f = new VisitorFunction().visitFunc(func);
            prg.addFunction(f);
            prg.addEntry(f.toEntry());
        });
        ctx.classDec().forEach(classDec -> {
            ClassDec c = new VisitorClass().visitClassDec(classDec);
            prg.addClass(c);
            prg.addEntry(c.toEntry());
        });
        ctx.globalVar().forEach(globalVar -> {
            GlobalDeclaration g = new VisitorGlobalVarDec().visitGlobalVar(globalVar);
            prg.addGlobalVar(g);
            prg.addEntry(g.toEntry());
        });
        ctx.label().forEach(label -> {
            Label l = new VisitorLabel().visitLabel(label);
            prg.addLabel(l);
            prg.addEntry(l.toEntry());
        });
        prg.setMain(new VisitorMainFunction().visitMain(ctx.main()));
        prg.resolve(prg.getGlobalSymbols());
        return prg;
    }

}