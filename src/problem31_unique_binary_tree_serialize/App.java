package problem31_unique_binary_tree_serialize;

public class App {

/*
	   1 					  2        
	  / \		   			 / \
	 2   2 					1   4
		/ \		           / \
	   3   4 			  2	  3        
						 
*/
	public static void main(String[] args) {
		
		Solution1 s = new Solution1();
		
		TreeNode<Integer> root1 = new TreeNode<>(1); 
		TreeNode<Integer> node1 = new TreeNode<Integer>(2);
		TreeNode<Integer> node2 = new TreeNode<Integer>(2);
		TreeNode<Integer> node3 = new TreeNode<Integer>(3);
		TreeNode<Integer> node4 = new TreeNode<Integer>(4);
		root1.setLeft(node1);
		root1.setRight(node2);
		node2.setLeft(node3);
		node2.setRight(node4);
		
		TreeNode<Integer> root2 = new TreeNode<>(2); 
		TreeNode<Integer> node11 = new TreeNode<Integer>(1);
		TreeNode<Integer> node22 = new TreeNode<Integer>(4);
		TreeNode<Integer> node33 = new TreeNode<Integer>(2);
		TreeNode<Integer> node44 = new TreeNode<Integer>(3);
		root2.setLeft(node11);
		root2.setRight(node22);
		node11.setLeft(node33);
		node11.setRight(node44);
		
		
		
		StringBuilder sb1 = new StringBuilder();
		s.serializePreOrder(root1, sb1);
		System.out.println("Pre Order 1 : " + sb1.toString());
		
		StringBuilder  sb2 = new StringBuilder();
		s.serializePreOrder(root2, sb2);
		System.out.println("Pre Order 2 : " + sb2.toString());
		System.out.println(sb1.toString().equals(sb2.toString()));
		
		StringBuilder  sb3 = new StringBuilder();
		s.serializePostOrder(root1, sb3);
		System.out.println("Post Order 1 : " + sb3.toString());
		
		StringBuilder  sb4 = new StringBuilder();
		s.serializePostOrder(root2, sb4);
		System.out.println("Post Order 2 : " + sb4.toString());
		System.out.println(sb3.toString().equals(sb4.toString()));
		
		StringBuilder  sb5 = new StringBuilder();
		s.serializeInOrder(root1, sb5);
		System.out.println("In Order 1 : " + sb5.toString());
		
		StringBuilder  sb6 = new StringBuilder();
		s.serializeInOrder(root2, sb6);
		System.out.println("In Order 2 : " + sb6.toString());
		System.out.println(sb5.toString().equals(sb6.toString()));
		
		StringBuilder  sb7 = new StringBuilder();
		s.serializeLevelOrder(root1, sb7);
		System.out.println("Level Order 1 : " + sb7.toString());
		
		StringBuilder  sb8 = new StringBuilder();
		s.serializeLevelOrder(root2, sb8);
		System.out.println("Level Order 2 : " + sb8.toString());
		System.out.println(sb7.toString().equals(sb8.toString()));
		
	}

}
