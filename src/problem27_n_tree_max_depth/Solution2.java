package problem27_n_tree_max_depth;

//BFS
import java.util.ArrayDeque;
import java.util.Deque;

public class Solution2 {
	
	  public int maxDepth(NTreeNode<Integer> root) {
		    Deque<Pair<NTreeNode<Integer>, Integer>> queue = new ArrayDeque<>();
		    NTreeNode<Integer> parent = root;
		    if (parent != null) {
		      queue.add(new Pair<NTreeNode<Integer>, Integer>(parent, 1));
		    }

		    int depth = 0;
		    while (!queue.isEmpty()) {
		      Pair<NTreeNode<Integer>, Integer> current = queue.poll();
		      parent = current.getKey();
		      int h = current.getValue();
		      if (parent != null) {
		        depth = Math.max(depth, h);
		        for (NTreeNode<Integer> node : parent.getChildren()) {
		          queue.add(new Pair<NTreeNode<Integer>, Integer>(node, h + 1));    
		        }
		      }
		    }
		    return depth;
	  }
	
}
