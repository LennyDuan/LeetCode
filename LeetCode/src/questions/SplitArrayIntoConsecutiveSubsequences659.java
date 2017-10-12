package questions;

import java.util.*;

/**
 * Created by Lenny on 12/10/2017.
 */
public class SplitArrayIntoConsecutiveSubsequences659 {
    public boolean isPossible(int[] nums) {

        int size = nums.length;
        int[] a = nums;
        if (size < 3) return false;
        for (int i = 1; i < nums.length - 1;) {
            if (a[i] == a[i - 1]) {
                if (size < i + 3) {
                    return false;
                } else {
                    if (i > 1) {
                        if (a[i] - 2 > a[i - 2]) return false;
                        i += 2;
                        if (a[i] - 2 > a[i - 2]) return false;
                    } else {
                        if (a[i] - 1 > a[i - 1]) return false;
                        i ++;
                        if (a[i + 4] - 3 > a[i]) return false;
                    }
                }
            }
            else
                i++;
        }

        return true;
    }
}
