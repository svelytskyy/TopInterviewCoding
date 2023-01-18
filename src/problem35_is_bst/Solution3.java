package problem35_is_bst;

//recursive : in-order

public class Solution3 {
	
	   private Integer prev;

	    public boolean isValidBST(TreeNode<Integer> root) {
	        prev = null;
	        return inorder(root);
	    }

	    private boolean inorder(TreeNode<Integer> root) {
	        if (root == null) {
	            return true;
	        }
	        if (!inorder(root.getLeft())) {
	            return false;
	        }
	        if (prev != null && root.getVal() <= prev) {
	            return false;
	        }
	        prev = root.getVal();
	        System.out.print(prev + " ");
	        if (!inorder(root.getRight())) {
	            return false;
	        }
	        return true;
	    }

}
