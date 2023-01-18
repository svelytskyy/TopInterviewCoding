package problem01b_pairs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Solution1 {
	
	public List<String> getPairs(int[] nums, int N){
		if(nums == null || nums.length < 2) {
			return Collections.emptyList();
		}
		List<String> result = new ArrayList<>();
		Arrays.sort(nums);
		int l = 0;
		int r = nums.length-1;
		while(l < r) {
			int s = nums[l] + nums[r];
			if(s == N) {
				result.add("(" + nums[l] + "," + nums[r] +")");
				l++;
				r--;
			}else if(s < N) {
				l++;
			}else{
				r--;
			}
		}
		return result;
	}

}
