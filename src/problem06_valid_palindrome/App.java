package problem06_valid_palindrome;

public class App {

	public static void main(String[] args) {
		testSolution1();
	}
	
	public static void testSolution1() {
		String s1 = "A man, a plan, a canal: Panama"; //true
		String s2 =  "race a car"; //false
		
		Solution1 sol1 = new Solution1();
		System.out.println(sol1.isPalindrome(s1));
		System.out.println(sol1.isPalindrome(s2));
	}

}
