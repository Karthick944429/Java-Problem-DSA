package Sortings;

public class BubbleSort {
    public static void bubbleSort(int[] arr, int n){
        for (int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if (arr[i]<arr[j]){
                    int t= arr[i];
                    arr[i]=arr[j];
                    arr[j]=t;
                }
            }
        }
        System.out.println("Normal bubble sort: ");
        for(int ele:arr){
            System.out.print(ele+" ");
        }
    }
    public static void recursionSort(int[] arr, int n) {
        if(n==arr.length) {
            return;
        }
        for(int i=0;i<arr.length-1;i++) {
            if (arr[i]>arr[i+1]) {
                int t = arr[i];
                arr[i] = arr[i + 1];
                arr[i + 1] = t;
            }
        }
        recursionSort(arr,n+1);
    }
    public static void main(String[] args) {
        int[] arr = {99,22,33,11,35,57,88};
        bubbleSort(arr,arr.length);
        recursionSort(arr,0);
        System.out.println("\nRecursive bubble sort: ");
        for (int ele:arr)
            System.out.print(ele+" ");
    }
}
