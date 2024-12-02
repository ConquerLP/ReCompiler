package ch.compiler.visitor.ASTgenerator.statement;

import ch.compiler.AST.statement.CheckNode;
import ch.compiler.parser.ReFuggBaseVisitor;
import ch.compiler.parser.ReFuggParser;
import ch.compiler.visitor.ASTgenerator.expression.nonConstant.VBinary;

public class VCheck extends ReFuggBaseVisitor<CheckNode> {

    @Override
    public CheckNode visitCheck(ReFuggParser.CheckContext ctx) {
        return new CheckNode(new VBinary().visitOrExpression(ctx.orExpression()));
    }

}
