package problem12_sqrtx;

//O(log n)
public class Solution1 {
	
	public int mySqrt(int x) {
		if(x < 2) return x;
		int left = 2;
		int right = x/2;
		int pivot = 0;
		long num = 0;
		while(left < right) {
			pivot = left + (right-left)/2;
			num = (long)pivot*pivot;
			if(num > x) right = pivot-1;
			else if(num < x) left = pivot +1;
			else return pivot;
		}
		return right;
	}

}
