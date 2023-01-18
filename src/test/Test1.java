package test;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Test1 {

	public static void main(String[] args) {
		String s = "abcabca";
		System.out.println(lengthOfLongestUniqueSubstring(s));
		System.out.println(lengthOfLongestUniqueSubstring1(s));
		System.out.println(lengthOfLongestUniqueSubstring2(s));
	}
	
    public static int lengthOfLongestUniqueSubstring(String s) {
       Set<Character> cache = new HashSet<>();
        int left = 0, right = 0, max = 0;
        while (right < s.length()) {
        	if(!cache.contains(s.charAt(right))) {
        		cache.add(s.charAt(right));
        		right++;
        	}else {
        		cache.remove(s.charAt(left));
        		left++;
        	}
        	max = Math.max(right-left, max);
        }
        return max;
    }
    
    public static int lengthOfLongestUniqueSubstring1(String s) {
    // Initialize a map to store the last index of each character
    Map<Character, Integer> lastIndex = new HashMap<>();
    // Initialize the longest substring length to 0
    int longest = 0;
    // Initialize the start index of the current substring to 0
    int start = 0;
    // Iterate through each character in the string
    for (int i = 0; i < s.length(); i++) {
        char c = s.charAt(i);
        // If the character has been seen before in the current substring
        if (lastIndex.containsKey(c) && lastIndex.get(c) >= start) {
            // Update the start index to be one character after the previous occurrence of the character
            start = lastIndex.get(c) + 1;
        }
        // Update the last index of the character
        lastIndex.put(c, i);
        // Update the longest substring length if necessary
        longest = Math.max(longest, i - start + 1);
    }
    return longest;
    }
    
    
    
    public static int lengthOfLongestUniqueSubstring2(String s) {
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

    private static boolean isUnique(String s, int start, int end) {
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
