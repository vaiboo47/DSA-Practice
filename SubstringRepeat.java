// Repeated Substring Pattern

// Given a string s, check if it can be constructed by 
// taking a substring of it and appending multiple copies of the substring together.
// Input: s = "abab"
// Output: true
// Input: s = "aba"
// Output: false

import java.util.Scanner;
public class SubstringRepeat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String");
        String s = sc.next();
        System.out.println(repeatedSubstringPattern(s));
    }
    static boolean repeatedSubstringPattern(String s) {
        int len = s.length();
        for(int i=len/2;i>=1;i--)
        {
            if(len%i==0)
            {
                int reps = len/i;
                String sub = s.substring(0,i);
                StringBuilder sb = new StringBuilder();
                for(int j=0;j<reps;j++)
                {
                    sb.append(sub);
                }
                if(sb.toString().equals(s))
                    return true;
            }
        }
        return false;
    }
}