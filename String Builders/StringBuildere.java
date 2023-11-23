import java.util.Scanner;

public class StringBuildere {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("\n\tEnter a string: ");
        String inputString = scanner.nextLine();

        // Check if the input string is a palindrome
        boolean isPalindrome = isPalindrome(inputString);

        if (isPalindrome) {
            System.out.println("\n\tThe entered string is a palindrome.");
        } else {
            System.out.println("\n\tThe entered string is not a palindrome.");
        }

        // Get the reversed string using StringBuilder
        String reversedString = reverseString(inputString);
        System.out.println("\n\tReversed string: " + reversedString);

        scanner.close();
    }

    public static boolean isPalindrome(String str) {
        // Remove spaces and convert to lowercase for case-insensitive check
        str = str.replaceAll("\\s+", "").toLowerCase();

        // Create a StringBuilder from the input string
        StringBuilder stringBuilder = new StringBuilder(str);

        // Get the reversed string using StringBuilder
        String reversedString = stringBuilder.reverse().toString();

        // Check if the original string and its reversed form are equal
        return str.equals(reversedString);
    }

    public static String reverseString(String str) {
        // Create a StringBuilder from the input string
        StringBuilder stringBuilder = new StringBuilder(str);

        // Get the reversed string using StringBuilder
        return stringBuilder.reverse().toString();
    }
}


        // Enter a string: racecar

        // The entered string is a palindrome.

        // Reversed string: racecar



        