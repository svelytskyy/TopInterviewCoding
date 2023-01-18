package m05_longest_palindrom_substring;

public class App {

	public static void main(String[] args) {
		String s1 = "ZZZabccbaQWEaba"; //even case
		String s2 = "XXXabcdcbaQWEaba"; //odd case
		String s3 = "abcdefgh";  
		
		Solution1 s = new Solution1();
		System.out.println(s.longestPalindromSubstring(s1));
		System.out.println(s.longestPalindromSubstring(s2));
		System.out.println(s.longestPalindromSubstring(s3));

	}

}
