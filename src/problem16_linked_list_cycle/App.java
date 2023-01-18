package problem16_linked_list_cycle;

public class App {

	public static void main(String[] args) {
		//testLinkedList();
		testSolution1();
		testSolution2();
	}
	
	public static void testLinkedList() {
		ListNode head = new ListNode(10);
		ListNode node1 = new ListNode(15);
		//head.setNext(node1)
		head.next = node1;
		
		ListNode node = head;
		while(node != null) {
			System.out.println(node.val);
			node = node.next;
		}
		System.out.println(head.val);
		
	}
	
	public static void testSolution1() {
		Solution1 s = new Solution1();
		boolean case1 = s.hasCycle(getListNodeNoCycle()); //false
		boolean case2 = s.hasCycle(getListNodeCycle());  //true
		System.out.println("Solution1 : ");
		System.out.println("case1 = " + case1 + " case2 = " + case2);
	}
	
	public static void testSolution2() {
		Solution2 s = new Solution2();
		boolean case1 = s.hasCycle(getListNodeNoCycle());  //false
		boolean case2 = s.hasCycle(getListNodeCycle());   //true
		System.out.println("Solution2 : ");
		System.out.println("case1 = " + case1 + " case2 = " + case2);
	}

	
	public static ListNode getListNodeNoCycle() {
		ListNode head = new ListNode(5);
		ListNode node1 = new ListNode(10);
		ListNode node2 = new ListNode(15);
		head.next = node1;
		node1.next = node2;
		return head;
	}
	
	public static ListNode getListNodeCycle() {
		ListNode head = new ListNode(5);
		ListNode node1 = new ListNode(10);
		ListNode node2 = new ListNode(15);
		head.next = node1;
		node1.next = node2;
		node2.next = head;
		return head;
	}

}
