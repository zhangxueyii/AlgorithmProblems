import com.sun.tools.javac.util.ListBuffer;

import java.util.Queue;

public class TwoQueuesAsStack2 {
    Queue<Integer> queueMaster = new ListBuffer();
    Queue<Integer> queueSlave = new ListBuffer<>();

    public void push(Integer elem) {
        queueMaster.add(elem);
    }

    public Integer pop() {
        if (queueMaster.isEmpty()) {
            return null;
        }

        while (queueMaster.size() > 1) {
            queueSlave.add(queueMaster.poll());
        }

        Integer result = queueMaster.poll();

        Queue<Integer> queue = queueMaster;
        queueMaster = queueSlave;
        queueSlave = queue;

        return result;
    }
}
