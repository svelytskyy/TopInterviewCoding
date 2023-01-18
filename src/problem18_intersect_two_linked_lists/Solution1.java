package problem18_intersect_two_linked_lists;

public class Solution1 {
	 public ListNode getIntersectionListNode(ListNode headA, ListNode headB) {
	        ListNode lA = headA;
	        while(lA != null){
	            ListNode lB = headB;
	            while(lB != null){
	                if(lA == lB) return lA;
	                lB = lB.next;
	            }
	            lA = lA.next;
	        }
	        return null;
	    }
}
