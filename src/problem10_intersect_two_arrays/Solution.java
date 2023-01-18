package problem10_intersect_two_arrays;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution {
	
	public int[] intersect(int[] nums1, int[] nums2) {
		if(nums1.length < nums2.length) return intersect(nums2, nums1);
		Map<Integer, Integer> cache = new HashMap<>();
		
		for(int a : nums1) {
			cache.put(a, cache.getOrDefault(a, 0)+1);
		}
		List<Integer> res = new ArrayList<>();
		for(int a : nums2) {
			int count  = cache.getOrDefault(a, 0);
			if(count > 0) {
				res.add(a);
				cache.put(a,count - 1);
			}
		}
		//return res.stream().mapToInt(x -> x.intValue()).toArray();
		return res.stream().mapToInt(Integer::intValue).toArray();
	}

}
