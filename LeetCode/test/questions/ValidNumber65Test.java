package questions;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by Lenny on 03/04/2017.
 */
class ValidNumber65Test {

    ValidNumber65 validNumber65 = new ValidNumber65();

    @Test
    void test0() {
        assertTrue(validNumber65.isNumber("0"));
    }
    @Test
    void test0dot1() {
        assertTrue(validNumber65.isNumber(" 0.1 "));
    }
    @Test
    void testabc() {
        assertFalse(validNumber65.isNumber("abc"));
    }
    @Test
    void test1spa() {
        assertFalse(validNumber65.isNumber("1 a"));
    }
    @Test
    void test2e10() {
        assertTrue(validNumber65.isNumber("2e10"));
    }

}