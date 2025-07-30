// Find Missing and Repeating Numbers

// You are given a 0-indexed 2D integer matrix grid of size n * n with values in the range [1, n^2].
// Each integer appears exactly once except a which appears twice and b which is missing. 
// The task is to find the repeating and missing numbers a and b.

// Input: grid = [[9,1,7],[8,9,2],[3,4,6]]
// Output: [9,5]
// Explanation: Number 9 is repeated and number 5 is missing so the answer is [9,5].

import java.util.Scanner;

public class MissingRepeating {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter matrix length:");
        int n = sc.nextInt();
        System.out.println("Enter matrix elements");
        int[][] a = new int[n][n];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                a[i][j]=sc.nextInt();
            }
        }
        sc.close();
        int[] res = findMissingAndRepeatedValues(a);
        System.out.println("Repeating Value: "+res[0]);
        System.out.println("Missing Value: "+res[1]);
    }

    static int[] findMissingAndRepeatedValues(int[][] grid) {
        int n = grid.length;
        int[] a = new int[n*n+1];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                a[grid[i][j]]++;
            }
        }
        int[] res = new int[2];
        for(int i=1;i<a.length;i++)
        {
            if(a[i]==2)
                res[0]=i;
            if(a[i]==0)
                res[1]=i;
        }
        return res;
    }
}
