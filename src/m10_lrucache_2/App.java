package m10_lrucache_2;

public class App {

	public static void main(String[] args) {
		LRUCache lruCache= new LRUCache(2);
		lruCache.put(1, 1); // cache is {1=1} 
		lruCache.put(2, 2); // cache is {1=1, 2=2} 
		System.out.println(lruCache.get(1)); // return 1 
		lruCache.put(3, 3); // LRU key was 2, evicts key 2, cache is {1=1, 3=3} 
		System.out.println(lruCache.get(2)); // returns -1 (not found) 
		lruCache.put(4, 4); // LRU key was 1, evicts key 1, cache is {4=4, 3=3} 
		System.out.println(lruCache.get(1)); // return -1 (not found) 
		System.out.println(lruCache.get(3)); // return 3 
		System.out.println(lruCache.get(4)); // return 4

	}

}
