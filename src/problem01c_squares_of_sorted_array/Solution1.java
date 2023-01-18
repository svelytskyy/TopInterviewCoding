package problem01c_squares_of_sorted_array;

import java.util.Arrays;

//O(nlog n)
public class Solution1 {
	
	public int[] sortedSquares(int[] nums) {
        int n = nums.length;
        int[] res = new int[n];
        for (int i = 0; i < n; i++)
            res[i] = nums[i] * nums[i];

        Arrays.sort(res);
        return res;
    }


}
