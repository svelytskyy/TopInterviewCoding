package m12_maxheap_to_minheap;

import java.util.Arrays;

public class App {

	public static void main(String[] args) {
		int[] arr = new int[] {60,45,35,25,12,20,10};
		HeapConvert.convertToMinHeap(arr);
		System.out.println(Arrays.toString(arr));

	}

}
