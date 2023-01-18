package problem19a_reverse_doubly_limked_list;

public class Solution1 {
	
	public ListNode<Integer> reverse(ListNode<Integer> head){
		ListNode<Integer> cur = head;
		ListNode<Integer> prev = null;
		while(cur != null) {
			ListNode<Integer> nextTmp = cur.getNextNode();
			cur.setNextNode(cur.getPrevNode());
			cur.setPrevNode(nextTmp);
			prev = cur;
			cur = cur.getPrevNode();
			if(cur != null) {
				head = cur;
			}
		}
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
