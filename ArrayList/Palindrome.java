import java.util.ArrayList;
import java.util.Scanner;

class Palindrome {
    public static void main(String[] args) {
        ArrayList<String> words = new ArrayList<String>();
        Scanner scan = new Scanner(System.in);
        while (scan.hasNext())
            words.add(scan.next());
        System.out.println("Is it a palindrome? " +
                isPalindrome(words));
    }

    static boolean isPalindrome(ArrayList<String> words) {
        int front = 0, back = words.size() - 1;
        while (front < back) {
            if ( !words.get(front).equals(words.get(back))) {
                return false;
            }
            front++;
            back--;
        }
        return true;
    }
}
