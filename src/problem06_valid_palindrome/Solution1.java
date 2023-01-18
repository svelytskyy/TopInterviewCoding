package problem06_valid_palindrome;

public class Solution1 {
	
	public boolean isPalindrome(String s) {
		int left = 0;
		int right = s.length()-1;
		
		if(s.length() == 1) return true;
		
		while(left < right) {
			char c1 = Character.toLowerCase(s.charAt(left));
			char c2 = Character.toLowerCase(s.charAt(right));
			if(!Character.isLetterOrDigit(c1)) {
				left++;
				continue;
			}
			if(!Character.isLetterOrDigit(c2)) {
				right--;
				continue;
			}
			if(c1 != c2) return false;
			left++;
			right--;

		}
		return true;
	}

}
