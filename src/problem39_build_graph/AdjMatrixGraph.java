package problem39_build_graph;

public class AdjMatrixGraph {

	   private int V; // vertices number in Graph
	   private int E; // edges number in Graph
	   private int[][] adjMatrix;

	   public AdjMatrixGraph(int n) {
	      this.V = n;
	      this.E = 0;
	      this.adjMatrix = new int[n][n];
	   }

	   public void addEdge(int u, int v) {
	      adjMatrix[u][v] = 1;
	      adjMatrix[v][u] = 1; // undirected graph
	      E++;
	   }

	   public String toString() {
	      StringBuilder sb = new StringBuilder();
	      sb.append(V + " vertices;" + E + " edges " + "\n");
	      for (int v = 0; v < V; v++) {
	         sb.append(v + ": ");
	         for (int w : adjMatrix[v]) {
	            sb.append(w + " ");
	         }
	         sb.append("\n");
	      }
	      return sb.toString();
	   }
	}