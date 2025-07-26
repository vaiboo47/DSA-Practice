// Input: prices = [10,1,5,6,7,1]
// Output: 6
// Explanation: Buy prices[1] and sell prices[4], profit = 7 - 1 = 6.
import java.util.*;
public class StockProfit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of prices: ");
        int n = sc.nextInt();
        int[] prices = new int[n];
        System.out.println("Enter stock prices");
        for(int i=0;i<n;i++)
        {
            prices[i]=sc.nextInt();
        }
        System.out.println("Max Profit = "+maxProfit(prices));
    }

    static public int maxProfit(int[] prices) {
        int max=0;
        for(int i=0;i<prices.length;i++)
        {
            int buy=prices[i];
            int j=i+1;
            while(j<prices.length && buy<=prices[j])
            {
                int sell=prices[j];
                max=Math.max(max,sell-buy);
                j++;
            }
        }
        return max;
    }
}
  
