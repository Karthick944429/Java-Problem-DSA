package GreedyApproach;

import java.util.ArrayList;

public class BasicConcept {
    public static void main(String[] args) {
        int[] start ={1,3,0,5,8,5};
        int[] end = {2,4,6,7,9,9};
        int pend =end[0];
        int cnt =1;
        ArrayList<Integer> ans =new ArrayList<>();
        ans.add(pend);
        for (int i = 1; i < end.length -1; i++) {
            if (start[i] > pend) {
                cnt++;
                ans.add(i);
                pend=end[i];
            }
        }
        System.out.println(cnt);
        for (int i = 0; i < ans.size(); i++) {
            System.out.println("Act:"+ans.get(i));
        }
    }
}
