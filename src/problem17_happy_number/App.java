package problem17_happy_number;

public class App {

	public static void main(String[] args) {
		testSolution1();
		testSolution2();
	}
	
	public static void testSolution1() {
		Solution1 s = new Solution1();
		System.out.println("Solution1 : ");
		System.out.println(s.isHappy(19)); //true
		System.out.println(s.isHappy(116)); //false
	}
	
	public static void testSolution2() {
		Solution2 s = new Solution2();
		System.out.println("Solution2 : ");
		System.out.println(s.isHappy(19)); //true
		System.out.println(s.isHappy(116)); //false
	}


}
