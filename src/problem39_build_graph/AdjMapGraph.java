package problem39_build_graph;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
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
	        adjacencyMap.get(vertex1).add(vertex2);
	        adjacencyMap.get(vertex2).add(vertex1);
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

}
