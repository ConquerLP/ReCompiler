package ch.compiler.visitor.ASTgenerator.statement;

import ch.compiler.AST.statement.CheckNode;
import ch.compiler.parser.ReFuggBaseVisitor;
import ch.compiler.parser.ReFuggParser;
import ch.compiler.visitor.ASTgenerator.expression.nonConstant.VBinary;

import static ch.compiler.utils.ASTUtils.withPosition;

public class VCheck extends ReFuggBaseVisitor<CheckNode> {

    @Override
    public CheckNode visitCheck(ReFuggParser.CheckContext ctx) {
        return withPosition(new CheckNode(new VBinary().visitOrExpression(ctx.orExpression())), ctx);
    }

}
