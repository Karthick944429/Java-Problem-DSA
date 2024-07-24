package Search;

public class BinarySearchUsingRecursion {
    static int n=0;
    public static int searchOp(int[] arr, int key, int start , int end) {
        if (start>end) {
            return 0;
        }
        int mid = (start + end) / 2;
        if (key == arr[mid]) {
            return mid;
        }
        if (key>arr[mid]){
            start=mid+1;
        }
        if (key<arr[mid]){
            end=mid-1;
        }

        return searchOp(arr,key,start,end);
    }
    public static void main(String[] args) {
        int[] arr= {1,2,3,4,5,6,7,8,9,10,111};
        int k = 111;
        int res = searchOp(arr,k,0,arr.length-1);
        System.out.println(res);
    }
}
