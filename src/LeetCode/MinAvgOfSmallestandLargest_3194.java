package LeetCode;
import java.util.Arrays;

public class MinAvgOfSmallestandLargest_3194 {
    public static void main(String[] args) {
        Solution_5 sol= new Solution_5();
        int[] arr ={1,9,8,3,10,5};
        double ans = sol.minimumAverage(arr);
        System.out.println(ans);
    }
}
class Solution_5 {
    public double minimumAverage(int[] nums) {
        double res = 0;
        int lf = 0, rt = nums.length - 1;
        Arrays.sort(nums);
        double[] ans = new double[nums.length/2];
        int n=0;
        while (lf < rt) {
            double min = nums[lf];
            double max = nums[rt];
            res = (min + max) / 2;
            ans[n]=res;
            n++;
            lf++;
            rt--;
        }
        Arrays.sort(ans);
        return ans[0];
    }
}
