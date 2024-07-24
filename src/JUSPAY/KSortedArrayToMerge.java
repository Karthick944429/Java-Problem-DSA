package JUSPAY;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class KSortedArrayToMerge {
    public static void main(String[] args) {
        Solution_2 sol= new Solution_2();
        Scanner sc =new Scanner(System.in);
        int k = sc.nextInt();
        int[][] arr = new int[k][k];
        int row = arr.length;
        int col = arr[0].length;
        for (int i=0; i<row;i++){
            for (int j=0; j<col; j++){
                arr[i][j] = sc.nextInt();
            }
        }
        ArrayList<Integer> res = sol.mergeKArrays(arr,k);
        System.out.println(res);
    }
}
class Solution_2
{
    public static ArrayList<Integer> mergeKArrays(int[][] arr,int K) {
        ArrayList<Integer> ans = new ArrayList<>();
        Stack<Integer> al = new Stack<>();
        int[] res = new int[K*K];
        for (int[] ar:arr){
            for (int a:ar) {
                al.add(a);
            }
        }
        int i=0;
        System.out.println(al.size());
        while(!al.isEmpty()){
            res[i]=al.pop();
            i++;

        }
        Arrays.sort(res);
        for(int el: res){
            ans.add(el);
        }
        return ans;
    }
}
