package HashMap;

import java.util.HashMap;

class an_hasmap{
    HashMap<Character,Integer> hm = new HashMap<>();
    public void hashm(String s,String t)
    {
        if(s.length() != t.length())
            return;
        for(int i = 0;i<s.length();i++)
        {
            char ch = s.charAt(i);
            if(!hm.containsKey(ch))
                hm.put(ch,1);
            else {
                hm.put(ch, hm.get(ch)+1);
            }
        }

        for(int i = 0;i<t.length();i++)
        {
            char ch = t.charAt(i);
            if(hm.containsKey(ch))
            {
                if (hm.get(ch) == 1)
                    hm.remove(ch);
                else
                    hm.put(ch, hm.get(ch)-1);
            }

        }
        if(hm.isEmpty())
            System.out.println("true");
        else
            System.out.println("false");
    }
}
public class Anagram_hashmap {
    public static void main(String[] args) {
        String str = "anagram";
        String str1 = "nagaram";
        an_hasmap ah = new an_hasmap();
        ah.hashm(str,str1);
    }


}
