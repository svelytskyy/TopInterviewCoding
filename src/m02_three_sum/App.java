package m02_three_sum;

import java.util.List;

public class App {

	public static void main(String[] args) {
		 testSolution1();
		 testSolution2();

	}
	
	public static void testSolution1() {
		Solution1 s = new Solution1();
		List<List<Integer>> case1 = s.threeSum(new int[] {-1,0,1,2,-1,-4});
		s = new Solution1();
		List<List<Integer>> case2 = s.threeSum(new int[] {0,1,1});
		s = new Solution1();
		List<List<Integer>> case3 = s.threeSum(new int[] {0,0,0});
		System.out.println("case1 :  " + case1 +  " case 2 : " + case2 + " case3 :" + case3 );
	}
	
	public static void testSolution2() {
		Solution2 s = new Solution2();
		List<List<Integer>> case1 = s.threeSum(new int[] {-1,0,1,2,-1,-4});
		List<List<Integer>> case2 = s.threeSum(new int[] {0,1,1});
		List<List<Integer>> case3 = s.threeSum(new int[] {0,0,0});
		System.out.println("case1 :  " + case1 +  " case 2 : " + case2 + " case3 :" + case3 );
	}


}
