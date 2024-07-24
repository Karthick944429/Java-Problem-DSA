package Search;

public class LinearSearchNormal {
    public static void searchOp(int[] arr, int tar){
        for(int i=0;i<arr.length;i++){
            if (tar==arr[i]) {
                System.out.println("Target is founf at index: "+i);
                break;
            }
        }

    }
    public static void main(String[] args) {
        int[] arr={77,88,33,22,11,12};
        int tar=11;
        searchOp(arr,tar);

    }
}
