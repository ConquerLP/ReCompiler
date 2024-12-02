package ch.compiler.visitor.ASTgenerator.classes;

import ch.compiler.AST.expression.vars.MemberVarDecNode;
import ch.compiler.AST.function.ConstructorNode;
import ch.compiler.AST.function.MethodNode;
import ch.compiler.AST.misc.Visibility;
import ch.compiler.parser.ReFuggParser;
import ch.compiler.visitor.ASTgenerator.function.VSubDec;

import java.util.ArrayList;
import java.util.List;

public class VClassInsideGroup {

    private final List<MethodNode> methods = new ArrayList<>();
    private final List<ConstructorNode> constructors = new ArrayList<>();
    private final List<MemberVarDecNode> member = new ArrayList<>();
    private final Visibility visibility;
    private final String className;

    public VClassInsideGroup(ReFuggParser.ClassInsideGroupContext ctx, String className) {
        visibility = new Visibility(new VVisibility().visitVisibilty(ctx.visibilty()));
        this.className = className;
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
        MethodNode method = new VSubDec().visitMethod(ctx);
        method.setVisibility(visibility);
        return method;
    }

    private ConstructorNode visitConstructor(ReFuggParser.ClassConstructorContext ctx) {
        ConstructorNode constructor = new VSubDec().visitClassConstructor(ctx);
        constructor.setVisibility(visibility);
        constructor.setClassName(className);
        return constructor;
    }

    private MemberVarDecNode visitField(ReFuggParser.ClassFieldContext ctx) {
        MemberVarDecNode field = new VClassField().visitClassField(ctx);
        field.setVisibility(visibility);
        return field;
    }

}
