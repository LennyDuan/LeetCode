package questions;

/**
 * Created by Lenny on 05/04/2017.
 */
public class LongestPalindrome409 {
    public int longestPalindrome(String s) {
        int sum = 0;
        int[] arr = new int[122];

        for(char ch : s.toCharArray()) {
                arr[ch - 'A'] ++;
        }

        boolean has = false;
        for(int i = 0; i < arr.length; i ++) {
            if( arr[i] % 2 == 0) {
                sum += arr[i];
            } else {
                sum += arr[i] - 1;
                has = true;
            }
        }

        return has ? sum + 1 : sum;
    }
}
