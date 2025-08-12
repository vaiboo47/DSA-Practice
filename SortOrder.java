// Input: arr[] = [1, 2, 3, 5, 4, 7, 10]
// Output: [7, 5, 3, 1, 2, 4, 10]
// Explanation: 7, 5, 3, 1 are odd numbers in descending order and 2, 4, 10 are even numbers in ascending order.
import java.util.*;
public class SortOrder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int n = sc.nextInt();
        int[] a = new int[n];
        System.out.println("Enter array elements:");
        for(int i=0;i<n;i++)
        {
            a[i] = sc.nextInt();
        }
        sc.close();
        System.out.println("Before Sorting:");
        printArray(a, n);
        System.out.println();
        sortIt(a);
        System.out.println("Sorted Array: ");
        printArray(a, n);
    }
    static void sortIt(int[] arr) {
        // code here
        ArrayList<Integer> odd = new ArrayList<>();
        ArrayList<Integer> even = new ArrayList<>();
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]%2==0)
                even.add(arr[i]);
            else
                odd.add(arr[i]);
        }
        Collections.sort(odd,Collections.reverseOrder());
        Collections.sort(even);
        odd.addAll(even);
        for(int i=0;i<arr.length;i++)
        {
            arr[i] = odd.get(i);
        }
    }

    static void printArray(int[] a,int n)
    {
        for(int i=0;i<n;i++)
        {
            System.out.print(a[i]+" ");
        }
    }
}
