
import java.util.Scanner;

public class Hcf {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the two numbers from the user
        System.out.print("\n\tEnter first number: ");
        int num1 = scanner.nextInt();

        System.out.print("\n\tEnter second number: ");
        int num2 = scanner.nextInt();

        // Calculate HCF using the Euclidean algorithm
        int hcf = calculateHCF(num1, num2);

        // Display the HCF
        System.out.println("\n\t HCF of " + num1 + " and " + num2 + " is: " + hcf);
    }

    // Method to calculate HCF using the Euclidean algorithm
    public static int calculateHCF(int num1, int num2) {
        while (num2 != 0) {
            int temp = num2;
            num2 = num1 % num2;
            num1 = temp;
        }
        return num1;
    }
}

        // Enter first number: 45

        // Enter second number: 43

        //  HCF of 45 and 43 is: 1



        