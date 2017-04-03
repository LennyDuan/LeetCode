package questions;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Lenny on 02/04/2017.
 */
public class FizzBuzz412 {
    public List<String> fizzBuzz(int n) {
        List<String> arr = new ArrayList<>();

        for(int i = 1; i < n + 1; i++) {
            arr.add(setNum(i));
        }
        return arr;
    };

    public String setNum(int num) {
        if(num % 3 == 0 && num % 5 ==0) {
            return "FizzBuzz";
        } else if (num % 3 == 0) {
            return "Fizz";
        } else if (num % 5 == 0) {
            return "Buzz";
        } else {
            return String.valueOf(num);
        }
    }
}
