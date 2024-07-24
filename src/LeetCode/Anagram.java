package LeetCode;

class ana{
    public boolean anagram_string(String str,String str1)
    {
        if(str.length() != str1.length())
            return false;
        int[] freq = new int[26];
        for(int i = 0;i<str.length();i++)
        {
            freq[str.charAt(i) - 'a']++;
            freq[str1.charAt(i) - 'a']--;
        }
        for(int i = 0;i<freq.length;i++)
        {
            if(freq[i] != 0)
                return false;
        }
        return true;

    }

}
public class Anagram {
    public static void main(String[] args) {
        String str= "nagaram";
        String str1 = "anagram";
        ana a = new ana();

        boolean ans = a.anagram_string(str,str1);
        System.out.println(ans);


    }
}
