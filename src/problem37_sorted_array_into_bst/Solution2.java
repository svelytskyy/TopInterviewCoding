package problem37_sorted_array_into_bst;

//strategy : right middle element as a root/parent

public class Solution2 {

	public TreeNode<Integer> minimalBst(int arr[]) {
		return minimalBstHelper(arr, 0, arr.length - 1);
}
	private TreeNode<Integer> minimalBstHelper(int arr[], int low, int high) {
		
		if (low > high)  return null;
		
		int middle = (low + high) / 2;
		if((low + high) % 2 == 1) middle++;
		TreeNode<Integer> node = new TreeNode<>(arr[middle]);
		node.setLeft(minimalBstHelper(arr, low, middle - 1)); 
		node.setRight(minimalBstHelper(arr, middle + 1, high)); 
		return node;
	}
	
}
