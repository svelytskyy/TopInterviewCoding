package problem09_first_uniq_char;

import java.util.HashMap;
import java.util.Map;

//O(2n) == O(n), O(n)
public class Solution {
	
	public int firstUniqChar(String s) {
		Map<Character, Integer> cache = new HashMap<>();
		for(char c : s.toCharArray()) {
			cache.put(c, cache.getOrDefault(c, 0)+1);
		}
		for(int i=0; i<s.length(); i++) {
			char c = s.charAt(i);
			if(cache.get(c) == 1) return i;
		}
		return -1;
	}

}
