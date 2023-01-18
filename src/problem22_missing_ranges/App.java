package problem22_missing_ranges;

import java.util.List;

public class App {

	public static void main(String[] args) {
		Solution s = new Solution();
		List<String> case1 = s.getRanges(new int[] {1,4,5,10,12}, -2, 17);
		List<String> case2 = s.getRanges(new int[] {-1}, -1, -1);
		System.out.println(case1);
		System.out.println(case2);
	}

}
