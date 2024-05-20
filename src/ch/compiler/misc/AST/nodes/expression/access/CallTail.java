package ch.compiler.misc.AST.nodes.expression.access;

import ch.compiler.misc.AST.nodes.expression.ExpressionNode;

import java.util.ArrayList;
import java.util.List;

public class CallTail {

    private String identifier;
    private ExpressionNode simpleCall;
    private List<ArrayAccess> arrayAccess = new ArrayList<>();

    public CallTail(String identifier, ExpressionNode simpleCall, List<ArrayAccess> arrayAccess) {
        this.identifier = identifier;
        this.simpleCall = simpleCall;
        arrayAccess.addAll(arrayAccess);
    }


}
