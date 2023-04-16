package problem39_build_graph;

import java.util.LinkedList;

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