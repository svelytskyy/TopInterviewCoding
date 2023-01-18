package problem04_max_profit_stock;

public class App {

	public static void main(String[] args) {
		
		int[] case1 = new int[] {7,1,5,3,6,4};
		int[] case2 = new int[] {};
		int[] case3 = new int[] {7,6,4,3,1};
		
		Solution1 s1 = new Solution1();
		System.out.println("Solution 1 BFSA O(n^2) :");
		System.out.println(s1.maxProfit(case1));
		System.out.println(s1.maxProfit(case2));
		System.out.println(s1.maxProfit(case3));
		
		Solution1 s2= new Solution1();
		System.out.println("Solution 2 O(n) :");
		System.out.println(s2.maxProfit(case1));
		System.out.println(s2.maxProfit(case2));
		System.out.println(s2.maxProfit(case3));


	}

}
