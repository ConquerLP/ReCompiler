package ch.compiler;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import ch.compiler.AST.program.ProgramNode;
import ch.compiler.utils.ASTUtils;
import ch.compiler.visitor.ASTgenerator.program.VProgram;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;

import ch.compiler.parser.*;

public class Main {

	private static final String VERSION = "ReFugg Compiler v0.1";

	public static void main(String[] args) {

		String inputFile = null;
		String outputFile = null;
		boolean showHelp = false;
		boolean showVersion = false;
		boolean dumpAST = false;
		boolean validateOnly = false;
		boolean measureTime = false;

		for (int i = 0; i < args.length; i++) {
			switch (args[i]) {
				case "-i":
					inputFile = args[++i];
					break;
				case "-o":
					outputFile = args[++i];
					break;
				case "-a":
					dumpAST = true;
					break;
				case "-help":
					showHelp = true;
					break;
				case "-version":
					showVersion = true;
					break;
				case "-validate":
					validateOnly = true;
					break;
				case "-time":
					measureTime = true;
					break;
				default:
					System.err.println("Unbekanntes Argument: " + args[i]);
					return;
			}
		}

		if (showHelp || args.length == 0) {
			printHelp();
			return;
		}
		if (showVersion) {
			System.out.println(VERSION);
			return;
		}
		if (inputFile == null) {
			System.err.println("Fehler: Eingabedatei mit -i angeben.");
			return;
		}
		long startTime = System.nanoTime();

		ReFuggParser parser = getParser(inputFile);
		if (parser == null) return;
		ProgramNode program = new VProgram().visitProgram(parser.program());

		if (dumpAST) {
			String astFile = outputFile != null ? outputFile : "AST_Tree.txt";
			ASTUtils.writeASTToFile(program, astFile);
			System.out.println("AST geschrieben nach " + astFile);
		}
		if (validateOnly) {
			System.out.println("Validierung erfolgreich.");
		} else {
			if (outputFile != null) {
				try (PrintWriter out = new PrintWriter(outputFile)) {
					out.println("// compiled output placeholder");
				} catch (IOException e) {
					System.err.println("Fehler beim Schreiben von: " + outputFile);
					e.printStackTrace();
				}
			}
			System.out.println("Kompilierung abgeschlossen.");
		}
		if (measureTime) {
			long elapsed = System.nanoTime() - startTime;
			System.out.printf("Dauer: %.2f ms%n", elapsed / 1_000_000.0);
		}
	}

	private static ReFuggParser getParser(String filename) {
		try {
			CharStream input = CharStreams.fromFileName(filename);
			ReFuggLexer lexer = new ReFuggLexer(input);
			CommonTokenStream tokens = new CommonTokenStream(lexer);
			return new ReFuggParser(tokens);
		} catch (IOException e) {
			System.err.println("Error reading file: " + filename);
			e.printStackTrace();
			return null;
		}
	}

	private static void printHelp() {
		System.out.println("ReFugg Compiler – options:");
		System.out.println("  -i <file>       Inputfile");
		System.out.println("  -o <file>       Outputfile");
		System.out.println("  -a              Save AST as text");
		System.out.println("  -validate       Just validate syntax");
		System.out.println("  -time           Show compile time");
		System.out.println("  -version        Show current version");
		System.out.println("  -help           Show help");
	}
	
}
