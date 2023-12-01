import java.util.function.Predicate;

public class Palindrome {
    public static void main(String[] args) {
        // Lambda expression to check for palindrome
        Predicate<String> isPalindrome = (str) -> {
            String reverse = new StringBuilder(str).reverse().toString();
            return str.equalsIgnoreCase(reverse);
        };

        // Test strings for palindrome
        String str1 = "madam";
        String str2 = "hello";

        // Check if strings are palindromes using the lambda expression
        System.out.println("\"" + str1 + "\" is a palindrome: " + isPalindrome.test(str1)); // Output: "madam" is a palindrome: true
        System.out.println("\"" + str2 + "\" is a palindrome: " + isPalindrome.test(str2)); // Output: "hello" is a palindrome: false
    }
}
