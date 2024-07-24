package LeetCode;

public class LongestCommonSubsequence {
    public static int lcsRecur(String s, String t){
        if (s.length() == 0 || t.length()== 1){
            return 0;
        }
        char ch1= s.charAt(0);
        char ch2 = t.charAt(0);
        String rem1 = s.substring(1);
        String rem2 = t.substring(1);
        int ans=0;
        if (ch1==ch2){
            ans = lcsRecur(rem1,rem2)+1;
        }
        else {
            int o1 = lcsRecur(s,rem1);
            int o2 = lcsRecur(rem2,t);
            ans = Math.max(o1,o2);
        }

        return ans;
    }
    public static void main(String[] args) {
        String s= "abcd";
        String t = "agcfd";
        int res = lcsRecur(s,t);
        System.out.println(res);
    }
}
