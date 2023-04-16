package m18_number_islands_bfs;

import m18_number_islands_dfs.Solution1;

public class App {

	public static void main(String[] args) {
		
		char[][] grid	= { {'1','1','0','0','0'}, 
	            		    {'1','1','0','0','0'}, 
	            		    {'0','0','1','0','0'}, 
	            		    {'0','0','0','1','1'} }; 
		
		Solution1 s1 = new Solution1();
		System.out.println(s1.numIslands(grid));

	}

}
