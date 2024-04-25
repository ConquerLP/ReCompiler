package ch.compiler.misc.visitors.bodys;

import org.antlr.v4.runtime.tree.ParseTree;

import ch.compiler.misc.nodes.bodys.Function;
import ch.compiler.misc.nodes.symbolTable.Type;
import ch.compiler.misc.visitors.*;
import ch.compiler.misc.visitors.statements.*;
import ch.compiler.parser.ReFuggBaseVisitor;
import ch.compiler.parser.ReFuggParser.ArgListContext;
import ch.compiler.parser.ReFuggParser.BlockContext;
import ch.compiler.parser.ReFuggParser.FuncContext;
import ch.compiler.parser.ReFuggParser.TypeContext;

public class VisitorFunction extends ReFuggBaseVisitor<Function>{

	@Override
	public Function visitFunc(FuncContext ctx) {
		ParseTree fHeader = ctx.getChild(1);
		ParseTree ftype = fHeader.getChild(0);
		ParseTree argList = ctx.getChild(2);
		String type;
		if(ftype instanceof TypeContext) {
			type = ftype.getChild(0).getText();
		}else {
			type = ftype.getText();
		}
		Type returnType;
		if(fHeader.getChildCount() == 2) {
			returnType = new Type(type, false);
		} else {
			returnType = new Type(type, true);
		}
		Function f = new Function(VisitorHelper.getLastChildString(fHeader), returnType);
		if(argList.getChildCount() == 2) {
			f.setTable(null);
		} else {
			argList = argList.getChild(1);
			f.setTable(new VisitorArgList().visitArgList((ArgListContext) argList));
		}
		ParseTree fBlock = VisitorHelper.getLastChild(ctx);
		VisitorBlock vb = new VisitorBlock();
		f.setBlock(vb.visitBlock((BlockContext) fBlock));
		return f;
	}

	
	
	
	
};