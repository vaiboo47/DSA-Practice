// Check if Array Is Sorted and Rotated

// Given an array nums, return true if the array was originally sorted in non-decreasing order,
// then rotated some number of positions (including zero). Otherwise, return false.

// There may be duplicates in the original array.

// Note: An array A rotated by x positions results in 
// an array B of the same length such that B[i] == A[(i+x) % A.length] for every valid index i.

// Input: nums = [3,4,5,1,2]
// Output: true
// Input: nums = [2,1,3,4]
// Output: false

import java.util.Scanner;

public class SortedRotated {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size");
        int n = sc.nextInt();
        System.out.println("Enter array elements");
        int[] a = new int[n];
        for(int i=0;i<n;i++)
        {
            a[i] = sc.nextInt();
        }
        if(isSortedRotated(a))
            System.out.println("Array is sorted and rotated");
        else
            System.out.println("Array is not sorted and rotated");
    }
    static boolean isSortedRotated(int[] nums) {
        int count=0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]>nums[(i+1)%nums.length])
            {
                count++;
                if(count==2)
                    return false;
            }
        }
        return true;
    }
}
