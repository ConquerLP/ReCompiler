package ch.compiler.misc.visitors;

import org.antlr.v4.runtime.tree.ParseTree;

public class VisitorHelper {

	public static ParseTree getLastChild(ParseTree p) {
		return p.getChild(p.getChildCount() - 1);
	}
	
	public static String getLastChildString(ParseTree p) {
		return p.getChild(p.getChildCount() - 1).getText();
	}
	
}
