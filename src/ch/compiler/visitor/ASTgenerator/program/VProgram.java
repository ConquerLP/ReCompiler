package ch.compiler.visitor.ASTgenerator.program;

import ch.compiler.AST.program.ProgramNode;
import ch.compiler.parser.ReFuggBaseVisitor;
import ch.compiler.parser.ReFuggParser;
import ch.compiler.visitor.ASTgenerator.classes.VClassDec;
import ch.compiler.visitor.ASTgenerator.expression.vars.VVar;
import ch.compiler.visitor.ASTgenerator.function.VFunction;
import ch.compiler.visitor.ASTgenerator.statement.jumps.VLabel;

public class VProgram extends ReFuggBaseVisitor<ProgramNode> {

    @Override
    public ProgramNode visitProgram(ReFuggParser.ProgramContext ctx) {
        ProgramNode program = new ProgramNode();
        ctx.func().forEach(func -> program.addFunction(new VFunction().visit(func)));
        ctx.classDec().forEach(classDec -> program.addClass(new VClassDec().visit(classDec)));
        ctx.globalVar().forEach(globalVar -> program.addGlobalVar(new VVar().visitGlobalVar(globalVar)));
        ctx.label().forEach(label -> program.addLabel(new VLabel().visit(label)));
        return program;
    }
}
