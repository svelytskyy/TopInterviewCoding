package problem18_intersect_two_linked_lists;

public class App {
	
	//headA = [3 -> 4 -> 5]
	//headB = [1 -> 2 -> 4 -> 5]
	public static void main(String[] args) {
		ListNode headA = new ListNode(3);
		ListNode headB = new ListNode(1);
		
		ListNode node1 = new ListNode(4);
		ListNode node2 = new ListNode(5);
		ListNode node3 = new ListNode(2);
		
		//LinkedList A
		headA.next = node1;
		node1.next = node2;
		
		//LinkedListB
		headB.next = node3;
		node3.next = node1;
		node1.next = node2;
		
		testSolution1(headA, headB);
		testSolution2(headA, headB);
		testSolution3(headA, headB);
	}
	
	public static void testSolution1(ListNode headA, ListNode headB) {
		Solution1 s = new Solution1();
		ListNode intersect = s.getIntersectionListNode(headA, headB);
		System.out.println(intersect.val);
	}
	
	public static void testSolution2(ListNode headA, ListNode headB) {
		Solution2 s = new Solution2();
		ListNode intersect = s.getIntersectionListNode(headA, headB);
		System.out.println(intersect.val);
	}
	
	public static void testSolution3(ListNode headA, ListNode headB) {
		Solution3 s = new Solution3();
		ListNode intersect = s.getIntersectionListNode(headA, headB);
		System.out.println(intersect.val);
	}

}
