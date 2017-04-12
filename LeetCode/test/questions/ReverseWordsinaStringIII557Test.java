package questions;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by Lenny on 12/04/2017.
 */
class ReverseWordsinaStringIII557Test {
    ReverseWordsinaStringIII557 reverseWord = new ReverseWordsinaStringIII557();
    @Test
    void reverseWords() {
        assertEquals("s'teL ekat edoCteeL tsetnoc", reverseWord.reverseWords("Let's take LeetCode contest"));
    }

}