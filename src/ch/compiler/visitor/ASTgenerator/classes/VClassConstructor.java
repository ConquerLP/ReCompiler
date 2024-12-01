package ch.compiler.visitor.ASTgenerator.classes;

import ch.compiler.AST.classes.ClassNode;
import ch.compiler.AST.function.ConstructorNode;
import ch.compiler.parser.ReFuggBaseVisitor;
import ch.compiler.parser.ReFuggParser;

public class VClassConstructor extends ReFuggBaseVisitor<ConstructorNode> {

    @Override
    public ConstructorNode visitClassConstructor(ReFuggParser.ClassConstructorContext ctx) {
        return super.visitClassConstructor(ctx);
    }

}
