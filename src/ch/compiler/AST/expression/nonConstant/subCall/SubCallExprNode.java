package ch.compiler.AST.expression.nonConstant.subCall;

import ch.compiler.AST.expression.nonConstant.ExprNode;

import java.util.ArrayList;
import java.util.List;

public abstract class SubCallExprNode extends ExprNode {

    protected final String name;
    protected final List<ExprNode> args = new ArrayList<>();
    protected final List<ExprNode> arrayAccess = new ArrayList<>();
    protected final List<ExprNode> exprTail = new ArrayList<>();

    public SubCallExprNode(String name) {
        this.name = name;
    }

    public void addArgs(List<ExprNode> args) {
        this.args.addAll(args);
    }

    public void addArrayAccess(ExprNode arrayAccess) {
        this.arrayAccess.add(arrayAccess);
    }

    public void addExprTails(List<ExprNode> exprTails) {
        this.exprTail.addAll(exprTails);
    }

}
