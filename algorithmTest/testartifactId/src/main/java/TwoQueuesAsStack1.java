import com.sun.tools.javac.util.ListBuffer;

import java.util.Queue;

/*
This approach: Move elements in queue when pushing in new element.
 */
public class TwoQueuesAsStack1 {
    Queue<Integer> queueSlave = new ListBuffer();
    Queue<Integer> queueMaster = new ListBuffer();

    public void push(Integer element) {

        queueSlave.add(element);

        while (!queueMaster.isEmpty()) {
            queueSlave.add(queueMaster.poll());
        }

        Queue<Integer> queue = queueSlave;
        queueSlave = queueMaster;
        queueMaster = queue;
    }

    public Integer pop() {
        if (queueMaster.isEmpty()) {
            return null;
        }

        return queueMaster.poll();
    }
}
