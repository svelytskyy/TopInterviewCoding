package problem08_single_number;

public class App {

	public static void main(String[] args) {
		testSolution3();
		testSolution2();
	}
	
	public static void testSolution3() {
		int[] case1 = new int[] {4,1,2,1,2};
		int[] case2 = new int[] {1};
		
		Solution3 sol = new Solution3();
		
		System.out.println(sol.singleNumber(case1));
		System.out.println(sol.singleNumber(case2));
	}
	
	public static void testSolution2() {
		int[] case1 = new int[] {4,1,2,1,2};
		int[] case2 = new int[] {1};
		
		Solution2 sol = new Solution2();
		
		System.out.println(sol.singleNumber(case1));
		System.out.println(sol.singleNumber(case2));
	}

}
