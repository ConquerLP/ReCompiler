package ch.compiler.visitor.ASTgenerator.classes;

import ch.compiler.AST.function.MethodNode;
import ch.compiler.parser.ReFuggBaseVisitor;
import ch.compiler.parser.ReFuggParser;

public class VMethod extends ReFuggBaseVisitor<MethodNode> {

    @Override
    public MethodNode visitMethod(ReFuggParser.MethodContext ctx) {
        return super.visitMethod(ctx);
    }

}
