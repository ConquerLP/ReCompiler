package ch.compiler.misc.AST.nodes.symbolTable;

import java.util.ArrayList;
import java.util.List;

public class Type {

    private List<Integer> dims;
    private TypeModifier typeModifier;
    private DataType dataType;

    public Type(String type) {
        dims = new ArrayList<>();
        setUpType(type);
    }

    public void setTypeModifier(TypeModifier typeModifier) {
        this.typeModifier = typeModifier;
    }

    public void addDim(int dim) {
        dims.add(dim);
        if(dims.size() > 1) {
            dataType = DataType.ARRAY;
        }
    }

    public DataType getType() {
        return dataType;
    }

    private void setUpType(String type) {
        switch (type) {
            case "int": {
                this.dataType = DataType.INT;
            }
            break;
            case "double": {
                this.dataType = DataType.DOUBLE;
            }
            break;
            case "String": {
                this.dataType = DataType.STRING;
            }
            break;
            case "char": {
                this.dataType = DataType.CHAR;
            }
            break;
            case "boolean": {
                this.dataType = DataType.BOOLEAN;
            }
            break;
            case "void": {
                this.dataType = DataType.VOID;
            }
            break;
            default:
                this.dataType = DataType.CLASS;
        }
    }

}
