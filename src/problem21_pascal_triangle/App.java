package problem21_pascal_triangle;

import java.util.List;

public class App {

	public static void main(String[] args) {
		Solution1 s = new Solution1();
		List<List<Integer>> pt = s.getPascalTriangle(5);
		System.out.println(pt);
	}

}
