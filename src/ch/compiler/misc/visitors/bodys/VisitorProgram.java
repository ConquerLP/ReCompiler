package ch.compiler.misc.visitors.bodys;

import ch.compiler.misc.nodes.bodys.Program;
import ch.compiler.misc.visitors.bodys.classes.VisitorClass;
import ch.compiler.misc.visitors.bodys.function.VisitorFunction;
import ch.compiler.misc.visitors.expression.constant.VisitorGlobalVarDec;
import ch.compiler.misc.visitors.statements.VisitorLabel;
import ch.compiler.parser.ReFuggBaseVisitor;
import ch.compiler.parser.ReFuggParser;
import ch.compiler.parser.ReFuggParser.*;

public class VisitorProgram extends ReFuggBaseVisitor<Program> {

    @Override
    public Program visitProgram(ReFuggParser.ProgramContext ctx) {
        Program prg = new Program();
        for (int i = 0; i < ctx.getChildCount(); i++) {
            Object child = ctx.getChild(i);
            if (child instanceof FuncContext) {
                prg.addFunction(new VisitorFunction().visitFunc((FuncContext) child));
            } else if (child instanceof ClassDecContext) {
                prg.addClass(new VisitorClass().visitClassDec((ClassDecContext) child));
            } else if (child instanceof ReFuggParser.GlobalVarContext) {
                prg.addGlobalVar(new VisitorGlobalVarDec().visitGlobalVar((ReFuggParser.GlobalVarContext) child));
            } else if (child instanceof LabelContext) {
                prg.addLabel(new VisitorLabel().visitLabel((LabelContext) child));
            } else if (child instanceof ReFuggParser.MainContext) {
                prg.setMain(new VisitorMainFunction().visitMain((ReFuggParser.MainContext) child));
            }
        }
        return prg;
    }

}