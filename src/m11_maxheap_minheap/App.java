package m11_maxheap_minheap;

import java.util.Comparator;
import java.util.PriorityQueue;

public class App {

	public static void main(String[] args) {
		MinHeap minHeap = new MinHeap(5);
		minHeap.insert(100);
		minHeap.insert(200);
		minHeap.insert(50);
		minHeap.insert(10);
		minHeap.insert(13);
		minHeap.printHeap();
		for(int i = 0; i<5; i++) {
			System.out.print(minHeap.deleteMinValue() +  " ");
		}
		
		System.out.println();
		MaxHeap maxHeap = new MaxHeap(5);
		maxHeap.insert(100);
		maxHeap.insert(200);
		maxHeap.insert(50);
		maxHeap.insert(10);
		maxHeap.insert(13);
		maxHeap.printHeap();
		for(int i = 0; i<5; i++) {
			System.out.print(maxHeap.deleteMaxValue() +  " ");
		}
		
		System.out.println("\nPriority queue");
		PriorityQueue<Integer> pqueue = new PriorityQueue<>(5);
		pqueue.add(100);
		pqueue.add(200);
		pqueue.add(50);
		pqueue.add(10);
		pqueue.add(13);
		System.out.println(pqueue);
		for(int i = 0; i<5; i++) {
			System.out.print(pqueue.poll() +  " ");
		}
		
		System.out.println("\nPriority queue reversed");
		pqueue = new PriorityQueue<>(5, Comparator.reverseOrder());
		pqueue.add(100);
		pqueue.add(200);
		pqueue.add(50);
		pqueue.add(10);
		pqueue.add(13);
		System.out.println(pqueue);
		for(int i = 0; i<5; i++) {
			System.out.print(pqueue.poll() +  " ");
		}
	}

}
