package Stacks;

import java.util.Stack;

public class Number_rev {
    public static Stack<Integer> nums = new Stack<>();
    public static void pushAtBot(int n){
        if(nums.isEmpty()){
            nums.push(n);
            return;
        }
        int temp= nums.pop();
        pushAtBot(n);
        nums.push(temp);
    }

    public static void main(String[] args) {
        nums.push(1);
        nums.push(2);
        nums.push(3);
        pushAtBot(4);
        while (!nums.isEmpty()){
            System.out.println(nums.pop());
        }
    }
}
