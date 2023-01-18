package m04_longest_unique_substring;

public class App {

	public static void main(String[] args) {
		String s = "abcabca";
		Solution1 s1 = new Solution1();
		Solution2 s2 = new Solution2();
		Solution3 s3 = new Solution3();
		System.out.println(s1.lengthOfLongestUniqueSubstring(s));
		System.out.println(s2.lengthOfLongestUniqueSubstring(s));
		System.out.println(s3.lengthOfLongestUniqueSubstring(s));
	}

}
