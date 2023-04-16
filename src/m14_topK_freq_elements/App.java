package m14_topK_freq_elements;

import java.util.Arrays;

public class App {

	public static void main(String[] args) {
		
		int[] arr = new int[] {1,1,1,2,2,3};
		Solution1 s1 = new Solution1();
		Solution2 s2 = new Solution2();
		Solution3 s3 = new Solution3();
		System.out.println(Arrays.toString(s1.topKFrequent(arr, 2)));
		System.out.println(Arrays.toString(s2.topKFrequent(arr, 2)));
		System.out.println(Arrays.toString(s3.topKFrequent(arr, 2)));
	}

}
