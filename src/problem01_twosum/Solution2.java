package problem01_twosum;

//recursion

public class Solution2 {
	
	public int[] twoSum(int[] nums, int target) {
		return twoSumHelper(0, 1, nums, target);
	}
	
	private int[] twoSumHelper(int i, int j, int[] nums, int target) {
		if(j == nums.length) {
			return twoSumHelper(i+1, i+2, nums, target);
		}
		if(i == nums.length-1) throw new RuntimeException("no match found");
		if(nums[i] + nums[j] == target) return new int[] {i, j};
		return twoSumHelper(i, j+1, nums, target);
	}

}
