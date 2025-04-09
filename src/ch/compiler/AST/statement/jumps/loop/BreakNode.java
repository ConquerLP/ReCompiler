package ch.compiler.AST.statement.jumps.loop;

public class BreakNode extends LoopJump {

    @Override
    public String toString(int depth) {
        return " ".repeat(depth) + "Break" + position;
    }

}
