package problem17_happy_number;

import java.util.HashSet;
import java.util.Set;

public class Solution1 {
	
	public boolean isHappy(int n) {
		Set<Integer>cache = new HashSet<>();
		while(n != 1 && !cache.contains(n)) {
			cache.add(n);
			n = getNext(n);
		}
		return n==1;
	}
	
	private int getNext(int n) {
		int sum = 0;
		while(n > 0) {
			int digit = n % 10;
			n = n / 10;
			sum += digit*digit;
		}
		return sum;
	}

}
