// Input: nums = [131, 11, 48]
// Output: 1 3 4 8

// Input: nums = [111, 222, 333, 4444, 666]
// Output: 1 2 3 4 6
import java.util.*;
public class DistinctDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size: ");
        int n = sc.nextInt();
        int[] a = new int[n];
        System.out.println("Enter array elements");
        for(int i=0;i<n;i++)
        {
            a[i] = sc.nextInt();
        }
        int[] sol = getDistDigits(a);
        System.out.println("Distinctive Digits Array");
        for(int i=0;i<sol.length;i++)
        {
            System.out.print(sol[i]+" ");
        }
        System.out.println();
        sc.close();
    }
    static int[] getDistDigits(int[] a)
    {
        ArrayList<Integer> li = new ArrayList<>();
        for(int i=0;i<a.length;i++)
        {
            int x=a[i];
            while(x!=0)
            {
                int rem=x%10;
                x/=10;
                if(li.contains(rem))
                    continue;
                else
                    li.add(rem);
            }
        }
        int size = li.size();
        int[] sol = new int[size];
        for(int i=0;i<size;i++)
        {
            sol[i]=li.get(i);
        }
        Arrays.sort(sol);
        return sol;
    }
}
