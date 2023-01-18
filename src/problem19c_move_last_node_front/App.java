package problem19c_move_last_node_front;

public class App {

	public static void main(String[] args) {
		ListNode<Integer> head = new ListNode<Integer>(7);
		
		ListNode<Integer> node1 = new ListNode<Integer>(4);
		ListNode<Integer> node2 = new ListNode<Integer>(3);
		ListNode<Integer> node3 = new ListNode<Integer>(1);
		ListNode<Integer> node4 = new ListNode<Integer>(8);
		ListNode<Integer> node5 = new ListNode<Integer>(2);
		ListNode<Integer> node6 = new ListNode<Integer>(9);
		ListNode<Integer> node7 = new ListNode<Integer>(0);
		
		head.setNextNode(node1);
		node1.setNextNode(node2);
		node2.setNextNode(node3);
		node3.setNextNode(node4);
		node4.setNextNode(node5);
		node5.setNextNode(node6);
		node6.setNextNode(node7);
		
		Solution1 s = new Solution1();
		s.printLinkedList(head);
		System.out.println();
		head = s.moveLastToFront(head);
		s.printLinkedList(head);
	}

}
