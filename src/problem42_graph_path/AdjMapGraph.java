package problem42_graph_path;

import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;

public class AdjMapGraph<T> {
	
	    private Map<T, List<T>> adjacencyMap;

	    public AdjMapGraph() {
	        adjacencyMap = new HashMap<>();
	    }

	    public void addVertex(T vertex) {
	        adjacencyMap.put(vertex, new LinkedList<>());
	    }

	    public void addEdge(T vertex1, T vertex2) {
	    	if(adjacencyMap.get(vertex1) == null) addVertex(vertex1);
	        adjacencyMap.get(vertex1).add(vertex2);
	    }

	    public void removeVertex(T vertex) {
	        adjacencyMap.remove(vertex);
	        for (T v : adjacencyMap.keySet()) {
	            adjacencyMap.get(v).remove(vertex);
	        }
	    }

	    public void removeEdge(T vertex1, T vertex2) {
	        adjacencyMap.get(vertex1).remove(vertex2);
	        adjacencyMap.get(vertex2).remove(vertex1);
	    }

	    public List<T> getNeighbors(T vertex) {
	        return adjacencyMap.get(vertex);
	    }

	    public Set<T> getVertices() {
	        return adjacencyMap.keySet();
	    }
	    
	    public boolean isPath(T from, T to) { 
		    Queue<T> queue = new ArrayDeque<>(); 
		    Set<T> visited = new HashSet<>();
		    // we start from the 'from' node visited.add(from);
		    queue.add(from);
		    while (!queue.isEmpty()) {
		    	T element = queue.poll();
		    	List<T> adjacents = adjacencyMap.get(element);
		  
				 if (adjacents != null) { 
					 for (T t : adjacents) {
						 if (t != null && !visited.contains(t)) { 
							 visited.add(t);
							 queue.add(t);
							 // we reached the destination (the 'to' node) if (t.equals(to)) {
							 return true; 
						 }
					 } 
				 }
			} 
			return false; 
	  	}

}
