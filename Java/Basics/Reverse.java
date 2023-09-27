public class Reverse {
       public static void main(String[] args) {
        String input = "Hello";
        String reversed = reverseString(input);
        System.out.println("\n\tOriginal string: " + input);
        System.out.println("\n\tReversed string: " + reversed);
    }

    public static String reverseString(String input) {
        // Convert the string to a character array
        char[] charArray = input.toCharArray();

        // Initialize pointers for the start and end of the character array
        int start = 0;
        int end = charArray.length - 1;

        // Reverse the characters in the character array
        while (start < end) {
            // Swap the characters at the start and end positions
            char temp = charArray[start];
            charArray[start] = charArray[end];
            charArray[end] = temp;

            // Move the pointers towards each other
            start++;
            end--;
        }

        // Convert the character array back to a string
        String reversed = new String(charArray);

        return reversed;
    }
}
                    output:

                       Original string: Hello

                        Reversed string: olleH