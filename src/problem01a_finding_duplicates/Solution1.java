package problem01a_finding_duplicates;

import java.util.BitSet;

public class Solution1 {
	
	private final int MAX_NUMBER = 32000;
	
	public void printDuplicates(int[] nums) {
		BitSet bits = new BitSet(MAX_NUMBER);
		for(int i = 0; i < nums.length; i++) {
			int num = nums[i];
			if(bits.get(num)) {
				System.out.println("Duplicate : " + num);
			}else {
				bits.set(num);
			}
		}
	}

}
