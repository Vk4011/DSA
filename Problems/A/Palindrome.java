import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        System.out.println("\n\t Palindrome program \n ");
        Scanner sc = new Scanner(System.in);
        System.out.println("\n\t Enter a string : ");
        String s = sc.nextLine();
        for (int i = 0; i < s.length(); i++) {
            if(s.equals(new StringBuilder(s).reverse().toString())){
                System.out.println(s);
                break;
            }
             String s1=s+new StringBuilder(s.substring(0,i+1)).reverse().toString();
            if(s1.equals(new StringBuilder(s1).reverse().toString())){
                System.out.println(s1);
                break;
            }
            
        }
       

    }
}

//               Palindrome program


//          Enter a string :
// vikram
// vikramarkiv


