package m17_rotate_image_matrix;

import java.util.Arrays;

public class App {

	public static void main(String[] args) {
		
		int[][] a1 = new int[][] {{1,2,3},{4,5,6},{7,8,9}};
		int[][] a2 = new int[][] {{1,2,3},{4,5,6},{7,8,9}};
		
		Solution1 s1 = new Solution1();
		s1.rotate(a1);
		
		Solution1 s2 = new Solution1();
		s2.rotate(a2);
		
		System.out.println(Arrays.deepToString(a1));
		System.out.println(Arrays.deepToString(a2));

	}

}
