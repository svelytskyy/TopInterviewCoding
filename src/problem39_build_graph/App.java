package problem39_build_graph;

public class App {

	public static void main(String[] args) {
		
	      AdjMatrixGraph g2 = new AdjMatrixGraph(4);
	      g2.addEdge(0, 1);
	      g2.addEdge(1, 2);
	      g2.addEdge(2, 3);
	      g2.addEdge(3, 0);
	      System.out.println(g2);

		  AdjListGraph g1= new AdjListGraph(4);
	      g1.addEdge(0, 1);
	      g1.addEdge(1, 2);
	      g1.addEdge(2, 3);
	      g1.addEdge(3, 0);
	      System.out.println(g1);
	}

}
