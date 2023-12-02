
    

import java.util.*;

public class Candy {
    public static void main(String[] args) {
        int[] candyPrices = {2, 3, 1, 4, 5};
        int budget = 7;

        int maxCandies = maxCandiesToBuy(candyPrices, budget);
        System.out.println("\n\t Maximum number of candies the customer can buy: " + maxCandies);
    }

    public static int maxCandiesToBuy(int[] candyPrices, int budget) {
        if (candyPrices == null || candyPrices.length == 0 || budget <= 0) {
            return 0;
        }

        Arrays.sort(candyPrices); // Sort the candy prices 
        int count = 0;

        for (int price : candyPrices) {
            if (price <= budget) {
                count++;
                budget -= price;
            } else {
                break; 
            }
        }

        return count;
    }
}
                //  Maximum number of candies the customer can buy: 3






