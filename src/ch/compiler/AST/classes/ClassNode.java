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

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if(hasParent) {
            sb.append("Class: ").append(name).append(" extends ").append(parent).append("\n");
        } else {
            sb.append("Class: ").append(name).append("\n");
        }
        sb.append("\tMembers (").append(member.size()).append("):\n");
        member.forEach(memberVarDecNode -> sb.append("\t").append(memberVarDecNode.toString()).append("\n"));
        sb.append("\tConstructors (").append(constructors.size()).append("):\n");
        constructors.forEach(constructorNode -> sb.append("\t").append(constructorNode.toString()).append("\n"));
        sb.append("\tMethods (").append(methods.size()).append("):\n");
        methods.forEach(methodNode -> sb.append("\t\t").append(methodNode.toString()).append("\n"));
        return sb.toString();
    }

}
