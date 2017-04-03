package questions;

import utility.Common;

/**
 * Created by Lenny on 03/04/2017.
 */
public class ComplexNumberMultiplication537 {
    public String complexNumberMultiply(String a, String b) {
        String[] aArr = a.split("\\+");
        String[] bArr = b.split("\\+");
        int aF = Integer.valueOf(aArr[0]);
        int bF = Integer.valueOf(bArr[0]);
        int aS = Integer.valueOf(aArr[1].substring(0, aArr[1].length()-1));
        int bS = Integer.valueOf(bArr[1].substring(0, bArr[1].length()-1));

        Common.sysprint("First: " + aF + "+" + aS + "i");
        Common.sysprint("Second: " + bF + "+" + bS + "i");

        int first = aF * bF - (aS * bS);
        int second = aF * bS + bF * aS;
        return first + "+" + second +"i";
    }
}
