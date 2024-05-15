package ch.compiler.misc.visitors.bodys;

import ch.compiler.misc.nodes.bodys.MainFunction;
import ch.compiler.misc.nodes.statements.Block;
import ch.compiler.misc.visitors.statements.VisitorBlock;
import ch.compiler.parser.ReFuggBaseVisitor;
import ch.compiler.parser.ReFuggParser.MainContext;

public class VisitorMainFunction extends ReFuggBaseVisitor<MainFunction>{

	@Override
	public MainFunction visitMain(MainContext ctx) {
		MainFunction main = new MainFunction();
		VisitorBlock vb = new VisitorBlock();
		Block block = vb.visit(ctx.getChild(1));
		main.setBlock(block);
		return main;
	}
	
}