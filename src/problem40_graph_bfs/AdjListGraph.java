package problem40_graph_bfs;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

public class AdjListGraph {

	   private int V; // vertices number in Graph
	   private int E; // edges number in Graph 
	   private LinkedList<Integer>[] adj;

	   public AdjListGraph(int n) {
	      this.V = n;
	      this.E = 0;
	      this.adj = new LinkedList[n];
	      for (int v = 0; v < V; v++) {
	         adj[v] = new LinkedList<>();
	      }
	   }

	   public void addEdge(int u, int v) {
	      adj[u].add(v);
	      adj[v].add(u);
	      E++;
	   }
	   
	   public void BFS(int s) {
		   Queue<Integer>queue = new LinkedList<>();
		   Set<Integer>visited = new HashSet<>();
		   queue.add(s);
		   visited.add(s);
		   while(!queue.isEmpty()) {
			   int v = queue.poll();
			   System.out.println(v + " ");
			   for(int i = 0; i < adj[v].size(); i++) {
				   int n = adj[v].get(i);
				   if(!visited.contains(n)) {
					   visited.add(n);
					   queue.add(n);
				   }
			   }
		   }
	   }
 
	   public String toString() {
	      StringBuilder sb = new StringBuilder();
	      sb.append(V + " vertices, " + E + " edges " + "\n");
	      for (int v = 0; v < V; v++) {
	         sb.append(v + ": ");
	         for (int w : adj[v]) {
	            sb.append(w + " ");
	         }
	         sb.append("\n");
	      }
	      return sb.toString();
	   }
	}