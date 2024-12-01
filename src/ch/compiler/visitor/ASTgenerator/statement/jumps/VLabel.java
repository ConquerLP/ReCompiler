package ch.compiler.visitor.ASTgenerator.statement.jumps;

import ch.compiler.AST.statement.jumps.LabelNode;
import ch.compiler.parser.ReFuggBaseVisitor;
import ch.compiler.parser.ReFuggParser;

public class VLabel extends ReFuggBaseVisitor<LabelNode> {
    @Override
    public LabelNode visitLabel(ReFuggParser.LabelContext ctx) {
        return super.visitLabel(ctx);
    }
}
