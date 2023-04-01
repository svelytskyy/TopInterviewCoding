package m13_k_smallest_in_sorted_matrix;

import java.util.Comparator;
import java.util.PriorityQueue;

class HeapNode {

	  int row;
	  int column;
	  int value;

	  public HeapNode(int v, int r, int c) {
	    this.value = v;
	    this.row = r;
	    this.column = c;
	  }

	  public int getValue() {
	    return this.value;
	  }

	  public int getRow() {
	    return this.row;
	  }

	  public int getColumn() {
	    return this.column;
	  }	  
	  
}

class HeapComparator implements Comparator<HeapNode> {
	  public int compare(HeapNode x, HeapNode y) {
	    return x.value - y.value;
	  }
}


public class Solution1{

	public static void main(String[] args) {
			
		int[][] arr = new int[][] {{1,5,9},{10,11,13},{12,13,15}};
		System.out.println(kthSmallest(arr, 8));
		
	}
	
	 public static int kthSmallest(int[][] matrix, int k) {
	    int N = matrix.length;
	    PriorityQueue<HeapNode> minHeap =  new PriorityQueue<HeapNode>(Math.min(N, k), new HeapComparator());
	    // Preparing our min-heap
	    for (int r = 0; r < Math.min(N, k); r++) {
	           minHeap.offer(new HeapNode(matrix[r][0], r, 0));
	    }
	    HeapNode element = minHeap.peek();
	    while (k > 0) {
	       k--;
	       element = minHeap.poll();
	      int r = element.getRow(), c = element.getColumn();
	       if (c < N - 1) {
	          minHeap.offer(new HeapNode(matrix[r][c + 1], r, c + 1));
	      }
	    }
	    return element.getValue();
	  }


}
