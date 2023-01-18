package test;

public class Test2 {

	public static void main(String[] args) {
		String s1 = "ZZZabccbaXXX";
		String s2 = "XXXabcdcbaZZZ";
		String s3 = "abcdefgh";
		System.out.println(longestPalindromicSubstring(s1));
		System.out.println(longestPalindromicSubstring(s2));
		System.out.println(longestPalindromicSubstring(s3));
	}
	
	public static String longestPalindromicSubstring(String s) {
	    if (s == null || s.length() == 0) {
	        return "";
	    }
	    int start = 0;
	    int end = 0;
	    for (int i = 0; i < s.length(); i++) {
	        int len1 = expandAroundCenter(s, i, i);
	        int len2 = expandAroundCenter(s, i, i + 1);
	        int len = Math.max(len1, len2);
	        if (len > end - start) {
	            start = i - (len - 1) / 2;
	            end = i + len / 2;
	        }
	    }
	    return s.substring(start, end + 1);
	}
	private static int expandAroundCenter(String s, int i, int j) {
	    while (i >= 0 && j < s.length() && s.charAt(i) == s.charAt(j)) {
	        i--;
	        j++;
	    }
	    return j - i - 1;
	}
	
	public String longestPalindromicSubstring2(String s) {
	    if (s == null || s.length() == 0) {
	        return "";
	    }
	    int[][] dp = new int[s.length()][s.length()];
	    int start = 0;
	    int end = 0;
	    for (int len = 1; len <= s.length(); len++) {
	        for (int i = 0; i < s.length() - len + 1; i++) {
	            int j = i + len - 1;
	            if (len == 1) {
	                dp[i][j] = 1;
	            }
	            else if (len == 2) {
	                dp[i][j] = (s.charAt(i) == s.charAt(j)) ? 2 : 0;
	            }
	            else {
	                dp[i][j] = (s.charAt(i) == s.charAt(j) && dp[i + 1][j - 1] > 0) ? dp[i + 1][j - 1] + 2 : 0;
	            }
	            if (dp[i][j] > end - start) {
	                start = i;
	                end = j;
	            }
	        }
	    }

	    return s.substring(start, end + 1);
	}



}
