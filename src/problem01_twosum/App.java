package problem01_twosum;

import java.util.Arrays;

public class App {

	public static void main(String[] args) {
		//testSolution1();
		//testSolution2();
		testSolution3();
	}
	
	public static void testSolution1() {
		
		System.out.println("###### Solution 1 : ########");
		
		Solution1 sol1 = new Solution1();
		int[] result = sol1.twoSum(new int[] {2,7,11,15}, 22);
		System.out.println("Test case 1 : " + Arrays.toString(result));
		
		result = sol1.twoSum(new int[]{}, 10);
		System.out.println("Test case 2 : " + Arrays.toString(result));
	}


	public static void testSolution2() {
		
		System.out.println("###### Solution 2 : ########");
		
		Solution2 sol1 = new Solution2();
		int[] result = sol1.twoSum(new int[] {2,7,11,15}, 22);
		System.out.println("Test case 1 : " + Arrays.toString(result));
		
		result = sol1.twoSum(new int[]{}, 10);
		System.out.println("Test case 2 : " + Arrays.toString(result));
	}

	public static void testSolution3() {
		
		System.out.println("###### Solution 3 : ########");
		
		Solution3 sol1 = new Solution3();
		int[] result = sol1.twoSum(new int[] {2,7,11,15}, 22);
		System.out.println("Test case 1 : " + Arrays.toString(result));
		
		result = sol1.twoSum(new int[]{}, 10);
		System.out.println("Test case 2 : " + Arrays.toString(result));
	}

	
}
