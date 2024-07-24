package LeetCode;

public class WildCardMatching44 {
    public static void main(String[] args) {
        Solution_4 sol = new Solution_4();
        String s = "cb";
        String p = "?a";
        boolean ans = sol.isMatch(s,p);
        System.out.println(ans);
    }
}
class Solution_4 {
    int n =0;
    public boolean isMatch(String s, String p) {
        if(s.length()==0 || p.length() == 0|| (p.length()==1 && (p.charAt(n)!='?' && p.charAt(n) != '*' ))){
            return false;
        }
        char cs = s.charAt(n);
        char cp = p.charAt(n);
        if(cp == '?' ){
            s= s.substring(1,s.length());
            p = p.substring(1, p.length());
        }
        if(cp == '*'){
            s= s.substring(n,s.length());
            p = p.substring(n, p.length());
        }
        isMatch(s,p);
        return true;
    }
}
