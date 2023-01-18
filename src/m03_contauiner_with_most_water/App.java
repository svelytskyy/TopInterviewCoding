package m03_contauiner_with_most_water;

public class App {

	public static void main(String[] args) {
		Solution1 s = new Solution1();
		System.out.println(s.maxArea(new int[] {1,8,6,2,5,4,8,3,7})); // 49
		System.out.println(s.maxArea(new int[] {1,1})); //1
	}

}
