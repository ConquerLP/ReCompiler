package ch.compiler.visitor.program;

import ch.compiler.AST.program.ProgramNode;
import ch.compiler.parser.ReFuggBaseVisitor;
import ch.compiler.parser.ReFuggParser;
import ch.compiler.visitor.classes.VClassDec;

public class VProgram extends ReFuggBaseVisitor<ProgramNode> {

    @Override
    public ProgramNode visitProgram(ReFuggParser.ProgramContext ctx) {
        ProgramNode program = new ProgramNode();
        ctx.classDec().forEach(classDec -> program.addClass(new VClassDec().visit(classDec)));
        

        return program;
    }
}
