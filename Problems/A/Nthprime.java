
import java.util.Scanner;

public class Nthprime {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("\n\t Enter the value of N: ");
        int n = scanner.nextInt();

        int prime = findNthPrime(n);
        System.out.println("\n\t The " + n + "th prime number is: " + prime);
    }

    public static int findNthPrime(int n) {
        int count = 0;
        int num = 2;

        while (count < n) {
            if (isPrime(num)) {
                count++;
            }
            if (count == n) {
                break;
            }
            num++;
        }

        return num;
    }

    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}



        //        Enter the value of N: 6

        //  The 6th prime number is: 13