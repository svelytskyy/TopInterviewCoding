package test;

import java.util.Arrays;

public class Test7 {

	public static void main(String[] args) {
		System.out.println(Arrays.toString(sortedSquares(new int[] {-10,-3,1,7,9,15})));

	}
	
	 public static int[] sortedSquares(int[] nums) {
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
