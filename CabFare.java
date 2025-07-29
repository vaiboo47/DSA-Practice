// Cab Fare Calculation

// Fare for first 2 kilometers = 25
// After first two kilometers, charge of base price(starting from 15) for each kilometer
// Base price increases by 5 after every 5 kilometers

// Input: 9
// Output: 140
// Explanation: 25 + 5*15 + 2*20
import java.util.*;
public class CabFare {
public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter kilometers: ");
        int fare = sc.nextInt();
        System.out.println("Total fare:"+getFare(fare));
    }
    static int getFare(int n)
    {
        int price=25;
        if(n<=2)
        {
            return price;
        }
        else{
            int base=15,count=0,rem=n-2;
            while(rem!=0)
            {
                price+=base;
                count++;
                if(count==5)
                    base+=5;
                rem--;
            }
            return price;
        }
    }
}