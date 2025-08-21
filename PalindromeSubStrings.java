// Palindromic Substrings
// Input: abbasjkkjopliil
// Output: Palindromic Substrings: abba bb jkkj kk liil ii 

import java.util.*;
public class PalindromeSubStrings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String");
        String s=sc.next();
        getStrings(s);
        sc.close();
    }

    static void getStrings(String s)
    {
        System.out.print("Palindromic Substrings: ");
        for(int i=0;i<s.length()-1;i++)
        {
            String a = ""+s.charAt(i);
            for(int j=i+1;j<s.length();j++)
            {
                a+=s.charAt(j);
                if(isPal(a))
                    System.out.print(a+" ");
            }
        }
    }

    static boolean isPal(String s)
    {
        String rev="";
        for(int i=s.length()-1;i>=0;i--)
        {
            rev+=s.charAt(i);
        }
        return rev.equals(s);
    }
}
