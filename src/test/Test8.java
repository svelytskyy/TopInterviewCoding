package test;

import java.util.Arrays;

public class Test8 {
	
	
	  // convert max heap to min heap (O(n))
    public static int[] convertToMinHeap(int[] maxHeap) {

        if (maxHeap == null) {
            throw new IllegalArgumentException("The given max heap cannot be null");
        }

        // build heap from last node to all the way up to the root node
        int p = getParent(maxHeap.length -1);
        while (p >= 0) {
            heapifyMin(maxHeap, p);
            p--;
        }
        return maxHeap;
    }

    // heapify the node at index p and its two direct children    
    private static void heapifyMin(int[] maxHeap, int p) {
    	if(getChild(p,true) < maxHeap.length && getChild(p,false) < maxHeap.length ) {
        // get left and right child of node at index p
    		System.out.println(Arrays.toString(maxHeap));
	        int left = getChild(p, true);
	        int right = getChild(p, false);
	
	        int smallest = p;
	
	        // compare maxHeap[p] with its left and 
	        // right child and find the smallest value
	        
	        if ((left < maxHeap.length) && (maxHeap[left] < maxHeap[p])) {
	            smallest = left;
	        }
	
	        if ((right < maxHeap.length) && (maxHeap[right] < maxHeap[smallest])) {
	            smallest = right;
	        }
	        
	        // swap 'smallest' with 'p' and heapify
	        if (smallest != p) {
	            swap(maxHeap, p, smallest);
	            heapifyMin(maxHeap, smallest);
	        }
    	}
    }
    
    public static int getParent(int index) {
        // Calculate the index of the parent node
        return (index - 1) / 2;
    }

    public static int getChild(int index, boolean left) {
        // Calculate the index of the child node (left or right)
        return 2 * index + (left ? 1 : 2);
    }

    // utility function to swap two indices in the array
    private static void swap(int heap[], int i, int j) {
        int tmp = heap[i];
        heap[i] = heap[j];
        heap[j] = tmp;
    }

	public static void main(String[] args) {
		//System.out.println(Arrays.toString(new int[] {60,45,35,25,12,20,10}));
		int[] arr = new int[] {60,45,35,25,12,20,10};
		convertToMinHeap(arr);
		System.out.println(Arrays.toString(arr));
		//System.out.println(Arrays.toString(convertToMinHeap(new int[] {60,45,35,25,12,20,10})));
		//System.out.println(Arrays.toString(convertToMinHeap(new int[] {11,53,13,45,26,11,76})));

	}

}
