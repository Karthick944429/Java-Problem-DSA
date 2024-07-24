package LeetCode;

public class LeetCode7 {
    public static void main(String[] args) {
        Solution sol = new Solution();
        int x = -1234;
        System.out.println(sol.reverse(x));
    }
}
class Solution {
    public int reverse(int x) {
        int n = Math.abs(x);;
        int res = 0;

        while (n > 0 || n < 0) {
            int rem = n % 10;
            if (res > (Integer.MAX_VALUE - rem) / 10) {
                return 0;
            }
            res = (10 * res) + rem;
            n /= 10;
        }
        if(x<0){
            return -res;
        }
        return res;

    }
}