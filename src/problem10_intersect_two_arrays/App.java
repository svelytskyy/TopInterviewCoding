package problem10_intersect_two_arrays;

import java.util.Arrays;

public class App {

	public static void main(String[] args) {
		Solution s = new Solution();
		int[] res = s.intersect(new int[] {}, new int[] {});
		System.out.println(Arrays.toString(res));
		
		res = s.intersect(new int[] {4,9,5}, new int[] {9,4,9,8,4});
		System.out.println(Arrays.toString(res));
		
		res = s.intersect(new int[] {1,2,2,1}, new int[] {2,2});
		System.out.println(Arrays.toString(res));


	}

}
