package LeetCode;

import java.util.HashMap;

class note{
    HashMap<Character,Integer> hm = new HashMap<>();
    public boolean ransom(String s,String t)
    {
        for(int i = 0;i<s.length();i++)
        {
            if(!hm.containsKey(s.charAt(i)))
                hm.put(s.charAt(i),1);
            else
                hm.put(s.charAt(i),hm.get(s.charAt(i))+1);
        }
        System.out.println(hm);
        for(int i = 0;i<t.length();i++)
        {
            if(hm.containsKey(t.charAt(i)))
            {
                if(hm.get(t.charAt(i)) == 1)
                    hm.remove(t.charAt(i));
                else
                    hm.put(t.charAt(i),hm.get(t.charAt(i))-1);
            }
            else
                return false;
        }
        System.out.println(hm);
        return !hm.containsKey(0);
    }
}
public class ransomNote {
    public static void main(String[] args) {
        String paper = "aaa";
        String note = "aab";
        note n = new note();
        boolean ans = n.ransom(note,paper);
        System.out.println(ans);
    }
}
