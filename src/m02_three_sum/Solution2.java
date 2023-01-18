package m02_three_sum;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Solution2 {
	
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> res = new ArrayList<>();
        for (int i = 0; i < nums.length && nums[i] <= 0; i++)
            if (i == 0 || nums[i - 1] != nums[i]) {
                twoSum(nums, i, res);
            }
        return res;
    }
    void twoSum(int[] nums, int i, List<List<Integer>> res) {
        Set<Integer> cache = new HashSet<Integer>();
        for (int j = i + 1; j < nums.length; ++j) {
            int diff = 0 - nums[i] - nums[j];
            if (cache.contains(diff)) {
                res.add(Arrays.asList(nums[i], nums[j], diff));
                while (j + 1 < nums.length && nums[j] == nums[j + 1])
                    j++;
            }
            cache.add(nums[j]);
        }
    }

}
