package problem41_graph_dfs;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Stack;

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
	   
	   private void DFS(int v, HashSet<Integer> visited) {
	        visited.add(v);
	        System.out.print(v + " ");
	        for (int n : adj[v]) {
	            if (!visited.contains(n)) {
	                DFS(n, visited);
	            }
	        }
	    }
	   
	   

	    public void DFS1(int v) {
	        HashSet<Integer> visited = new HashSet<Integer>();
	        DFS(v, visited);
	    }
	    
		   public void DFS2(int v) {
		        HashSet<Integer> visited = new HashSet<Integer>();
		        Stack<Integer> stack = new Stack<Integer>();
		        stack.push(v);
		        while (!stack.isEmpty()) {
		            v = stack.pop();
		            if (!visited.contains(v)) {
		                visited.add(v);
		                System.out.print(v + " ");
		                for (int n : adj[v]) {
		                    if (!visited.contains(n)) {
		                        stack.push(n);
		                    }
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