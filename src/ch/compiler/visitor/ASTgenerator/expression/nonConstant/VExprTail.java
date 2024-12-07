package ch.compiler.visitor.ASTgenerator.expression.nonConstant;

import ch.compiler.AST.expression.nonConstant.ExprNode;
import ch.compiler.parser.ReFuggBaseVisitor;
import ch.compiler.parser.ReFuggParser;

import java.util.ArrayList;
import java.util.List;

public class VExprTail extends ReFuggBaseVisitor<List<ExprNode>> {

    @Override
    public List<ExprNode> visitExprTail(ReFuggParser.ExprTailContext ctx) {
        List<ExprNode> exprNodes = new ArrayList<>();
        if (ctx.identifier() != null) {

        }

        return exprNodes;
    }

}
