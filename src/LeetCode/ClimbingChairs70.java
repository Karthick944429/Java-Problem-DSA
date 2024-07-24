package LeetCode;

public class ClimbingChairs70 {
    public static void main(String[] args) {
        Solution_2 sol = new Solution_2();
        int n= 44;
        int ans = sol.climbStairs(n);
        System.out.println(ans);
    }
}
class Solution_2 {
    public int climbStairs(int n) {
        int[] dp = new int[n+1];
        dp[0]=1;
        dp[1]=1;
        for (int i=2;i<dp.length;i++){
            dp[i]= dp[i-2]+dp[i-1];
        }
        return dp[n];
    }
}