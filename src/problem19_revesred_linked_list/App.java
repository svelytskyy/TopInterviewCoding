package problem19_revesred_linked_list;

public class App {

	public static void main(String[] args) {
		
			ListNode head = getLinkedList();
			printLinkedList(head);
			ListNode revertedHead = (new Solution()).reverseLinkedList(head);
			System.out.println("\nreverted linkedlist : ");
			printLinkedList(revertedHead);
	}
	
	public static ListNode getLinkedList() {
		//[1 -> 2 -> 3 -> 4]
		ListNode head = new ListNode(1);
		ListNode node2 = new ListNode(2);
		ListNode node3 = new ListNode(3);
		ListNode node4 = new ListNode(4);

		head.next = node2;
		node2.next = node3;
		node3.next = node4;
		
		return head;
	}
	
	public static void printLinkedList(ListNode head) {
		ListNode l = head;
		while(l != null) {
			System.out.print(l.val +  " ");
			l = l.next;
		}
	}
	
}
