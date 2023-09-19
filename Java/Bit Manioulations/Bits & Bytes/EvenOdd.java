import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        System.out.println("\n\t check if a number is odd or even \n");
        Scanner sc = new Scanner (System.in);
        System.out.println("\n\t Enter a Number : ");
        int x=sc.nextInt();
        Check(x);
    }

   public static void Check(int n) {
        int bitMask = 1;// &1 and &0
        if ((n & bitMask) == 0) {
            System.out.println("\n\t The number is Even : " + n);

        } else {
            System.out.println("\n\t The Number is odd : " + n);
        }
    }
}

                output :

                check if a number is odd or even 


         Enter a Number :
6

         The number is Even : 6

