import org.junit.Test;

import static org.junit.Assert.*;

public class TwoQueuesAsStack2Test {
    @Test
    public void test1() {
        TwoQueuesAsStack2 stack = new TwoQueuesAsStack2();
        stack.push(1);
        assertEquals(Integer.valueOf(1), stack.pop());
    }

    @Test
    public void test2() {
        TwoQueuesAsStack2 stack = new TwoQueuesAsStack2();
        stack.push(1);
        stack.push(2);
        assertEquals(Integer.valueOf(2), stack.pop());
        assertEquals(Integer.valueOf(1), stack.pop());
    }

    @Test
    public void test3() {
        TwoQueuesAsStack2 stack = new TwoQueuesAsStack2();
        stack.push(1);
        stack.push(3);
        stack.push(2);
        assertEquals(Integer.valueOf(2), stack.pop());
        assertEquals(Integer.valueOf(3), stack.pop());
        assertEquals(Integer.valueOf(1), stack.pop());
    }
}