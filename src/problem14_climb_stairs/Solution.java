package problem14_climb_stairs;

public class Solution {
	
	public int climbStairs(int n) {
		int[] cache = new int[n+1];
		return helper_recursive(n, cache);
	}
	
	public int helper_recursive(int i, int[] cache) {
		if(i < 0) return 0;
		if(i == 0) return 1;
		if(cache[i] > 0) return cache[i];
		cache[i] = helper_recursive(i-1, cache) + helper_recursive(i-2, cache);
		return cache[i];
	}

}
