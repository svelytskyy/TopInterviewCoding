package m02_three_sum;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution1 {
	
	List<List<Integer>> res = new ArrayList<>();
	
	public List<List<Integer>> threeSum(int[] nums){
		Arrays.sort(nums);
		for(int i=0; i<nums.length-2 && nums[i] <= 0; i++) { //-1 + 0 +1
			if(i == 0 || nums[i-1] != nums[i])
				twoSum(nums, i);
		}
		return res;
	}
	
	public List<List<Integer>> twoSum(int nums[], int i){
		int left = i+1;
		int right = nums.length-1;
		while(left < right) {
			int sum = nums[i] + nums[left] + nums[right];
			if(sum > 0) right--;
			else if(sum < 0) left++;
			else {
				res.add(List.of(nums[i], nums[left], nums[right]));
				left++;
				right--;
				while(left < right && nums[left] == nums[left-1]) {
					left++;
				}
			}
		}
		return res;
	}

}
