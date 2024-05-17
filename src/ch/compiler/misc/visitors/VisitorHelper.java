package ch.compiler.misc.visitors;

import org.antlr.v4.runtime.tree.ParseTree;

public class VisitorHelper {

	public static ParseTree getLastChild(ParseTree p) {
		return p.getChild(p.getChildCount() - 1);
	}
	
	public static String getLastChildString(ParseTree p) {
		return p.getChild(p.getChildCount() - 1).getText();
	}

	public static String getIdentifier(ParseTree p) {
		for(int i = 0; i < p.getChildCount(); i++) {
			ParseTree child = p.getChild(i);
			if(child instanceof ReFuggParser.IdentifierContext) {
				return child.getChild(i).getText();
			}
		}
		return null;
	}

}
