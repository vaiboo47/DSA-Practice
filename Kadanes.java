// Given an integer array nums, find the subarray with the largest sum, and return its sum

// Input: nums = [-2,1,-3,4,-1,2,1,-5,4]
// Output: 6
// Explanation: The subarray [4,-1,2,1] has the largest sum 6.

// Input: nums = [5,4,-1,7,8]
// Output: 23
public class Kadanes {
    public static void main(String[] args) {
        int[] a={-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(maxSubarraySum(a));
    }
    static int maxSubarraySum(int[] a) {
        int max=a[0],cursum=a[0];
        for(int i=1;i<a.length;i++)
        {
            cursum=Math.max(a[i],cursum+a[i]);
            max=Math.max(max,cursum);
        }
        return max;
    }
}