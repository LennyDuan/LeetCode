package questions;

/**
 * Created by Lenny on 02/04/2017.
 */
public class MaxConsecutiveOnes485 {
    public int findMaxConsecutiveOnes(int[] nums) {
        int max = 0;
        int start = 0;

        for (int i = 0; i < nums.length; i ++) {
            if(nums[i] == 0) {
                start = i;
            }
            int minus = i - start;
            max = max > minus ? max : minus;
        }

        return max;
    }
}
