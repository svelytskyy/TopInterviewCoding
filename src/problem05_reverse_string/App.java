package problem05_reverse_string;

import java.util.Arrays;

public class App {

	public static void main(String[] args) {
		Solution sol = new Solution();
		char[] s = new char[] {'h','e', 'l', 'l', 'o'};
		System.out.println(Arrays.toString(s));
		sol.reverseString(s);
		System.out.println(Arrays.toString(s));
		
		String str = "hello";
		StringBuilder sb = new StringBuilder(str);
		System.out.println(sb.reverse().toString());
	}

}
