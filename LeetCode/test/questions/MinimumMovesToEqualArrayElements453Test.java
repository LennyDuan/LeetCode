package questions;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by Lenny on 05/04/2017.
 */
class MinimumMovesToEqualArrayElements453Test {
    @Test
    void minMoves() {
        int[] data = {1, 2, 3};
        int act = new MinimumMovesToEqualArrayElements453().minMoves(data);
        assertEquals(3 ,act);
    }

}