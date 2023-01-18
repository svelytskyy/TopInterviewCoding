package problem13_missing_number;

import java.util.Arrays;

public class Solution1 {
	 public int missingNumber(int[] nums) {
	        Arrays.sort(nums);
	        for(int i=0; i<nums.length; i++){
	            if(nums[i] !=i) return i;
	        }
	        return nums.length;
	    }
}
