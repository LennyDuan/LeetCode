package questions;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by Lenny on 03/04/2017.
 */
class ComplexNumberMultiplication537Test {

    ComplexNumberMultiplication537 com = new ComplexNumberMultiplication537();

    @Test
    void testOne() {
        String result = com.complexNumberMultiply("1+1i", "1+1i");
        assertEquals("0+2i", result);
    }

    @Test
    void testTwo() {
        String result = com.complexNumberMultiply("1+-1i", "1+-1i");
        assertEquals("0+-2i", result);
    }

    @Test
    void testThree() {
        String result = com.complexNumberMultiply("1+-1i", "0+0i");
        assertEquals("0+0i", result);
    }
}