package ch.compiler.visitor.ASTgenerator.classes;

import ch.compiler.AST.expression.vars.MemberVarDecNode;
import ch.compiler.AST.function.ConstructorNode;
import ch.compiler.AST.function.MethodNode;
import ch.compiler.AST.misc.Visibility;
import ch.compiler.parser.ReFuggParser;

import java.util.ArrayList;
import java.util.List;

public class VClassInsideGroup {

    private final List<MethodNode> methods = new ArrayList<>();
    private final List<ConstructorNode> constructors = new ArrayList<>();
    private final List<MemberVarDecNode> member = new ArrayList<>();

    public VClassInsideGroup(ReFuggParser.ClassInsideGroupContext ctx) {
        Visibility visibility = new Visibility(new VVisibility().visitVisibilty(ctx.visibilty()));
        ctx.classInside().forEach(inside -> {
            if (inside.classConstructor() != null) {
                constructors.add(visitConstructor(inside.classConstructor()));
            } else if (inside.method() != null) {
                methods.add(visitMethod(inside.method()));
            } else if (inside.classField() != null) {
                member.add(visitField(inside.classField()));
            }
        });
    }

    public List<MethodNode> getMethods() {
        return methods;
    }

    public List<ConstructorNode> getConstructors() {
        return constructors;
    }

    public List<MemberVarDecNode> getMember() {
        return member;
    }

    private MethodNode visitMethod(ReFuggParser.MethodContext ctx) {
        return new VMethod().visitMethod(ctx);
    }

    private ConstructorNode visitConstructor(ReFuggParser.ClassConstructorContext ctx) {
        return new VClassConstructor().visitClassConstructor(ctx);
    }

    private MemberVarDecNode visitField(ReFuggParser.ClassFieldContext ctx) {
        return new VClassField().visitClassField(ctx);
    }

}
