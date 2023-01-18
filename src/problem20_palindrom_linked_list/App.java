package problem20_palindrom_linked_list;

public class App {

	public static void main(String[] args) {
		//1 -> 2 -> 2 -> 1
		ListNode head = new ListNode(1);
		ListNode node2 = new ListNode(2);
		ListNode node3 = new ListNode(2);
		ListNode node4 = new ListNode(1);

		head.next = node2;
		node2.next = node3;
		node3.next = node4;
		
		testSolution1(head);
		testSolution2(head);
		testSolution3(head);
	}
	
	public static void testSolution1(ListNode head) {
		Solution1 s = new Solution1();
		System.out.println(s.isPalindrome(head));
	}
	
	public static void testSolution2(ListNode head) {
		Solution2 s = new Solution2();
		System.out.println(s.isPalindrome(head));
	}

	public static void testSolution3(ListNode head) {
		Solution3 s = new Solution3();
		System.out.println(s.isPalindrome(head));
	}


}
