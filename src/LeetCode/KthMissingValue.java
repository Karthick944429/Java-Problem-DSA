package LeetCode;

public class KthMissingValue {
    public static int findKthPositive(int[] arr, int k) {
        int st = 0;
        int end =arr.length-1;
        while (st<=end){
            int mid = (st+end)/2;
            int mis = arr[mid]-mid-1;
            if (mis<k)
                st = mid+1;
            else
                end = mid-1;
        }
        return end+k+1;
    }
    public static void main(String[] args) {
        int arr[]= {2,3,4,7,11};
        int res = findKthPositive(arr,5);
        System.out.println(res);
    }
}
