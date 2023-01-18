package problem18_intersect_two_linked_lists;

import java.util.HashSet;
import java.util.Set;

public class Solution2 {
	
	   public ListNode getIntersectionListNode(ListNode headA, ListNode headB) {
	        Set<ListNode> cache = new HashSet<ListNode>();
	        ListNode lA = headA;
	        ListNode lB = headB;
	        while (lA != null) {
	            cache.add(lA);
	            lA = lA.next;
	        }

	        while (lB != null) {
	            if (cache.contains(lB)) {
	                return lB;
	            }
	            lB = lB.next;
	        }

	        return null;
	    }

}
