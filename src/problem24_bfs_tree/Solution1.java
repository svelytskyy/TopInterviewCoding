package problem24_bfs_tree;

import java.util.ArrayDeque;
import java.util.Deque;

public class Solution1 {
	
	public void traverseBFS(TreeNode<Integer> root) {
		Deque<TreeNode<Integer>> queue = new ArrayDeque<>();
		queue.add(root);
		while(!queue.isEmpty()) {
			TreeNode<Integer> cur = queue.poll();
			System.out.print(cur.getVal() + " ");
			if(cur.getLeft() != null) queue.add(cur.getLeft());
			if(cur.getRight() != null) queue.add(cur.getRight());
		}
	}

}
