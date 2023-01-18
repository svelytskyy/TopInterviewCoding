package problem29_same_binary_trees;

public class Solution1 {
	
	  public boolean isSameTree(TreeNode<Integer> root1, TreeNode<Integer> root2) {
		    if (root1 == null && root2 == null) return true;
		    if (root1 == null || root2 == null) return false;
		    if (root1.getVal() != root2.getVal()) return false;
		    return isSameTree(root1.getRight(), root2.getRight()) &&
		           isSameTree(root1.getLeft(), root2.getLeft());
	  }

}
