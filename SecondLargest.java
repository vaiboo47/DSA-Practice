// Second Largest Number
// Given a sorted array, find the second largest number

// Input: [1,2,3,4,5]
// Output: 4
// Input: [1,1,2,4,12,25,25,26,26,27,27,27]
// Output: 26
public class SecondLargest {
    public static void main(String[] args) {
        int[] a = {1,1,2,4,12,25,25,26,26,27,27,27};
        System.out.println(get2ndLargest(a));
    }
    static int get2ndLargest(int[] a)
    {
        int secLarg=a[a.length-1];
        int i=a.length-1;
        while(i>=0 && a[i]==secLarg)
        {
            i--;
        }
        secLarg=a[i];
        return secLarg;
    }
}
