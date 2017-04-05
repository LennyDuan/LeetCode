package questions;

import utility.Common;

/**
 * Created by Lenny on 05/04/2017.
 */
public class TwoSumIIInputArrayisSorted167 {
    public int[] twoSum(int[] numbers, int target) {
        int[] result = new int[2];
        int start = 0;
        int end = numbers.length - 1;
        if (numbers == null || numbers.length < 2) return result;

        while(start < end) {
            int total = numbers[start] + numbers[end];
            if (target == total) {
                result[0] = start + 1;
                result[1] = end + 1;
                break;
            } else if (target < total) {
                end --;
            } else if (target > total) {
                start ++;
            }
        }
        return result;
    }
}
