import java.util.Scanner;

public class Line {
    public static void main(String[] args) {
        String firstName = "Vikram";
        String lastName = "Ram";
        System.out.println("\n\t Concatination \n");
        String fullName = firstName + " " + lastName;
        System.out.println("Concation : " + fullName);// this is +"" concatination
        Scanner sc = new Scanner(System.in);
        System.out.println("\n\t Enter a String : ");
        String str = sc.nextLine();
        System.out.println("\n\t The string is : " + str);
        System.out.println("\n\t String lengths  : " + fullName.length() + "\t string str : " + str.length());

    }
}
                output 

                
         Concatination

Concation : Vikram Ram

         Enter a String :
Hello world ..! learn Java

         The string is : Hello world ..! learn Java

         String lengths  : 10    string str : 26