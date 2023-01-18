package problem19a_reverse_doubly_limked_list;

public class ListNode<T extends Comparable<T>> {
	ListNode<T> nextNode;
	ListNode<T> prevNode;
	T value;
	public ListNode() {
	}
	public ListNode(ListNode<T> nextNode, ListNode<T> prevNode, T value) {
		super();
		this.nextNode = nextNode;
		this.prevNode = prevNode;
		this.value = value;
	}
	
	public ListNode(T value) {
		super();
		this.value = value;
	}
	
	public ListNode(ListNode<T> nextNode, T value) {
		super();
		this.nextNode = nextNode;
		this.value = value;
	}
	public ListNode<T> getNextNode() {
		return nextNode;
	}
	public void setNextNode(ListNode<T> nextNode) {
		this.nextNode = nextNode;
	}
	public ListNode<T> getPrevNode() {
		return prevNode;
	}
	public void setPrevNode(ListNode<T> prevNode) {
		this.prevNode = prevNode;
	}
	public T getValue() {
		return value;
	}
	public void setValue(T value) {
		this.value = value;
	}
	@Override
	public String toString() {
		return "ListNode [value=" + value + "]";
	}
	
	
	
}
