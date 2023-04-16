package problem41_graph_dfs;

public class App {

	public static void main(String[] args) {
		AdjListGraph g = new AdjListGraph(5);
		g.addEdge(0, 1);
		g.addEdge(1, 2);
		g.addEdge(2, 3);
		g.addEdge(3, 4);
		g.addEdge(3, 0);
		System.out.println(g);
		g.DFS1(0);
		System.out.println();
		g.DFS2(0);
	}

}
