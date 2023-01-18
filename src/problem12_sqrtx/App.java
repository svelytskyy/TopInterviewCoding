package problem12_sqrtx;

public class App {

	public static void main(String[] args) {
		testSolution1();
		testSolution2();
	}
	
	public static void testSolution1() {
		Solution1 s = new Solution1();
		int case1 = s.mySqrt(12);
		int case2 = s.mySqrt(1);
		int case3 = s.mySqrt(100);
		System.out.println("case1 = " + case1 + " case2 = " + case2 + " case3 = " + case3);
	}
	
	public static void testSolution2() {
		Solution2 s = new Solution2();
		int case1 = s.mySqrt(12);
		int case2 = s.mySqrt(1);
		int case3 = s.mySqrt(100);
		System.out.println("case1 = " + case1 + " case2 = " + case2 + " case3 = " + case3);
	}


}
