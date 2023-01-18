package problem29_same_binary_trees;

import java.util.ArrayDeque;
import java.util.Queue;

public class Solution2 {
	
	  public boolean isSameTree(TreeNode<Integer> root1, TreeNode<Integer> root2) {
		    if (root1 == null && root2 == null)  return true; 
		    if (root1 == null || root2 == null) return false; 
		    Queue<TreeNode<Integer>> q1 = new ArrayDeque<TreeNode<Integer>> ();
		    Queue<TreeNode<Integer>>  q2 = new ArrayDeque<TreeNode<Integer>> (); 
		    q1.add(root1); 
		    q2.add(root2); 
		    while (!q1.isEmpty() && !q2.isEmpty()) { 
		    	TreeNode<Integer> n1 = q1.poll(); 
		    	TreeNode<Integer> n2 = q2.poll(); 
		        if (n1.getVal() != n2.getVal()) return false; 
		        if (n1.getLeft() != null && n2.getLeft() != null){ 
		            q1.add(n1.getLeft()); 
		            q2.add(n2.getLeft()); 
		        } 
		        else if (n1.getLeft() != null || n2.getLeft() != null) 
		            return false; 
		  
		        if (n1.getRight() != null && n2.getRight() != null){ 
		            q1.add(n1.getRight()); 
		            q2.add(n2.getRight()); 
		        } 
		        else if (n1.getRight() != null || n2.getRight() != null) 
		            return false; 
		    } 
		  
		    return true; 
		  }
}
