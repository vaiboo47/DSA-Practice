// Generate Tag for Video Caption

// Combine all words in the string into a single camelCase string prefixed with '#'.
// Remove all characters that are not an English letter, except the first '#'.
// Truncate the result to a maximum of 100 characters.
// Return the tag after performing the actions on caption.

// Input: caption = "Leetcode daily streak achieved"
// Output: "#leetcodeDailyStreakAchieved"
import java.util.*;
public class CaptionString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String: ");
        String s = sc.nextLine();
        System.out.println(generateTag(s));
        sc.close();
    }
    public static String generateTag(String s) {
        StringBuilder sb = new StringBuilder("#");
        boolean flag=false;
        short count=1;
        for(int i=0;i<s.length();i++)
        {
            char ch = s.charAt(i);
            if(ch==' ')
            {
                continue;
            }
            if(ch>=65&&ch<=97||ch>=97&&ch<=122)
            {
                if(flag==false)
                {
                    sb.append(Character.toLowerCase(ch));
                    flag=true;
                }
                else if(s.charAt(i-1)==' ')
                {
                    sb.append(Character.toUpperCase(ch));
                    count++;
                }
                else{
                    sb.append(Character.toLowerCase(ch));
                    count++;
                }
            }
            if(count==99)
            {
                break;
            }
        }
        return sb.toString();
    }
    
}
