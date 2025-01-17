package Graph;
import java.util.LinkedList;
import java.util.Queue;

public class rottenOranges
{
    public class pair{
        int row;
        int col;
        int tm;
        pair(int r,int c,int t)
        {
            this.row=r;
            this.col=c;
            this.tm=t;

        }
    }
    public int orangesRotting(int[][] grid)
    {
        int n=grid.length;
        int m=grid[0].length;
        Queue<pair> q=new LinkedList<>();
        int[][] vis=new int[n][m];
        int cntfresh=0;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                if(grid[i][j]==2)
                {
                    q.add(new pair(i,j,0));
                    vis[i][j]=2;
                }
                if(grid[i][j]==1)
                    cntfresh++;
            }
        }
        int tm=0;
        int drow[]={-1,0,+1,0};
        int dcol[]={0,1,0,-1};
        int cnt=0;
        while(!q.isEmpty()) {
            int r = q.peek().row;
            int c = q.peek().col;
            int t = q.peek().tm;
            tm = Math.max(tm,t);
            q.remove();
            for (int i = 0;i < 4;i++)
            {
                int nrow = r + drow[i];
                int ncol = c + dcol[i];
                if (nrow >= 0 && nrow < n && ncol >= 0 && ncol < n && vis[nrow][ncol] == 0 && grid[nrow][ncol] == 1)
                {
                    q.add(new pair(nrow, ncol, t + 1));
                    vis[nrow][ncol] = 2;
                    cnt++;
                }
            }

        }

        if(cnt!=cntfresh)
            return-1;

        return tm;
    }
    public static void main(String[] args)
    {
        rottenOranges gr=new rottenOranges();
        int[][] grid={{2,1,2},{2,1,2},{2,1,2}};
        int ans=gr.orangesRotting(grid);
        System.out.println(ans);
    }
}
