package questions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by Lenny on 03/04/2017.
 */
class EncodeAndDecodeTinyURL535Test {

    EncodeAndDecodeTinyURL535 encodeAndDecodeTinyURL535 = new EncodeAndDecodeTinyURL535();

    @Test
    void test() {
        assertEquals("0",
                encodeAndDecodeTinyURL535.encode("https://leetcode.com/problems/design-tinyurl"));
        assertEquals("https://leetcode.com/problems/design-tinyurl",
                encodeAndDecodeTinyURL535.decode("0"));
    }

}