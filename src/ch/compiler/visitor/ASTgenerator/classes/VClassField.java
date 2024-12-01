package ch.compiler.visitor.ASTgenerator.classes;

import ch.compiler.AST.expression.vars.MemberVarDecNode;
import ch.compiler.parser.ReFuggBaseVisitor;
import ch.compiler.parser.ReFuggParser;

public class VClassField extends ReFuggBaseVisitor<MemberVarDecNode> {

    @Override
    public MemberVarDecNode visitClassField(ReFuggParser.ClassFieldContext ctx) {


        return super.visitClassField(ctx);
    }

}
