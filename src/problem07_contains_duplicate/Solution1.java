package problem07_contains_duplicate;

import java.util.HashSet;
import java.util.Set;

public class Solution1 {
	
	
	public boolean containsDuplicate(int[] nums) {
		Set<Integer> cache = new HashSet<>();
		for(int i = 0; i< nums.length; i++) {
			if(cache.contains(nums[i])) {
				return true;
			}else {
				cache.add(nums[i]);
			}
		}
		return false;
	}

}
