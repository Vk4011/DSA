public class StringReverse {
    
    public static void main(String[] args) {
        System.out.println("\n\t Reverse String \n");
        String str = " M a r k i V ";
        System.out.println("\n\t String str     : " + str);
        char[] rev = reverseString(str.toCharArray(), 0, str.length() - 1);
        System.out.println("\n\t Reverse String : " + new String(rev));
    }

    public static char[] reverseString(char[] str, int start, int end) {
        if (start >= end) {
            return str; // Base case: Return the original character array as it's already reversed.
        } 
        else {
            // Swap characters at the start and end indices.
            char temp = str[start];
            str[start] = str[end];
            str[end] = temp;

            // Recursively reverse the remaining substring.
            return reverseString(str, start + 1, end - 1);
        }
    }
}


        //      Reverse String


        //  String str     :  M a r k i V

        //  Reverse String :  V i k r a M




        