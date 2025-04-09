package ch.compiler.AST.statement.jumps.loop;

public class ContinueNode extends LoopJump {

    @Override
    public String toString(int depth) {
        return "".repeat(depth) + "Continue" + position;
    }

}
