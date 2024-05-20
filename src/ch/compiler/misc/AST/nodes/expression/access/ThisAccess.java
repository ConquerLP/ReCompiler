package ch.compiler.misc.AST.nodes.expression.access;

import ch.compiler.misc.AST.nodes.expression.ExpressionNode;
import ch.compiler.misc.AST.nodes.symbolTable.SymbolTableEntry;

public class ThisAccess extends ExpressionNode {

    public ThisAccess() {
        super(ExpressionNode.THIS);
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
