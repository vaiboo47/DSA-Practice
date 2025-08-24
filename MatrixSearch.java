// Search a 2D Matrix

// You are given an m x n 2-D integer array matrix and an integer target.
// Each row in matrix is sorted in non-decreasing order.
// The first integer of every row is greater than the last integer of the previous row.
// Return true if target exists within matrix or false otherwise.

// Input: matrix = [[1,2,4,8],[10,11,12,13],[14,20,30,40]], target = 10
// Output: true
// Input: matrix = [[1,2,4,8],[10,11,12,13],[14,20,30,40]], target = 15
// Output: false

import java.util.Scanner;

public class MatrixSearch {
    public static void main(String[] args) {
        int[][] matrix = {{1,2,4,8},{10,11,12,13},{14,20,30,40}};
        Scanner sc = new Scanner(System.in);
        displayMatrix(matrix);
        System.out.println("\nEnter target: ");
        int target = sc.nextInt();
        searchMatrix(matrix, target);
        sc.close();
    }
    static boolean searchMatrix(int[][] matrix, int target) 
    {
        if(target<matrix[0][0])
            return false;
        int rows = matrix.length;
        int cols = matrix[0].length;
        int[] rowFirst = new int[rows];
        for(int i=0;i<rows;i++)
        {
            rowFirst[i] = matrix[i][0];
        }
        int i=0;
        while(i<rows)
        {
            if(target==rowFirst[i])
                return true;
            if(target>rowFirst[i])
            {
                if(i+1!=rows)
                    i++;
                else
                    break;
            }
            else
            {
                i--;
                break;
            }
        }
        for(int j=0;j<cols;j++)
        {
            if(matrix[i][j]==target)
            {
                System.out.println("Row: "+(i+1)+", Column: "+(j+1));
                return true;
            }
        }
        System.out.println("Not present");
        return false;
    }

    static void displayMatrix(int[][] matrix)
    {
        System.out.println("Matrix:");
        for(int i=0;i<matrix.length;i++)
        {
            for(int j=0;j<matrix[0].length;j++)
            {
                System.out.print(matrix[i][j]+" ");
            }
        System.out.println();
        }
    }
}