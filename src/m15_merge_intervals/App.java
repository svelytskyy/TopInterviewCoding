package m15_merge_intervals;

import java.util.Arrays;

public class App {

	public static void main(String[] args) {
		Solution1 s = new Solution1();
		int[][] result = s.merge(new int[][] {{2,5},{1,4},{9,10},{6,9}});
		for(int r[] : result) {
			System.out.print(Arrays.toString(r) +  " ");
		}

	}

}
