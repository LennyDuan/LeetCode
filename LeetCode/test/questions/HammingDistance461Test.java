package questions;

import org.junit.jupiter.api.Test;
import utility.Common;

import static org.junit.jupiter.api.Assertions.*;

class HammingDistance461Test {

    @Test
    public void testInput1And4() {
        int result = new HammingDistance461().hammingDistance(1,4);
        assertEquals(2, result);
    }

    @Test
    public void testInput4And14() {
        int result = new HammingDistance461().hammingDistance(4,14);
        Common.sysprint("2 should be the result: " + result);
        assertEquals(2, result);
    }

    @Test
    public void testInput4And2() {
        int result = new HammingDistance461().hammingDistance(4,2);
        Common.sysprint("2 should be the result: " + result);
        assertEquals(2, result);
    }
}