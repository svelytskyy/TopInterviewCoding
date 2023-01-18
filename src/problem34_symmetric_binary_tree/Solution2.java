package problem34_symmetric_binary_tree;

import java.util.LinkedList;
import java.util.Queue;

public class Solution2 {
	
	public boolean isSymmetric(TreeNode<Integer> root) {
		Queue<TreeNode<Integer>> q = new LinkedList<>();
		q.add(root);
		q.add(root);
		while(!q.isEmpty()) {
			TreeNode<Integer>t1 = q.poll();
			TreeNode<Integer>t2 = q.poll();
			if(t1 == null && t2 == null) continue;
			if(t1 == null || t2 == null) return false;
			if(t1.getVal() != t2.getVal()) return false;
			q.add(t1.getLeft());
			q.add(t2.getRight());
			q.add(t1.getRight());
			q.add(t2.getLeft());
		}
		return true;
	}

}
