package questions;

/**
 * Created by Lenny on 01/04/2017.
 */
public class NumberComplement476 {
    public int findComplement(int num) {
        return ~num & Integer.highestOneBit(num) - 1;
    }
}

//  00000101
//~ 11111010
//h 00000010
//r 00000010

//  00000 10110111
//  11111 01001000
//  00000 01111111
//  00000 01001000