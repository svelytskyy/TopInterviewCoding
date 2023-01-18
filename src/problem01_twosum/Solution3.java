package problem01_twosum;

import java.util.HashMap;
import java.util.Map;

public class Solution3 {
	
	Map<Integer, Integer> map = new HashMap<>();
	
	public int[] twoSum(int nums[], int target) {
		
		for(int i = 0; i< nums.length; i++) {
			int diff = target - nums[i];
			if(map.containsKey(diff)) {
				return new int[] {map.get(diff), i};
			}else {
				map.put(nums[i], i);
			}
		}
		
		throw new RuntimeException("no match found");
	}

}
