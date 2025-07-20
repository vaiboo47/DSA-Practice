// Given an integer n, return the count of all numbers with unique digits, x, where 0 <= x < 10^n.

// Example 1:
// Input: n = 2, Output: 91
// Explanation: The answer should be the total numbers in the range of 0 ≤ x < 100, excluding 11,22,33,44,55,66,77,88,99

// Example 2:
// Input: n = 0, Output: 1

// Constraints:
// 0 <= n <= 8
import java.util.*;
public class CountUniqueDigits {
    public static int countNumbersWithUniqueDigits(int n) {
        if(n==0)
            return 1;
        int res=10;
        int availableNos = 9;
        int uniqueDigits = 9;
        int currNos = 2;
        while(currNos<=n && availableNos>0){
            uniqueDigits = uniqueDigits*availableNos;
            res+=uniqueDigits;
            currNos++;
            availableNos--;
        }
        return res;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        System.out.println("Unique Digits: "+countNumbersWithUniqueDigits(n));   
        sc.close();
    }
}