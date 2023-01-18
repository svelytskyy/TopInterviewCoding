package problem37_sorted_array_into_bst;

public class App {

	public static void main(String[] args) {
		
		System.out.println("\n##### Solution 1 :");
		Solution1 s = new Solution1();
		TreeNode<Integer> root = s.minimalBst(new int[] {1,2,3,4,5,6,7,8});
		System.out.println("pre-order : ");
		traversePreOrder(root);
		System.out.println("\nin-order : ");
		traverseInOrder(root);
		System.out.println("\nreverse-in-order : ");
		traverseReverseInOrder(root);
		System.out.println("\npost-order : ");
		traversePostOrder(root);
		
		System.out.println("\n##### Solution 2 :");
		Solution2 s2 = new Solution2();
		root = s2.minimalBst(new int[] {1,2,3,4,5,6,7,8});
		System.out.println("pre-order : ");
		traversePreOrder(root);
		System.out.println("\nin-order : ");
		traverseInOrder(root);
		System.out.println("\nreverse-in-order : ");
		traverseReverseInOrder(root);
		System.out.println("\npost-order : ");
		traversePostOrder(root);
		
		System.out.println("\n##### Solution 3 :");
		Solution3 s3 = new Solution3();
		root = s3.minimalBst(new int[] {1,2,3,4,5,6,7,8});
		System.out.println("pre-order : ");
		traversePreOrder(root);
		System.out.println("\nin-order : ");
		traverseInOrder(root);
		System.out.println("\nreverse-in-order : ");
		traverseReverseInOrder(root);
		System.out.println("\npost-order : ");
		traversePostOrder(root);
		
	}
	
	
	public static void traversePreOrder(TreeNode<Integer> node) {
		if (node == null) {
			return;
		}
			System.out.print(" " + node.getVal()); 
			traversePreOrder(node.getLeft());
			traversePreOrder(node.getRight()); 
	}
	
	public static void traverseInOrder(TreeNode<Integer> node) { 
		if (node == null) {
			return;
		}
			traverseInOrder(node.getLeft()); 
			System.out.print(" " + node.getVal()); 
			traverseInOrder(node.getRight());
	} 
	
	public static void traverseReverseInOrder(TreeNode<Integer> node) { 
			if (node == null) {
				return;
			}
			traverseReverseInOrder(node.getRight()); 
			System.out.print(" " + node.getVal()); 
			traverseReverseInOrder(node.getLeft());
	} 
	
	public static void traversePostOrder(TreeNode<Integer> node) { 
		if (node != null) {
			traversePostOrder(node.getLeft()); 
			traversePostOrder(node.getRight());
			System.out.print(" " + node.getVal()); 
		}
	} 

}
