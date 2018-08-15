import org.junit.Test;

import static org.junit.Assert.*;

public class TwoStacksAsQueue3Test {
    @Test
    public void test1() {
        TwoStacksAsQueue3 queue1 = new TwoStacksAsQueue3();
        queue1.add(1);
        assertEquals(Integer.valueOf(1), queue1.remove());
    }

    @Test
    public void test2() {
        TwoStacksAsQueue3 queue1 = new TwoStacksAsQueue3();
        queue1.add(1);
        queue1.add(2);
        assertEquals(Integer.valueOf(1), queue1.remove());
        assertEquals(Integer.valueOf(2), queue1.remove());
    }

    @Test
    public void test3() {
        TwoStacksAsQueue3 queue1 = new TwoStacksAsQueue3();
        queue1.add(1);
        queue1.add(3);
        queue1.add(2);
        assertEquals(Integer.valueOf(1), queue1.remove());
        assertEquals(Integer.valueOf(3), queue1.remove());
        assertEquals(Integer.valueOf(2), queue1.remove());
    }

    @Test
    public void test4() {
        TwoStacksAsQueue3 queue1 = new TwoStacksAsQueue3();
        queue1.add(1);
        queue1.add(3);
        assertEquals(Integer.valueOf(1), queue1.remove());
        assertEquals(Integer.valueOf(3), queue1.remove());
        queue1.add(2);
        queue1.add(2);
        queue1.add(5);
        queue1.add(4);
        assertEquals(Integer.valueOf(2), queue1.remove());
        assertEquals(Integer.valueOf(2), queue1.remove());
        assertEquals(Integer.valueOf(5), queue1.remove());
        assertEquals(Integer.valueOf(4), queue1.remove());
    }
}