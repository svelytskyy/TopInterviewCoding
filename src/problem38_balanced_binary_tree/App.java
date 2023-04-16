package problem38_balanced_binary_tree;

public class App {

	public static void main(String[] args) {
		
		TreeNode<Integer>balancedBT = getBalancedBinaryTree();
		TreeNode<Integer>unBalancedBT = getUnBalancedBinaryTree();
		
		Solution1 s1 = new Solution1();
		System.out.println(s1.isBalanced(balancedBT));
		System.out.println(s1.isBalanced(unBalancedBT));
	}
	
	/*
		20         
 	  /    \	 
	 10     30 		
	/  \   /  \	   
   3    15 25  40
*/
	public static TreeNode<Integer> getBalancedBinaryTree() {
		TreeNode<Integer> root = new TreeNode<>(20);
		TreeNode<Integer> node1 = new TreeNode<>(10);
		TreeNode<Integer> node2 = new TreeNode<>(3);
		TreeNode<Integer> node3 = new TreeNode<>(15);
		TreeNode<Integer> node4 = new TreeNode<>(30);
		TreeNode<Integer> node5 = new TreeNode<>(25);
		TreeNode<Integer> node6 = new TreeNode<>(40);
		root.setLeft(node1);
		root.setRight(node4);
		node1.setLeft(node2);
		node1.setRight(node3);
		node4.setLeft(node5);
		node4.setRight(node6);
		return root;
	}
		
/*
 			20
 			 \
 			 10
 			  \
 			   3
 */
	
	public static TreeNode<Integer> getUnBalancedBinaryTree(){
		TreeNode<Integer> root = new TreeNode<>(20);
		TreeNode<Integer> node1 = new TreeNode<>(10);
		TreeNode<Integer> node2 = new TreeNode<>(3);
		root.setLeft(node1);
		node1.setLeft(node2);;
		return root;
	}

}
