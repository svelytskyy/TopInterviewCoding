package problem27_n_tree_max_depth;

import java.util.List;

public class NTreeNode<T extends Comparable<T>> {
	
	private T val;
	private List<NTreeNode<T>> children;
	public T getVal() {
		return val;
	}
	public void setVal(T val) {
		this.val = val;
	}
	public List<NTreeNode<T>> getChildren() {
		return children;
	}
	public void setChildren(List<NTreeNode<T>> children) {
		this.children = children;
	}
	public NTreeNode(T val, List<NTreeNode<T>> children) {
		super();
		this.val = val;
		this.children = children;
	}
	public NTreeNode(T val) {
		super();
		this.val = val;
	}
	public NTreeNode() {
		super();
	}
	@Override
	public String toString() {
		return "NTreeNode [val=" + val + "]";
	}
	
}
