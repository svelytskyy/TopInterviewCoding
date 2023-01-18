package m07_string_pattern_match_kmp;

//naive implementation

public class Solution1 {
	
	public int findNeedle(String needle, String haystack) {
		int nLen = needle.length(); 
		int hLen = haystack.length(); 
		for (int i = 0;  i < hLen - nLen + 1;  i++) {
			if (haystack.substring(i,  i + nLen).equals(needle)) { 
				return i; 
			}
	 	} 
		return -1; 
	}
	
	
}
