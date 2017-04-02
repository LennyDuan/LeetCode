package questions;
import utility.Common;

/**
 * Created by Lenny on 01/04/2017.
 */
public class HammingDistance461 {
    public int hammingDistance(int x, int y) {
        int diff = x ^ y;
        String[] arr = convertToBinary(diff).split("");
        int dis = 0;
        for(int i = 0; i < arr.length; i ++) {
            if("1".equals(arr[i]))
                dis++;
        }
        return dis;
    }

    private String convertToBinary(int num) {
        Common.sysprint(Integer.toString(num, 2));
        return Integer.toString(num, 2);
    }
}
