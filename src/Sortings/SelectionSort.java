package Sortings;

public class SelectionSort {
    public static void sortings(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            int min= i;
            for (int j=i;j< arr.length;j++) {
                if (arr[min]>arr[j])
                    min=j;
            }
            int t= arr[min];
            arr[min]=arr[i];
            arr[i]=t;
        }
    }
    public static void recursive(int[] arr, int n){
        if (n==arr.length){
            return;
        }
        int min =n;
        for(int i=n; i< arr.length; i++){
            if (arr[min]<arr[i])
                min=i;
        }
        int t=arr[min];
        arr[min]= arr[n];
        arr[n]=t;

        recursive(arr,n+1);
    }
    public static void main(String[] args) {
        int[] arr={5,2,3,1};
        sortings(arr);
        System.out.println("Normal Selection Sort:");
        for(int ele:arr)
            System.out.print(ele+" ");
        System.out.println("\nRecursive Selection sort:");
        recursive(arr,0);
        for(int ele:arr)
            System.out.print(ele+" ");

    }
}
