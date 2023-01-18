package m05_longest_palindrom_substring;

public class Solution1 {
	
	public String longestPalindromSubstring(String s) {
		if(s == null || s.length() == 0) return "";	
		int start = 0, end = 0;
		for(int i = 0; i< s.length(); i++) {
			int len1 = expandAroundCenter(s, i, i); // odd case
			int len2 = expandAroundCenter(s, i, i+1); // even case
			int len = Math.max(len1, len2);
			if (len > end - start) {
				start = i - (len-1)/2;
				end = i + len/2;
			}
		}
		return s.substring(start, end +1); 
	}
	
	private int expandAroundCenter(String s, int i, int j) {
		while(i >= 0 && j < s.length() && s.charAt(i) == s.charAt(j)) {
			i--;
			j++;
		}
		return j-i-1;
	}

}
