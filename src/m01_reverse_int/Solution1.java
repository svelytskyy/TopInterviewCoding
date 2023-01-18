package m01_reverse_int;

public class Solution1 {
	
	public int reverse(int n) {
		long res = 0;
		while(n != 0) {
			res = res*10 + n%10;
			n = n / 10;
		}
		if(res > Integer.MAX_VALUE || res < Integer.MIN_VALUE) return 0;
		else return (int)res;
	}

}
