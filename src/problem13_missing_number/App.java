package problem13_missing_number;

public class App {

	public static void main(String[] args) {
		testSolution1();
		testSolution2();
		testSolution3();
	}
	
	public static void testSolution1() {
		int[] case1 = new int[] {3,0,1}; //2
		int[] case2 = new int[] {0,1}; // 2
		int[] case3 = new int[] {9,6,4,2,3,5,7,0,1}; //8
		
		Solution1 s = new Solution1();
		System.out.println("Solution1 : ");
		System.out.println(s.missingNumber(case1) +  " " + s.missingNumber(case2) +  " " + s.missingNumber(case3));
	}
	
	public static void testSolution2() {
		int[] case1 = new int[] {3,0,1}; //2
		int[] case2 = new int[] {0,1}; // 2
		int[] case3 = new int[] {9,6,4,2,3,5,7,0,1}; //8
		
		Solution2 s = new Solution2();
		System.out.println("Solution2 : ");
		System.out.println(s.missingNumber(case1) +  " " + s.missingNumber(case2) +  " " + s.missingNumber(case3));
	}

	public static void testSolution3() {
		int[] case1 = new int[] {3,0,1}; //2
		int[] case2 = new int[] {0,1}; // 2
		int[] case3 = new int[] {9,6,4,2,3,5,7,0,1}; //8
		
		Solution3 s = new Solution3();
		System.out.println("Solution3 : ");
		System.out.println(s.missingNumber(case1) +  " " + s.missingNumber(case2) +  " " + s.missingNumber(case3));
	}


}
