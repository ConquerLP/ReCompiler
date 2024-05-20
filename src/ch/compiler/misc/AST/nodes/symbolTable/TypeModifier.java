package ch.compiler.misc.AST.nodes.symbolTable;

public enum TypeModifier {

    FINAL {
        @Override
        public String toString() {
            return "final";
        }
    },

    NONE {
        @Override
        public String toString() {
            return "";
        }
    }

}
