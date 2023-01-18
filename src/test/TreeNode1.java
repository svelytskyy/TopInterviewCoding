package test;

import java.util.List;

public class TreeNode1<T extends Comparable<T>> {
	
	private T val;
	private List<TreeNode1<T>> children;
	public TreeNode1(T val, List<TreeNode1<T>> children) {
		super();
		this.val = val;
		this.children = children;
	}
	public TreeNode1() {
		super();
		// TODO Auto-generated constructor stub
	}
	public TreeNode1(T val) {
		super();
		this.val = val;
	}
	public T getVal() {
		return val;
	}
	public void setVal(T val) {
		this.val = val;
	}
	public List<TreeNode1<T>> getChildren() {
		return children;
	}
	public void setChildren(List<TreeNode1<T>> children) {
		this.children = children;
	}
	@Override
	public String toString() {
		return "TreeNode1 [val=" + val + "]";
	}
	

}
