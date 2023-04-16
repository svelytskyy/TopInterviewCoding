package m20_find_celebrity;

import java.util.LinkedList;

public class AdjListGraph {

	   private int V; // vertices number in Graph
	   private int E; // edges number in Graph 
	   private LinkedList<Integer>[] adj;
	   
	   public AdjListGraph() {
		      this.V = 6;
		      this.E = 0;
		      this.adj = new LinkedList[V];
		      for (int v = 0; v < V; v++) {
		         adj[v] = new LinkedList<>();
		      }
		      buildGraph();
		      System.out.println(this.toString());
	   }
	   
	   private void buildGraph() {
		   int celebrity = 3;
		   for(int i = 0; i< V; i++) {
			   if(celebrity ==i) continue;
			   addEdge(i, celebrity);
		   }
		   addEdge(0, 2);
		   addEdge(4, 5);
		   addEdge(5, 0);
		   addEdge(0, 5);
	   }

	   private void addEdge(int u, int v) {
	      adj[u].add(v);
	      E++;
	   }
	   
	   public boolean knows(int i, int j) {
		   if(i > V || j > V) return false;
		   LinkedList<Integer> vs = adj[i];
		   if(vs == null || vs.isEmpty()) return false;
		   if(vs.contains(j)) return true;
		   else return false;
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