package questions;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by Lenny on 04/04/2017.
 */
class MinStack155Test {

    static MinStack155 stack = new MinStack155();

    @BeforeAll
    static void setup() {
        stack.push(0);
        stack.push(-1);
        stack.push(1);
        stack.push(2);
    }

    @Test
    void test() {
        assertEquals(2, stack.top());
        stack.pop();
        assertEquals(1, stack.top());
        assertEquals(-1, stack.getMin());

    }

    @Test
    void testSecond() {
        stack = new MinStack155();
        stack.push(-2);
        stack.push(-0);
        stack.push(-3);
        assertEquals(-3, stack.getMin());
        stack.pop();
        assertEquals(0, stack.top());
        assertEquals(-2, stack.getMin());
    }

}