// Duck Number
// A number which contains zero is called as duck number

// Input: 600
// Output: Duck number

// Input: 123
// Output: Not duck number

import java.util.Scanner;

public class DuckNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        int n = sc.nextInt();
        if(isDuck(n))
        {
            System.out.println("Duck number");
        }
        else
        {
            System.out.println("Not duck number");
        }
    }

    static boolean isDuck(int num)
    {
        if(num==0)
            return true;
        int rem=0;
        while(num!=0)
        {
            rem=num%10;
            if(rem==0)
            {
                return true;
            }
            num/=10;
        }
        return false;
    }
}
