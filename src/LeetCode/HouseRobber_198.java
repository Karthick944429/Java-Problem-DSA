package LeetCode;

public class HouseRobber_198 {
    public static void main(String[] args) {
        Solution_1 st = new Solution_1();
        int[] arr = {6,7,1,3,8,2,4};
        int n=arr.length;
        int ans = st.rob(arr);
        int rec = st.robRec(arr,arr.length-1);
        int Dp = st.robDP(arr);
        System.out.println("Dynamic Program:"+Dp);
        System.out.println("Mine: "+ans);
        System.out.println("Recursion: "+ rec);
    }
}
class Solution_1 {
    public int rob(int[] nums) {
        int prev=nums[0];
        int prev2=0;
        int n=nums.length;
        for(int i=1;i<n;i++){
            int take=nums[i];
            if(i>1)take+=prev2;
            int notTake=prev;
            int cur1=Math.max(take,notTake);
            prev2=prev;
            prev=cur1;
        }
        return prev;
    }
    public int robDP(int[] arr){
        if (arr.length<2)
            return arr[0];
        int[] dp = new int[arr.length];
        dp[0] = arr[0];
        dp[1]= Math.max(arr[0],arr[1]);
        for (int i = 2; i < arr.length; i++) {
            dp[i] = Math.max(dp[i-2]+arr[i], dp[i-1]);
        }
        return dp[arr.length-1];
    }
    public int robRec(int[] arr, int n){
        if (n<0)
            return 0;
        if (n == 0) {
            return arr[0];
        }
        int pick = arr[n] + robRec(arr,n-2);
        int notpick = robRec(arr,n-1);
        return Math.max(pick,notpick);
    }

}
