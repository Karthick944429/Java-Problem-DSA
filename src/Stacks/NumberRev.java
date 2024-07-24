package Stacks;

import java.util.Stack;

public class NumberRev {
    public static Stack<Integer> nums= new Stack<>();
     static Stack<Integer> numbers= new Stack<>();
    public static void main(String[] args) {
        int[] arr= {1,2,3};
        for (int i=0; i<arr.length;i++){
            nums.push(arr[i]);
        }
        System.out.println(nums);


        numbers.push(nums.pop());
        for(int i=0; i<arr.length-1; i++){
            numbers.push(arr[i]);
        }
        System.out.println(numbers);
    }
}
