package questions;

import utility.Common;

import javax.swing.tree.TreeNode;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Lenny on 02/04/2017.
 */
public class FindAllNumbersDisappearedinanArray448 {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> result = new ArrayList<>();

        int max = 1;

        for (int num1 : nums) {
            max = max > num1 ? max : num1;
        }

        int[] arr = new int[max + 1];

        for (int num : nums) {
            arr[num] = 1;
        }

        for(int i = 1; i < max; i ++) {
            if(arr[i] != 1) {
                result.add(i);
            }
        }
        return result;
    }
}
