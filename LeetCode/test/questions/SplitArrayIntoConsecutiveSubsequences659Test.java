package questions;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by Lenny on 12/10/2017.
 */
class SplitArrayIntoConsecutiveSubsequences659Test {
    @Test
    void isPossibleOne() {
        assertTrue(new SplitArrayIntoConsecutiveSubsequences659().
                isPossible(new int[]{1, 2 ,3 , 4, 5, 6})
        );
    }
    @Test
    void isPossibleTwo() {
        assertTrue(new SplitArrayIntoConsecutiveSubsequences659().
                isPossible(new int[]{1, 2 , 3, 3, 4, 4, 5, 5})
        );
    }
    @Test
    void isPossibleThree() {
        assertFalse(new SplitArrayIntoConsecutiveSubsequences659().
                isPossible(new int[]{1, 2 ,3 , 4, 4, 5})
        );
    }

    @Test
    void isPossible4() {
        assertFalse(new SplitArrayIntoConsecutiveSubsequences659().
                isPossible(new int[]{1, 2 ,3 , 4, 5, 6, 6, 8, 9, 9})
        );
    }

    @Test
    void isPossible5() {
        assertFalse(new SplitArrayIntoConsecutiveSubsequences659().
                isPossible(new int[]{2,5,5,5,6,7,8,8,8,9})
        );
    }

    @Test
    void isPossible6() {
        assertFalse(new SplitArrayIntoConsecutiveSubsequences659().
                isPossible(new int[]{2,2,2,3,4,6,7,8,9,9})
        );
    }
}