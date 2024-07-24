package JUSPAY;

import java.util.*;

public class ReactDeveloper {
    static HashMap<Integer,ArrayList<Integer>> adj;
    public static void addVertex(int members[]){
        adj = new HashMap<>();
        for (int i: members){
            adj.put(i,new ArrayList<>());
        }
    }
    public static void addEdge(int mem1,int mem2){
        adj.get(mem1).add(mem2);
    }
    public static int findDev(int src, int des){
        HashSet<Integer> hs = new HashSet<>();
        Queue<Integer> q = new LinkedList<>();
        hs.add(src);
        q.add(src);
        while (!q.isEmpty()){
            int node = q.poll();
            for(int it: adj.get(node)){
                if(!hs.contains(it)){
                    hs.add(it);
                    q.add(it);
                }
                if (it == des){
                    return 1;
                }
            }
        }
        return 0;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int v = sc.nextInt();
        int[] dev = new int[v];
        for (int i=0; i<v;i++){
            dev[i] = sc.nextInt();
        }
        addVertex(dev);
        int e = sc.nextInt();
        for (int i=0; i<e;i++ ){
            int mem1 = sc.nextInt();
            int mem2 = sc.nextInt();
            addEdge(mem1,mem2);
        }
        int st = sc.nextInt();
        int end = sc.nextInt();
        System.out.println(findDev(st,end));
    }
}
