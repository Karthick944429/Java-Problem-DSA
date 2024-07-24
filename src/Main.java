import java.util.*;
public class Main {
    static Stack<Integer> q = new Stack<>();
    static Stack<Integer> st = new Stack<>();
    static Stack<Integer> st1 = new Stack<>();
    public static void reverse(int[] arr, int k){
        for (int i = 0; i < arr.length; i++) {
            q.push(arr[i]);
        }
        for (int i = 0; i < k; i++) {
            st.push(q.pop());
        }
        while (!st.isEmpty()){
            st1.push(st.pop());
        }
        while (!q.isEmpty()){
            st.push(q.pop());
        }
        while (!st.isEmpty()) {
            st1.push(st.pop());
        }

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = {1,2,3,4,5,6,7};
//        int n = str.length;
////        int[] arr = new int[n];
////        for(int i=0; i<n; i++){
////            arr[i] = Integer.parseInt(str[i]);
////        }
        int k = 3;
        reverse(arr,k);
        System.out.print(st1);
    }
}