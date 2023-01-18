package problem07_contains_duplicate;

public class App {

	public static void main(String[] args) {
		testSolution1();
		testSolution2();
	}
	
	public static void testSolution1() {
		int[] case1 = new int[] {1,2,3,1}; // true - duplicates
		int[] case2 = new int[] {1,2,3,4}; // false, no duplicates
		int[] case3 = new int[] {1,1,1,3,3,4,3,2,4,2}; // true

		Solution1 sol = new Solution1();
		System.out.println(sol.containsDuplicate(case1));
		System.out.println(sol.containsDuplicate(case2));
		System.out.println(sol.containsDuplicate(case3));
		
	}
	
	public static void testSolution2() {
		int[] case1 = new int[] {1,2,3,1}; // true - duplicates
		int[] case2 = new int[] {1,2,3,4}; // false, no duplicates
		int[] case3 = new int[] {1,1,1,3,3,4,3,2,4,2}; // true
		Solution2 sol = new Solution2();
		System.out.println(sol.containsDuplicate(case1));
		System.out.println(sol.containsDuplicate(case2));
		System.out.println(sol.containsDuplicate(case3));
	}	

}
