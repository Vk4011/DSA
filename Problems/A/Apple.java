import java.util.Scanner;

public class Apple {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of apples and their weight range (in grams) for A, B, and C:");
        int n = scanner.nextInt();
        int minWeight = scanner.nextInt();
        int maxWeight = scanner.nextInt();

        boolean result = isFairDistribution(n, minWeight, maxWeight);
        
        if (result) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

        scanner.close();
    }

    static boolean isFairDistribution(int n, int minWeight, int maxWeight) {
      
        int totalWeight = n * minWeight;

    
        return totalWeight % 2 == 0 && totalWeight >= 2 * minWeight && totalWeight <= 2 * maxWeight;
    }
}
// Enter the number of apples and their weight range (in grams) for A, B, and C:
// 300
// 100
// 200
// No