package problem15_plus_one;

import java.util.Arrays;

public class App {

	public static void main(String[] args) {
		testSolution();
	}
	
	public static void testSolution() {
		Solution s = new Solution();
		int[] case1 = s.plusOne(new int[] {9,9,9}); //[1,0,0,0]
		int[] case2 =  s.plusOne(new int[] {9});	// [1,0]
		int[] case3 =  s.plusOne(new int[] {2,9});  // [3,0]
		System.out.println("case1 = " + Arrays.toString(case1) + " case2 = " + Arrays.toString(case2) + " case3 = " + Arrays.toString(case3) );
	}

}
