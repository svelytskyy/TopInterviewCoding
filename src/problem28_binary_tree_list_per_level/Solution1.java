package problem28_binary_tree_list_per_level;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

public class Solution1 {
	
	public List<List<Integer>> fetchAllLevels(TreeNode<Integer> root){
		List<List<Integer>> result = new ArrayList<>();
		
		Queue<TreeNode<Integer>> curNodes = new ArrayDeque<>();
		List<Integer>curValues = new ArrayList<>();
		curNodes.add(root);
		curValues.add(root.getVal());
		
		while(!curNodes.isEmpty()) {
			result.add(curValues);
			Queue<TreeNode<Integer>> prevNodes = curNodes;
			
			curNodes = new ArrayDeque<>();
			curValues = new ArrayList<>();
			
			for(TreeNode<Integer> parent : prevNodes) {
				if(parent.getLeft() != null) {
					curNodes.add(parent.getLeft());
					curValues.add(parent.getLeft().getVal());
				}
				if(parent.getRight() != null) {
					curNodes.add(parent.getRight());
					curValues.add(parent.getRight().getVal());
					
				}
			}
		}
		
		return result;
	}

}
