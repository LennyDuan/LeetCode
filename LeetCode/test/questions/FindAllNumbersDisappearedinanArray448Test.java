package questions;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by Lenny on 02/04/2017.
 */
class FindAllNumbersDisappearedinanArray448Test {

    @Test
    public void testInput() {
        int[] data = {4,3,2,7,8,2,3,1};
        List<Integer> result = new FindAllNumbersDisappearedinanArray448()
                .findDisappearedNumbers(data);

        Integer[] output = {5, 6};
        List<Integer> exp = Arrays.asList(output);
        assertEquals(exp, result);
    }
}