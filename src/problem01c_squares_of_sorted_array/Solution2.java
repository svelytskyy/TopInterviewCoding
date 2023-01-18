package problem01c_squares_of_sorted_array;

public class Solution2 {
	//O(n)
	 public int[] sortedSquares(int[] nums) {
	        int n = nums.length;
	        int[] result = new int[n];
	        int left = 0;
	        int right = n - 1;
	        int indx = n-1;
	        while(left <= right) {
	            int square;
	            if (Math.abs(nums[left]) < Math.abs(nums[right])) {
	                square = nums[right];
	                right--;
	            } else {
	                square = nums[left];
	                left++;
	            }
	            result[indx] = square * square;
	            indx--;
	        }
	        return result;
	    }

}
