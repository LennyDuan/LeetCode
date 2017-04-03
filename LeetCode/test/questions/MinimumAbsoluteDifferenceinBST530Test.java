package questions;

import org.junit.jupiter.api.Test;
import utility.tree.IntTreeNode;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by Lenny on 02/04/2017.
 */
class MinimumAbsoluteDifferenceinBST530Test {

    @Test
    public void test() {
        IntTreeNode root = new IntTreeNode(1);
        IntTreeNode rightFirst = new IntTreeNode(3);
        IntTreeNode leftSecond = new IntTreeNode(2);
        rightFirst.setLeft(leftSecond);
        root.setRight(rightFirst);

        int result = new MinimumAbsoluteDifferenceinBST530().getMinimumDifference(root);
        assertEquals(1, result);
    }

}