package problem02_roman_to_int;

import java.util.Map;

public class Solution1 {
	
	Map<Character, Integer> map = Map.of(
			 'I', 1,
			 'V', 5,
			 'X', 10,
			 'L', 50,
			 'C', 100,
			 'D', 500,
			 'M', 1000
			);
	
	public int romanToInt(String s) {
		int result = 0;
		
		if(s == null || s.isEmpty()) return 0;
		
		for(int i = 0; i<s.length(); i++) {
			Character c1 = s.charAt(i);
			Character c2 = (i!= s.length()-1)?s.charAt(i+1):null;
			Integer sCase = processSubsructCase(c1, c2);
			if(sCase != null) {
				result += sCase;
				i++;
			}else {
				result += map.get(c1);
			}
		}
		
		return result;
	}
	
	public Integer processSubsructCase(Character c1, Character c2) {
		if(c1 == null || c2 == null) return null;
		if(c1 == 'I' && c2 == 'V') return 4;
		if(c1 == 'I' && c2 == 'X') return 9;
		if(c1 == 'X' && c2 == 'L') return 40;
		if(c1 == 'X' && c2 == 'C') return 90;
		if(c1 == 'C' && c2 == 'D') return 400;
		if(c1 == 'C' && c2 == 'M') return 900;
		return null;
	}


}
