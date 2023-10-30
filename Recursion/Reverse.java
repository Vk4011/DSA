public class Reverse {
    public static void main(String[] args) {
        System.out.println("\n\t Reverse String \n");
        String str="Hello World!!!";
        System.out.println("\n\t String str     : "+str);
        String rev="";
        for(int i=str.length()-1;i>=0;i--){
            rev+=str.charAt(i);
        }
        System.out.println("\n\t Reverse String : "+rev);

        System.out.println("\n\n\t Recursion Method \n");
        System.out.println("\n\t reveresed str : "+reverseString(str));
    }
    public static String reverseString(String str) {
        // Base case: If the string is empty or has only one character, it's already reversed
        if (str.isEmpty() || str.length() == 1) {
            return str;
        }

        // Recursive case: Reverse the substring excluding the first character
        // and concatenate the first character at the end.
        return reverseString(str.substring(1)) + str.charAt(0);
    }
}
