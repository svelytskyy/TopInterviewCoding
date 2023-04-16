package m18_number_islands_bfs;

import java.util.LinkedList;
import java.util.Queue;

public class Solution1 {
	
    public int numIslands(char[][] grid) {
        if (grid == null || grid.length == 0 || grid[0].length == 0) {
            return 0;
        }
        int m = grid.length;
        int n = grid[0].length;
        int count = 0;
        int[][] directions = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}}; // up, down, left, right
        Queue<int[]> queue = new LinkedList<>();
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] == '1') {
                    count++;
                    queue.offer(new int[] {i, j});
                    while (!queue.isEmpty()) {
                        int[] curr = queue.poll();
                        int x = curr[0];
                        int y = curr[1];
                        if (x < 0 || x >= m || y < 0 || y >= n || grid[x][y] != '1') {
                            continue;
                        }
                        grid[x][y] = '0'; // mark as visited
                        for (int[] direction : directions) {
                            int dx = x + direction[0];
                            int dy = y + direction[1];
                            queue.offer(new int[] {dx, dy});
                        }
                    }
                }
            }
        }
        return count;
    }

}
