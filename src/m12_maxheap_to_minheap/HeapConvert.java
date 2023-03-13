package m12_maxheap_to_minheap;

import java.util.Arrays;

public class HeapConvert {
	
	  // convert max heap to min heap (O(n))
    public static void convertToMinHeap(int[] maxHeap) {

        if (maxHeap == null) {
            throw new IllegalArgumentException("The given max heap cannot be null");
        }

        // build heap from last node to all the way up to the root node
        int p = getParent(maxHeap.length -1);
        while (p >= 0) {
            heapifyMin(maxHeap, p);
            p--;
        }
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

    
    // heapify the node at index p and its two direct children    
    private static void heapifyMax(int[] minHeap, int p) {

        // get left and right child of node at index p
        int left = getChild(p,true);
        int right = getChild(p,false);
        int size = minHeap.length;
        
        int largest = p;

        // compare minHeap[p] with its left and 
        // right child and find the largest value
        if ((left < size) && (minHeap[left] > minHeap[p])) {
            largest = left;
        }

        if ((right < size) && (minHeap[right] > minHeap[largest])) {
            largest = right;
        }

        // swap 'largest' with 'p' and heapify
        if (largest != p) {
            swap(minHeap, p, largest);
            heapifyMax(minHeap, largest);
        }
    }
    

}
