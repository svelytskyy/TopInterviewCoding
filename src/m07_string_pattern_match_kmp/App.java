package m07_string_pattern_match_kmp;

public class App {

	public static void main(String[] args) {
		String text = "onionions";
		String pattern = "onions";
		System.out.println("text="+text);
		System.out.println("pattern=" + pattern);
		
		Solution1 s1 = new Solution1();
		Solution2 s2 = new Solution2();
		
		System.out.println(s1.findNeedle(pattern, text));
		System.out.println(s2.search(text, pattern));


	}

}
