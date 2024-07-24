package LeetCode;

public class MinCostClimbingStairs746 {
    public static void main(String[] args) {
        Solution_3 sol = new Solution_3();
        int[] cost = {10,15,20};
        int ans = sol.minCostClimbingStairs(cost);
        System.out.println(ans);
    }
}
class Solution_3 {
    public int minCostClimbingStairs(int[] cost) {
        int[] dp = new int[cost.length];
        dp[0]= cost[0];
        dp[1]= cost[1];
        for (int i=2;i<dp.length;i++){
            dp[i]=  cost[i] + Math.min(dp[i - 1], dp[i - 2]);
        }
        return Math.min(dp[cost.length-1],dp[cost.length-2]);
    }
}