package problem18_intersect_two_linked_lists;

public class Solution3 {
	
	public ListNode getIntersectionListNode(ListNode headA, ListNode headB) {
		ListNode lA = headA;
		ListNode lB = headB;
		while(lA != lB) {
			lA = (lA!= null)?lA.next:headB;
			lB = (lB!= null)?lB.next:headA;
		}
		return lA;
	}

}
