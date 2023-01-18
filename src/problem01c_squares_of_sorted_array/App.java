package problem01c_squares_of_sorted_array;

import java.util.Arrays;

public class App {

	public static void main(String[] args) {
		Solution1 s1 = new Solution1();
		Solution2 s2 = new Solution2();
		System.out.println(Arrays.toString(s1.sortedSquares(new int[] {-10,-3,1,7,9,15})));
		System.out.println(Arrays.toString(s2.sortedSquares(new int[] {-10,-3,1,7,9,15})));

	}

}
