package problem11_majority_element;

public class App {

	public static void main(String[] args) {
			
		int[] case1 = new int[] {3,2,3};  //3
		int[] case2 = new int[] {2,2,1,1,1,2,2}; //2
		int[] case3 = new int[] {}; //0
		int[] case4 = new int[] {1}; //1
		
		Solution sol = new Solution();
		System.out.println(sol.majorityElement(case1));
		System.out.println(sol.majorityElement(case2));
		System.out.println(sol.majorityElement(case3));
		System.out.println(sol.majorityElement(case4));
		

	}

}
