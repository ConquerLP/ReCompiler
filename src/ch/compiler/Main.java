package ch.compiler;

import java.io.IOException;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;

import ch.compiler.misc.AST.nodes.bodys.Program;
import ch.compiler.misc.AST.visitors.bodys.VisitorProgram;
import ch.compiler.parser.*;

public class Main {

	public static void main(String[] args) {
		String filename = "demo.fugg";
		ReFuggParser parser = getParser(filename);
		Program p = new VisitorProgram().visitProgram(parser.program());
		System.out.println("Done!");
	}
	
	private static ReFuggParser getParser(String filename) {
		ReFuggParser parser = null;
		try {
			CharStream input = CharStreams.fromFileName(filename);
			ReFuggLexer lexer = new ReFuggLexer(input);
			CommonTokenStream tokens = new CommonTokenStream(lexer);
			parser = new ReFuggParser(tokens);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return parser;
	}
	

}
