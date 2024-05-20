package ch.compiler.misc.AST.nodes.symbolTable;

public enum DataType {

    CLASS {
        @Override
        public String toString() {
            return "class";
        }
    }, STRING {
        @Override
        public String toString() {
            return "String";
        }
    }, CHAR {
        @Override
        public String toString() {
            return "char";
        }
    }, INT {
        @Override
        public String toString() {
            return "int";
        }
    }, DOUBLE {
        @Override
        public String toString() {
            return "double";
        }
    }, BOOLEAN {
        @Override
        public String toString() {
            return "boolean";
        }
    }, VOID {
        @Override
        public String toString() {
            return "void";
        }
    }, ARRAY {
        @Override
        public String toString() {
            return "array";
        }
    }

}
