package problem42_graph_path;

public class App {

	public static void main(String[] args) {
		
		AdjMapGraph<Character> g = new AdjMapGraph<>();
		g.addEdge(Character.valueOf('D'), Character.valueOf('A'));
		g.addEdge(Character.valueOf('D'), Character.valueOf('B'));
		g.addEdge(Character.valueOf('B'), Character.valueOf('E'));
		g.addEdge(Character.valueOf('A'), Character.valueOf('C'));
		g.addEdge(Character.valueOf('C'), Character.valueOf('B'));
		g.addEdge(Character.valueOf('C'), Character.valueOf('E'));
		
		System.out.println(g.isPath('D', 'E'));
		System.out.println(g.isPath('E', 'D'));
		
	}

}
