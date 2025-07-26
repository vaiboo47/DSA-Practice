// Valid Parentheses

// Input: s = "()[]{}"
// Output: true

// Input: s = "(]"
// Output: false
import java.util.*;
public class ValidParantheses {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Parantheses: ");
        String s = sc.nextLine();
        if(isValid(s))
            System.out.println("Valid parantheses");
        else
            System.out.println("Invalid parantheses");
    }
    static boolean isValid(String s)
    {
        Stack<Character> stack = new Stack<>();
        for(int i=0;i<s.length();i++)
        {
            char c = s.charAt(i);
            switch (c) {
                case '(':
                    stack.push(')');
                    break;
                case '[':
                    stack.push(']');
                    break;
                case '{':
                    stack.push('}');
                    break;
                default:
                    if(stack.isEmpty()||stack.pop()!=c)
                        return false;
                    break;
            }
        }
        return stack.isEmpty();
    }
}

