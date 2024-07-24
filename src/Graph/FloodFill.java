package Graph;

import java.util.LinkedList;
import java.util.Queue;
public class FloodFill {
    static class Pair {
        int row;
        int col;

        Pair(int r, int c) {
            this.row = r;
            this.col = c;
        }
    }
    public static void bfs(int row, int col, int[][] grid) {
        Queue<Pair> q = new LinkedList<>();
        q.add(new Pair(row,col));
        int drow[] = {-1, 0, 1, 0};
        int dcol[] = {0, 1, 0, -1};
        int n = grid.length;
        int m = grid[0].length;
        while (!q.isEmpty()) {
            int r = q.peek().row;
            int c = q.peek().col;
            q.remove();
            for (int k = 0; k < 4; k++) {
                int nrow = r + drow[k];    //path definer
                int ncol = c + dcol[k];
                if (nrow >= 0 && nrow < n && ncol >= 0 && ncol < m && grid[nrow][ncol] == 1) {
                    q.add(new Pair(nrow, ncol));
                    grid[nrow][ncol] = 2;
                }
            }
        }
    }
    public static int[][] floodfill(int[][] grid){
        int n = grid.length;
        int m = grid[0].length;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (grid[i][j] == 1 ) {
                    bfs(i, j, grid);
                }
            }

        }
        return grid;
    }
    public static void main(String[] args) {
        int[][] grid = {{1, 1, 1}, {1, 1, 0}, {1, 0, 1}};
        int[][] ans = floodfill(grid);
        for(int[] el:ans){
            for (int res:el)
                System.out.print(res+" ");
            System.out.println();
        }
    }
}
