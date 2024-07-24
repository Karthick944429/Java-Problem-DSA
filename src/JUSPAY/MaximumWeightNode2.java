package JUSPAY;
import java.util.*;

public class MaximumWeightNode2 {
    public static int bfs(int n,ArrayList<ArrayList<Integer>> adj,int[] weights)
    {
        Queue<Integer> q = new LinkedList<>();
        int Max = Integer.MIN_VALUE;
        int ans = 0;
        for(int i = 0;i<n;i++)
        {
            if(weights[i]>=Max)
            {
                ans = i;
                Max = weights[i];
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] arr = new int[n];
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for(int i = 0;i<n;i++)
        {
            adj.add(new ArrayList<Integer>());
            arr[i] = scan.nextInt();
        }
        int[] weights = new int[n];

        for(int i = 0;i<n;i++)
            if(arr[i] != -1) {
                adj.get(i).add(arr[i]);
                weights[arr[i]] += i;
            }
        int weight = bfs(n,adj,weights);
        System.out.println(weight);
    }
}
