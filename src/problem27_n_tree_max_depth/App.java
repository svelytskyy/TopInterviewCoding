package problem27_n_tree_max_depth;

import java.util.List;

public class App {

	public static void main(String[] args) {
		NTreeNode<Integer> root = new NTreeNode<>(1);
		
		NTreeNode<Integer> node1 = new NTreeNode<>(2);
		NTreeNode<Integer> node2 = new NTreeNode<>(3);
		NTreeNode<Integer> node3 = new NTreeNode<>(4);
		NTreeNode<Integer> node4 = new NTreeNode<>(5);
		NTreeNode<Integer> node5 = new NTreeNode<>(6);
		NTreeNode<Integer> node6 = new NTreeNode<>(7);
		NTreeNode<Integer> node7 = new NTreeNode<>(8);
		NTreeNode<Integer> node8 = new NTreeNode<>(9);
		NTreeNode<Integer> node9 = new NTreeNode<>(10);

		root.setChildren(List.of(node1, node2, node3));
		node3.setChildren(List.of(node4, node5, node6));
		node6.setChildren(List.of(node7, node8, node9));
		
		Solution1 s1 = new Solution1();
		System.out.println(s1.maxDepth(root));

		Solution1 s2 = new Solution1();
		System.out.println(s2.maxDepth(root));

	}

}
