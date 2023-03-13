package m11_maxheap_minheap;

import java.util.Arrays;

public class MinHeap {

    private int[] heap;
    private int size;

    public MinHeap(int capacity) {
        heap = new int[capacity];
        size = 0;
    }

    public void insert(int value) {
        // Check if the heap is full
        if (isFull()) {
            throw new RuntimeException("Heap is full");
        }
        // Add the new element to the end of the heap
        heap[size] = value;
        // Fix the heap by moving the new element up the tree
        fixHeapAbove(size);
        size++;
    }

    public int deleteMinValue() {
        // Check if the heap is empty
        if (isEmpty()) {
            throw new RuntimeException("Heap is empty");
        }
        // Remove the minimum element (which is at the root of the heap)
        int minValue = heap[0];
        // Replace the root with the last element in the heap
        heap[0] = heap[size - 1];
        size--;
        // Fix the heap by moving the new root down the tree
        fixHeapBelow(0, size - 1);
        return minValue;
    }

    public void printHeap() {
        // Print the elements in the heap
    	System.out.println(Arrays.toString(heap));
    }

    public boolean isFull() {
        // Check if the heap is full
        return size == heap.length;
    }

    public boolean isEmpty() {
        // Check if the heap is empty
        return size == 0;
    }

    private void fixHeapAbove(int index) {
        // Get the value of the new element
        int newValue = heap[index];
        // Move the new element up the tree until it is in the correct position
        while (index > 0 && newValue < heap[getParent(index)]) {
            // Swap the new element with its parent
            heap[index] = heap[getParent(index)];
            index = getParent(index);
        }
        // Put the new element in its correct position
        heap[index] = newValue;
    }

    private void fixHeapBelow(int index, int lastHeapIndex) {
        // Find the child to swap with the current node
        int childToSwap;
        while (index <= lastHeapIndex) {
            int leftChild = getChild(index, true);
            int rightChild = getChild(index, false);
            if (leftChild <= lastHeapIndex) {
                if (rightChild > lastHeapIndex) {
                    childToSwap = leftChild;
                } else {
                    childToSwap = (heap[leftChild] < heap[rightChild]) ? leftChild : rightChild;
                }
                // If the current node is larger than its smallest child, swap them
                if (heap[index] > heap[childToSwap]) {
                    int tmp = heap[index];
                    heap[index] = heap[childToSwap];
                    heap[childToSwap] = tmp;
                } else {
                    break;
                }
                index = childToSwap;
            } else {
                break;
            }
        }
    }

    public int getParent(int index) {
        // Calculate the index of the parent node
        return (index - 1) / 2;
    }

    public int getChild(int index, boolean left) {
        // Calculate the index of the child node (left or right)
        return 2 * index + (left ? 1 : 2);
    }
}
