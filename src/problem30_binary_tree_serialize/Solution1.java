package problem30_binary_tree_serialize;

import java.util.ArrayDeque;
import java.util.Deque;

public class Solution1 {
	
    public void serializePreOrder(TreeNode<Integer> node, StringBuilder treeStr) {
        if (node == null) {
            treeStr.append("#");
            return;
        }

        treeStr.append("^" + node.getVal());
        serializePreOrder(node.getLeft(), treeStr);
        serializePreOrder(node.getRight(), treeStr);
    }
    
    public void serializePostOrder(TreeNode<Integer> node, StringBuilder treeStr) {
        if (node == null) {
            treeStr.append("#");
            return;
        }
        serializePostOrder(node.getLeft(), treeStr);
        serializePostOrder(node.getRight(), treeStr);
        treeStr.append("^" + node.getVal());

    }

    public void serializeInOrder(TreeNode<Integer> node, StringBuilder treeStr) {
        if (node == null) {
            treeStr.append("#");
            return;
        }
        serializeInOrder(node.getLeft(), treeStr);
        treeStr.append("^"  + node.getVal());
        serializeInOrder(node.getRight(), treeStr);
    }
    
    //BFS
	public void serializeLevelOrder(TreeNode<Integer> root, StringBuilder treeStr) {
		Deque<TreeNode<Integer>> queue = new ArrayDeque<>();
		queue.add(root);
		while(!queue.isEmpty()) {
			TreeNode<Integer> cur = queue.poll();
			treeStr.append("^" + cur.getVal());
			if(cur.getLeft() != null) {
				queue.add(cur.getLeft());
			}else {
				treeStr.append("#");
			}
			if(cur.getRight() != null) {
				queue.add(cur.getRight());
			}else {
				treeStr.append("#");
			}
		}
	}

}
