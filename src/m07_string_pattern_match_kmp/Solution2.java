package m07_string_pattern_match_kmp;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// K M P algorithm

public class Solution2 {
	
	/**
	 * creates an array of length pattern.length()+1
	 * @param pattern "abcxxxabcyyy"
	 * @return [-1, 0, 0, 0, 0, 0, 0, 1, 2, 3, 0, 0, 0]
	 */
	public int[] lps(String pattern) {
		int patternLen = pattern.length();
		int[] ar = new int[patternLen + 1];
		ar[0] = -1;
		ar[1] = 0;

		int prefixLen = 0;
		int i = 1;
		
		while (i < patternLen) {			
			if (pattern.charAt(prefixLen) == pattern.charAt(i)) { 
				prefixLen++;
				i++;
				ar[i] = prefixLen;
				
			} else if (prefixLen > 0) {
				prefixLen = ar[prefixLen]; // note  that we do not increment i here
				//prefixLen = 0;
			} else {
				i++;
				ar[i] = 0; // 'prefixLen' reached 0, so save that into ar[] and move forward
			}
		}
		System.out.println("lps : " + Arrays.toString(ar));
		return ar;
	}
	
	/**
	 * implementation is based on the pseudo code from Wikipedia: https://en.wikipedia.org/wiki/Knuth%E2%80%93Morris%E2%80%93Pratt_algorithm
	 * @param text
	 * @param pattern
	 * @return
	 */
	public List<Integer> search(String text, String pattern) {
		int t = 0; // the position of the current character in text
		int p = 0; // the position of the current character in pattern
		
		int tLen = text.length();
		int pLen = pattern.length();
		
		List<Integer> matches = new ArrayList<>();
		int[] lpsArr = lps(pattern);
		
		while (t < tLen) {
			if (pattern.charAt(p) == text.charAt(t)) {				
				p++;
				t++;
				
				if (p == pLen) {
					// occurrence found, if only first occurrence is needed then you could halt here
					matches.add(t-p);
					p = lpsArr[p]; // reset
				}				
			} else {
				p = lpsArr[p];
				if (p < 0) {
					t++;
					p++;
				}
			}
		}
		
		return matches;
	}

	
}
