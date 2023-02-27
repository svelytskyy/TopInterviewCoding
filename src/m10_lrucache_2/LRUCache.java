package m10_lrucache_2;

import java.util.HashMap;
import java.util.Map;

	class Node {
	  int value;
	  int key;
	  Node prev;
	  Node next;
	  public Node() {}

	  public Node(int key, int value) {
	    this.key = key;
	    this.value = value;
	    this.prev = null;
	    this.next = null;
	  }
	}

	class DoublyLinkedList {
	  Node head;
	  Node tail;
	  
	  public DoublyLinkedList() {
	    head = new Node();
	    tail = new Node();
	    this.head.next = this.tail;
	    this.tail.prev = head;
	  }
	  
	 
	  public void insertHead(Node node){
		  Node next = head.next;
		  head.next = node;
		  node.next = next;
		  next.prev = node;
		  node.prev = head;
	  }
	    
	  public void remove(Node n) {
		  n.prev.next = n.next;
		  n.next.prev = n.prev;
	  }
	  
	  public int removeTail() {
	    Node node = tail.prev;
	    int key = node.key;
	    remove(node);
	    return key;
	  }
	}

	public class LRUCache {
	  Map<Integer,Node> cache;
	  DoublyLinkedList list;
	  int capacity;
	  
	  public LRUCache(int capacity) {
	    this.capacity = capacity;
	    this.cache = new HashMap<>();
	    this.list = new DoublyLinkedList();
	  }
	  
	  public int get(int key) {
	    if (!cache.containsKey(key)) 
	        return -1;
	    else {
	        Node node = cache.get(key);
	        list.remove(node);
	        list.insertHead(node);  
	        return cache.get(key).value;
	    }
	  }
	  
	  public void put(int key, int value) {
	    Node node = new Node(key, value);
	     
	    if (cache.containsKey(key)){
	        list.remove(cache.get(key));
	    }
	    else if (cache.size() >= capacity) {
	        int k = list.removeTail();
	        cache.remove(k);
	    }
        list.insertHead(node);
        cache.put(key, node);    
	  }
	  
	}
