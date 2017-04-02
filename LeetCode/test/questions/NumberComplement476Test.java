package questions;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


class NumberComplement476Test {

    @Test
    public void testInput1And4() {
        int result = new NumberComplement476().findComplement(5);
        assertEquals(2, result);
    }
}
