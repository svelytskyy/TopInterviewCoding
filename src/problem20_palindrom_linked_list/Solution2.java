package problem20_palindrom_linked_list;

public class Solution2 {
	
	   private ListNode frontPointer;
	   
	   private boolean recursivelyCheck(ListNode currentNode) {
	        if (currentNode != null) {
	            if (!recursivelyCheck(currentNode.next)) return false;
	            if (currentNode.val != frontPointer.val) return false;
	            frontPointer = frontPointer.next;
	        }
	        return true;
	    }

	    public boolean isPalindrome(ListNode head) {
	        frontPointer = head;
	        return recursivelyCheck(head);
	    }

}
