package questions;

/**
 * Created by Lenny on 12/04/2017.
 */
public class ReverseWordsinaStringIII557 {
    public String reverseWords(String s) {
        String[] arr = s.split(" ");
        String result = "";
        for (String ele : arr) {
            result += new StringBuffer(ele).reverse().toString() + " ";
        }

        return result.trim();
    }
}
