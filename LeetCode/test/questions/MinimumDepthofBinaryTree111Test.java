package questions;

import org.junit.jupiter.api.Test;
import utility.tree.IntTreeNode;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by Lenny on 05/04/2017.
 */
class MinimumDepthofBinaryTree111Test {
    @Test
    void minDepthOfBinaryTree() {
        IntTreeNode one = new IntTreeNode(0);
        IntTreeNode oneL = new IntTreeNode(1);
        IntTreeNode oneR = new IntTreeNode(2);
        IntTreeNode twoL = new IntTreeNode(3);
        oneR.setLeft(twoL);
        one.setLeft(oneL);
        one.setRight(oneR);

        int act = new MinimumDepthofBinaryTree111().minDepth(one);
        assertEquals(2, act);
    }

    @Test
    void minDepthOfBinaryTree2() {
        IntTreeNode one = new IntTreeNode(0);
        IntTreeNode oneL = new IntTreeNode(1);
        one.setLeft(oneL);

        int act = new MinimumDepthofBinaryTree111().minDepth(one);
        assertEquals(2, act);
    }
}