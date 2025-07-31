// Sum of 2 halves of a numbber

// Input: 1234
// Output: 46
import java.util.Scanner;

public class HalvesSum {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        int a = sc.nextInt();
        System.out.println(getHalvesSum(a));
        sc.close();
    }

    static int getHalvesSum(int n) {
        if(n/10==0)
            return n;
        int i,count=0,temp=n,n1=0,n2=0;
        while(n!=0)
        {
            count++;
            n/=10;
        }
        i=(int)Math.pow(10,count/2);
        n1 = temp/i;
        n2 = temp%i;
        System.out.println("First half = "+n1);
        System.out.println("Second half = "+n2);
        return n1+n2;
    }
}

