package ch.compiler.misc.visitors;

import ch.compiler.misc.nodes.constantExpression.ConstExpNode;
import ch.compiler.misc.nodes.symbolTable.EntryVariable;
import ch.compiler.misc.nodes.symbolTable.SymbolTable;
import ch.compiler.misc.nodes.symbolTable.Type;
import ch.compiler.misc.nodes.symbolTable.value.Value;
import ch.compiler.misc.visitors.expression.constant.VisitorConstantExpression;
import ch.compiler.parser.ReFuggBaseVisitor;
import ch.compiler.parser.ReFuggParser.ArgListContext;
import ch.compiler.parser.ReFuggParser.ConstKnownArraysizeContext;
import ch.compiler.parser.ReFuggParser.ConstUnknownArraysizeContext;
import ch.compiler.parser.ReFuggParser.IdentifierContext;
import ch.compiler.parser.ReFuggParser.TypeContext;

public class VisitorArgList extends ReFuggBaseVisitor<SymbolTable>{

	@Override
	public SymbolTable visitArgList(ArgListContext ctx) {
		String dataType = "";
		String id = "";
		Value v = null;
		SymbolTable table = new SymbolTable();
		for(int i = 0; i < ctx.getChildCount(); i++) {
			if(ctx.getChild(i) instanceof TypeContext) {
				dataType = ctx.getChild(i).getText();
			} else if(ctx.getChild(i) instanceof ConstKnownArraysizeContext) {
				VisitorConstantExpression ve = new VisitorConstantExpression();
				ConstExpNode ce = ve.visitConstKnownArraysize((ConstKnownArraysizeContext) ctx.getChild(i));
				//v = ce.processValue();
			} else if(ctx.getChild(i) instanceof ConstUnknownArraysizeContext) {
				VisitorConstantExpression ve = new VisitorConstantExpression();
				//ConstantExpression ce = ve.visitConstUnknownArraysize((ConstUnknownArraysizeContext) ctx.getChild(i));
				//v = ce.processValue();
			} else if(ctx.getChild(i) instanceof IdentifierContext) {
				id = ctx.getChild(i).getText();
				table.add(constructEntry(id, dataType, v));
				dataType = "";
				id = "";
				v = null;
			}
		}
		return table;
	}

	private EntryVariable constructEntry(String id, String type, Value v) {
		EntryVariable e = new EntryVariable(id);
		//e.setDataType(new Type(type, 1));
		e.setValue(v);
		return e;
	}
	
	
}
