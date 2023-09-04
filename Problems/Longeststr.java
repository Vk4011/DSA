import java.util.*;

public class Longeststr{

    public static int lengthOfLongestSubstring(String s) {
        int maxLength = 0;
        int strLength = s.length();

        for (int i = 0; i < strLength; i++) {
            Set<Character> charSet = new HashSet<>();
            int j = i;
            while (j < strLength && !charSet.contains(s.charAt(j))) {
                charSet.add(s.charAt(j));
                j++;
            }

            maxLength = Math.max(maxLength, j - i);
        }

        System.out.println("Longest Substring Length: " + maxLength);
        return maxLength;
    }

    public static void main(String[] args) {
        String str = "pwwkew";
        System.out.println("\n\tLongest Substring without Repeating Characters\n");
        System.out.println("\n\tThe string is : " + str);
        int strLength = str.length();
        System.out.println("\n\tLength of the string : " + strLength);
        lengthOfLongestSubstring(str);
    }
}
