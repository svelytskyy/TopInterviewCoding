package problem30_binary_tree_serialize;

public class App {

/*
	   3          
	  / \		   
	 4   5 
*/
	public static void main(String[] args) {
		
		Solution1 s = new Solution1();
		
		TreeNode<Integer> root = new TreeNode<>(3); 
		TreeNode<Integer> node1 = new TreeNode<Integer>(4);
		TreeNode<Integer> node2 = new TreeNode<Integer>(5);
		root.setLeft(node1);
		root.setRight(node2);
		
		StringBuilder sb = new StringBuilder();
		s.serializePreOrder(root, sb);
		System.out.println("Pre Order " + sb.toString());
		
		sb = new StringBuilder();
		s.serializePostOrder(root, sb);
		System.out.println("Post Order " + sb.toString());
		
		sb = new StringBuilder();
		s.serializeInOrder(root, sb);
		System.out.println("In Order " + sb.toString());
		
		sb = new StringBuilder();
		s.serializeLevelOrder(root, sb);
		System.out.println("Level Order " + sb.toString());
		
	}

}
