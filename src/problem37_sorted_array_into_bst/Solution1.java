package problem37_sorted_array_into_bst;

//strategy : left middle element as a root/parent

public class Solution1 {
	
	public TreeNode<Integer> minimalBst(int arr[]) {
			return minimalBstHelper(arr, 0, arr.length - 1);
	}
	private TreeNode<Integer> minimalBstHelper(int arr[], int left, int right) {
		if (left > right)  {
			return null;
		}
		
		int middle = (left + right) / 2;
		TreeNode<Integer> node = new TreeNode<>(arr[middle]);
		node.setLeft(minimalBstHelper(arr, left, middle - 1)); 
		node.setRight(minimalBstHelper(arr, middle + 1, right)); 
		return node;
	}


}
