package problem26_binary_tree_max_depth;

import java.util.ArrayDeque;
import java.util.Deque;

public class Solution2 {
	
	public int maxDepth(TreeNode<Integer> root) {
        int h =0;
        if(root == null)
            return h;
        
    Deque<TreeNode<Integer>> queue = new ArrayDeque<>();
        queue.offer(root);
        
        while(!queue.isEmpty()){
          int level = queue.size();
          h++;
          for(int i=0; i< level; i++){
             if(queue.peek().getLeft() != null) queue.offer(queue.peek().getLeft());
             if(queue.peek().getRight() != null) queue.offer(queue.peek().getRight());
             queue.poll();
          } 
        }
        return h;
	}
}
