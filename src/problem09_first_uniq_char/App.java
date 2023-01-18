package problem09_first_uniq_char;

public class App {

	public static void main(String[] args) {
		
		Solution s = new Solution();
		System.out.println(s.firstUniqChar("leetcode")); //0
		System.out.println(s.firstUniqChar("loveleetcode")); //2
		System.out.println(s.firstUniqChar("aabb")); //-1
	}

}
