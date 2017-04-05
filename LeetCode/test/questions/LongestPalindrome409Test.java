package questions;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by Lenny on 05/04/2017.
 */
class LongestPalindrome409Test {
    @Test
    void longestPalindrome() {
        assertEquals(7, new LongestPalindrome409().longestPalindrome("abccccdd"));
        assertEquals(6, new LongestPalindrome409().longestPalindrome("AAAAAA"));
    }

}