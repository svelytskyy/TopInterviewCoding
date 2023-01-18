package problem34_symmetric_binary_tree;

public class App {

	public static void main(String[] args) {
		 testSolution1();
		 testSolution2();
	}
	
	//DFS
	public static void testSolution1() {
		Solution1 s = new Solution1();
		System.out.println(s.isSymmetric(getCase1()));
		System.out.println(s.isSymmetric(getCase2()));
	}
	
	//BFS
	public static void testSolution2() {
		Solution2 s = new Solution2();
		System.out.println(s.isSymmetric(getCase1()));
		System.out.println(s.isSymmetric(getCase2()));
	}
	
/* 
 *  false
	
	   50 					         
	 /    \		   			 
	45     45 				
   /  \   /  \		         
  41  3  41	  3 
  
*/
	
	public static TreeNode<Integer>getCase1(){
		TreeNode<Integer> root = new TreeNode<>(50);
		TreeNode<Integer> node1 = new TreeNode<>(45);
		TreeNode<Integer> node2 = new TreeNode<>(41);
		TreeNode<Integer> node3 = new TreeNode<>(3);
		TreeNode<Integer> node4 = new TreeNode<>(45);
		TreeNode<Integer> node5 = new TreeNode<>(41);
		TreeNode<Integer> node6 = new TreeNode<>(3);
		root.setLeft(node1);
		root.setRight(node4);
		node1.setLeft(node2);
		node1.setRight(node3);
		node4.setLeft(node5);
		node4.setRight(node6);
		return root;
	}
	
	/* 
	 *  true
		
		   50 					         
		 /    \		   			 
		45     45 				
	   /  \   /  \		         
	  41  3  3	  41 
	  
	*/
		
		public static TreeNode<Integer>getCase2(){
			TreeNode<Integer> root = new TreeNode<>(50);
			TreeNode<Integer> node1 = new TreeNode<>(45);
			TreeNode<Integer> node2 = new TreeNode<>(41);
			TreeNode<Integer> node3 = new TreeNode<>(3);
			TreeNode<Integer> node4 = new TreeNode<>(45);
			TreeNode<Integer> node5 = new TreeNode<>(3);
			TreeNode<Integer> node6 = new TreeNode<>(41);
			root.setLeft(node1);
			root.setRight(node4);
			node1.setLeft(node2);
			node1.setRight(node3);
			node4.setLeft(node5);
			node4.setRight(node6);
			return root;
		}
}
