package Search;

public class LinearSearchRecursion {
    public static int searchOp(int[] arr, int target,int pointer){
        if (pointer>arr.length-1){
            return -1;
        }
        if (target==arr[pointer]){
            return pointer;
        }
        return searchOp(arr,target,pointer+1);
    }
    public static void main(String[] args) {
        int arr[] = {2,8,4,6,7,9};
        int key=7;
        int res= searchOp(arr,key, 0);
        System.out.println(res);
    }
}
