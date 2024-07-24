package Graph;

import java.util.ArrayList;
public class dfsgraph {
    public static void  dfs(int node, boolean[] vis, ArrayList<ArrayList<Integer>> adj, ArrayList<Integer> k)
    {

        vis[node]=true;
        k.add(node);
        for(int it:adj.get(node))
        {
            if(vis[it]==false)
            {
                dfs(it,vis,adj,k);
            }
        }
    }
    public static ArrayList<Integer> tree(int v,ArrayList<ArrayList<Integer>> ls)
    {
        boolean vis[]=new boolean[v];
        vis[0]=true;
        ArrayList<Integer> lss=new ArrayList<>();
        dfs(0,vis,ls,lss);
        return lss;
    }
    public static void main(String args[])
    {
        ArrayList<ArrayList<Integer>> adj=new ArrayList<>();
        for(int i=0;i<5;i++)
        {
            adj.add(new ArrayList<Integer>());
        }
        adj.get(0).add(1);
        adj.get(1).add(0);
        adj.get(0).add(4);
        adj.get(4).add(0);
        adj.get(1).add(2);
        adj.get(2).add(1);
        adj.get(1).add(3);
        adj.get(3).add(1);

        ArrayList<Integer> ans=tree(5,adj);
        System.out.println(adj);
        for(int i:ans)
        {
            System.out.println(i);
        }

    }
}
