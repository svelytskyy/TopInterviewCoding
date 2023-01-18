package problem28_binary_tree_list_per_level;

public class TreeNode<T extends Comparable<T>> {
	
	private TreeNode<T> left;
	private TreeNode<T> right;
	private T val;
	
	public TreeNode() {	}

	public TreeNode(T val) {
		super();
		this.val = val;
	}


	public TreeNode(TreeNode<T> left, TreeNode<T> right, T val) {
		super();
		this.left = left;
		this.right = right;
		this.val = val;
	}

	public TreeNode<T> getLeft() {
		return left;
	}
	public void setLeft(TreeNode<T> left) {
		this.left = left;
	}
	public TreeNode<T> getRight() {
		return right;
	}
	public void setRight(TreeNode<T> right) {
		this.right = right;
	}
	public T getVal() {
		return val;
	}
	public void setVal(T val) {
		this.val = val;
	}
	
	
	
}
