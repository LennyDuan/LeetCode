package questions;

import utility.Common;
import utility.tree.IntTreeNode;

/**
 * Created by Lenny on 02/04/2017.
 */
public class MinimumAbsoluteDifferenceinBST530 {
    public int getMinimumDifference(IntTreeNode root) {
        int min = 0;

        int s = root.getVal();
        int ss = root.getVal();
        s = findMin(root, 0, s);
        boolean twoSame = false;
        ss = findMin(root, s, 2);
        Common.sysprint("Min: " + s + " | Second min: " + ss);
        return ss - s;
    }

    private int findMin(IntTreeNode root, int ignore, int result) {
        if(root.getLeft() == null && root.getRight() == null) {
            if(root.getVal() < result && root.getVal() != ignore) {
                result = root.getVal();
            }
        }
        if (root.getLeft() != null){
            result = findMin(root.getLeft(), ignore, result);
        }
        if (root.getRight() != null){
            result = findMin(root.getRight(), ignore, result);
        }
        return result;
    }
}

