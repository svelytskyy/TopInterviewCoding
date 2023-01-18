package problem19c_move_last_node_front;

public class Solution1 {
	
	public ListNode<Integer> moveLastToFront(ListNode<Integer> head) {
		ListNode<Integer> cur = head;
		while (cur.getNextNode().getNextNode() != null) {
			cur = cur.getNextNode(); 
		}
		ListNode<Integer> next = cur.getNextNode();
		cur.setNextNode(null);
		next.setNextNode(head);
		head = next;
		return head;
	}
	
	public void printLinkedList(ListNode<Integer> head) {
		ListNode<Integer> l = head;
		while(l != null) {
			System.out.print(l.getValue() +  " ");
			l = l.getNextNode();
		}
	}

}
