package problem19a_reverse_doubly_limked_list;

public class App {

	public static void main(String[] args) {
		ListNode<Integer> head = new ListNode<Integer>(1);

		ListNode<Integer> node1 = new ListNode<Integer>(2);
		ListNode<Integer> node2 = new ListNode<Integer>(3);
		ListNode<Integer> node3 = new ListNode<Integer>(4);
		ListNode<Integer> node4 = new ListNode<Integer>(5);
		
		head.setNextNode(node1);
		node1.setPrevNode(head);
		node1.setNextNode(node2);
		
		node2.setPrevNode(node1);
		node2.setNextNode(node3);
		
		node3.setNextNode(node4);
		node3.setPrevNode(node2);
		
		node4.setPrevNode(node3);
		Solution1 s = new Solution1();
		s.printLinkedList(head);
		System.out.println();
		head = s.reverse(head);
		s.printLinkedList(head);
	}

}
