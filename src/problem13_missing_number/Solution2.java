package problem13_missing_number;

import java.util.HashSet;
import java.util.Set;

//O(n), O(n)
public class Solution2 {
	
	public int missingNumber(int[] nums) {
		Set<Integer> cache = new HashSet<>();
		for(int num : nums) cache.add(num);
		for(int num = 0; num<nums.length+1; num++) {
			if(!cache.contains(num)) return num;
		}
		throw new RuntimeException("not found");
	}

}
