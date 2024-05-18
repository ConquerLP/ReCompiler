package ch.compiler.misc.visitors.statements;

import ch.compiler.misc.nodes.statements.Block;
import ch.compiler.parser.ReFuggBaseVisitor;
import ch.compiler.parser.ReFuggParser.BlockContext;

public class VisitorBlock extends ReFuggBaseVisitor<Block>{

	@Override
	public Block visitBlock(BlockContext ctx) {
		Block block = new Block();
		ctx.stmt().forEach();
		return block;
	}

}
