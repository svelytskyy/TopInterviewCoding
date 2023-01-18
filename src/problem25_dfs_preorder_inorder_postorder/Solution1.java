package problem25_dfs_preorder_inorder_postorder;

public class Solution1 {
	
	public void traversePreOrder(TreeNode<Integer> node) {
		if (node != null) {
			System.out.print(" " + node.getVal()); 
			traversePreOrder(node.getLeft());
			traversePreOrder(node.getRight()); 
		}
	}
	
	public void traverseInOrder(TreeNode<Integer> node) { 
		if (node != null) {
			traverseInOrder(node.getLeft()); 
			System.out.print(" " + node.getVal()); 
			traverseInOrder(node.getRight());
		}
	} 
	
	public void traversePostOrder(TreeNode<Integer> node) { 
		if (node != null) {
			traversePostOrder(node.getLeft()); 
			traversePostOrder(node.getRight());
			System.out.print(" " + node.getVal()); 
		}
	} 


}
