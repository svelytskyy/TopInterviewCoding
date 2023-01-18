package problem11_majority_element;

import java.util.HashMap;
import java.util.Map;

public class Solution {
	
	public int majorityElement(int[] nums) {
		Map<Integer, Integer> map = new HashMap<>();
		int ln = nums.length;
		for(int a : nums) {
			map.put(a, map.getOrDefault(a, 0)+1);
			if(map.get(a) > ln/2) return a;
		}
		return 0;
	}

}
