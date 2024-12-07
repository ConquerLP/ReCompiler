package ch.compiler.AST.classes;

import ch.compiler.AST.ASTNode;
import ch.compiler.AST.expression.vars.MemberVarDecNode;
import ch.compiler.AST.function.ConstructorNode;
import ch.compiler.AST.function.MethodNode;

import java.util.ArrayList;
import java.util.List;

public class ClassNode extends ASTNode {

    private final String name;
    private final String parent;
    private final boolean hasParent;
    private final List<MethodNode> methods = new ArrayList<>();
    private final List<ConstructorNode> constructors = new ArrayList<>();
    private final List<MemberVarDecNode> member = new ArrayList<>();

    public ClassNode(String name, String parent) {
        this.name = name;
        this.parent = parent;
        this.hasParent = !parent.isEmpty();
    }

    public void addMethod(List<MethodNode> method) {
        methods.addAll(method);
    }

    public void addConstructor(List<ConstructorNode> constructor) {
        constructors.addAll(constructor);
    }

    public void addMemberVar(List<MemberVarDecNode> memberVar) {
        member.addAll(memberVar);
    }

}
