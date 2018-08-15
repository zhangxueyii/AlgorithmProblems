import java.util.Stack;

public class TwoStacksAsQueue3 {
    private Stack<Integer> stackMaster = new Stack<>();
    private Stack<Integer> stackSlave = new Stack<>();

    public void add(Integer elem) {
        stackMaster.push(elem);
    }

    public Integer remove() {
        if (stackMaster.isEmpty() && stackSlave.isEmpty()) {
            return null;
        }

        if (stackSlave.isEmpty()) {
            while (!stackMaster.isEmpty()) {
                stackSlave.push(stackMaster.pop());
            }
        }

        return stackSlave.pop();
    }
}
