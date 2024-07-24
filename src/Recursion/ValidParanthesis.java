package Recursion;

import java.util.ArrayList;

public class ValidParanthesis {
    public static ArrayList<String > res = new ArrayList<>();
    public static void valid(int n, int op, int cl, String ans){
        if (op == n && cl == n ){
            res.add(ans);
            return;
        }
        if (op>n||cl>n){
            return;
        }

        valid(n,op+1,cl,ans+"(");
        if (cl<op){
            valid(n,op,cl+1,ans+")");
        }
    }
    public static void main(String[] args) {
        int n=3;
        valid(n,0,0,"");
        System.out.println(res);
    }

}
