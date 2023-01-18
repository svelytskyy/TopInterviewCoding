package m06_longest_palindrom_substring_dp_part2;

public class App {

	public static void main(String[] args) {
		
		Solution1 sol = new Solution1();
		String s1 = "XcabacYaba";
		String s2 = "XcabbacYaca";
		System.out.println(sol.longestPalindrome(s1));
		System.out.println(sol.longestPalindrome(s2));
	}

}
