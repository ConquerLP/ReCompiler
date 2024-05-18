package ch.compiler.misc.visitors.bodys;

import ch.compiler.misc.nodes.bodys.Program;
import ch.compiler.misc.visitors.bodys.classes.VisitorClass;
import ch.compiler.misc.visitors.bodys.function.VisitorFunction;
import ch.compiler.misc.visitors.expression.constant.VisitorGlobalVarDec;
import ch.compiler.misc.visitors.statements.VisitorLabel;
import ch.compiler.parser.ReFuggBaseVisitor;
import ch.compiler.parser.ReFuggParser;

public class VisitorProgram extends ReFuggBaseVisitor<Program> {

    @Override
    public Program visitProgram(ReFuggParser.ProgramContext ctx) {
        Program prg = new Program();
        ctx.func().forEach(func -> prg.addFunction(new VisitorFunction().visitFunc(func)));
        ctx.classDec().forEach(classDec -> prg.addClass(new VisitorClass().visitClassDec(classDec)));
        ctx.globalVar().forEach(globalVar -> prg.addGlobalVar(new VisitorGlobalVarDec().visitGlobalVar(globalVar)));
        ctx.label().forEach(label -> prg.addLabel(new VisitorLabel().visitLabel(label)));
        prg.setMain(new VisitorMainFunction().visitMain(ctx.main()));
        return prg;
    }

}