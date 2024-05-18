package ch.compiler.misc.nodes.symbolTable;

public enum Access {
    PRIVATE {
        @Override
        public String toString() {
            return "private";
        }
    }, PROTECTED {
        @Override
        public String toString() {
            return "protected";
        }
    }, PUBLIC {
        @Override
        public String toString() {
            return "public";
        }
    };
}
