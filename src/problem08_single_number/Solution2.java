package problem08_single_number;

import java.util.Arrays;

public class Solution2 {
	 public int singleNumber(int[] nums) {
	        Arrays.sort(nums);
	        int ln = nums.length;
	        if(ln ==1) return nums[0];
            if(nums[0] != nums[1]) return nums[0];
            if(nums[ln-1] != nums[ln-2]) return nums[ln-1];
	        for(int i = 0; i<ln; i++){
	            if( i!= ln-1 && i>1 && nums[i-1] != nums[i] && nums[i] != nums[i+1]) 
	                return nums[i];
	        }
	        return 0;
	    }
}
