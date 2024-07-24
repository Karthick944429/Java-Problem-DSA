package Stacks;

import java.util.Stack;

public class StackPushToAddNums {
    static Stack<Integer> stack = new Stack<>();
    public static int AddNumsStr(String[] str){
        int n= str.length;
        int res=0;
        int num1=0,num2=0;
        for (int i=0; i<n; i++){
            if(str[i]=="+"||str[i]=="-"||str[i]=="*"||str[i]=="/"){
                switch (str[i]){
                    case "+":
                        num1=stack.pop();
                        num2=stack.pop();
                        res =num1+num2;
                        stack.push(res);
                        break;
                    case "-":
                        num1=stack.pop();
                        num2 = stack.pop();
                        res = num1-num2;
                        stack.push(res);
                        break;
                    case "*":
                        num1=stack.pop();
                        num2=stack.pop();
                        res =num1*num2;
                        stack.push(res);
                        break;
                    case "/":
                        num1=stack.pop();
                        num2=stack.pop();
                        res =num1/num2;
                        stack.push(res);
                        break;
                }
            }
            else {
                stack.push(Integer.parseInt(str[i]));
            }

        }
        return res;
    }
    public static void main(String[] args) {
        String[] tok= {"2","1","+","3","*","3","*"};
        System.out.println(AddNumsStr(tok));
    }
}
