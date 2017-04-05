package questions;

import utility.Common;
import utility.tree.IntTreeNode;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by Lenny on 05/04/2017.
 */
public class SumofLeftLeaves404 {
    public int sumOfLeftLeaves(IntTreeNode root) {
        // return calSum(root);
        return calSumBFS(root);

    }

    // BFS
    private int calSumBFS(IntTreeNode root) {
        if(root == null || root.getLeft() == null && root.getRight() == null) return 0;
        Queue<IntTreeNode> queue = new LinkedList<>();
        int sum = 0;
        queue.offer(root);

        while(!queue.isEmpty()) {
            IntTreeNode node = queue.poll();
            if(node.getLeft() != null && node.getLeft().getLeft() == null
                    && node.getLeft().getRight() == null) sum += node.getLeft().getVal();
            if(node.getLeft() != null) queue.offer(node.getLeft());
            if(node.getRight() != null) queue.offer(node.getRight());
        }

        return sum;
    }

    // DFS
    private int calSum(IntTreeNode root) {
        if (root == null) return 0;
        int sum = 0;

        if (root.getLeft() != null) {
            if (root.getLeft().getLeft() == null && root.getLeft().getRight() == null) {
                sum += root.getLeft().getVal();
            } else {
                sum += calSum(root.getLeft());
            }
        }

        sum += calSum(root.getRight());
        return sum;
    }
}
