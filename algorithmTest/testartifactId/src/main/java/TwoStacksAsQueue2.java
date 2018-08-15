import java.util.Stack;

public class TwoStacksAsQueue2 {
    private Stack<Integer> stackMaster = new Stack<>();
    private Stack<Integer> stackSlave = new Stack<>();

    public void add(Integer elem) {
        stackMaster.push(elem);
    }

    public Integer remove() {
        if (stackMaster.isEmpty()) {
            return null;
        }

        while (stackMaster.size() > 1) {
            stackSlave.push(stackMaster.pop());
        }

        Integer result = stackMaster.pop();

        while (!stackSlave.isEmpty()) {
            stackMaster.push(stackSlave.pop());
        }

        return result;
    }
}
