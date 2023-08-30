import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("\n\t Reverse of a number");
        System.out.println("\n\t Enter a number : ");
        int n=sc.nextInt();
        while(n>0){
            int lastDigit = n%10;
            System.out.print(lastDigit+" ");
            n=n/10; // n/=10; //any number is less than 10 is divide by 10 quotient is 0
        }
        System.out.println("\n\t Reversed  number  ");

    }
    
}
// output:

//          Reverse of a number

//          Enter a number : 
// 54321
// 1 2 3 4 5 
//          Reversed  number  


