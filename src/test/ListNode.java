package test;

public class ListNode<T extends Comparable<T>> {
	
	ListNode<T> nextNode;
	ListNode<T> prevNode;
	T value;
	
	public ListNode() {};
	
	public ListNode(T value){
		this.value = value;
	}
	
	public ListNode(T value, ListNode<T> nextNode){
		this.value = value;
		this.nextNode = nextNode;
	}
	
	public ListNode(T value, ListNode<T> nextNode, ListNode<T> prevNode){
		this.value = value;
		this.nextNode = nextNode;
		this.prevNode = prevNode;
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
	
	
	
}
