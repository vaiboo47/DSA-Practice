// Input: N1 = 9, N2 = 12
// Output: 3
// Input: N1 = 20, N2 = 15
// Output: 5
import java.util.*;
public class Gcd {

    static int getGCD(int a, int b)
    {
        while(a!=b)
        {
            if(a>b)
            {
                a-=b;
            }
            else{
                b-=a;
            }
        }
        if(a==b)
        {
            return a;
        }
        else{
            return 1;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number 1: ");
        int a = sc.nextInt();
        System.out.print("Enter number 2: ");
        int b = sc.nextInt();
        System.out.println("GCD: "+getGCD(a, b));
    }
}
