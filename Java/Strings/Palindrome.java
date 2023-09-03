import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
        System.out.println("\n\t Check the string is palindrome \n");
        System.out.println("\n\t Enter the string : ");
        String str=sc.nextLine();
        System.out.println("\n\t String :"+str);
        int l=str.length();
        for(int i =0;i<l/2;i++){
            if(str.charAt(i) != str.charAt(l-1-i)){
                System.out.println("\n\t is not a palindrome");
            }else{
                 System.out.println("\n\t is  a palindrome");
            }


        }
    }
}
                        output

                        Check the string is palindrome


                        Enter the string :
                                            MoM

                        String :MoM

                        is  a palindrome


                        // 