// Reverse Integer
// Given a signed 32-bit integer x, return x with its digits reversed. 
// If reversing x causes the value to go outside 
// the signed 32-bit integer range [-231, 231 - 1], then return 0.

// Input: x = -123
// Output: -321
// Input: x = 1534236469
// Output: 0
import java.util.*;
public class ReverseNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        int n = sc.nextInt();
        System.out.println("Reversed number: "+getReverse(n));
        sc.close();
    }

    static int getReverse(int n)
    {
        int rev=0;
        int rem=0;
        while(n!=0)
        {
            rem=n%10;
            if(rev>Integer.MAX_VALUE || (rev==Integer.MAX_VALUE && rem>7))
                return 0;
            if(rev<Integer.MIN_VALUE || (rev==Integer.MIN_VALUE && rem<-8))
                return 0;
            rev=rev*10+rem;
            n/=10;
        }
        return rev;
    }
}
