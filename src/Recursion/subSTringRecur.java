package Recursion;

import java.util.ArrayList;

public class subSTringRecur {
    public static ArrayList<String> res= new ArrayList<>();
    public static void SubString(String str, String ans){
        if (str.length() == 0){
            res.add(ans);
            return;
        }
        char ch=str.charAt(0);
        SubString(str.substring(1),ans+ch);
        SubString(str.substring(1),ans);
    }
    public static void main(String[] args) {
        String str = "abc";
        SubString(str,"");
        System.out.println(res);
    }

}
