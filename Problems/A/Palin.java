
import java.util.Scanner;

public class Palin {
    


    static int rev(int n) {
        int r = 0;
        while (n > 0) {
            int digit = n % 10;
            r = r * 10 + digit;
            n = n / 10;
        }
        return r;
    }

    static boolean isPalindrome(int n) {
        return n == rev(n);
    }

    static int solve(int n) {
        while (!isPalindrome(n)) {
            n += rev(n);
        }
        return n;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("\n\t Enter the digit : ");
        int n = scanner.nextInt();
        System.out.println("\n\t digit : "+solve(n));
    }
}






    //  Enter the digit : 12

    //      digit : 33

            //  Enter the digit : 196



