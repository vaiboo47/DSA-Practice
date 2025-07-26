// Input: n = 10
// Output: 4
//
// Input: n = 1
// Output: 0
import java.util.*;
public class CountPrimes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number: ");
        int n = sc.nextInt();
        sc.close();
        int sol = countPrimes(n);
        System.out.println("No of primes: "+sol);
    }
    static int countPrimes(int n)
    {
        if(n<=2)
            return 0;
        boolean[] composites = new boolean[n];
        for(int i=2;i*i<n;i++)
        {
            if(!composites[i])
            {
                for(int j=i*i;j<n;j+=i)
                    composites[j]=true;
            }
        }
        int count=0;
        for(int i=2;i<n;i++)
        {
            if(!composites[i])
            count++;
        }
        return count;
    }
}
