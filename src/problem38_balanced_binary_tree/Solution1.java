package problem38_balanced_binary_tree;

public class Solution1 {

	public boolean isBalanced(TreeNode<Integer> root) { 
		if (root == null){ 
			return true; 
		} 
			if (Math.abs(height(root.getLeft()) - height(root.getRight())) > 1) { 
				return false; 
			} else { 
				return isBalanced(root.getLeft()) && isBalanced(root.getRight()); 
			} 
		}
	private int height(TreeNode<Integer> root) { 
		if (root == null) { 
			return 0; 
		} 
		return Math.max(height(root.getLeft()), height(root.getRight())) + 1; 
	} 
	
}
