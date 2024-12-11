package ch.compiler;

import java.io.IOException;

import ch.compiler.AST.program.ProgramNode;
import ch.compiler.visitor.ASTgenerator.program.VProgram;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;

import ch.compiler.parser.*;

public class Main {

	public static void main(String[] args) {
		String filename = "demo.fugg";
		ReFuggParser parser = getParser(filename);
		ProgramNode p = new VProgram().visitProgram(parser.program());
		System.out.println(p);
		System.out.println("Done compiling!");
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
