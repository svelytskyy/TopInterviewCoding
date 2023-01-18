package problem35_is_bst;

//iterative in-order

import java.util.ArrayDeque;
import java.util.Deque;

public class Solution4 {
	
    public boolean isValidBST(TreeNode<Integer> root) {
        Deque<TreeNode<Integer>> stack = new ArrayDeque<>();
        Integer prev = null;

        while (!stack.isEmpty() || root != null) {
            while (root != null) {
                stack.push(root);
                root = root.getLeft();
            }
            root = stack.pop();
            if (prev != null && root.getVal() <= prev) {
                return false;
            }
            prev = root.getVal();
            System.out.print(prev +  " ");
            root = root.getRight();
        }
        return true;
    }

}
