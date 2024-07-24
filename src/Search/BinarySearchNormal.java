package Search;

public class BinarySearchNormal {
    public static void main(String[] args) {
        int[] arr = {11,22,33,44,55,66,77,88,99};
        int st=0;
        int end=arr.length-1;
        int key=88;
        while (st<end){
            int mid=(st+end)/2;
            if (key==arr[mid]){
                System.out.println(mid);
                break;
            }
            if (key<arr[mid]){
                end=mid-1;
            }
            if (key>arr[mid]){
                st=mid+1;
            }
        }
    }
}
