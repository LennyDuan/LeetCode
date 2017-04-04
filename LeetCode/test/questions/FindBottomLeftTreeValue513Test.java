package questions;

import org.junit.jupiter.api.Test;
import utility.tree.IntTreeNode;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by Lenny on 04/04/2017.
 */
class FindBottomLeftTreeValue513Test {

    @Test
    void test() {
        IntTreeNode one = new IntTreeNode(2);
        IntTreeNode oneL = new IntTreeNode(1);
        IntTreeNode oneR = new IntTreeNode(3);
        one.setLeft(oneL);
        one.setRight(oneR);

        assertEquals(1, new FindBottomLeftTreeValue513().findBottomLeftValue(one));
    }
}