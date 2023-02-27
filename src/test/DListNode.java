package test;

public class DListNode<T extends Comparable<T>> {
		DListNode<T> nextNode;
		DListNode<T> prevNode;
		T key;
		T value;
		public DListNode() {
		}
		public DListNode(DListNode<T> nextNode, DListNode<T> prevNode, T value) {
			super();
			this.nextNode = nextNode;
			this.prevNode = prevNode;
			this.value = value;
		}
		
		public DListNode(T value) {
			super();
			this.value = value;
		}
		
		public DListNode(DListNode<T> nextNode, T value) {
			super();
			this.nextNode = nextNode;
			this.value = value;
		}
		public DListNode<T> getNextNode() {
			return nextNode;
		}
		public void setNextNode(DListNode<T> nextNode) {
			this.nextNode = nextNode;
		}
		public DListNode<T> getPrevNode() {
			return prevNode;
		}
		public void setPrevNode(DListNode<T> prevNode) {
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
			return "DListNode [value=" + value + "]";
		}
		
		
		
}


