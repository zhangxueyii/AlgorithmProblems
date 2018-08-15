import org.junit.Test;

import static org.junit.Assert.*;

public class TwoStacksAsQueue1Test {

    @Test
    public void test1() {
        TwoStacksAsQueue1 queue1 = new TwoStacksAsQueue1();
        queue1.add(1);
        assertEquals(Integer.valueOf(1), queue1.remove());
    }

    @Test
    public void test2() {
        TwoStacksAsQueue1 queue1 = new TwoStacksAsQueue1();
        queue1.add(1);
        queue1.add(2);
        assertEquals(Integer.valueOf(1), queue1.remove());
        assertEquals(Integer.valueOf(2), queue1.remove());
    }

    @Test
    public void test3() {
        TwoStacksAsQueue1 queue1 = new TwoStacksAsQueue1();
        queue1.add(1);
        queue1.add(3);
        queue1.add(2);
        assertEquals(Integer.valueOf(1), queue1.remove());
        assertEquals(Integer.valueOf(3), queue1.remove());
        assertEquals(Integer.valueOf(2), queue1.remove());
    }
}