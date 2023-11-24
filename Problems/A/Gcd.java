import java.util.Scanner;

public class Gcd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Input the two numbers from the user
        System.out.print("Enter first number: ");
        int num1 = scanner.nextInt();
        
        System.out.print("Enter second number: ");
        int num2 = scanner.nextInt();
        
        // Calculate GCD using the Euclidean algorithm
        int gcd = calculateGCD(num1, num2);
        
        // Display the GCD
        System.out.println("GCD of " + num1 + " and " + num2 + " is: " + gcd);
    }

    // Method to calculate GCD using the Euclidean algorithm
    public static int calculateGCD(int num1, int num2) {
        while (num2 != 0) {
            int temp = num2;
            num2 = num1 % num2;
            num1 = temp;
        }
        return num1;
    }
}


// Enter first number: 6
// Enter second number: 3
// GCD of 6 and 3 is: 3



