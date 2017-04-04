package questions;

import utility.tree.IntTreeNode;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

/**
 * Created by Lenny on 04/04/2017.
 */
public class FindBottomLeftTreeValue513 {
    public int findBottomLeftValue(IntTreeNode root) {
        int bot = 0;
        Queue<IntTreeNode> queue = new LinkedList<>();
        queue.add(root);

        while(!queue.isEmpty()) {
            IntTreeNode obj = queue.poll();
            if(obj.getRight() != null) {
                queue.add(obj.getRight());
            }

            if(obj.getLeft() != null) {
                queue.add(obj.getLeft());
            }
            bot = obj.getVal();
        }
        return bot;
    }
}
