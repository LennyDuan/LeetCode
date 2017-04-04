package questions;

import utility.Common;

/**
 * Created by Lenny on 04/04/2017.
 */
public class CountingBits338 {
    public int[] countBits(int num) {
        int[] arr = new int[num + 1];

        for(int i = 0; i <= num; i++) {
            arr[i] = arr[i >> 1] + (1 & i);
        }

        return arr;
    }
}
