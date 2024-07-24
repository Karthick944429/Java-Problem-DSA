package Graph;

import java.util.LinkedList;
import java.util.Queue;
public class Island {
    static class PAIR {
        int row;
        int col;

        PAIR(int r, int c) {
            this.row = r;
            this.col = c;
        }
    }
    public static void bfs(int i, int j, int[][] grid, int[][] vis) {
        Queue<PAIR> q = new LinkedList<>();
        q.add(new PAIR(i,j));
        vis[i][j]=1;
        int drow[] = {-1, 0, 1, 0};
        int dcol[] = {0, 1, 0, -1};
        int n = grid.length;
        int m = grid[0].length;
        while (!q.isEmpty()) {
            int r = q.peek().row;
            int c = q.peek().col;
            q.remove();
            for (int k = 0; k < 4; k++) {
                int nrow = r + drow[k];
                int ncol = c + dcol[k];
                if (nrow >= 0 && nrow < n && ncol >= 0 && ncol < m && grid[nrow][ncol] == 1 && vis[nrow][ncol] ==0) {
                    q.add(new PAIR(nrow, ncol));
                    vis[nrow][ncol] = 1;
                }
            }
        }
    }
    public static int countIsland(int[][] grid){
        int n = grid.length;
        int m = grid[0].length;
        int count =0;
        int[][] vis = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (grid[i][j] == 1 && vis[i][j] == 0) {
                    bfs(i, j, grid, vis);
                    count++;
                }
            }

        }
        return count;
    }
    public static void main(String[] args) {
        int[][] grid = {{0, 0, 0, 0}, {0, 1, 1, 0}, {1, 0, 1, 0}, {0, 0, 0, 0}};
        int ans = countIsland(grid);
        System.out.println(ans);
    }
}
