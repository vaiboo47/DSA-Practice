// Given a number N, the task is to print the prime numbers from 1 to N.
// Input: N = 10
// Output: 2, 3, 5, 7
import java.util.*;
public class PrimeNumbers {
    public static void main(String[] args) {
        System.out.print("Enter number range: ");
        Scanner sc=new Scanner(System.in);
        int n =sc.nextInt();
        printPrime(n);
        sc.close();
    }
    static void printPrime(int n)
    {
        int i=2;
        System.out.println("Prime Numbers: ");
        while(i<n)
        {
            if(isPrime(i))
            {
                System.out.print(i+" ");
            }
            i++;
        }
        
    }

    static boolean isPrime(int n)
    {
        for(int i=2;i<=n/2;i++)
        {
            if(n%i==0)
            return false;
        }
        return true;
    }
    
}

