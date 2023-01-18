package problem13_missing_number;

public class Solution3 {
    public int missingNumber(int[] nums) {
        int ln = nums.length;
        for (int i = 0; i < nums.length; i++) {
            ln ^= i ^ nums[i];
        }
        return ln;
    }
}
