package problem28_binary_tree_list_per_level;

public class App {

	public static void main(String[] args) {
		TreeNode<Integer> root = new TreeNode<>(40);
		TreeNode<Integer> node1 = new TreeNode<>(47);
		TreeNode<Integer> node2 = new TreeNode<>(45);
		TreeNode<Integer> node3 = new TreeNode<>(11);
		TreeNode<Integer> node4 = new TreeNode<>(13);
		TreeNode<Integer> node5 = new TreeNode<>(44);
		TreeNode<Integer> node6 = new TreeNode<>(88);
		TreeNode<Integer> node7 = new TreeNode<>(3);
		TreeNode<Integer> node8 = new TreeNode<>(1);
		
		root.setLeft(node1);
		root.setRight(node2);
		
		node1.setLeft(node3);
		node1.setRight(node4);
		
		node2.setLeft(node5);
		node2.setRight(node6);
		
		node3.setLeft(node7);
		node3.setRight(node8);

		
		Solution1 s = new Solution1();
		System.out.println(s.fetchAllLevels(root));

	}

}
