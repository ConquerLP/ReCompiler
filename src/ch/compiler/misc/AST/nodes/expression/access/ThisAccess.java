package ch.compiler.misc.AST.nodes.expression.access;

import ch.compiler.misc.AST.nodes.expression.ExpressionNode;
import ch.compiler.misc.AST.nodes.symbolTable.SymbolTableEntry;

import java.util.List;

public class ThisAccess extends AccessNode {

    public ThisAccess(List  <ExpressionNode> expressions) {
        super(ExpressionNode.THIS, expressions);
    }

    @Override
    public ExpressionNode evaluate() {
        return null;
    }

    @Override
    public int evaluateType() {
        return 0;
    }

}
