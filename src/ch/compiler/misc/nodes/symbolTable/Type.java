package ch.compiler.misc.nodes.symbolTable;

import ch.compiler.misc.nodes.expression.ExpressionNode;

import java.util.ArrayList;
import java.util.List;

public class Type {

    private List<Integer> dims;
    private int type;
    public final static int UNKNOWN_DIM = -1;
    private boolean isArray;
    private TypeModifier typeModifier;

    public Type(String type) {
        dims = new ArrayList<>();
        setUpType(type);
        isArray = false;
    }

    public void setTypeModifier(TypeModifier typeModifier) {
        this.typeModifier = typeModifier;
    }

    public List<Integer> getDims() {
        return dims;
    }

    public boolean isArray() {
        return isArray;
    }

    public void addDim(int dim) {
        dims.add(dim);
        isArray = dims.size() > 1 ? true : false;
    }

    public int getType() {
        return type;
    }

    private void setUpType(String type) {
        switch (type) {
            case "int": {
                this.type = ExpressionNode.INT;
            }
            break;
            case "double": {
                this.type = ExpressionNode.DOUBLE;
            }
            break;
            case "String": {
                this.type = ExpressionNode.STRING;
            }
            break;
            case "char": {
                this.type = ExpressionNode.CHAR;
            }
            break;
            case "boolean": {
                this.type = ExpressionNode.BOOLEAN;
            }
            break;
            case "void": {
                this.type = ExpressionNode.VOID;
            }
            break;
            default:
                this.type = ExpressionNode.CLASS;
        }
    }

}
