
    

import java.util.Arrays;


    public class Ananagram {
    // Function to check if two strings are anagrams
    static boolean areAnagrams(String str1, String str2) {
        // Remove spaces and convert strings to lowercase
        str1 = str1.replaceAll("\\s", "").toLowerCase();
        str2 = str2.replaceAll("\\s", "").toLowerCase();
        
        // If the lengths are different, they can't be anagrams
        if (str1.length() != str2.length()) {
            return false;
        }
        
        // Convert strings to character arrays
        char[] charArray1 = str1.toCharArray();
        char[] charArray2 = str2.toCharArray();
        
        // Sort both character arrays
        Arrays.sort(charArray1);
        Arrays.sort(charArray2);
        
        // Compare sorted arrays
        return Arrays.equals(charArray1, charArray2);
    }

    public static void main(String[] args) {
        System.out.println("\n\t Anagrams \n");
        String str1 = "listen";
        String str2 = "silent";
        
        if (areAnagrams(str1, str2)) {
            System.out.println(str1 + " and " + str2 + " are anagrams.");
        } else {
            System.out.println(str1 + " and " + str2 + " are not anagrams.");
        }
    }
}
