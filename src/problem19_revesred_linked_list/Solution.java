package problem19_revesred_linked_list;

public class Solution {
	
	public ListNode reverseLinkedList(ListNode head) {
		ListNode prev = null;
		ListNode cur = head;
		while(cur != null) {
			ListNode tmp = cur.next;
			cur.next = prev;
			prev = cur;
			cur = tmp;
		}
		return prev;
	}

}
