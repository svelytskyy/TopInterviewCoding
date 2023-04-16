package m16_unique_paths;

import java.util.Arrays;

//O(n^2)
public class Solution1 {
	
	public int uniquePaths(int m, int n) {
		int board[][] = new int[m][n];
		Arrays.fill(board[0], 1);
		for(int i = 0; i < m; i++) {
			board[i][0] = 1;
		}
		for(int i = 1; i < board.length; i++) {
			for(int j = 1; j < board[i].length; j++) {
				board[i][j] = board[i-1][j] + board[i][j-1];
			}
		}
		return board[m-1][n-1];
	}

}
