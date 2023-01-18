package test;

import java.util.LinkedHashMap;
import java.util.Map;

public class Test6 {

	public static void main(String[] args) {
		Test6 t = new Test6();
		LRUCache cache = t.new LRUCache(2);
		cache.put(0, 0);
		cache.put(1, 1);
		cache.put(2, 2);
		System.out.println(cache.get(0));
		System.out.println(cache.get(1));
		System.out.println(cache.get(2));
		
		cache.put(3, 3);
		System.out.println(cache.get(1));
		System.out.println(cache.get(2));
		System.out.println(cache.get(3));
	}
	
	public class LRUCache extends LinkedHashMap<Integer, Integer>{
	    private int capacity;
	    
	    public LRUCache(int capacity) {
	        super(capacity, 0.75F, true);
	        this.capacity = capacity;
	    }

	    public int get(int key) {
	        return super.getOrDefault(key, -1);
	    }

	    public void put(int key, int value) {
	        super.put(key, value);
	    }

	    @Override
	    protected boolean removeEldestEntry(Map.Entry<Integer, Integer> eldest) {
	        return size() > capacity; 
	    }
	}

}
