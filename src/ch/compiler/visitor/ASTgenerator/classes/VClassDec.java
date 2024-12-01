package ch.compiler.visitor.ASTgenerator.classes;

import ch.compiler.AST.classes.ClassNode;
import ch.compiler.parser.ReFuggBaseVisitor;
import ch.compiler.parser.ReFuggParser;

public class VClassDec extends ReFuggBaseVisitor<ClassNode> {

    @Override
    public ClassNode visitClassDec(ReFuggParser.ClassDecContext ctx) {
        ClassNode classNode = new ClassNode(ctx.identifier().getText(),
                new VPoly().visitPoly(ctx.poly()));
        ctx.classInsideGroup().forEach(group -> {
            VClassInsideGroup inside = new VClassInsideGroup(group);
            classNode.addConstructor(inside.getConstructors());
            classNode.addMethod(inside.getMethods());
            classNode.addMemberVar(inside.getMember());
        });
        return classNode;
    }

}
