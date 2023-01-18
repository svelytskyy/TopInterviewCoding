package problem36_kth_largest_in_bst;

//Reverse-in-order traversal

public class Solution1 {
	
	public void kthLargest(TreeNode<Integer> root,int k) {
		kthLargestHelper(root, k); 
	}
	
	private int counter;
	
	private void kthLargestHelper(TreeNode<Integer> node, int k) {
		if (node == null || counter >= k) {
			return;
		}
		
		kthLargestHelper(node.getRight(), k);

		counter++;
		if (counter == k) {
			System.out.println(node.getVal()); 
		}
		
		kthLargestHelper(node.getLeft(), k); 
	}
	
}