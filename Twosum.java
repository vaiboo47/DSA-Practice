// Input: nums = [3,4,5,6], target = 7
// Output: [0,1]
// Input: nums = [1,20,2,3], target = 100
// Ouput: Valid elements not present

import java.util.*;
public class Twosum{

    static void get2sum(int[] a,int target)
    {
        HashMap<Integer,Integer> hm = new HashMap<>();
        for(int i=0;i<a.length;i++)
        {
            int rem=target-a[i];
            if(hm.containsKey(rem)){
                System.out.println("Indices: "+i+", "+hm.get(rem));
                return;
            }
            else{
                hm.put(a[i],i);
            }
        }
        System.out.println("Valid elements not present");
        return;
    }
    public static void main(String[] args) {
        System.out.print("Enter size of array: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        System.out.println("\nEnter elements of array: ");
        for(int i=0;i<n;i++)
        {
            a[i] = sc.nextInt();
        }
        System.out.print("\nEnter target: ");
        int target = sc.nextInt();
        get2sum(a,target);
        sc.close();
    }
}
