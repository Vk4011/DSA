import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Word {

    static List<String> splitString(String str) {
        ArrayList<String> words = new ArrayList<>();
        StringBuilder word = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == ' ') {
                words.add(word.toString());
                word.setLength(0); 
            } else {
    
                word.append(ch);
            }
        }
       
        words.add(word.toString());
        return words;
    }

    static String solve(String str, int n) {
        List<String> words = splitString(str);
        n = n % words.size();

        List<String> rotatedWords = new ArrayList<>();
        for (int i = words.size() - n; i < words.size(); ++i) {
            rotatedWords.add(words.get(i));
        }
        for (int i = 0; i < n; ++i) {
            rotatedWords.add(words.get(i));
        }


        StringBuilder rotatedString = new StringBuilder();
        for (String word : rotatedWords) {
            rotatedString.append(word).append(' ');
        }
        rotatedString.setLength(rotatedString.length() - 1); 
        return rotatedString.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("\n\tEnter the string : ");
        String str = sc.nextLine();
        System.out.print("\n\tEnter the number of rotations : ");
        int n = sc.nextInt();
        String ans = solve(str, n);
        System.out.println("\n\tAfter rotation : "+ans);
    }
}
