import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Word {

    static List<String> splitString(String str) {
        List<String> words = new ArrayList<>();
        StringBuilder word = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == ' ') {
                words.add(word.toString());
                word.setLength(0); // Clear StringBuilder
            } else {
                // build the word
                word.append(ch);
            }
        }
        // pushing the last word
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

        // build the output string
        StringBuilder rotatedString = new StringBuilder();
        for (String word : rotatedWords) {
            rotatedString.append(word).append(' ');
        }
        rotatedString.setLength(rotatedString.length() - 1); // Remove trailing space
        return rotatedString.toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String str = scanner.nextLine();
        System.out.print("Enter the number of rotations: ");
        int n = scanner.nextInt();
        String ans = solve(str, n);
        System.out.println(ans);
    }
}
