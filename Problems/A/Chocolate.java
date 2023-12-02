public class Chocolate {
    

    public static void main(String[] args) {
        System.out.println(chocolateDistributionWays(4)); // Output: 1
        System.out.println(chocolateDistributionWays(12)); // Output: 5
    }

    public static int chocolateDistributionWays(int n) {
        int count = 0;

        for (int bChocolates = 1; bChocolates < n; bChocolates++) {
            int aChocolates = n - bChocolates;
            if (aChocolates > bChocolates) {
                count++;
            }
        }

        return count;
    }
}
