package DynamicProg;


public class MazeAtIndex {
    static class maze{
        public int maze_probklem(int row,int col,int n,int m,int[][] ans) {
            if(row == n && col == m) {
                return 1;
            }
            if (n > row|| m > col){
                return 0;
            }
            if(ans[n][m] != 0)
                return ans[n][m];
            int ch = maze_probklem(row, col, n + 1, m, ans);
            int cv = maze_probklem(row, col, n, m + 1, ans);
            int anss = ch + cv;
            ans[n][m] = anss;
            return anss;
        }
    }
    public static void main(String[] args) {
        maze m = new maze();
        int[][] anss = new int[3][3];
        int ans = m.maze_probklem(2,2,0,0,anss);
        for(int[] i : anss)
        {
            for(int j : i)
                System.out.print(j+" ");
            System.out.println();
        }
    }
}

