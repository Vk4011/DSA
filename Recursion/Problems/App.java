
    

import java.util.*;
public class App {
    public static void main(String[] args) {
        System.out.println("\n\t Remove Duplicates in a string \n");
        String str = "vikramram";
        System.out.println("\n\t The string is str : " + str);
        String newStr = removeDuplicates(str);
        System.out.println("\n\t The new string str : " + newStr);
    }

    public static String removeDuplicates(String str) {
        boolean[] map = new boolean[26];
        StringBuilder newStr = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            char currChar = str.charAt(i);
            if (!map[currChar - 'a']) {
                map[currChar - 'a'] = true;
                newStr.append(currChar);
            }
        }

        return newStr.toString();
    }
}
        //             Remove Duplicates in a string


        //  The string is str : vikramram

        //  The new string str : vikram
        



        