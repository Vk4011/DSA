import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        System.out.println("\n\t Sum of two numbers \n");
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("\n\tEnter the first number: ");
        int num1 = scanner.nextInt();
        
        System.out.print("\n\tEnter the second number: ");
        int num2 = scanner.nextInt();
        
        int sum = add(num1, num2);
        
        System.out.println("\n\tThe sum of " + num1 + " and " + num2 + " is: " + sum);
    }
    
    public static int add(int a, int b) {
        // Iterate till there is no carry
        while (b != 0) {
            // Carry now contains common set bits of a and b
            int carry = a & b;
 
            // Sum of bits of a and b where at least one of the bits is not set
            a = a ^ b;
 
            // Carry is shifted by one so that adding it to a gives the required sum
            b = carry << 1;
        }
 
        return a;
    }
}
                    output:

                    
         Sum of two numbers


        Enter the first number: 5

        Enter the second number: 6

        The sum of 5 and 6 is: 11