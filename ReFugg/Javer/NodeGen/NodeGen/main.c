/*
#define BINARYOP(NAME, BASETYPE, OP) \
public class NAME<T extends Number> implements BASETYPE<T> { \
private BASETYPE<T> left; \
private BASETYPE<T> right; \
public NAME(BASETYPE<T> left, BASETYPE<T> right) { \
    this.left = left; \
    this.right = right; \
} \
@Override \
public T evaluate() { \
    return (T)(Double)(left.evaluate().doubleValue() OP right.evaluate().doubleValue()); \
}} \

	
BINARYOP(ConstPlusExp, ConstMathExp, +)
BINARYOP(ConstMinusExp, ConstMathExp, -)
BINARYOP(ConstDivExp, ConstMathExp, /)
BINARYOP(ConstMultExp, ConstMathExp, *)
BINARYOP(ConstModExp, ConstMathExp, %)
BINARYOP(ConstExpoExp, ConstMathExp, ^^)


*/


#include <stdlib.h>
#include <stdio.h>

const char package[] = "package ch.compiler.misc.nodes.constexpression.test;";
const char header[] = "public class";

void generate(char* filename, char* className, char* type, char* op)
{
    FILE* file = fopen(filename, "w");
    fprintf(file, "%s\n\n", package);
    fprintf(file, "%s %s {\n\n\tprivate %s left;\n\tprivate %s right;\n\n", header, className, className, className);
    fprintf(file, "\tpublic %s evaluate() {\n", type);
    fprintf(file, "\t\treturn left.evaluate() %s evaluate();\n\t}\n\n}", op);
    fclose(file);
}

#define GEN_CONST_MATH(TYPE, OPS, OP) \
    generate("ConstMathExp"#TYPE#OPS".java", "ConstMathExpIntAdd", #TYPE, #OP);

#define GEN_CONST_REL(TYPE, OPS, OP) \
    generate("ConstRelExp"#TYPE#OPS".java", "ConstMathExpIntAdd", #TYPE, #OP);

void gen_ConstMath(char* filename, char* classname, char* super,
    char* op, char** types_class, char** types_lit, char** types_prim,
    int num_cases) 
{
    FILE* file = fopen(filename, "w");
    fprintf(file, "package ch.compiler.misc.nodes.constantExpression.math;\n");
    fprintf(file, "import ch.compiler.misc.nodes.constantExpression.ConstBinaryExp;\n");
    fprintf(file, "import ch.compiler.misc.nodes.constantExpression.ConstExpNode;\n");
    fprintf(file, "import ch.compiler.misc.nodes.constantExpression.literals.*;\n");

    fprintf(file, "\n\npublic class %s extends %s {\n\n", classname, super);
    fprintf(file, "\tpublic %s (ConstExpNode left, ConstExpNode right) {\n", classname);
    fprintf(file, "\t\tsuper(left, right);\n\t}\n\n");
    fprintf(file, "\t@Override\n\tpublic ConstExpNode evaluate() {\n\t\t");
    fprintf(file, "ConstExpNode leftEvaluated = left.evaluate();\n\t\t");
    fprintf(file, "ConstExpNode rightEvaluated = right.evaluate();\n\t\t");
    fprintf(file, "switch(evaluateType()) {\n");
    for (int i = 0; i < num_cases; i++) {
        fprintf(file, "\t\t\t case %s: {\n", types_lit[i]);
        fprintf(file, "\t\t\t\t %s leftExp = ((%s)leftEvaluated).getValue();\n",
            types_prim[i], types_class[i]);
        fprintf(file, "\t\t\t\t %s rightExp = ((%s)rightEvaluated).getValue();\n",
            types_prim[i], types_class[i]);
        fprintf(file, "\t\t\t\treturn new %s((%s)(leftExp %s rightExp));\n\t\t\t}\n", types_class[i], types_prim[i], op);
    }
    fprintf(file, "\t\t}\n\t\treturn null;\n\t}\n\n}");
    fclose(file);
}

void gen_literal(char* filename, char* classname, char* prim_type, char* super, char* prim_lit)
{
    FILE* file = fopen(filename, "w");
    fprintf(file, "package ch.compiler.misc.nodes.constantExpression.literals;\n");
    fprintf(file, "import ch.compiler.misc.nodes.constantExpression.ConstExpNode;\n");
    fprintf(file, "\npublic class %s extends %s {\n\t\n", classname, super);
    fprintf(file, "\tprivate final %s value;\n\n\t", prim_type);
    fprintf(file, "public %s(%s value) {\n\t\t", classname, prim_type);
    fprintf(file, "this.value = value;\n\t}\n\n");
    fprintf(file, "\t@Override\n\tpublic ConstExpNode evaluate() {\n\t\treturn this;\n\t}\n\n");
    fprintf(file, "\tpublic %s getValue() {\n\t\treturn value;\n\t}\n\n", prim_type);
    fprintf(file, "\tpublic int evaluateType() {\n\t\treturn %s;\n\t}", prim_lit);
    fprintf(file, "\n}\n");
    fclose(file);
}

#define ARRAY_SIZE(ptr) (sizeof((ptr)) / sizeof((*ptr)))

#define GEN_COSNT_MATH(PRIM, TYPEC, TYPEL, SUPER, OP, OPS) \
        gen_ConstMath("ConstMathExp"#OPS".java", "ConstMathExp"#OPS, #SUPER, \
        #OP, TYPEC, types_lit, PRIM, ARRAY_SIZE(PRIM));

#define GEN_LIT(PRIM, SUPER, PRIM_LIT) \
    gen_literal(#PRIM"Literal"".java", #PRIM"Literal", #PRIM, #SUPER, #PRIM_LIT);

int main(void) {

    char* types_class[] = {
        "IntegerLiteral",
        "DoubleLiteral",
        "CharacterLiteral",
        "StringLiteral"
    };

    char* types_lit[] = {
        "INT", "DOUBLE", "CHAR", "STRING"
    };

    char* types_prim[] = {
        "int", "double", "char", "String"
    };

    GEN_COSNT_MATH(types_prim, types_class, types_lit, ConstBinaryExp, +, Add);
    GEN_COSNT_MATH(types_prim, types_class, types_lit, ConstBinaryExp, -, Sub);
    GEN_COSNT_MATH(types_prim, types_class, types_lit, ConstBinaryExp, *, Mul);
    GEN_COSNT_MATH(types_prim, types_class, types_lit, ConstBinaryExp, /, Div);
    GEN_COSNT_MATH(types_prim, types_class, types_lit, ConstBinaryExp, ???, Expo);
    GEN_COSNT_MATH(types_prim, types_class, types_lit, ConstBinaryExp, %, Mod);
    
    GEN_LIT(Double, ConstExpNode, DOUBLE);
    GEN_LIT(Integer, ConstExpNode, INT);
    GEN_LIT(String, ConstExpNode, STRING);
    GEN_LIT(Character, ConstExpNode, CHAR);
    GEN_LIT(Boolean, ConstExpNode, BOOLEAN);

	return 0;
}