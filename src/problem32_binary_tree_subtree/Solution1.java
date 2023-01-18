package problem32_binary_tree_subtree;

public class Solution1 {
	
	public boolean isSubtree(TreeNode<Integer> root, TreeNode<Integer> subRoot) {
		
		if(root == null) return false;
		if(isIdentical(root, subRoot)) return true;
		
		return isSubtree(root.getLeft(), subRoot) || isSubtree(root.getRight(), subRoot);
	}
	
	private boolean isIdentical(TreeNode<Integer> node1, TreeNode<Integer> node2) {
			
			if(node1 == null || node2 == null) {
				return node1 == null && node2 == null;
			}
			
			return node1.getVal() == node2.getVal() && isIdentical(node1.getLeft(), node2.getLeft()) &&
					isIdentical(node1.getRight(), node2.getRight());
		}
	
	}
