package problem24_bfs_tree;

public class App {

	public static void main(String[] args) {
		TreeNode<Integer> root = new TreeNode<>(1);
		TreeNode<Integer> node2 = new TreeNode<>(2);
		TreeNode<Integer> node3 = new TreeNode<>(3);
		TreeNode<Integer> node4 = new TreeNode<>(4);
		TreeNode<Integer> node5 = new TreeNode<>(5);
		TreeNode<Integer> node6 = new TreeNode<>(6);
		TreeNode<Integer> node7 = new TreeNode<>(7);
		
		root.setLeft(node2);
		root.setRight(node3);
		
		node2.setLeft(node4);
		node2.setRight(node5);
		
		node3.setLeft(node6);
		node3.setRight(node7);
		
		Solution1 s = new Solution1();
		s.traverseBFS(root);
	}

}
