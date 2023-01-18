package problem15_plus_one;

public class Solution {
	
	public int[] plusOne(int[] digits) {
		int ln = digits.length;
		for(int i = ln-1; i>=0; i--) {
			if(digits[i] == 9) digits[i] = 0;
			else {
				digits[i]++;
				return digits;
			}
		}
		digits = new int[ln+1];
		digits[0] = 1;
		return digits;
	}

}
