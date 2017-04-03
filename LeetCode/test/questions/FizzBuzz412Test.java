package questions;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by Lenny on 02/04/2017.
 */
class FizzBuzz412Test {

    @Test
    public void testInput15() {
        List<java.lang.String> result = new FizzBuzz412().fizzBuzz(15);
        String[] data = new String[]{
                "1",
                "2",
                "Fizz",
                "4",
                "Buzz",
                "Fizz",
                "7",
                "8",
                "Fizz",
                "Buzz",
                "11",
                "Fizz",
                "13",
                "14",
                "FizzBuzz"};
        List<String> exp = Arrays.asList(data);
        assertEquals(exp, result);
    }
}