package m06_longest_palindrom_substring_dp_part2;

public class Solution1 {
	//T = O(n^2), S = o(n^2)
	public String longestPalindrome(String s) {
	    if (s == null || s.length() == 0) {
	        return "";
	      }

	      int n = s.length();
	      String longest = s.substring(0, 1);
	      boolean[][] dp = new boolean[n][n];

	      // every string with one character is a palindrome
	      for (int i = 0; i < n; i++) {
	        dp[i][i] = true;
	      }

	      // fill the dp table
	      for (int len = 2; len <= n; len++) {
	        for (int i = 0; i < n - len + 1; i++) {
	          int j = i + len - 1;
	          if (len == 2) {
	            dp[i][j] = (s.charAt(i) == s.charAt(j));
	          } else {
	            dp[i][j] = (s.charAt(i) == s.charAt(j)) && dp[i + 1][j - 1];
	          }

	          // update the longest palindromic substring if needed
	          if (dp[i][j] && len > longest.length()) {
	            longest = s.substring(i, j + 1);
	          }
	        }
	      }

	      return longest;
    }	

}
