package problem32_binary_tree_subtree;

public class App {

	public static void main(String[] args) {
		testCase1();
		testCase2();
	}
	
/*
	   40 					  30        
	 /    \		   			 /  \
	30     10 				20	90
   /  \   /  \		       /    
  20  90 70	  80     	  6	 	 
  /         
 6						 

*/
	
	public static void testCase1() {
		TreeNode<Integer> root1 = new TreeNode<>(40);
		TreeNode<Integer> node1 = new TreeNode<>(30);
		TreeNode<Integer> node2 = new TreeNode<>(20);
		TreeNode<Integer> node3 = new TreeNode<>(90);
		TreeNode<Integer> node4 = new TreeNode<>(6);
		TreeNode<Integer> node5 = new TreeNode<>(10);
		TreeNode<Integer> node6 = new TreeNode<>(70);
		TreeNode<Integer> node7 = new TreeNode<>(80);
		root1.setLeft(node1);
		root1.setRight(node5);
		node1.setLeft(node2);
		node1.setRight(node3);
		node2.setLeft(node4);
		node5.setLeft(node6);
		node5.setRight(node7);
		
		TreeNode<Integer> root2 = new TreeNode<>(30);
		TreeNode<Integer> node11 = new TreeNode<>(20);
		TreeNode<Integer> node12 = new TreeNode<>(90);
		TreeNode<Integer> node13 = new TreeNode<>(6);
		root2.setLeft(node11);
		root2.setRight(node12);
		node11.setLeft(node13);
		
		Solution1 s = new Solution1();
		
		System.out.println(s.isSubtree(root1,root2));
		
	}
	
/*
	   40 					  30        
	 /    \		   			 /  \
	30     10 				20	90
   /  \   /  \		       /    
  20  90 70	  80     	  6	 	 
 /  \        
6	80					 

*/
	
	public static void testCase2() {
		TreeNode<Integer> root1 = new TreeNode<>(40);
		TreeNode<Integer> node1 = new TreeNode<>(30);
		TreeNode<Integer> node2 = new TreeNode<>(20);
		TreeNode<Integer> node3 = new TreeNode<>(90);
		TreeNode<Integer> node4 = new TreeNode<>(6);
		TreeNode<Integer> node5 = new TreeNode<>(10);
		TreeNode<Integer> node6 = new TreeNode<>(70);
		TreeNode<Integer> node7 = new TreeNode<>(80);
		TreeNode<Integer> node8 = new TreeNode<>(80);
		root1.setLeft(node1);
		root1.setRight(node5);
		node1.setLeft(node2);
		node1.setRight(node3);
		node2.setLeft(node4);
		node2.setRight(node8);
		node5.setLeft(node6);
		node5.setRight(node7);
		
		TreeNode<Integer> root2 = new TreeNode<>(30);
		TreeNode<Integer> node11 = new TreeNode<>(20);
		TreeNode<Integer> node12 = new TreeNode<>(90);
		TreeNode<Integer> node13 = new TreeNode<>(6);
		root2.setLeft(node11);
		root2.setRight(node12);
		node11.setLeft(node13);
		
		Solution1 s = new Solution1();
		
		System.out.println(s.isSubtree(root1,root2));
		
	}	

}
