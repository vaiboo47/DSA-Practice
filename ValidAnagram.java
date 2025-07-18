// Input: s = "anagram", t = "nagaram"
// Output: true
// Input: s = "rat", t = "car"
// Output: false
// s and t consist of lowercase English letters.
import java.util.*;
public class ValidAnagram{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String 1:");
        String a =sc.nextLine();
        System.out.println("Enter String 2:");
        String b =sc.nextLine();
        if(isAnagram(a,b))
        {
            System.out.println("Both strings are anagrams");
        }
        else{
            System.out.println("Not anagrams");
        }
        sc.close();
    }
    
    static boolean isAnagram(String a,String b)
    {
        if(a.length()!=b.length())
        return false;
        char[] hash = new char[26];
        for(int i=0;i<a.length();i++)
        {
            hash[a.charAt(i)-'a']++;
        }
        for(int i=0;i<b.length();i++)
        {
            hash[b.charAt(i)-'a']--;
        }
        for(int i=0;i<26;i++)
        {
            if(hash[i]!=0)
            return false;
        }
        return true;
    }
}