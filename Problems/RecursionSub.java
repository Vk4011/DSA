public class RecursionSub {
 public static void main(String[] args) {
    System.out.println("\n\t Reverse String using recursion substring mehtod \n");
    char[] s = {'h', 'e', 'l', 'l', 'o'};
    System.out.println("\n\t Given string : "+new String(s));
    reverseString(s);
    System.out.println("\n\t Reverse String : " + new String(s));

 }
    public static void reverseString(char[] s) {
        String str = new String(s);
        String reversed = reverseHelper(str);
        char[] reversedChars = reversed.toCharArray();
        System.arraycopy(reversedChars, 0, s, 0, s.length);
    }

    private static String reverseHelper(String str) {
        if (str.length() <= 1) {
            return str;
        }

        int mid = str.length() / 2;
        String left = str.substring(0, mid);
        String right = str.substring(mid);

        String reversedLeft = reverseHelper(left);
        String reversedRight = reverseHelper(right);

        return reversedRight + reversedLeft;
    }
}

        Reverse String using recursion substring mehtod 


         Given string : hello

         Reverse String : olleh





         