
import java.util.Scanner;

public class Pattern {    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("\n\t Enter the size of the pattern (odd number): ");
        int size = scanner.nextInt();

        if (size % 2 == 0) {
            System.out.println("\n\t Please enter an odd number for a better X pattern.");
            return;
        }
        System.out.println("\n\n\t Pattern \n");
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (i == j || i + j == size - 1)
                    System.out.print(" * ");
                else
                    System.out.print("    ");
            }
            System.out.println();
        }

        scanner.close();
    }
}




//          Enter the size of the pattern (odd number): 9


//          Pattern 

//  *                              * 
//      *                      *     
//          *              *
//              *      *
//                  *
//              *      *
//          *              *
//      *                      *
//  *                              *











