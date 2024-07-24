package LeetCode;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GeneratePara22 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n= scanner.nextInt();
        Solution_7 sol = new Solution_7();
        List<String> ans = sol.generateParenthesis(n);
        System.out.println(ans);
    }
}
class Solution_7 {
    public List<String> generateParenthesis(int n) {

        List<String> ans = new ArrayList<>();
        paranth(n,0,0,"",ans);
        return ans;
    }
    public static void paranth(int n , int op, int cl, String ans,List<String> res){
        if(op==n && cl== n){
            res.add(ans);
            return ;
        }
        if(op>n || cl>n){
            return;
        }
        paranth(n,op+1,cl,ans+"(",res);
        if(cl<op){
            paranth(n,op,cl+1,ans+")",res);
        }
    }
}