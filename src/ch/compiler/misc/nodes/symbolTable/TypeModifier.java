package ch.compiler.misc.nodes.symbolTable;

public enum TypeModifier {

    STATIC {
        @Override
        public String toString() {
            return "static";
        }
    },

    FINAL {
        @Override
        public String toString() {
            return "final";
        }
    },

}
