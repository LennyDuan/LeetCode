package questions;

import utility.tree.IntTreeNode;

/**
 * Created by Lenny on 05/04/2017.
 */
public class DiameterofBinaryTree543 {

    int max = 0;
    public int diameterOfBinaryTree(IntTreeNode root) {
        maxDepth(root);
        return max;
    }

    private int maxDepth(IntTreeNode root) {
        if(root == null) return 0;

        int left = (maxDepth(root.getLeft()));
        int right = (maxDepth(root.getRight()));

        max = Math.max(max, left + right);

        return Math.max(left, right) + 1;
    }
}
