package problem22_missing_ranges;

import java.util.ArrayList;
import java.util.List;

public class Solution {
	
	public List<String> getRanges(int[] nums, int low, int upper){
		List<String> result = new ArrayList<>();
		int prev = low - 1;
		for(int i = 0; i<= nums.length; i++) {
			int cur = (i < nums.length)?nums[i]:upper +1;
			String rs = buildRange(prev+1, cur -1);
			if(rs != null) result.add(rs);
			prev = cur;
		}
		return result;
	}
	
	private String buildRange(int low, int upper) {
		if(low > upper) return null;
		else if(low == upper) return String.valueOf(low);
		else return low + "->" + upper;
	}

}
