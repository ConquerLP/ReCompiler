package ch.compiler.misc.AST.visitors.bodys.classes;

import ch.compiler.misc.AST.nodes.bodys.ClassConstructor;
import ch.compiler.misc.AST.visitors.bodys.function.VisitorFParam;
import ch.compiler.misc.AST.visitors.statements.VisitorStatement;
import ch.compiler.parser.ReFuggBaseVisitor;
import ch.compiler.parser.ReFuggParser;
import ch.compiler.misc.AST.nodes.symbolTable.Type;

public class VisitorClassConstructor extends ReFuggBaseVisitor<ClassConstructor> {

    @Override
    public ClassConstructor visitClassConstructor(ReFuggParser.ClassConstructorContext ctx) {
        return new ClassConstructor(ctx.identifier().getText(),
                new Type("class"),
                new VisitorFParam().visitFParam(ctx.fParam()),
                new VisitorStatement().visitBlock(ctx.block())
                );
    }
}