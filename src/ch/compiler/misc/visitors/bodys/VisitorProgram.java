package ch.compiler.misc.visitors.bodys;

import ch.compiler.misc.nodes.bodys.Program;
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
            Object o = ctx.getChild(i);
            if (o instanceof FuncContext) {
                prg.addFunction(new VisitorFunction().visitFunc((FuncContext) o));
            } else if (o instanceof ClassDecContext) {
                prg.addClass(new VisitorClass().visitClassDec((ClassDecContext) o));
            } else if (o instanceof ReFuggParser.GlobalYesInitContext) {
                prg.addGlobalVar(new VisitorGlobalVarDec().visitGlobalYesInit((ReFuggParser.GlobalYesInitContext) o));
            } else if (o instanceof ReFuggParser.GlobalNoInitContext) {
                prg.addGlobalVar(new VisitorGlobalVarDec().visitGlobalNoInit((ReFuggParser.GlobalNoInitContext) o));
            } else if (o instanceof LabelContext) {
                prg.addLabel(new VisitorLabel().visitLabel((LabelContext) o));
            } else if (o instanceof ReFuggParser.MainContext) {
                prg.setMain(new VisitorMainFunction().visitMain((ReFuggParser.MainContext) o));
            }
        }
        return prg;
    }

}