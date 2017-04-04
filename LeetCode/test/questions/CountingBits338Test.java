package questions;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by Lenny on 04/04/2017.
 */
class CountingBits338Test {
    @Test
    void countBits() {
        int[] result = {0,1,1,2,1,2};
        assertArrayEquals(result, new CountingBits338().countBits(5));
    }

}