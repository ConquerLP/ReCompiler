package ch.compiler.AST.classes;

import ch.compiler.AST.ASTNode;
import ch.compiler.AST.expression.vars.MemberVarDecNode;
import ch.compiler.AST.function.ConstructorNode;
import ch.compiler.AST.function.MethodNode;
import ch.compiler.utils.StringUtils;

import java.io.IOException;
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
    public void dumpTree(Appendable out, int depth) throws IOException {
        prefix(out, depth);
        out.append("ClassNode").append(name).append("\n");

    }

    public String toString(int depth) {
        StringBuilder sb = new StringBuilder();
        final int deeper = depth + 1;
        final int deepest = depth + 2;
        sb.append(" ".repeat(depth));
        sb.append("Class").append(position).append(name);
        if(hasParent) {
            sb.append(" extends ").append(parent);
        }
        sb.append("\n");
        if(!member.isEmpty()) {
            sb.append(" ".repeat(deeper));
            sb.append("Members (").append(member.size()).append("):\n");
            member.forEach(m -> sb.append(m.toString(deepest)).append("\n"));
        }
        if(!constructors.isEmpty()) {
            sb.append(" ".repeat(deeper));
            sb.append("Constructors (").append(constructors.size()).append("):\n");
            constructors.forEach(c -> sb.append(c.toString(deepest)).append("\n"));
        }
        if(!methods.isEmpty()) {
            sb.append(" ".repeat(deeper));
            sb.append("Methods (").append(methods.size()).append("):\n");
            methods.forEach(m -> sb.append(m.toString(deepest)).append("\n"));
        }
        return sb.toString();
    }

}
