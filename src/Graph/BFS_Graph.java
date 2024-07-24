package Graph;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

class BFSingraph{
    public ArrayList<Integer> bfs(int n,ArrayList<ArrayList<Integer>> adj)
    {
        boolean[] vist = new boolean[n];
        ArrayList<Integer> return_ans = new ArrayList<>();
        Queue<Integer> q = new LinkedList<>();
        q.add(0);
        vist[0] = true;
        while(!q.isEmpty())
        {
            int av = q.poll();
            return_ans.add(av);
            for(int it : adj.get(av))
            {
                if(!vist[it])
                {
                    vist[it] = true;
                    q.add(it);
                }
            }
        }
        return return_ans;
    }
}
public class BFS_Graph {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for(int i = 0;i<5;i++)
            adj.add(new ArrayList<>());
        adj.get(0).add(1);
        adj.get(1).add(0);
        adj.get(0).add(4);
        adj.get(4).add(0);
        adj.get(1).add(2);
        adj.get(2).add(1);
        adj.get(1).add(3);
        adj.get(3).add(1);
        BFSingraph bfs = new BFSingraph();
        ArrayList<Integer> ans = bfs.bfs(5,adj);
        for(int i = 0;i<ans.size();i++)
        {
            System.out.println(ans.get(i));
        }
    }
}
