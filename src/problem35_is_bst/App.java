package problem35_is_bst;

public class App {

	
/*
 * 		Not Valid BST		Valid BST
 * 
		    20 					20         
		  /    \		   	  /    \	 
		 10     30 			 10     30 		
		/  \   /  \		    /  \   /  \	   
	   3   15 32  40 	   3    15 25  40
*/
	
	public static TreeNode<Integer> getNotValidBST(){
		TreeNode<Integer> root1 = new TreeNode<>(20);
		TreeNode<Integer> node1 = new TreeNode<>(10);
		TreeNode<Integer> node2 = new TreeNode<>(3);
		TreeNode<Integer> node3 = new TreeNode<>(15);
		TreeNode<Integer> node4 = new TreeNode<>(30);
		TreeNode<Integer> node5 = new TreeNode<>(32);
		TreeNode<Integer> node6 = new TreeNode<>(40);
		root1.setLeft(node1);
		root1.setRight(node4);
		node1.setLeft(node2);
		node1.setRight(node3);
		node4.setLeft(node5);
		node4.setRight(node6);
		
		return root1;
	}
	
	public static TreeNode<Integer> getValidBST(){
		TreeNode<Integer> root1 = new TreeNode<>(20);
		TreeNode<Integer> node1 = new TreeNode<>(10);
		TreeNode<Integer> node2 = new TreeNode<>(3);
		TreeNode<Integer> node3 = new TreeNode<>(15);
		TreeNode<Integer> node4 = new TreeNode<>(30);
		TreeNode<Integer> node5 = new TreeNode<>(25);
		TreeNode<Integer> node6 = new TreeNode<>(40);
		root1.setLeft(node1);
		root1.setRight(node4);
		node1.setLeft(node2);
		node1.setRight(node3);
		node4.setLeft(node5);
		node4.setRight(node6);
		
		return root1;
	}

	
	public static void main(String[] args) {
		
		Solution1 s1 = new Solution1();
		Solution2 s2 = new Solution2();
		Solution3 s3 = new Solution3();
		Solution4 s4 = new Solution4();
		
		System.out.println(s1.isValidBST(getNotValidBST()));
		System.out.println(s1.isValidBST(getValidBST()));
		
		System.out.println(s2.isValidBST(getNotValidBST()));
		System.out.println(s2.isValidBST(getValidBST()));
		
		System.out.println(s3.isValidBST(getNotValidBST()));
		System.out.println(s3.isValidBST(getValidBST()));
		
		System.out.println(s4.isValidBST(getNotValidBST()));
		System.out.println(s4.isValidBST(getValidBST()));

	}
	
	

	

}
