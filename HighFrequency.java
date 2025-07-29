import java.util.*;

public class HighFrequency {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of elements");
        int n = sc.nextInt();
        int[] a = new int[n];
        System.out.println("Enter elements");
        for(int i=0;i<n;i++)
        {
            a[i] = sc.nextInt();
        }
        majorityElement(a);
    }
    static void majorityElement(int[] nums) {
        int freq=0;
        Map<Integer,Integer> hm = new HashMap<>();
        for(int i=0;i<nums.length;i++)
        {
            freq=0;
            if(hm.containsKey(nums[i]))
            {
                freq = hm.get(nums[i]);
            }
            freq++;
            hm.put(nums[i],freq);
        }
        int max=0;
        int n=0;
        for(Map.Entry<Integer,Integer> entry :hm.entrySet())
        {
            if(entry.getValue()>max)
            {
                max=entry.getValue();
                n=entry.getKey();
            }
        }
        System.out.println("Number that appears most: "+n);
        System.out.println("Frequency: "+max);
    }
}
