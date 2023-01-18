package problem08_single_number;

public class Solution3 {
	
	public int singleNumber(int[] nums) {
		int res = 0;
		for(int a : nums) {
			res = res ^ a;
		}
		return res;
	}

}
