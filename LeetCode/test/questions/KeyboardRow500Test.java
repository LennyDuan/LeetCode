package questions;

import org.junit.jupiter.api.Test;
import utility.Common;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by Lenny on 01/04/2017.
 */
class KeyboardRow500Test {
    @Test
    public void testStringArr() {
        String[] arr = new String[]{"Hello", "Alaska", "Dad", "Peace"};
        String[] result = new KeyboardRow500().findWords(arr);
        String[] exp = new String[]{"Alaska", "Dad"};
        assertArrayEquals(exp, result);
    }

    @Test
    public void testStringArrReg() {
        String[] arr = new String[]{"Hello", "Alaska", "Dad", "Peace"};
        String[] result = new KeyboardRow500().findWords(arr);
        String[] exp = new String[]{"Alaska", "Dad"};
        assertArrayEquals(exp, result);
    }
}