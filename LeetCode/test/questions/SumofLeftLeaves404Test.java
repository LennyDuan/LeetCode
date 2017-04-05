package questions;

import org.junit.jupiter.api.Test;
import utility.tree.IntTreeNode;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by Lenny on 05/04/2017.
 */
class SumofLeftLeaves404Test {
    @Test
    void sumOfLeftLeaves() {
        IntTreeNode one = new IntTreeNode(3);
        IntTreeNode oneL = new IntTreeNode(9);
        IntTreeNode oneR = new IntTreeNode(20);
        IntTreeNode twoL = new IntTreeNode(15);
        IntTreeNode twoR = new IntTreeNode(7);
        oneR.setLeft(twoL);
        oneR.setRight(twoR);
        one.setLeft(oneL);
        one.setRight(oneR);
        int sum = new SumofLeftLeaves404().sumOfLeftLeaves(one);
        assertEquals(24, sum);
    }

}