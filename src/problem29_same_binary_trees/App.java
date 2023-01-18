package problem29_same_binary_trees;


public class App {
	
	/*
		10            10
		/ \          /  \
	   5   6        5    6
	  / \		   / \
	 4   5 		  4   5

Output : true
*/

	public static void main(String[] args) {
		TreeNode<Integer> root1 = new TreeNode<>(10); 
	    root1.setLeft(new TreeNode<>(5)); 
	    root1.setRight(new TreeNode<>(6)); 
	    root1.getLeft().setLeft(new TreeNode<>(4)); 
	    root1.getLeft().setRight(new TreeNode<>(5)); 
	  
	    TreeNode<Integer> root2 = new TreeNode<>(10); 
	    root2.setLeft(new TreeNode<Integer>(5)); 
	    root2.setRight(new TreeNode<Integer>(6)); 
	    root2.getLeft().setLeft(new TreeNode<>(4)); 
	    root2.getLeft().setRight(new TreeNode<Integer>(5)); 
	    testSolution1(root1,root2);
	    testSolution2(root1, root2);

	}
	
	public static void testSolution1(TreeNode<Integer> root1, TreeNode<Integer> root2) {
		Solution1 s = new Solution1();
		System.out.println(s.isSameTree(root1, root2));
	}
	
	public static void testSolution2(TreeNode<Integer> root1, TreeNode<Integer> root2) {
		Solution2 s = new Solution2();
		System.out.println(s.isSameTree(root1, root2));
	}


}
