package Recursion;

import java.util.ArrayList;

public class MazeList {
    public static ArrayList<String> arr= new ArrayList<>();
    public static void path(int n, int row,int col, String st){
        if (row == n && col == n){
            arr.add(st);
            return;
        }
        if(row>n||col>n){
            return;
        }
        path(n,row,col+1,st+"H");
        path(n,row+1,col,st+"V");
        path(n,row+1,col+1,st+"D");
    }
    public static void main(String[] args){

        path(2,0,0,"");
        System.out.println(arr);
    }
}
