package problem19c_move_last_node_front;

public class ListNode<T extends Comparable<T>> {
	
	ListNode<T> nextNode;
	T value;
	
	public ListNode() {};
	
	public ListNode(T value){
		this.value = value;
	}
	
	public ListNode(T value, ListNode<T> nextNode){
		this.value = value;
		this.nextNode = nextNode;
	}
	

	public ListNode<T> getNextNode() {
		return nextNode;
	}

	public void setNextNode(ListNode<T> nextNode) {
		this.nextNode = nextNode;
	}

	public T getValue() {
		return value;
	}

	public void setValue(T value) {
		this.value = value;
	}
	
	
	
}
