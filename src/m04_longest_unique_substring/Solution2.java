package m04_longest_unique_substring;

import java.util.HashSet;
import java.util.Set;

//brute force
public class Solution2 {
	
    public int lengthOfLongestUniqueSubstring(String s) {
        int res = 0;
        for (int i = 0; i < s.length(); i++) {
            for (int j = i; j < s.length(); j++) {
                if (isUnique(s, i, j)) {
                    res = Math.max(res, j - i + 1);
                }
            }
        }
        return res;
    }

    private boolean isUnique(String s, int start, int end) {
        Set<Character> cache = new HashSet<>();
        for (int i = start; i <= end; i++) {
            char c = s.charAt(i);
            if(cache.contains(c)){
                return false;
            }
            cache.add(c);
        }
        return true;
    }

}
