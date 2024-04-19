package ch.compiler.misc.visitors.bodys;

import ch.compiler.misc.nodes.bodys.Program;
import ch.compiler.misc.visitors.expression.constant.VisitorGlobalVarDec;
import ch.compiler.misc.visitors.statements.VisitorLabel;
import ch.compiler.parser.ReFuggBaseVisitor;
import ch.compiler.parser.ReFuggParser;
import ch.compiler.parser.ReFuggParser.ClassDecContext;
import ch.compiler.parser.ReFuggParser.FuncContext;
import ch.compiler.parser.ReFuggParser.GlobalVarContext;
import ch.compiler.parser.ReFuggParser.LabelContext;
import ch.compiler.parser.ReFuggParser.MainContext;

public class VisitorProgram extends ReFuggBaseVisitor<Program>{

	@Override
	public Program visitProgram(ReFuggParser.ProgramContext ctx) {
		Program prg = new Program();
		VisitorFunction vf = new VisitorFunction();
		VisitorClass vc = new VisitorClass();
		VisitorLabel vl = new VisitorLabel();
		VisitorGlobalVarDec vg = new VisitorGlobalVarDec();
		for(int i = 0; i < ctx.getChildCount() - 2; i++) {
			if(ctx.getChild(i) instanceof FuncContext) {
				prg.addFunction(vf.visit(ctx.getChild(i)));
			}else if (ctx.getChild(i) instanceof ClassDecContext) {
				prg.addClass(vc.visit(ctx.getChild(i)));
			}else if(ctx.getChild(i) instanceof GlobalVarContext) {
				prg.addGlobalVar(vg.visit(ctx.getChild(i)));
			}else if(ctx.getChild(i) instanceof LabelContext) {
				prg.addLabel(vl.visit(ctx.getChild(i)));
			}
		}
		VisitorMainFunction main = new VisitorMainFunction();
		prg.setMain(main.visit(ctx.getChild(ctx.getChildCount() - 1)));
		return prg;
	}
	
}