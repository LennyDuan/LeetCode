package questions;

import org.junit.jupiter.api.Test;
import utility.tree.IntTreeNode;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by Lenny on 05/04/2017.
 */
class DiameterofBinaryTree543Test {
    @Test
    void diameterOfBinaryTree() {
        IntTreeNode one = new IntTreeNode(0);
        IntTreeNode oneL = new IntTreeNode(1);
        IntTreeNode oneR = new IntTreeNode(2);
        IntTreeNode twoL = new IntTreeNode(3);
        oneR.setLeft(twoL);
        one.setLeft(oneL);
        one.setRight(oneR);

        int act = new DiameterofBinaryTree543().diameterOfBinaryTree(one);
        assertEquals(3, act);
    }

}