import java.util.*;
public class MatrixDiagonalSum {
    public static void main(String[] args) {
        int[][] mat = readMatrix();
        displayMatrix(mat);
        System.out.println("Sum of diagonal elements: "+diagonalSum(mat));
    }
    static int diagonalSum(int[][] mat) {
        int rows=mat.length;
        int sum=0;
        for(int i=0;i<rows;i++)
        {
            sum+=mat[i][i];
            if(i!=rows-i-1)
            sum+=mat[i][rows-i-1];
        }
        return sum;
    }

    static int[][] readMatrix()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter matrix size: ");
        int n = sc.nextInt();
        System.out.println("Enter matrix elements");
        int[][] mat = new int[n][n];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                mat[i][j] = sc.nextInt();
            }
        }
        sc.close();
        return mat;
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
