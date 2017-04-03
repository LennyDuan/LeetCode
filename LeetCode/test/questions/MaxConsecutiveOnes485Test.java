package questions;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by Lenny on 02/04/2017.
 */
class MaxConsecutiveOnes485Test {

    @Test
    public void testOne() {
        int[] data = {1, 1, 0, 1, 1, 1};
        int result = new MaxConsecutiveOnes485().findMaxConsecutiveOnes(data);
        assertEquals(3, result);
    }

    @Test
    public void testTwo() {
        int[] data = {1, 1, 0, 1, 1, 1, 1, 0, 1, 1, 0, 0, 0, 1, 1, 1, 1};
        int result = new MaxConsecutiveOnes485().findMaxConsecutiveOnes(data);
        assertEquals(4, result);
    }

    @Test
    public void testThree() {
        int[] data = {0, 0, 1, 1, 0, 1, 1, 1, 1, 1, 0, 1, 1, 0, 0, 0, 1, 1, 1, 1};
        int result = new MaxConsecutiveOnes485().findMaxConsecutiveOnes(data);
        assertEquals(5, result);
    }

    @Test
    public void testZero() {
        int[] data = {0, 0};
        int result = new MaxConsecutiveOnes485().findMaxConsecutiveOnes(data);
        assertEquals(0, result);
    }
}