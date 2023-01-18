package problem34_symmetric_binary_tree;

//DFS
public class Solution1 {
	
	public boolean isSymmetric(TreeNode<Integer> root) {
		return isMirror(root, root);
	}
	
	private boolean isMirror(TreeNode<Integer> node1, TreeNode<Integer> node2) {
		
		if(node1 == null && node2 == null) return true;
		if(node1 == null || node2 == null) return false;
		
		return (node1.getVal() == node2.getVal()) &&
				isMirror(node1.getLeft(), node2.getRight()) &&
				isMirror(node1.getRight(), node2.getLeft());
	}

}
