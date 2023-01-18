package problem19b_reverse_singly_linked_list_in_group_of_K;

public class Solution1 {
	
	public ListNode<Integer> reverseInKGroups(ListNode<Integer> head, int k) {
		ListNode<Integer> cur = head; 
		ListNode<Integer> next = null; 
		ListNode<Integer> prev = null;
		int counter = 0;
		while (cur != null && counter < k) {
			next = cur.getNextNode(); 
			cur.setNextNode(prev); 
			prev = cur; 
			cur = next; 
			counter++;
		}
		if (next != null) {
			head.setNextNode(reverseInKGroups(next, k));
		}
		return prev; 
	}
	
	public void printLinkedList(ListNode<Integer> head) {
		ListNode<Integer> l = head;
		while(l != null) {
			System.out.print(l.getValue() +  " ");
			l = l.getNextNode();
		}
	}

}
