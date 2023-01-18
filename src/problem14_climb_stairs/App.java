package problem14_climb_stairs;

public class App {

	public static void main(String[] args) {
		Solution s = new Solution();
		
		int case1 = s.climbStairs(5); //8
		int case2= s.climbStairs(4); //5
		int case3= s.climbStairs(2); //2
		
		System.out.println(case1);
		System.out.println(case2);
		System.out.println(case3);

	}

}
