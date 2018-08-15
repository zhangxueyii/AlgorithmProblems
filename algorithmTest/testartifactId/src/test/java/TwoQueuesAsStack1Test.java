import org.junit.Test;

import static org.junit.Assert.*;

public class TwoQueuesAsStack1Test {
    @Test
    public void test1() {
        TwoQueuesAsStack1 stack = new TwoQueuesAsStack1();
        stack.push(1);
        assertEquals(Integer.valueOf(1), stack.pop());
    }

    @Test
    public void test2() {
        TwoQueuesAsStack1 stack = new TwoQueuesAsStack1();
        stack.push(1);
        stack.push(2);
        assertEquals(Integer.valueOf(2), stack.pop());
        assertEquals(Integer.valueOf(1), stack.pop());
    }

    @Test
    public void test3() {
        TwoQueuesAsStack1 stack = new TwoQueuesAsStack1();
        stack.push(1);
        stack.push(3);
        stack.push(2);
        assertEquals(Integer.valueOf(2), stack.pop());
        assertEquals(Integer.valueOf(3), stack.pop());
        assertEquals(Integer.valueOf(1), stack.pop());
    }
}