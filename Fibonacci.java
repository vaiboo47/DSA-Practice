// Fibonacci Series
// Generate Fibonacci series upto n numbers
// Example: 0 1 1 2 3
import java.util.*;
public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter range for Fibonacci Series: ");
        int n=sc.nextInt();
        System.out.println("Fibonacci Series");
        getFibonacci(n);
    }

    static void getFibonacci(int n)
    {
        int a=0,b=1;
        for(int i=1;i<=n;i++)
        {
            System.out.print(a+" ");
            int c=a+b;
            a=b;b=c;
        }
    }
}
