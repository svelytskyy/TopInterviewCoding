package m04_longest_unique_substring;

import java.util.HashSet;
import java.util.Set;

//sliding window
public class Solution1 {
	
	public int lengthOfLongestUniqueSubstring(String s) {
		Set<Character> cache = new HashSet<>();
		int left = 0, right = 0, max = 0;
		
		while(right < s.length()) {
			if(!cache.contains(s.charAt(right))) {
				cache.add(s.charAt(right));
				right++;
			}else {
				cache.remove(s.charAt(left));
				left++;
			}
			max = Math.max(max, right-left);
		}
		
		return max;
	}

}
