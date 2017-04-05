package questions;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by Lenny on 05/04/2017.
 */
class TwoSumIIInputArrayisSorted167Test {
    @Test
    void twoSum() {
        int[] input = {2, 7, 11, 15};
        int target = 9;
        int[] act = new TwoSumIIInputArrayisSorted167().twoSum(input, target);
        int[] exp = {1, 2};
        assertArrayEquals(exp, act);
    }

    @Test
    void twoSum2() {
        int[] input = {2, 7, 11, 15};
        int target = 13;
        int[] act = new TwoSumIIInputArrayisSorted167().twoSum(input, target);
        int[] exp = {1, 3};
        assertArrayEquals(exp, act);
    }

    @Test
    void twoSum3() {
        int[] input = {2, 7, 11, 15};
        int target = 18;
        int[] act = new TwoSumIIInputArrayisSorted167().twoSum(input, target);
        int[] exp = {2, 3};
        assertArrayEquals(exp, act);
    }

    @Test
    void twoSum4() {
        int[] input = {2, 7, 11, 15};
        int target = 26;
        int[] act = new TwoSumIIInputArrayisSorted167().twoSum(input, target);
        int[] exp = {3, 4};
        assertArrayEquals(exp, act);
    }

    @Test
    void twoSum5() {
        int[] input = {3,24,50,79,88,150,345};
        int target = 200;
        int[] act = new TwoSumIIInputArrayisSorted167().twoSum(input, target);
        int[] exp = {3, 6};
        assertArrayEquals(exp, act);
    }

}