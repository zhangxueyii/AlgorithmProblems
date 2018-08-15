import java.util.Stack;

public class TwoStacksAsQueue1 {
    private Stack<Integer> stackMain = new Stack<>();
    private Stack<Integer> stackSlave = new Stack<>();

    public void add(Integer elem) {

        while (!stackMain.isEmpty()) {
            stackSlave.push(stackMain.pop());
        }

        stackMain.push(elem);

        while (!stackSlave.isEmpty()) {
            stackMain.push(stackSlave.pop());
        }
    }

    public Integer remove() {
        return stackMain.pop();
    }
}
