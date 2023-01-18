package problem35_is_bst;

import java.util.Deque;
import java.util.LinkedList;

//iterative : valid range

public class Solution2 {
	
    private Deque<TreeNode<Integer>> queue = new LinkedList<>();
    private Deque<Integer> upperLimitsQueue = new LinkedList<>();
    private Deque<Integer> lowerLimitsQueue = new LinkedList<>();

    public void update(TreeNode<Integer> root, Integer low, Integer high) {
        queue.add(root);
        lowerLimitsQueue.add(low);
        upperLimitsQueue.add(high);
    }

    public boolean isValidBST(TreeNode<Integer> root) {
        Integer low = null, high = null, val;
        update(root, low, high);

        while (!queue.isEmpty()) {
            root = queue.poll();
            low = lowerLimitsQueue.poll();
            high = upperLimitsQueue.poll();

            if (root == null) continue;
            val = root.getVal();
            
         /*
        	For left child :                	For right child :
        	Low – same from parent          	Low – limited by parent value
        	Upper – limited by parent value     Upper – same from parent
		*/
            
            if (low != null && val <= low) {
                return false;
            }
            if (high != null && val >= high) {
                return false;
            }
            update(root.getRight(), val, high);
            update(root.getLeft(), low, val);
        }
        return true;
    }

}
