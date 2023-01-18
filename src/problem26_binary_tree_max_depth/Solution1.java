package problem26_binary_tree_max_depth;

public class Solution1 {
	//DFS
	public int maxDepth(TreeNode<Integer> root) {
		if(root == null) return 0;
		return Math.max(maxDepth(root.getLeft()), maxDepth(root.getRight()))+ 1;
		
	}

}
