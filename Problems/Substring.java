
import java.util.*;

public class Substring {

    public static int lengthOfLongestSubstring(String s) {
        int maxlength = 0;
        int l = s.length();
        for (int i = 0; i < l; i++) {
            StringBuilder currentSubstring = new StringBuilder();
            for (int j = 1; j < l; j++) {
                if (currentSubstring.indexOf(String.valueOf(s.charAt(j))) != -1) {
                    break;
                }
                currentSubstring.append(s.charAt(j));

                maxlength = Math.max(maxlength, currentSubstring.length());

            }
            System.out.println(+maxlength);

        }
        return maxlength;
    }

    public static void main(String[] args) {
        String str = "pwwkew ";//pwwkew  //abcabcbd
        System.out.println("\n\t Longest Substring without Repeating Characters \n ");
        System.out.println("\n\t The string is : " + str);
        int l = str.length();
        System.out.println("\n\t length of the string : " + l);
        lengthOfLongestSubstring(str);

    }
}