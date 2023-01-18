package problem03_valid_parentheses;

public class App {

	public static void main(String[] args) {
		
		Solution1 solution1 = new Solution1();
		String s1 = "()"; //true
		String s2 = "()[]{}"; //true
		String s3 = "(]";  //false
		
		
		boolean res1 = solution1.isValid(s1);
		boolean res2 = solution1.isValid(s2);
		boolean res3 = solution1.isValid(s3);
		
		System.out.println("res1 : " + res1);
		System.out.println("res2 : " + res2);
		System.out.println("res3 : " + res3);

	}

}
