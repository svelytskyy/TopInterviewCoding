package problem36_kth_largest_in_bst;

public class App {
	
/*
     			20         
  		   	  /    \	 
  			 10     30 		
		    /  \   /  \	   
		   3    15 25  40
*/	
	public static void main(String[] args) {
		Solution1 s = new Solution1();
		s.kthLargest(getBST(), 5);
	}
	
	public static TreeNode<Integer> getBST(){
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

}
