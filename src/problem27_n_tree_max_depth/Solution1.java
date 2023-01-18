package problem27_n_tree_max_depth;

//DFS
public class Solution1 {
	
	public int maxDepth(NTreeNode<Integer> root) {
    	if (root == null || root.getChildren() == null) return 0;
        int h = 0;
        for (NTreeNode<Integer> node : root.getChildren()) {
            h = Math.max(h, maxDepth(node));
        }
        return 1 + h;
    }
	
}
