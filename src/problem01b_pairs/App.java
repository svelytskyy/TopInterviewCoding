package problem01b_pairs;

import java.util.List;

public class App {

	public static void main(String[] args) {
		
		Solution1 s = new Solution1();
		List<String> case1 = s.getPairs(new int[] {-1,-4,0,-5,10,2,3,4,5}, 4);
		System.out.println(case1);
	}

}
