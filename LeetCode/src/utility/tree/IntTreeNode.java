package utility.tree;

/**
 * Created by Lenny on 02/04/2017.
 */
public class IntTreeNode {
    public int getVal() {
        return val;
    }

    public void setVal(int val) {
        this.val = val;
    }

    int val;

    public IntTreeNode getLeft() {
        return left;
    }

    public void setLeft(IntTreeNode left) {
        this.left = left;
    }

    public IntTreeNode getRight() {
        return right;
    }

    public void setRight(IntTreeNode right) {
        this.right = right;
    }

    IntTreeNode left;
    IntTreeNode right;

    public IntTreeNode(int val) {
        this.val = val;
    }
}
