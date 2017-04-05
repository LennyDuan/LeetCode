package questions;

import utility.tree.IntTreeNode;

/**
 * Created by Lenny on 05/04/2017.
 */
public class MinimumDepthofBinaryTree111 {
    public int minDepth(IntTreeNode root) {
        if (root == null) return 0;
        int left = minDepth(root.getLeft());
        int right = minDepth(root.getRight());
        return (left == 0 || right == 0) ? left + right + 1: Math.min(left,right) + 1;
    }
}
