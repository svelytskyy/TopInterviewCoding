package m04_longest_unique_substring;

import java.util.HashMap;
import java.util.Map;

//improved sliding window
public class Solution3 {
	
    public int lengthOfLongestUniqueSubstring(String s) {
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

}
