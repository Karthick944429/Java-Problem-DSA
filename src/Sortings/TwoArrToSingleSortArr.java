package Sortings;

import java.util.Arrays;

public class TwoArrToSingleSortArr {
    public static int[] mergeArray(int[] a, int[] b){
        int n = a.length, n1=b.length;
        int[] ans =new int[n+n1];
        int i=0,j=0,k=0;
        while (i<n && j<n1){
            if (a[i]<b[j]){
                ans[k]=a[i];
                i++;
            }
            else {
                ans[k]=b[j];
                j++;
            }
            k++;
        }
        while (i < n) {
            ans[k] = a[i];
            i++;
            k++;
        }
        while (j < n1) {
            ans[k] = b[j];
            j++;
            k++;
        }
        return ans;
    }
    public static int[] mergeSort(int[] arr, int lo, int hi){
        if (lo==hi){
            int[] br = new int[1];
            br[0] = arr[lo];
            return br;
        }
        int mid = (lo+hi)/2;
        int[] left= mergeSort(arr,lo,mid);
        int[] right = mergeSort(arr,mid+1,hi);
        return mergeArray(left,right);
    }
    public static void main(String[] args) {
        int[] arr= {12,14,56,22,10,20,90,1,3,0};
        int[] arr2 = {1,4,2,5,9};
        int res[] = mergeSort(arr, 0,arr.length-1);

        System.out.println(Arrays.toString(res));
    }
}
