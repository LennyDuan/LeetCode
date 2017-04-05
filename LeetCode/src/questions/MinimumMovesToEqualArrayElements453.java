package questions;

/**
 * Created by Lenny on 05/04/2017.
 */
public class MinimumMovesToEqualArrayElements453 {
    public int minMoves(int[] nums) {
        int sum = 0;
        int min = nums[0];

        for (int num : nums) {
            if (num < min) min = num;;
        }
        for (int num : nums) {
            sum += num - min;
        }

        return sum;
    }
}
